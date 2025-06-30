package FormularioUsuario;
import java.sql.*;

public class cConnection {
    private String url = "jdbc:ucanaccess://C:\\Users\\USER\\Documents\\Grupo7_LongHorn\\ProyectoLongHorn\\ProyectoLongHornApp\\DataBaseReservas.accdb";
    private String usr = "";
    private String pswd = "";
    private Connection con = null;
    public cConnection(){
        loadDriver();
    }
    private void loadDriver(){
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            
        }
        catch(ClassNotFoundException e){
            System.out.println("Error al crear el puente JDBC-Access\n");
        }
    }
    
    public Connection ObtenerConexion(){
        System.out.print("Estableciendo conexion con "+url+"\n");
        try{
            //Obteniendo la conexion
            con = DriverManager.getConnection(url, usr, pswd);
        }
        catch(SQLException sqle){
            System.out.print("No se pudo establecer la conexión\n");
            return null;
        }
        System.out.print("Conexión establecida con: "+url+"\n");
        return con;
    }
    //Cerrar la conexion
    public boolean closeConecction(){
        try{
            con.close();
        }
        catch(SQLException sqle){
            System.out.print("No se cerro la conexion\n");
            return false;
        }
        System.out.print("Conexion cerrada con exito\n");
        return true;
    }  
    
}
