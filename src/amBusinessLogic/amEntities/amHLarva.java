package amBusinessLogic.amEntities;

import java.util.List;

import amDataAccess.amDTOs.amHormigaDTO;
import amInfrastructure.AppException;

public class amHLarva extends amHormiga {

    public amHormigaDTO getLava(int id) throws AppException{
        data = factory.getBy(id);
        return data;
    }
    
    public List<amHormigaDTO> getLarvas() throws AppException {
        return factory.getAll();
    }
    
    public amHormiga aeComer(String comida) {
        if (comida.equals("carne")) {
            return new amHReina();
        }
        return this;
    }

    @Override
    public String toString() {
        return "amHLarva {}";
    }
}
