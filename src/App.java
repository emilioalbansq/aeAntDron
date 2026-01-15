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
import amBusinessLogic.amEntities.amX;
import amDataAccess.amDAOs.amAlimentoDAO;
import amDataAccess.amDAOs.amAntCiberDronDAO;
import amDataAccess.amDAOs.amHormigaDAO;
import amDataAccess.amDTOs.amAlimentoDTO;
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
                System.out.println("Nombres: Ariel Montufar, Emilio Alban");
                System.out.println("C.I: 1729372274,1751257088 ");
                break;
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
        amAlimentoDAO alimentoDAO = new amAlimentoDAO();

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
                        List<amAlimentoDTO> alimentosDTO = alimentoDAO.readAll();

                        for (amHormigaDTO hDTO : hormigasDTO) {
                        
                            
                        
                            // Buscar alimento Nectarívoro
                            amAlimentoDTO alimentoDTO = null;
                            for (amAlimentoDTO aDTO : alimentosDTO) {
                                if (aDTO.getIdAlimentoTipo() == 4) {
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
                        
                            System.out.println(hormiga.data.getNombre() + " alimentada");
                        }
                    
                    } catch (Exception e) {
                        System.err.println("Error al alimentar hormigas");
                        e.printStackTrace();
                    } finally {
                        System.out.println("..."); }
                    
                }

                case 4 -> {
                    try {
                        System.out.println("[ INYECTAR GENOMAS Y ALIMENTAR HORMIGAS ]");
                        // Traer alimentos desde BD
                        List<amHormigaDTO> hormigasDTO = hormigaDAO.readAll();
                        List<amAlimentoDTO> alimentosDTO = alimentoDAO.readAll();
                                        
                        amAlimento alimentoValido = null;
                                        
                        for (amAlimentoDTO aDTO : alimentosDTO) {
                            if (aDTO.getIdAlimentoTipo() == 4) {
                            
                                amNectarivoro n = new amNectarivoro();
                                n.data = aDTO;

                                
                                alimentoValido = n;
                                break;
                            }
                        }
                    
                        if (alimentoValido == null) {
                            System.out.println("✗ No hay alimento Nectarívoro válido");
                            return;
                        }
                    
                        for (amHormigaDTO hDTO : hormigasDTO) {
                        
                            if (hDTO.getIdHormigaTipo() != 1) {
                                continue;
                            }
                        
                            amHLarva larva = new amHLarva();
                            larva.data = hDTO;
                            
                            genetista.amPreparar(alimentoValido, new amX("X"));
                            genetista.alimentarAnt(larva, alimentoValido);
                            System.out.println(larva.data.getNombre() + " alimentada");
                        }
                    
                        System.out.println("✓ Hormigas alimentadas con genotipo");
                    
                    } catch (Exception e) {
                        System.err.println("Error al inyectar genoma");
                        e.printStackTrace();
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