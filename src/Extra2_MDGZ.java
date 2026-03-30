import java.util.Scanner;
public class Extra2_MDGZ {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("¿Cuántas horas has trabajado esta semana? ");
            int horas = sc.nextInt();

            int pagoNormal;
            int pagoExtra = 0;

            if (horas <= 40) {
                pagoNormal = horas * 16;
            } else {
                pagoNormal = 40 * 16;
                int extras = horas - 40;
                pagoExtra = extras * 20;
            }

            int total = pagoNormal + pagoExtra;
            System.out.println("Pago por horas normales: " + pagoNormal + "€");
            System.out.println("Pago por horas extra: " + pagoExtra + "€");
            System.out.println("Salario semanal total: " + total + "€");
    }
}