package programmer.zaman.now.database;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Test;

public class ConnectionPoolTest {

    @Test
    void testHikariCP () { // konfigurasi HikariCP
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setJdbcUrl("jdbc:mysql://localhost/belajar_java_database");
        config.setUsername("root");
        config.setPassword("");

        // configuration connection pool
        config.setMaximumPoolSize(10);
        config.setMinimumIdle(5);
        config.setIdleTimeout(60_000);
        config.setMaxLifetime(10 * 60_000);

        // membuat connection pool
        HikariDataSource dataSource = new HikariDataSource(config);

        // membuat connection
        dataSource.getConnection();
    }
}
