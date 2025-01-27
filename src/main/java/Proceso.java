import java.io.IOException;

public class Proceso {
    public static final String RUTAGENERICA = "C:\\Program Files\\";
    public static void lanzarProcesoNavegador_Ofi(String carpetaProceso,String proceso ) {
        try {
            Process process = new ProcessBuilder(RUTAGENERICA+carpetaProceso+proceso+"\"").start();
            System.out.println("Proceso lanzado: " + proceso);
        } catch (IOException e) {
            System.out.println("Error al lanzar el proceso: " + e.getMessage());
        }
    }

    public static void lanzarProcesoSistema(String proceso){
        try {
            Process process = new ProcessBuilder(proceso).start();
            System.out.println("Proceso lanzado: " + proceso);
        } catch (IOException e) {
            System.out.println("Error al lanzar el proceso: " + e.getMessage());
        }
    }
}
