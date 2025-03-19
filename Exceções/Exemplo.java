public class Exemplo {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("divisão por 0 não é permitida ");

        } finally {
            System.out.println(" programa finalizado");
        }
    }

}