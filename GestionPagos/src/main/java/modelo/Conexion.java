package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/gestion_creditos", // ✅ nombre correcto
                "root",   // usuario de MySQL
                ""        // contraseña de MySQL (vacía por defecto)
            );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}


