package aeDataAccess.aeDAOs;

import aeDataAccess.Helpers.DataHelperSQLiteDAO;
import aeDataAccess.aeDTOs.aeAntCiberDronDTO;
import aeInfrastructure.AppException;

public class aeAntCiberDronDAO extends DataHelperSQLiteDAO<aeAntCiberDronDTO>{
    public aeAntCiberDronDAO() throws AppException {
        super(aeAntCiberDronDTO.class, "aeAntCiberDron", "IdaeAntCiberDron");
    }

}
