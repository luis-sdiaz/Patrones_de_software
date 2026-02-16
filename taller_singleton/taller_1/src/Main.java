public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Iniciando aplicación...");
        logger2.log("Procesando datos...");

        System.out.println("¿Es la misma instancia? " + (logger1 == logger2));
    }
}
