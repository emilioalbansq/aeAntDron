package aeDataAccess.aeDTOs;

public class aeHormigaDTO {

    private Integer IdaeHormiga     ; 
    private Integer IdaeHormigaTipo ; 
    private Integer IdaeSexo        ; 
    private Integer IdaeEstado      ; 
    private String  aeNombre        ; 
    private String  aeDescripcion   ; 
    private String  aeEstado        ; 
    private String  aeFechaCreacion ; 
    private String  aeFechaModifica ;

    public aeHormigaDTO() {}
    public aeHormigaDTO(Integer idHormiga, Integer idHormigaTipo, Integer idSexo, Integer idEstado, String nombre,
            String descripcion) {
        IdaeHormiga = idHormiga;
        IdaeHormigaTipo = idHormigaTipo;
        IdaeSexo = idSexo;
        IdaeEstado = idEstado;
        aeNombre = nombre;
        aeDescripcion = descripcion;
    }
    public aeHormigaDTO(Integer idHormiga, Integer idHormigaTipo, Integer idSexo, Integer idEstado, String nombre,
            String descripcion, String estado, String fechaCreacion, String fechaModifica) {
        IdaeHormiga = idHormiga;
        IdaeHormigaTipo = idHormigaTipo;
        IdaeSexo = idSexo;
        IdaeEstado = idEstado;
        aeNombre = nombre;
        aeDescripcion = descripcion;
        aeEstado = estado;
        aeFechaCreacion = fechaCreacion;
        aeFechaModifica = fechaModifica;
    }
    public Integer getIdHormiga() {
        return IdaeHormiga;
    }
    public void setIdHormiga(Integer idHormiga) {
        IdaeHormiga = idHormiga;
    }
    public Integer getIdHormigaTipo() {
        return IdaeHormigaTipo;
    }
    public void setIdHormigaTipo(Integer idHormigaTipo) {
        IdaeHormigaTipo = idHormigaTipo;
    }
    public Integer getIdSexo() {
        return IdaeSexo;
    }
    public void setIdSexo(Integer idSexo) {
        IdaeSexo = idSexo;
    }
    public Integer getIdEstado() {
        return IdaeEstado;
    }
    public void setIdEstado(Integer idEstado) {
        IdaeEstado = idEstado;
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
        + "\n IdHormiga     : "+ getIdHormiga       ()
        + "\n IdHormigaTipo : "+ getIdHormigaTipo   ()
        + "\n IdSexo        : "+ getIdSexo          ()
        + "\n IdEstado      : "+ getIdEstado        ()  
        + "\n Nombre        : "+ getNombre          ()
        + "\n Descripcion   : "+ getDescripcion     ()
        + "\n Estado        : "+ getEstado          ()
        + "\n FechaCreacion : "+ getFechaCreacion   ()
        + "\n FechaModifica : "+ getFechaModifica   ();
    }
}
