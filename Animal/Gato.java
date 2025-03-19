package Animal;

public class Gato extends Animal {
   private String cor;

public Gato(String nome, String cor) {
    super(nome);
    this.cor = cor;
}

public String getCor() {
    return cor;
}

public void setCor(String cor) {
    this.cor = cor;
}
   
@Override
void fazerSom() {
     System.out.println(" o nome do gato é "+getNome()+ " a cor do gato é"+getCor()+ " miau miau ");
}
}
