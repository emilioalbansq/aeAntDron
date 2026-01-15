package amBusinessLogic.amEntities;

import java.util.List;

import amDataAccess.amDTOs.amHormigaDTO;
import amInfrastructure.AppException;

public class amHReina extends amHormiga {
    private String amHuevo;


    public amHormigaDTO getReina(int id) throws AppException{
        data = factory.getBy(id);
        return data;
    }
    
    public List<amHormigaDTO> getReinas() throws AppException {
        return factory.getAll();
    }
    

    @Override
    public String toString() {
        return "amHLarva {}";
    }

    public amHReina() {
        this.amHuevo = "---Huevo de Hormiga Reina Reproductora---";
    }

    public void amSuperReproductora() {
        this.SuperHabilidad = true;
        System.out.println("La Hormiga Reina ha activado su super habilidad de reproducción masiva.");
    }
}
