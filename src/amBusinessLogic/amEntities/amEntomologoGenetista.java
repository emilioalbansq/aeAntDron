package amBusinessLogic.amEntities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import amBusinessLogic.amInterfaces.IamEntomologo;
import amBusinessLogic.amInterfaces.IamIngestaNativa;
import amDataAccess.amDAOs.amAlimentoDAO;
import amDataAccess.amDAOs.amHormigaDAO;
import amInfrastructure.AppConfig;
import amInfrastructure.AppException;
import amInfrastructure.Tools.CMDColor;
import amInfrastructure.Tools.CMDProgress;

public class amEntomologoGenetista implements IamEntomologo,  IamIngestaNativa{

    public amAlimento amPreparar(amAlimento alimento, amGenoAlimento genoAlimento) {
        
        if (inyectar(genoAlimento)){
            int random = (int)(Math.random() * 3) + 1;
            switch (random) {
                case 1:
                    System.out.println("[Preparado]-<" + alimento.getClass().getSimpleName() + " + " + genoAlimento.getClass().getSimpleName() + ">-");
                    alimento.genoma = new amX("X");
                    break;
                case 2:
                    System.out.println("[Preparado]-<" + alimento.getClass().getSimpleName() + " + " + genoAlimento.getClass().getSimpleName() + ">-");
                    alimento.genoma = new amXX("XX");
                    break;
                case 3:
                    System.out.println("[Preparado]-<" + alimento.getClass().getSimpleName() + " + " + genoAlimento.getClass().getSimpleName() + ">-");
                    alimento.genoma = new amXY("XY");
                    break;
                default:
                    break;
            }
        }
        return alimento;
    }

    @Override
    public List<amHormiga> etlAntNest() throws InterruptedException, AppException {
        
        System.out.println("--ENTOMOLOGO GENETISTA--");
        List<amHormiga> resultado = new ArrayList<>();

        System.out.println("[+] amHormigas");

        try {
            List<String> lineas = Files.readAllLines(Paths.get(AppConfig.ANT_NEST_PATH));
            int i = 0;
            for (String linea : lineas) {

                // delimitador REAL: coma
                String[] tokens = linea.split(",");

                for (String t : tokens) {
                    i++;
                    String dato = t.trim();

                    if (dato.isEmpty()) continue;

                    CMDProgress.showSpinner();

                    // CASO D → solo HLarva
                    if (dato.equalsIgnoreCase("HLarva")) {

                        System.out.println(CMDColor.BLUE +"   HLarva" + CMDColor.RESET);

                        amHormiga h = new amHLarva();

                        h.data.setNombre("HLarva-" + i);
                        h.data.setIdHormigaTipo(1);
                        h.data.setIdSexo(4);
                        h.data.setIdEstado(1);

                        resultado.add(h);

                        amHormigaDAO hormigaDAO = new amHormigaDAO();
                        hormigaDAO.create(h.data);

                    } else if (dato.startsWith("H") && !dato.equalsIgnoreCase("Hormiga")) {

                        System.out.println(CMDColor.RED +"  HLarva "  +CMDColor.RESET);
                    }
                }
        }

        } catch (IOException e) {
            System.err.println("Error leyendo AntNest.txt");
        }

        return resultado;
    }

    @Override
    public List<amAlimento> etlAntFood() throws InterruptedException, AppException {
        
        List<amAlimento> resultado = new ArrayList<>();

        System.out.println("[+] Alimentos");

        try {
            List<String> lineas = Files.readAllLines(
                Paths.get("storage/DataFiles/AntFood.txt")
            );

            for (String linea : lineas) {

                // delimitador REAL: guion
                String[] tokens = linea.split("-");

                for (String t : tokens) {

                    String dato = t.trim();

                    if (dato.isEmpty()) continue;

                    CMDProgress.showSpinner();

                    if (dato.equalsIgnoreCase("Nectarívoros")
                     || dato.equalsIgnoreCase("Nectarivoros")) {

                        System.out.println(CMDColor.BLUE +"   Nectarívoros" +CMDColor.RESET);

                        amNectarivoro n = new amNectarivoro();

                        resultado.add(n);

                        amAlimentoDAO alimentoTipoDAO = new amAlimentoDAO();
                        alimentoTipoDAO.create(n.data);

                        resultado.add(new amNectarivoro());

                    } else if (
                        dato.equalsIgnoreCase("Carnívoro")
                     || dato.equalsIgnoreCase("Herbívoro")
                     || dato.equalsIgnoreCase("Omnívoro")
                     || dato.equalsIgnoreCase("Insectívoro")
                    ) {

                        System.out.println(CMDColor.RED +"   Nectarívoros "  +CMDColor.RESET);
                    }
                }
            }

        } catch (IOException e) {
            System.err.println("Error leyendo AntFood.txt");
        }

        return resultado;

    }

    @Override
    public amHormiga alimentarAnt(amHormiga ant, amAlimento food) throws InterruptedException, AppException {
        
        
        if (food instanceof amNectarivoro){
            System.out.println("Entomologo está alimentando la hormiga...");
            food.data.setEstado("x");
            amAlimentoDAO amAlimentoDAO = new amAlimentoDAO();
            amAlimentoDAO.update(food.data);

            if (food.genoma instanceof amX){
                ant.data.setIdSexo(3);
                System.out.println(ant.data.getNombre() + " : pasa a ser Asexual");
            } else if (food.genoma instanceof amXX){
                ant.data.setIdSexo(2);
                System.out.println(ant.data.getNombre() + " : aun con su mismo Sexo");
            } 
            else if (food.genoma instanceof amXY){
                ant.data.setIdSexo(1);
                System.out.println(ant.data.getNombre() + " : aun con su mismo Sexo");
            }

            ant.data.setIdHormigaTipo(4);
            System.out.println(ant.data.getNombre() + " : HLarva -> HReina");

            amHormigaDAO amHormigaDAO = new amHormigaDAO();
            amHormigaDAO.update(ant.data);
            return ant;
        }
        else {
            System.out.println("LA HORMIGA MUERE...");
            ant.data.setEstado("Muerta");
            
            amHormigaDAO amHormigaDAO = new amHormigaDAO();
            amHormigaDAO.update(ant.data);
            return ant;
        }

    }

    @Override
    public boolean inyectar(amGenoAlimento genoAlimento) {
        
        
        return true;

    }
}
