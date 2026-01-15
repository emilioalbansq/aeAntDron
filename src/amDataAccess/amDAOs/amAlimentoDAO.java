package amDataAccess.amDAOs;

import amDataAccess.Helpers.DataHelperSQLiteDAO;
import amDataAccess.amDTOs.amAlimentoDTO;
import amDataAccess.amDTOs.amAlimentoTipoDTO;
import amInfrastructure.AppException;

public class amAlimentoDAO extends DataHelperSQLiteDAO<amAlimentoDTO>{

    public amAlimentoDAO() throws AppException {
        super(amAlimentoDTO.class, "amAlimento", "IdamAlimento");
        //TODO Auto-generated constructor stub
    }

}
