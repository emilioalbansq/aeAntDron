package amDataAccess.amDTOs;

public class amHormigaDTO {

    private Integer IdamHormiga     ; 
    private Integer IdamHormigaTipo ; 
    private Integer IdamSexo        ; 
    private Integer IdamEstado      ; 
    private String  amNombre        ; 
    private String  amDescripcion   ; 
    private String  amEstado        ; 
    private String  amFechaCreacion ; 
    private String  amFechaModifica ;
    private boolean amSuperHabilidad;

    public amHormigaDTO() {
        amSuperHabilidad = false;
    }
    public amHormigaDTO(Integer idHormiga, Integer idHormigaTipo, Integer idSexo, Integer idEstado, String nombre,
            String descripcion) {
        IdamHormiga = idHormiga;
        IdamHormigaTipo = idHormigaTipo;
        IdamSexo = idSexo;
        IdamEstado = idEstado;
        amNombre = nombre;
        amDescripcion = descripcion;
        amSuperHabilidad = false;
    }
    public amHormigaDTO(Integer idHormiga, Integer idHormigaTipo, Integer idSexo, Integer idEstado, String nombre,
            String descripcion, String estado, String fechaCreacion, String fechaModifica) {
        IdamHormiga = idHormiga;
        IdamHormigaTipo = idHormigaTipo;
        IdamSexo = idSexo;
        IdamEstado = idEstado;
        amNombre = nombre;
        amDescripcion = descripcion;
        amEstado = estado;
        amFechaCreacion = fechaCreacion;
        amFechaModifica = fechaModifica;
        amSuperHabilidad = false;
    }
    public Integer getIdHormiga() {
        return IdamHormiga;
    }
    public void setIdHormiga(Integer idHormiga) {
        IdamHormiga = idHormiga;
    }
    public Integer getIdHormigaTipo() {
        return IdamHormigaTipo;
    }
    public void setIdHormigaTipo(Integer idHormigaTipo) {
        IdamHormigaTipo = idHormigaTipo;
    }
    public Integer getIdSexo() {
        return IdamSexo;
    }
    public void setIdSexo(Integer idSexo) {
        IdamSexo = idSexo;
    }
    public Integer getIdEstado() {
        return IdamEstado;
    }
    public void setIdEstado(Integer idEstado) {
        IdamEstado = idEstado;
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
    public boolean getSuperHabilidad() {
        return amSuperHabilidad;
    }
    public void setSuperHabilidad(boolean superHabilidad) {
        amSuperHabilidad = superHabilidad;
    }

    @Override
    public String toString() {
        return getClass().getName()
        + "\n IdHormiga     : "+ getIdHormiga       ()
        + "\n IdHormigaTipo : "+ getIdHormigaTipo   ()
        + "\n IdSexo        : "+ getIdSexo          ()
        + "\n IdEstado      : "+ getIdEstado        ()  
        + "\n Nombre        : "+ getNombre          ()
        + "\n SuperHabilidad: "+ ( getSuperHabilidad  ()? "Si" : "No" )
        + "\n Descripcion   : "+ getDescripcion     ()
        + "\n Estado        : "+ getEstado          ()
        + "\n FechaCreacion : "+ getFechaCreacion   ()
        + "\n FechaModifica : "+ getFechaModifica   ();
    }
}
