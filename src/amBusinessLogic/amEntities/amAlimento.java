package amBusinessLogic.amEntities;

import amBusinessLogic.FactoryBL;
import amDataAccess.amDAOs.amAlimentoDAO;
import amDataAccess.amDTOs.amAlimentoDTO;


public abstract class amAlimento {

    protected FactoryBL<amAlimentoDTO> factory = new FactoryBL<>(amAlimentoDAO.class);
    public amAlimentoDTO data = new amAlimentoDTO();
    protected amGenoAlimento genoma;

}
