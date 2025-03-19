import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("informe um numero");
            int numero1 = sc.nextInt();
            System.out.println(" informe outro numero");
            int numero2 = sc.nextInt();
            int resultado = numero1 / numero2;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("divisão por 0 não é possivel");
            System.out.println(" detalhe do erro" + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println(" não pode colocar letra ");
            System.out.println(" detalhe do erro:" + e.getMessage());

        } finally {
            System.out.println("programa finalizado");
        }
        sc.close();
    }
}