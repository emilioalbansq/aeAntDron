package aeDataAccess.aeDAOs;

import aeDataAccess.Helpers.DataHelperSQLiteDAO;
import aeDataAccess.aeDTOs.aeAlimentoTipoDTO;
import aeInfrastructure.AppException;

public class aeAlimentoTipoDAO extends DataHelperSQLiteDAO<aeAlimentoTipoDTO>{
    public aeAlimentoTipoDAO() throws AppException {
        super(aeAlimentoTipoDTO.class, "aeAlimentoTipo", "IdaeAlimentoTipo");
    }
}
