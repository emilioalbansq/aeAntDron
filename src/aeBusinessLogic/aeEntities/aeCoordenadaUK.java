package aeBusinessLogic.aeEntities;

public class aeCoordenadaUK {
    
    private String  aeGeoposicion;
    private String  aeTipoArsenal;
    private Boolean aeAccion;


    public aeCoordenadaUK(String geoposicion, String tipoArsenal, Boolean accion) {
        aeGeoposicion = geoposicion;
        aeTipoArsenal = tipoArsenal;
        aeAccion = accion;
    }


    public String getGeoposicion() {
        return aeGeoposicion;
    }


    public void setGeoposicion(String geoposicion) {
        aeGeoposicion = geoposicion;
    }


    public String getTipoArsenal() {
        return aeTipoArsenal;
    }


    public void setTipoArsenal(String tipoArsenal) {
        aeTipoArsenal = tipoArsenal;
    }


    public Boolean getAccion() {
        return aeAccion;
    }


    public void setAccion(Boolean accion) {
        aeAccion = accion;
    }


    @Override
    public String toString(){
        return getClass().getName()
        + "\n Geoposicion    : "+ getGeoposicion    ()
        + "\n TipoArsenal    : "+ getTipoArsenal    ()
        + "\n Accion         : "+ getAccion         ();
    }
}
