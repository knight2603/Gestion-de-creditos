package modelo;

import java.sql.Connection;

public class PruebaConexion {
    public static void main(String[] args) {
        Connection con = Conexion.getConnection();
        if (con != null) {
            System.out.println("✅ Conexión exitosa a la base de datos gestion_creditos");
        } else {
            System.out.println("❌ Error al conectar a la base de datos");
        }
    }
}



