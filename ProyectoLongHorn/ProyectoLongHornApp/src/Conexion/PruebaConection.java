
package Conexion;

import FormularioUsuario.cConnection;
import java.sql.*;

public class PruebaConection {

    public static void main(String[] args) {
        // Crear un objeto de la clase de conexion
        cConnection conect = new cConnection();
        //Obtener la conexion
        Connection con = conect.ObtenerConexion();
        if(con == null){
            //Error al establecer la conexion
        }
    }
    
}
