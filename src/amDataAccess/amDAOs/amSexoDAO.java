package amDataAccess.amDAOs;

import amDataAccess.Helpers.DataHelperSQLiteDAO;
import amDataAccess.amDTOs.amSexoDTO;
import amInfrastructure.AppException;

public class amSexoDAO extends DataHelperSQLiteDAO<amSexoDTO>{
    public amSexoDAO() throws AppException {
        super(amSexoDTO.class, "amSexo", "IdamSexo");
    }
}
