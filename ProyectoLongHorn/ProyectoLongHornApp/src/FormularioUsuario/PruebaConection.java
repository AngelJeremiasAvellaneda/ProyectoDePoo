package FormularioUsuario;

import java.sql.*;

public class PruebaConection {

    public static void main(String[] args) {
        // Crear un objeto de la clase de conexión
        cConnection conect = new cConnection();
        
        // Obtener la conexión
        Connection con = conect.ObtenerConexion();

        // Verificación
        if (con == null) {
            System.out.println("Error: No se pudo establecer la conexión con la base de datos.");
        } else {
            System.out.println("Conexión establecida correctamente con la base de datos.");
            try {
                con.close();
                System.out.println("Conexión cerrada correctamente.");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}