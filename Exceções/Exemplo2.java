import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println(" informe o valor de x ");
            int x = sc.nextInt();
            int y = 100 / x;
            System.out.println(" resultado é " + y);

        } catch (InputMismatchException e) {

            System.out.println("formato invalido");
            System.out.println("Detalhe do erro " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Detalhe do erro " + e.getMessage());
            System.out.println(" operação invalida");
        }finally{
            System.out.println("Conexão estabelecida");
        }
sc.close();
    }
}
