package Item;

public class Arma extends Item{
    private int dano;

    public Arma(String nome, double valor, String raridade, int dano){
        super(nome, valor, raridade);
        this.dano = dano;
    }

     
   

    public int getDano(){
        return dano;
    }

   
}