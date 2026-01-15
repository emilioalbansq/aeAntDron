//  © 2K26 ❱──💀──❰ pat_mic ? code is life : life is code

import java.util.List;
import java.util.Scanner;

import amBusinessLogic.FactoryBL;
import amBusinessLogic.amEntities.amAlimento;
import amBusinessLogic.amEntities.amEntomologo;
import amBusinessLogic.amEntities.amEntomologoGenetista;
import amBusinessLogic.amEntities.amHLarva;
import amBusinessLogic.amEntities.amHormiga;
import amBusinessLogic.amEntities.amNectarivoro;
import amDataAccess.amDAOs.amAlimentoTipoDAO;
import amDataAccess.amDAOs.amAntCiberDronDAO;
import amDataAccess.amDAOs.amHormigaDAO;
import amDataAccess.amDTOs.amAlimentoTipoDTO;
import amDataAccess.amDTOs.amAntCiberDronDTO;
import amDataAccess.amDTOs.amHormigaDTO;
import amInfrastructure.AppException;
import amInfrastructure.Tools.CMDInput;


public class App {

    public static void main(String[] args) throws AppException, InterruptedException   {

        Scanner sc = new Scanner(System.in);
        int maxIntentos = 3;

        for (int intento = 1; intento <= maxIntentos; intento++) {
            if (autenticar(sc, "patmic", "123")) {
                System.out.println("Acceso concedido.");
                sc.close();
                return;
            } else {
                int restantes = maxIntentos - intento;
                if (restantes > 0) {
                    System.out.println("Credenciales inválidas. Intentos restantes: " + restantes);
                } else {
                    System.out.println("Acceso denegado. Se alcanzó el número máximo de intentos.");
                }
            }
        }

        // =============================
        // DAOs
        // =============================
        amHormigaDAO hormigaDAO = new amHormigaDAO();
        amAlimentoTipoDAO alimentoDAO = new amAlimentoTipoDAO();

        // =============================
        // BL
        // =============================
        amEntomologo entomologo = new amEntomologo();

        amEntomologoGenetista genetista = new amEntomologoGenetista();

        // =============================
        // MENÚ
        // =============================
        int opcion;
        do {
            mostrarMenu();
            opcion = CMDInput.getNumeroPositivo("", "Por favor ingrese un número válido.");

            switch (opcion) {

                case 1 -> {
                    System.out.println("\n[ ETL ANT NEST ]");
                    entomologo.etlAntNest();
                }

                case 2 -> {
                    System.out.println("\n[ ETL ANT FOOD ]");
                    entomologo.etlAntFood();
                }

                case 3 -> {
                    System.out.println("\n[ ALIMENTAR HORMIGAS ]");

                    try {

                        // Traer datos desde BD
                        List<amHormigaDTO> hormigasDTO = hormigaDAO.readAll();
                        List<amAlimentoTipoDTO> alimentosDTO = alimentoDAO.readAll();

                        for (amHormigaDTO hDTO : hormigasDTO) {
                        
                            
                        
                            // Buscar alimento Nectarívoro
                            amAlimentoTipoDTO alimentoDTO = null;
                            for (amAlimentoTipoDTO aDTO : alimentosDTO) {
                                if ("Nectarivoro".equalsIgnoreCase(aDTO.getNombre())
                                 || "Nectarívoro".equalsIgnoreCase(aDTO.getNombre())) {
                                    alimentoDTO = aDTO;
                                    break;
                                }
                            }
                        
                            if (alimentoDTO == null) {
                                System.out.println("✗ No hay alimento válido");
                                break;
                            }
                        
                            // Mapear DTO → Entity 
                            amHormiga hormiga = new amHLarva();
                            hormiga.data = hDTO;
                        
                            amAlimento alimento = new amNectarivoro();
                            alimento.data = alimentoDTO;
                        
                            
                            entomologo.alimentarAnt(hormiga, alimento);
                        
                            // El alimento ya fue consumido
                            alimentosDTO.remove(alimentoDTO);
                        
                            System.out.println("✓ Hormiga alimentada");
                        }
                    
                    } catch (Exception e) {
                        System.err.println("Error al alimentar hormigas");
                    } finally {
                        System.out.println("..."); }
                    
                }

                case 4 -> {
                    try {
                        
                        // Traer alimentos desde BD
                        List<amAlimentoTipoDTO> alimentosDTO = alimentoDAO.readAll();

                        for (amAlimentoTipoDTO aDTO : alimentosDTO) {
                        
                            // Solo Nectarívoros
                            if (!"Nectarivoro".equalsIgnoreCase(aDTO.getNombre())
                             && !"Nectarívoro".equalsIgnoreCase(aDTO.getNombre())) {
                                continue;
                            }
                        
                            // Mapear DTO → Entity
                            amAlimento alimento = new amNectarivoro();
                            alimento.data = aDTO;
                        
                            // Inyectar genoma usando TU lógica existente
                            genetista.amPreparar(alimento, null);
                        
                            // Persistir cambios
                            alimentoDAO.update(alimento.data);
                        
                            System.out.println("✓ Genoma inyectado en alimento ");
                        }
                    
                    } catch (Exception e) {
                        System.err.println("Error al inyectar genoma");
                    }

                }

                case 5 -> System.out.println("Saliendo...");

                default -> System.out.println("Opción inválida");
            }

        } while (opcion != 5);

    
    }

    private static void mostrarMenu() {
        System.out.println("""
            
            ===== MENÚ ENTOMÓLOGO =====
            1. Cosechar hormigas (ETL AntNest)
            2. Cosechar alimentos (ETL AntFood)
            3. Alimentar hormiga
            4. Inyectar genoma (Genetista)
            5. Salir
            """);
        System.out.print("Opción: ");
    }

    
    private static boolean autenticar(Scanner sc, String USER, String PASS) {
        System.out.print("Usuario: ");
        String u = sc.nextLine();
        System.out.print("Contraseña: ");
        String p = sc.nextLine();
        return USER.equals(u) && PASS.equals(p);
    }
}