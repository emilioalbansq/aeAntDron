package amDataAccess.amDTOs;

import amBusinessLogic.amEntities.amGenoAlimento;

public class amAlimentoTipoDTO {
    private Integer IdamAlimentoTipo;
    private String  amNombre        ;
    private String  amDescripcion   ;
    private String  amEstado        ;
    private String  amFechaCreacion ;
    private String  amFechaModifica ;
    private amGenoAlimento amgenoAlimento;
    
    
    public amAlimentoTipoDTO() {
        amgenoAlimento      = null;
    }
    public amAlimentoTipoDTO(String nombre, String descripcion) {
        IdamAlimentoTipo  = 0;
        amNombre          = nombre;
        amDescripcion     = descripcion;
        amgenoAlimento      = null;
    }
    public amAlimentoTipoDTO(Integer idAlimentoTipo, String nombre, String descripcion, String estado, String fechaCreacion,
            String fechaModifica) {
        IdamAlimentoTipo  = idAlimentoTipo;
        amNombre          = nombre;
        amDescripcion     = descripcion;
        amEstado          = estado;
        amFechaCreacion   = fechaCreacion;
        amFechaModifica   = fechaModifica;
        amgenoAlimento      = null;
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
    public amGenoAlimento getAmgenoAlimento() {
        return amgenoAlimento;
    }
    public void setAmgenoAlimento(amGenoAlimento amgenoAlimento) {
        this.amgenoAlimento = amgenoAlimento;
    }
    @Override
    public String toString() {
        return getClass().getName()
        + "\n IdAlimentoTipo: "+ getIdAlimentoTipo  ()
        + "\n Nombre        : "+ getNombre          ()
        + "\n Genoma        : "+ getAmgenoAlimento  ().getClass().getName()
        + "\n Descripcion   : "+ getDescripcion     ()
        + "\n Estado        : "+ getEstado          ()
        + "\n FechaCreacion : "+ getFechaCreacion   ()
        + "\n FechaModifica : "+ getFechaModifica   ()
        + "\n --------------------------- " ;
    }
}
