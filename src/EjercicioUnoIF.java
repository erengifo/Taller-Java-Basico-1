
import java.util.Scanner;
import java.io.IOException;
public class EjercicioUnoIF {
    public static void main(String[] args) {
        /*int primerNumero = 30;
        int segundoNumero = 40;
        int terminalNumero= 90; Variables quemadas */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int A = scanner.nextInt();
        System.out.println("Ingrese el segundo número:");
        int B = scanner.nextInt();
        System.out.println("Ingrese el tercer número:");
        int C = scanner.nextInt();


        if (A != B && A != C && C != B) {
            if (A > B && A > C) {
                System.out.println("A es mayor");
                if (B < C) {
                    System.out.println("b es menor");
                } else {
                    System.out.println("C es menor");
                }

            } else if (B > A && B > C) {
                System.out.println("B es mayor");

                if (A < C) {
                    System.out.println("A es menor");
                } else {
                    System.out.println("C es menor");
                }


            } else {
                System.out.println("C es mayor");
                if (A < B) {
                    System.out.println("A es menor");
                } else {
                    System.out.println("B es menor");
                }

            }
        } else {
            System.out.println("Los números son iguales, por favor intentar de nuevo");
        }

    }


}