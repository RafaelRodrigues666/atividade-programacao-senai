import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite sua Idade: ");
        int idade = entrada.nextInt();

        System.out.println("Seu acesso (1 para Admin, 2 para Usuário): ");
        int acesso = entrada.nextInt();

        if(idade >= 18 || acesso == 1){
            System.out.println("Acesso Permitido");
            System.out.println("Nome: " +nome);
            System.out.println("Idade: " +idade);
            System.out.println("Admin: " +acesso);
        }else{
            System.out.println("Acesso Negado");
            System.out.println("Necessário 18 anos ou ter acesso Admin!");
        }
    }
}