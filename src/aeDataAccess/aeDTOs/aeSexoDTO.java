package aeDataAccess.aeDTOs;

public class aeSexoDTO {
    private Integer IdaeSexo       ;
    private String  aeNombre       ;
    private String  aeDescripcion  ;
    private String  aeEstado       ;
    private String  aeFechaCreacion;
    private String  aeFechaModifica;

    public aeSexoDTO() {
    }
    public aeSexoDTO(String nombre, String descripcion) {
        IdaeSexo = 0;
        aeNombre = nombre;
        aeDescripcion = descripcion;
    }
    public aeSexoDTO(Integer idSexo, String nombre, String descripcion, String estado, String fechaCreacion,
            String fechaModifica) {
        IdaeSexo = idSexo;
        aeNombre = nombre;
        aeDescripcion = descripcion;
        aeEstado = estado;
        aeFechaCreacion = fechaCreacion;
        aeFechaModifica = fechaModifica;
    }
    public Integer getIdSexo() {
        return IdaeSexo;
    }
    public void setIdSexo(Integer idSexo) {
        IdaeSexo = idSexo;
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
