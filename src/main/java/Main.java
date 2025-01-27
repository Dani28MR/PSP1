import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("""
                    ¿Qué quieres ejecutar?
                    1. Navegadores
                    2. App del sistema
                    3. App de ofimática
                    4. Salir
                    """);
            int opcion = new Scanner(System.in).nextInt();
            switch (opcion){
                case 1 -> {
                    System.out.println("""
                        1. Firefox
                        2. Google Chrome
                        3. Salir
                        """);

                    int opcionNavegador = new Scanner(System.in).nextInt();
                    switch (opcionNavegador){
                        case 1 -> {
                            if (new File(Proceso.RUTAGENERICA+"Mozilla Firefox").exists()){
                                Proceso.lanzarProcesoNavegador_Ofi("Mozilla Firefox\\","firefox.exe");
                            }else{
                                System.out.println("Firefox no está instalado en este equipo.");
                            }

                        }
                        case 2 -> {
                            if (new File(Proceso.RUTAGENERICA+"Google\\Chrome\\Application").exists()){
                            Proceso.lanzarProcesoNavegador_Ofi("Google\\Chrome\\Application\\","chrome.exe");
                            }else{
                                System.out.println("Chrome no está instalado en este equipo.");
                            }
                        }

                        case 3 -> System.out.println("");
                        default -> System.out.println("Opción invalida");
                    }
                }



                case 2 -> {
                    System.out.println("""
                        1. Calculadora
                        2. Bloc de notas
                        3. Salir
                        """);
                    int opcionSistema= new Scanner(System.in).nextInt();
                    switch (opcionSistema){
                        case 1 -> Proceso.lanzarProcesoSistema("calc.exe");
                        case 2 -> Proceso.lanzarProcesoSistema("notepad.exe");
                        case 3 -> System.out.println("");
                        default -> System.out.println("Opción invalida");
                    }
                }

                case 3 -> {
                    System.out.println("""
                        1. Microsoft Word
                        2. Microsoft PowerPoint
                        3. Microsoft Excel
                        4. Microsoft Access
                        5. Microsoft Outlook
                        6. Salir
                        """);
                    int opcionOfimatica = new Scanner(System.in).nextInt();
                    switch (opcionOfimatica){
                        case 1 -> {
                            if (new File(Proceso.RUTAGENERICA+"Microsoft Office\\Office16").exists()){
                                Proceso.lanzarProcesoNavegador_Ofi("Microsoft Office\\Office16\\","winword.exe");
                            }else{
                                System.out.println("Firefox no está instalado en este equipo.");
                            }

                        }
                        case 2 -> {
                            if (new File(Proceso.RUTAGENERICA+"Microsoft Office\\Office16").exists()){
                                Proceso.lanzarProcesoNavegador_Ofi("Microsoft Office\\Office16\\","powerpnt.exe");
                            }else{
                                System.out.println("Chrome no está instalado en este equipo.");
                            }
                        }
                        case 3 -> {
                            if (new File(Proceso.RUTAGENERICA+"Microsoft Office\\Office16").exists()){
                                Proceso.lanzarProcesoNavegador_Ofi("Microsoft Office\\Office16\\","excel.exe");
                            }else{
                                System.out.println("Chrome no está instalado en este equipo.");
                            }
                        }
                        case 4 -> {
                            if (new File(Proceso.RUTAGENERICA+"Microsoft Office\\Office16").exists()){
                                Proceso.lanzarProcesoNavegador_Ofi("Microsoft Office\\Office16\\","msaccess.exe");
                            }else{
                                System.out.println("Chrome no está instalado en este equipo.");
                            }
                        }
                        case 5 -> {
                            if (new File(Proceso.RUTAGENERICA+"Microsoft Office\\Office16").exists()){
                                Proceso.lanzarProcesoNavegador_Ofi("Microsoft Office\\Office16\\","outlook.exe");
                            }else{
                                System.out.println("Chrome no está instalado en este equipo.");
                            }
                        }
                        case 6 -> System.out.println("");
                        default -> System.out.println("Opción invalida");
                    }
                }
                case 4 -> {
                    System.out.println("Saliendo del programa");
                    isRunning = false;
                }
                default -> System.out.println("Opción invalida");
            }
        }
    }
}
