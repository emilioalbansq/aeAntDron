package aeDataAccess.aeDTOs;

public class aeAntCiberDronDTO {
    private Integer IdaeAntCiberDron  ;
    private String aeSerie            ;
    private String aeEstado           ;
    private String aeFechaCreacion    ;
    private String aeFechaModifica    ;

    
    

    public aeAntCiberDronDTO() {}
    public aeAntCiberDronDTO(String serie) {
        IdaeAntCiberDron = 0;
        aeSerie = serie;
    }
    public aeAntCiberDronDTO(Integer idAntCiberDron, String serie, String estado, String fechaCreacion,
            String fechaModifica) {
        IdaeAntCiberDron = idAntCiberDron;
        aeSerie = serie;
        aeEstado = estado;
        aeFechaCreacion = fechaCreacion;
        aeFechaModifica = fechaModifica;
    }

    public Integer getIdAntCiberDron() {
        return IdaeAntCiberDron;
    }
    public void setIdAntCiberDron(Integer idAntCiberDron) {
        IdaeAntCiberDron = idAntCiberDron;
    }
    public String getSerie() {
        return aeSerie;
    }
    public void setSerie(String serie) {
        aeSerie = serie;
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
        + "\n IdAntCiberDron: "+ getIdAntCiberDron       ()
        + "\n Serie         : "+ getSerie            ()
        + "\n Estado        : "+ getEstado          ()
        + "\n FechaCreacion : "+ getFechaCreacion   ()
        + "\n FechaModifica : "+ getFechaModifica   ()
        + "\n-----------------------------------------";
    }

};
