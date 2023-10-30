package programmer.zaman.now.database;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class MetaDataTest {

    @Test
    void testDatabaseMeta() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();
        DatabaseMetaData databaseMetaData = connection.getMetaData();

        System.out.println(databaseMetaData.getDatabaseProductName());

        connection.close();
    }
}
