package programmer.zaman.now.database;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchTest {

    @Test
    void testStatement () throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();
        Statement statement = connection.createStatement();

        String sql = "INSERT INTO comments (email, comment) VALUES ('robby@email.com', 'Hy')";

        for (int i = 0; i < 100; i++) {
            statement.addBatch(sql);
        }

        statement.executeBatch();
        statement.close();
        connection.close();

    }
}
