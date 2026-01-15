package amDataAccess.amDTOs;

public class amSexoDTO {
    private Integer IdamSexo       ;
    private String  amNombre       ;
    private String  amDescripcion  ;
    private String  amEstado       ;
    private String  amFechaCreacion;
    private String  amFechaModifica;

    public amSexoDTO() {
    }
    public amSexoDTO(String nombre, String descripcion) {
        IdamSexo = 0;
        amNombre = nombre;
        amDescripcion = descripcion;
    }
    public amSexoDTO(Integer idSexo, String nombre, String descripcion, String estado, String fechaCreacion,
            String fechaModifica) {
        IdamSexo = idSexo;
        amNombre = nombre;
        amDescripcion = descripcion;
        amEstado = estado;
        amFechaCreacion = fechaCreacion;
        amFechaModifica = fechaModifica;
    }
    public Integer getIdSexo() {
        return IdamSexo;
    }
    public void setIdSexo(Integer idSexo) {
        IdamSexo = idSexo;
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
    public String toString(){
        return getClass().getName()
        + "\n IdSexo        : "+ getIdSexo      ()
        + "\n Nombre        : "+ getNombre      ()
        + "\n Descripcion   : "+ getDescripcion ()
        + "\n Estado        : "+ getEstado      ()
        + "\n FechaCreacion : "+ getFechaCreacion ()
        + "\n FechaModifica : "+ getFechaModifica ();
    }
}
