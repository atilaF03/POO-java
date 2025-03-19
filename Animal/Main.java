package Animal;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Bicho> list = new ArrayList<>();
        ArrayList<Cachorro> list2 = new ArrayList<>();

        int op = 0;

        while (op != 3) {
            informacoes();
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    System.out.println("informe o nome do animal");
                    String nome = sc.nextLine();
                    System.out.println("informe o tipo do animal");
                    String tipoDoAnimal = sc.nextLine();
                    System.out.println("informe o barulho do animal");
                    String som = sc.nextLine();
                    list.add(new Bicho(nome, tipoDoAnimal, som));
                    break;
                case 2:
                    if (list.isEmpty()) {
                        System.out.println(" a lista está vazai por favor cadastre um animal");
                    } else {
                        for (Bicho bicho : list) {

                            bicho.fazerSom();
                        }
                    }
                    break;
                case 3:
                    System.out.println("programa encerrado");
                default:
                    break;
            }
        }
        sc.close();

    }

    public static void informacoes() {
        System.out.println("===========================");
        System.out.println("1- cadastrar bicho");
        System.out.println("2- Ver barulho do bicho");
        System.out.println("3- encerrar");
        System.out.println("===========================");
    }
}