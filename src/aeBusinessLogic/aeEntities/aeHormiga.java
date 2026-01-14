package aeBusinessLogic.aeEntities;

import aeBusinessLogic.FactoryBL;
import aeDataAccess.aeDAOs.aeHormigaDAO;
import aeDataAccess.aeDTOs.aeHormigaDTO;

public abstract class aeHormiga {
    protected FactoryBL<aeHormigaDTO> factory = new FactoryBL<>(aeHormigaDAO.class);
    public aeHormigaDTO data = new aeHormigaDTO();

    // protected HormigaDAO hormigaDAO;
    // protected Hormiga() throws AppException  {
    //     this.hormigaDAO = new HormigaDAO();
    // }

    // public FactoryBL<HormigaDTO> factory = new FactoryBL<>(() -> {
    //     try {
    //         return new HormigaDAO();
    //     } catch (Exception e) {
    //         new RuntimeException();
    //     }
    // });
}
