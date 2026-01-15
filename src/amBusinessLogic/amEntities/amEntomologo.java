package amBusinessLogic.amEntities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import amBusinessLogic.amInterfaces.IamEntomologo;
import amBusinessLogic.amInterfaces.IamIngestaNativa;
import amDataAccess.amDAOs.amAlimentoDAO;
import amDataAccess.amDAOs.amAlimentoDAO;
import amDataAccess.amDAOs.amHormigaDAO;
import amInfrastructure.AppConfig;
import amInfrastructure.AppException;
import amInfrastructure.Tools.CMDColor;
import amInfrastructure.Tools.CMDProgress;

public class amEntomologo implements IamEntomologo,  IamIngestaNativa{
    



    public amAlimento amPreparar(amAlimento alimento) {
        
        if (!inyectar(null))
            System.out.println("[Preparado]-<" + alimento.getClass().getSimpleName() + ">-");
        return alimento;
    }

    @Override
    public List<amHormiga> etlAntNest() throws InterruptedException, AppException {
        
        System.out.println("--ENTOMOLOGO--");
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
        int i =0 ;
        try {
            List<String> lineas = Files.readAllLines(Paths.get(AppConfig.ANT_FOOD_PATH));

            for (String linea : lineas) {
            
                // delimitador REAL: guion
                String[] tokens = linea.split("-");

                for (String t : tokens) {
                i++;
                    String dato = t.trim();

                    if (dato.isEmpty()) continue;

                    CMDProgress.showWaiting();

                    if (dato.equalsIgnoreCase("Nectarívoros")
                     || dato.equalsIgnoreCase("Nectarivoros")) {

                        System.out.println(CMDColor.BLUE +"   Nectarívoros" +CMDColor.RESET);

                        amNectarivoro n = new amNectarivoro();

                        n.data.setNombre("Nectarívoro-" + i);
                        n.data.setIdAlimentoTipo(4);
                        n.data.setDescripcion("Alimento para hormigas nectarívoras");

                        resultado.add(n);

                        amAlimentoDAO alimentoDAO = new amAlimentoDAO();
                        alimentoDAO.create(n.data);

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
        
        amPreparar(food);
        if (food instanceof amNectarivoro){
            System.out.println("Entomologo está alimentando la hormiga...");
            food.data.setEstado("x");
            amAlimentoDAO amAlimentoDAO = new amAlimentoDAO();
            amAlimentoDAO.update(food.data);
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
        return false;
    }

    
}
