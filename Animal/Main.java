package Animal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Bicho> list = new ArrayList<>();
        ArrayList<Gato> list2 = new ArrayList<>();
        ArrayList<Cachorro> list3 = new ArrayList<>();

        int op = 0;

        while (op != 3) {
            informacoes();
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    informacoes2();
                    int escolha = sc.nextInt();
                    sc.nextLine();
                    if (escolha == 1) {
                        System.out.println("informe a raça do cachorro ");
                        String nome1 = sc.nextLine();
                        System.out.println(" informe o nome do cachorro");
                        String raca = sc.nextLine();
                        list3.add(new Cachorro(nome1, raca));
                    }
                    if (escolha == 2) {
                        System.out.println("informe o nome do animal");
                        String nome2 = sc.nextLine();
                        System.out.println("informe a cor  do animal");
                        String cor = sc.nextLine();

                        list2.add(new Gato(nome2, cor));
                    }
                    if (escolha == 3) {
                        System.out.println("informe o nome do animal");
                        String nome3 = sc.nextLine();
                        System.out.println("informe o tipo do animal");
                        String tipoDoAnimal = sc.nextLine();
                        System.out.println("informe o barulho do animal");
                        String som = sc.nextLine();
                        list.add(new Bicho(nome3, tipoDoAnimal, som));
                    }

                    break;
                case 2:
                    informacoes3();
                    int escolha2 = sc.nextInt();
                    if (escolha2 == 1) {
                        for (Cachorro cachorro : list3) {

                            cachorro.fazerSom();
                        }

                    }
                    if (escolha2 == 2) {
                        for (Gato gato : list2) {

                            gato.fazerSom();
                        }

                    }

                    if (escolha2 == 2) {

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

    public static void informacoes2() {
        System.out.println("===========================");
        System.out.println("informe o tipo de animal que vc quer cadastrar");
        System.out.println("1 Cachorro");
        System.out.println("2- gato");
        System.out.println("3- animal de outra especime");
        System.out.println("===========================");
    }

    public static void informacoes3() {
        System.out.println("===========================");
        System.out.println("informe o tipo de animal que voce quer ver o som ");
        System.out.println("1 Cachorro");
        System.out.println("2- gato");
        System.out.println("3- animal de outra especime");
        System.out.println("===========================");
    }
}