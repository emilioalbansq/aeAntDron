package aeDataAccess.aeDAOs;

import aeDataAccess.Helpers.DataHelperSQLiteDAO;
import aeDataAccess.aeDTOs.aeSexoDTO;
import aeInfrastructure.AppException;

public class aeSexoDAO extends DataHelperSQLiteDAO<aeSexoDTO>{
    public aeSexoDAO() throws AppException {
        super(aeSexoDTO.class, "aeSexo", "IdaeSexo");
    }
}
