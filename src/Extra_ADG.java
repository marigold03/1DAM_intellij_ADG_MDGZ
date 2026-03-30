import java.util.Scanner;

public class Extra_ADG {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String[] nombres = new String[3];
        double[] precios = new double[3];
        double[] descuentos = new double[3];

        double totalSinDescuento = 0;
        double totalDescuento = 0;


        for (int i = 0; i < 3; i++) {
            System.out.print("Introduce el nombre del producto " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();

            System.out.print("Introduce el precio de " + nombres[i] + ": ");
            precios[i] = sc.nextDouble();
            sc.nextLine();

            if (precios[i] <= 50) {
                descuentos[i] = precios[i] * 0.08;
            } else {
                descuentos[i] = precios[i] * 0.10;
            }

            // Acumular totales
            totalSinDescuento += precios[i];
            totalDescuento += descuentos[i];
        }


        double totalConDescuento = totalSinDescuento - totalDescuento;


        System.out.println("\nResultados:");
        for (int i = 0; i < 3; i++) {

            System.out.printf("%s ... %.0f euros (descuento %.0f euros)\n", nombres[i], precios[i], descuentos[i]);
        }

        System.out.println("---------------------------");
        System.out.printf("Precio a pagar sin descuento (%.0f euros)\n", totalSinDescuento);
        System.out.printf("Precio a pagar con descuento (%.0f euros) con un ahorro de %.0f euros.\n",
                totalConDescuento, totalDescuento);


    }
}
