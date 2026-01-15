package amBusinessLogic.amEntities;

import amBusinessLogic.FactoryBL;
import amDataAccess.amDAOs.amAlimentoTipoDAO;
import amDataAccess.amDTOs.amAlimentoTipoDTO;

public abstract class amAlimento {

    protected FactoryBL<amAlimentoTipoDTO> factory = new FactoryBL<>(amAlimentoTipoDAO.class);
    public amAlimentoTipoDTO data = new amAlimentoTipoDTO();

}
