package amDataAccess.amDAOs;

import amDataAccess.Helpers.DataHelperSQLiteDAO;
import amDataAccess.amDTOs.amAlimentoTipoDTO;
import amInfrastructure.AppException;

public class amAlimentoTipoDAO extends DataHelperSQLiteDAO<amAlimentoTipoDTO>{
    public amAlimentoTipoDAO() throws AppException {
        super(amAlimentoTipoDTO.class, "amAlimentoTipo", "IdamAlimentoTipo");
    }
}
