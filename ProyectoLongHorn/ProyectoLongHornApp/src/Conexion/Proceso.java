package Conexion;
import FormularioUsuario.cConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.awt. *;
public class Proceso {
    public List<Reserva> LisProducto(Integer idProd){ // Crear la funcion lisProducto, con argumento para consultar
        List<Reserva> lista = new ArrayList();
        String consultaSQL = "select * from Producto where IdP LIKE '%"+idProd+"%'";
        cConnection conect = new cConnection();
        try{
            //Prearar la sentencia SQL
            PreparedStatement st = conect.ObtenerConexion().prepareStatement(consultaSQL);
            //cuando ejecutemos una consulta st.executeQuery, esta sera llevada a memoria
            //a traves de resulSet y se almacenara en rs
            ResultSet rs = st.executeQuery();
            //recorrer todo lo que esta memoria, leer fila por fila
            while(rs.next()){
                Reserva p = new Reserva();
                //p.setCodProd(rs.getInt(1));
               // p.setDescrip(rs.getString(2));
                lista.add(p);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return lista;
    }
}

