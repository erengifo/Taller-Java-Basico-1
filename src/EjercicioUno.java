public class EjercicioUno {
    public static void main(String[] args) {
        int A = 30;
        int B = 40;
        int C = 90;


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