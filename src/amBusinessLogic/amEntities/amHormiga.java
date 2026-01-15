package amBusinessLogic.amEntities;

import amBusinessLogic.FactoryBL;
import amDataAccess.amDAOs.amHormigaDAO;
import amDataAccess.amDTOs.amHormigaDTO;

public abstract class amHormiga {
    protected FactoryBL<amHormigaDTO> factory = new FactoryBL<>(amHormigaDAO.class);
    public amHormigaDTO data = new amHormigaDTO();
    protected boolean SuperHabilidad = false;
    

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
