import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um Número: ");
        int numero = entrada.nextInt();

        if (numero >= 20 && numero <= 90) {
            System.out.println("Seu número está no intervalo (20 a 90): " +numero);
        }else {
            System.out.println("Seu numero não está entre (20 a 90) Tente Novamente.");
        }
    }
}