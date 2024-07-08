import java.util.Scanner;

public class ConversorDeMoneda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("= Sea bienvenido/a al Conversor de Moneda =]");
            System.out.println("1) Dólar => Peso argentino");
            System.out.println("2) Peso argentino => Dólar");
            System.out.println("3) Dólar => Real brasileño");
            System.out.println("4) Real brasileño => Dólar");
            System.out.println("5) Dólar => Peso colombiano");
            System.out.println("6) Peso colombiano => Dólar");
            System.out.println("7) Salir");
            System.out.print("Elija una opción válida: ");

            int opcion = scanner.nextInt();

            if (opcion == 7) {
                System.out.println("Gracias por usar el conversor de moneda. ¡Hasta luego!");
                break;
            }

            try {
                double tasaCambio = 0;
                double cantidad = 0;

                switch (opcion) {
                    case 1:
                        tasaCambio = ApiExchangeRate.obtenerTasaCambio("ARS");
                        System.out.print("Ingrese la cantidad en Dólares: ");
                        cantidad = scanner.nextDouble();
                        System.out.println("Equivale a " + (cantidad * tasaCambio) + " Pesos argentinos.");
                        break;
                    case 2:
                        tasaCambio = ApiExchangeRate.obtenerTasaCambio("ARS");
                        System.out.print("Ingrese la cantidad en Pesos argentinos: ");
                        cantidad = scanner.nextDouble();
                        System.out.println("Equivale a " + (cantidad / tasaCambio) + " Dólares.");
                        break;
                    case 3:
                        tasaCambio = ApiExchangeRate.obtenerTasaCambio("BRL");
                        System.out.print("Ingrese la cantidad en Dólares: ");
                        cantidad = scanner.nextDouble();
                        System.out.println("Equivale a " + (cantidad * tasaCambio) + " Reales brasileños.");
                        break;
                    case 4:
                        tasaCambio = ApiExchangeRate.obtenerTasaCambio("BRL");
                        System.out.print("Ingrese la cantidad en Reales brasileños: ");
                        cantidad = scanner.nextDouble();
                        System.out.println("Equivale a " + (cantidad / tasaCambio) + " Dólares.");
                        break;
                    case 5:
                        tasaCambio = ApiExchangeRate.obtenerTasaCambio("COP");
                        System.out.print("Ingrese la cantidad en Dólares: ");
                        cantidad = scanner.nextDouble();
                        System.out.println("Equivale a " + (cantidad * tasaCambio) + " Pesos colombianos.");
                        break;
                    case 6:
                        tasaCambio = ApiExchangeRate.obtenerTasaCambio("COP");
                        System.out.print("Ingrese la cantidad en Pesos colombianos: ");
                        cantidad = scanner.nextDouble();
                        System.out.println("Equivale a " + (cantidad / tasaCambio) + " Dólares.");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, intente nuevamente.");
                }
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
