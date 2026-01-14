package aeBusinessLogic.aeEntities;

import java.util.List;

import aeDataAccess.aeDTOs.aeHormigaDTO;
import aeInfrastructure.AppException;

public class aeHLarva extends aeHormiga {

    public aeHormigaDTO getLava(int id) throws AppException{
        data = factory.getBy(id);
        return data;
    }
    
    public List<aeHormigaDTO> getLarvas() throws AppException {
        return factory.getAll();
    }
    
    public aeHormiga aeComer(String comida) {
        if (comida.equals("carne")) {
            return new aeHSoldado();
        }
        return this;
    }

    @Override
    public String toString() {
        return "aeHLarva {}";
    }
}
