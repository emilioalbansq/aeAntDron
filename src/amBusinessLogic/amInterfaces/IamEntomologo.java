package amBusinessLogic.amInterfaces;

import java.util.List;

import amBusinessLogic.amEntities.amAlimento;
import amBusinessLogic.amEntities.amHormiga;
import amInfrastructure.AppException;

public interface IamEntomologo {
    public List<amHormiga> etlAntNest() throws InterruptedException, AppException;
    public List<amAlimento> etlAntFood() throws InterruptedException, AppException;
    public amHormiga alimentarAnt(amHormiga ant, amAlimento food) throws InterruptedException, AppException;;
}
