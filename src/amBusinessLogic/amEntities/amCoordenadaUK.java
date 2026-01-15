package amBusinessLogic.amEntities;

public class amCoordenadaUK {
    
    private String  amGeoposicion;
    private String  amTipoArsenal;
    private Boolean amAccion;


    public amCoordenadaUK(String geoposicion, String tipoArsenal, Boolean accion) {
        amGeoposicion = geoposicion;
        amTipoArsenal = tipoArsenal;
        amAccion = accion;
    }


    public String getGeoposicion() {
        return amGeoposicion;
    }


    public void setGeoposicion(String geoposicion) {
        amGeoposicion = geoposicion;
    }


    public String getTipoArsenal() {
        return amTipoArsenal;
    }


    public void setTipoArsenal(String tipoArsenal) {
        amTipoArsenal = tipoArsenal;
    }


    public Boolean getAccion() {
        return amAccion;
    }


    public void setAccion(Boolean accion) {
        amAccion = accion;
    }


    @Override
    public String toString(){
        return getClass().getName()
        + "\n Geoposicion    : "+ getGeoposicion    ()
        + "\n TipoArsenal    : "+ getTipoArsenal    ()
        + "\n Accion         : "+ getAccion         ();
    }
}
