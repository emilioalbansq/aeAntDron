package aeDataAccess.aeDTOs;

public class aeVWHormigaDTO {
    private String IdaeHormiga    ;
    private String aeTipo ;
    private String aeSexo ;
    private String aeEstadoHormiga    ;
    private String aeNombre   ;
    private String aeDescripcion  ;
    private String aeEstado   ;
    private String aeFechaCreacion    ;
    private String aeFechaModifica    ;
    public aeVWHormigaDTO(String idHormiga, String tipo, String sexo, String estadoHormiga, String nombre,
            String descripcion, String estado, String fechaCreacion, String fechaModifica) {
        IdaeHormiga = idHormiga;
        aeTipo = tipo;
        aeSexo = sexo;
        aeEstadoHormiga = estadoHormiga;
        aeNombre = nombre;
        aeDescripcion = descripcion;
        aeEstado = estado;
        aeFechaCreacion = fechaCreacion;
        aeFechaModifica = fechaModifica;
    }
    public String getIdHormiga() {
        return IdaeHormiga;
    }
    public void setIdHormiga(String idHormiga) {
        IdaeHormiga = idHormiga;
    }
    public String getTipo() {
        return aeTipo;
    }
    public void setTipo(String tipo) {
        aeTipo = tipo;
    }
    public String getSexo() {
        return aeSexo;
    }
    public void setSexo(String sexo) {
        aeSexo = sexo;
    }
    public String getEstadoHormiga() {
        return aeEstadoHormiga;
    }
    public void setEstadoHormiga(String estadoHormiga) {
        aeEstadoHormiga = estadoHormiga;
    }
    public String getNombre() {
        return aeNombre;
    }
    public void setNombre(String nombre) {
        aeNombre = nombre;
    }
    public String getDescripcion() {
        return aeDescripcion;
    }
    public void setDescripcion(String descripcion) {
        aeDescripcion = descripcion;
    }
    public String getEstado() {
        return aeEstado;
    }
    public void setEstado(String estado) {
        aeEstado = estado;
    }
    public String getFechaCreacion() {
        return aeFechaCreacion;
    }
    public void setFechaCreacion(String fechaCreacion) {
        aeFechaCreacion = fechaCreacion;
    }
    public String getFechaModifica() {
        return aeFechaModifica;
    }
    public void setFechaModifica(String fechaModifica) {
        aeFechaModifica = fechaModifica;
    } 

    @Override
    public String toString() {
        return getClass().getName()
        + "\n  IdHormiga        : "+ getIdHormiga    ()
        + "\n  Tipo            : "+ getTipo          ()
        + "\n  Sexo            : "+ getSexo          ()
        + "\n  EstadoHormiga   : "+ getEstadoHormiga ()
        + "\n  Nombre          : "+ getNombre        ()
        + "\n  Descripcion     : "+ getDescripcion   ()
        + "\n  Estado          : "+ getEstado        ()
        + "\n  FechaCreacion   : "+ getFechaCreacion ()
        + "\n  FechaModifica   : "+ getFechaModifica ()
        + "\n-----------------------------------";
    }
}
