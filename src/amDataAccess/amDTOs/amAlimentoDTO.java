package amDataAccess.amDTOs;

public class amAlimentoDTO {

    private Integer IdamAlimento;
    

    private Integer IdamAlimentoTipo;
    private String  amNombre        ;
    private String  amDescripcion   ;
    private String  amEstado        ;
    private String  amFechaCreacion ;
    private String  amFechaModifica ;
    
    
    
    public amAlimentoDTO() {
    }
    public amAlimentoDTO(String nombre, String descripcion) {
        IdamAlimento  = 0;
        amNombre          = nombre;
        amDescripcion     = descripcion;
    }
    public amAlimentoDTO(Integer idAlimento, Integer idAlimentoTipo, String nombre, String descripcion, String estado, String fechaCreacion,
            String fechaModifica) {
        IdamAlimento      = idAlimento;
        IdamAlimentoTipo  = idAlimentoTipo;
        amNombre          = nombre;
        amDescripcion     = descripcion;
        amEstado          = estado;
        amFechaCreacion   = fechaCreacion;
        amFechaModifica   = fechaModifica;
    }

    public Integer getIdAlimento() {
        return IdamAlimento;
    }
    public void setIdAlimento(Integer idamAlimento) {
        IdamAlimento = idamAlimento;
    }
    public Integer getIdAlimentoTipo() {
        return IdamAlimentoTipo;
    }
    public void setIdAlimentoTipo(Integer idAlimentoTipo) {
        IdamAlimentoTipo = idAlimentoTipo;
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
        + "\n IdAlimento    : "+ getIdAlimento  ()
        + "\n IdAlimentoTipo: "+ getIdAlimentoTipo  ()
        + "\n Nombre        : "+ getNombre          ()
        + "\n Descripcion   : "+ getDescripcion     ()
        + "\n Estado        : "+ getEstado          ()
        + "\n FechaCreacion : "+ getFechaCreacion   ()
        + "\n FechaModifica : "+ getFechaModifica   ()
        + "\n --------------------------- " ;
    }

}
