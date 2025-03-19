package Animal;
public class Bicho extends Animal {
    private String tipoDoAnimal, som;

    public Bicho(String nome, String tipoDoAnimal, String som) {
        super(nome);
        this.tipoDoAnimal = tipoDoAnimal;
        this.som = som;
    }

    public String getTipoDoAnimal() {
        return tipoDoAnimal;
    }

    public void setTipoDoAnimal(String tipoDoAnimal) {
        this.tipoDoAnimal = tipoDoAnimal;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    @Override
    void fazerSom() {
        System.out.println(" o tipo do animal é " + getTipoDoAnimal() + " o nome do animal é " + getNome()
                + "esta emitindo som " + getSom());
    }

}