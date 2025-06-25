package Conexion;

public class Reserva {
    private Integer id_Reserva = null;
    private Integer id_cliente = null;
    private Integer id_usuario = null;
    private Integer id_mesa = null;
    private String fecha_reserva = null;
    private String hora_reserva = null;
    private Integer personas = null;
    private String estado = null;
    public String DatoCompleto(){
        return fecha_reserva; // xd
    }

    /**
     * @return the id_Reserva
     */
    public Integer getId_Reserva() {
        return id_Reserva;
    }

    /**
     * @param id_Reserva the id_Reserva to set
     */
    public void setId_Reserva(Integer id_Reserva) {
        this.id_Reserva = id_Reserva;
    }

    /**
     * @return the id_cliente
     */
    public Integer getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * @return the id_usuario
     */
    public Integer getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    /**
     * @return the id_mesa
     */
    public Integer getId_mesa() {
        return id_mesa;
    }

    /**
     * @param id_mesa the id_mesa to set
     */
    public void setId_mesa(Integer id_mesa) {
        this.id_mesa = id_mesa;
    }

    /**
     * @return the fecha_reserva
     */
    public String getFecha_reserva() {
        return fecha_reserva;
    }

    /**
     * @param fecha_reserva the fecha_reserva to set
     */
    public void setFecha_reserva(String fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

    /**
     * @return the hora_reserva
     */
    public String getHora_reserva() {
        return hora_reserva;
    }

    /**
     * @param hora_reserva the hora_reserva to set
     */
    public void setHora_reserva(String hora_reserva) {
        this.hora_reserva = hora_reserva;
    }

    /**
     * @return the personas
     */
    public Integer getPersonas() {
        return personas;
    }

    /**
     * @param personas the personas to set
     */
    public void setPersonas(Integer personas) {
        this.personas = personas;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
   

}
