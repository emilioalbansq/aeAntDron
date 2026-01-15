package amDataAccess.amDTOs;

public class amVWHormigaDTO {
    private String IdamHormiga    ;
    private String amTipo ;
    private String amSexo ;
    private String amEstadoHormiga    ;
    private String amNombre   ;
    private String amDescripcion  ;
    private String amEstado   ;
    private String amFechaCreacion    ;
    private String amFechaModifica    ;
    public amVWHormigaDTO(String idHormiga, String tipo, String sexo, String estadoHormiga, String nombre,
            String descripcion, String estado, String fechaCreacion, String fechaModifica) {
        IdamHormiga = idHormiga;
        amTipo = tipo;
        amSexo = sexo;
        amEstadoHormiga = estadoHormiga;
        amNombre = nombre;
        amDescripcion = descripcion;
        amEstado = estado;
        amFechaCreacion = fechaCreacion;
        amFechaModifica = fechaModifica;
    }
    public String getIdHormiga() {
        return IdamHormiga;
    }
    public void setIdHormiga(String idHormiga) {
        IdamHormiga = idHormiga;
    }
    public String getTipo() {
        return amTipo;
    }
    public void setTipo(String tipo) {
        amTipo = tipo;
    }
    public String getSexo() {
        return amSexo;
    }
    public void setSexo(String sexo) {
        amSexo = sexo;
    }
    public String getEstadoHormiga() {
        return amEstadoHormiga;
    }
    public void setEstadoHormiga(String estadoHormiga) {
        amEstadoHormiga = estadoHormiga;
    }
    public String getNombre() {
        return amNombre;
    }
    public void setNombre(String nombre) {
        amNombre = nombre;
    }
    public String getDescripcion() {
        return amDescripcion;
    }
    public void setDescripcion(String descripcion) {
        amDescripcion = descripcion;
    }
    public String getEstado() {
        return amEstado;
    }
    public void setEstado(String estado) {
        amEstado = estado;
    }
    public String getFechaCreacion() {
        return amFechaCreacion;
    }
    public void setFechaCreacion(String fechaCreacion) {
        amFechaCreacion = fechaCreacion;
    }
    public String getFechaModifica() {
        return amFechaModifica;
    }
    public void setFechaModifica(String fechaModifica) {
        amFechaModifica = fechaModifica;
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
