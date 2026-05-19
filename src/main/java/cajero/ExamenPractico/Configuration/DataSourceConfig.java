
package cajero.ExamenPractico.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSourceConfig {
    
    public static Connection getConecation() throws SQLException{
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String user = "DAraizaPruebaCajero";
        String password = "password1";
        
        return DriverManager.getConnection(url, user, password);
    }
    
}
