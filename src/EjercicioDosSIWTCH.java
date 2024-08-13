import java.io.IOException;
import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite su calificación");
        int calificacion = scanner.nextInt();

        switch (calificacion) {
            case 1:
            case 2:
                System.out.println("Su califcación es F");
                break;
            case 3:
            case 4:
                System.out.println("Su califcación es D");
                break;
            case 5:
            case 6:
                System.out.println("Su califcación es C");
                break;
            case 7:
            case 8:
                System.out.println("Su califcación es B");
                break;
            case 9:
            case 10:
                System.out.println("Su califcación es A");
                break;
            default:
                System.out.println("Número no válido, por favor verifique");
        }
    }
}//CIERRA SWITCH