package amDataAccess.amDAOs;

import amDataAccess.Helpers.DataHelperSQLiteDAO;
import amDataAccess.amDTOs.amAntCiberDronDTO;
import amInfrastructure.AppException;

public class amAntCiberDronDAO extends DataHelperSQLiteDAO<amAntCiberDronDTO>{
    public amAntCiberDronDAO() throws AppException {
        super(amAntCiberDronDTO.class, "amAntCiberDron", "IdamAntCiberDron");
    }

}
