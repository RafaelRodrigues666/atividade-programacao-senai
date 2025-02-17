import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um Número: ");
        int numero = entrada.nextInt();

        if(numero >= 10 && numero <= 50){
            if(numero % 2 == 0){
                System.out.println(numero +" é par, e está entre 10 e 50!");
            }else{
                System.out.println(numero +" é ímpar, e está entre 10 e 50!");
            }
        }else{
            System.out.println("Seu número não está entre 10 e 50!! Tente Novamente.");
        }
    }
}