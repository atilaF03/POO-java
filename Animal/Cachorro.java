package Animal;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    void fazerSom() {
        System.out.println(" nome do animal é " + getNome() + " a raça é" + getRaca() + " au au ");

    }
}
