import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        int idade;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("informe sua idade");
            idade = sc.nextInt();
         
        } catch (IllegalArgumentException e) {
            System.out.println(" a idade não corresponde");

        } finally {
            System.out.println(" operação realizada com sucesso");

        }
    }
}
