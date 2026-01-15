package amDataAccess.amDTOs;

public class amAntCiberDronDTO {
    private Integer IdamAntCiberDron  ;
    private String amSerie            ;
    private String amEstado           ;
    private String amFechaCreacion    ;
    private String amFechaModifica    ;

    
    

    public amAntCiberDronDTO() {}
    public amAntCiberDronDTO(String serie) {
        IdamAntCiberDron = 0;
        amSerie = serie;
    }
    public amAntCiberDronDTO(Integer idAntCiberDron, String serie, String estado, String fechaCreacion,
            String fechaModifica) {
        IdamAntCiberDron = idAntCiberDron;
        amSerie = serie;
        amEstado = estado;
        amFechaCreacion = fechaCreacion;
        amFechaModifica = fechaModifica;
    }

    public Integer getIdAntCiberDron() {
        return IdamAntCiberDron;
    }
    public void setIdAntCiberDron(Integer idAntCiberDron) {
        IdamAntCiberDron = idAntCiberDron;
    }
    public String getSerie() {
        return amSerie;
    }
    public void setSerie(String serie) {
        amSerie = serie;
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
        + "\n IdAntCiberDron: "+ getIdAntCiberDron       ()
        + "\n Serie         : "+ getSerie            ()
        + "\n Estado        : "+ getEstado          ()
        + "\n FechaCreacion : "+ getFechaCreacion   ()
        + "\n FechaModifica : "+ getFechaModifica   ()
        + "\n-----------------------------------------";
    }

};
