package aeDataAccess.aeDTOs;

public class aeAlimentoTipoDTO {
    private Integer IdaeAlimentoTipo;
    private String  aeNombre        ;
    private String  aeDescripcion   ;
    private String  aeEstado        ;
    private String  aeFechaCreacion ;
    private String  aeFechaModifica ;
    
    public aeAlimentoTipoDTO() {}
    public aeAlimentoTipoDTO(String nombre, String descripcion) {
        IdaeAlimentoTipo  = 0;
        aeNombre          = nombre;
        aeDescripcion     = descripcion;
    }
    public aeAlimentoTipoDTO(Integer idAlimentoTipo, String nombre, String descripcion, String estado, String fechaCreacion,
            String fechaModifica) {
        IdaeAlimentoTipo  = idAlimentoTipo;
        aeNombre          = nombre;
        aeDescripcion     = descripcion;
        aeEstado          = estado;
        aeFechaCreacion   = fechaCreacion;
        aeFechaModifica   = fechaModifica;
    }
    public Integer getIdAlimentoTipo() {
        return IdaeAlimentoTipo;
    }
    public void setIdAlimentoTipo(Integer idAlimentoTipo) {
        IdaeAlimentoTipo = idAlimentoTipo;
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
        + "\n IdAlimentoTipo: "+ getIdAlimentoTipo  ()
        + "\n Nombre        : "+ getNombre          ()
        + "\n Descripcion   : "+ getDescripcion     ()
        + "\n Estado        : "+ getEstado          ()
        + "\n FechaCreacion : "+ getFechaCreacion   ()
        + "\n FechaModifica : "+ getFechaModifica   ()
        + "\n --------------------------- " ;
    }
}
