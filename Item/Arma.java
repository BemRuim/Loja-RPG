package Item;

public class Arma extends Item{
    public Arma(String nome, double valor, String raridade){
        super(nome, valor, raridade);
    }

    
    private int dano;

    public int getDano(){
        return dano;
    }

   
}