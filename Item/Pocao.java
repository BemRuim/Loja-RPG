package Item;

public class Pocao extends Item{
    public Pocao(String nome, double valor, String raridade){
        super(nome, valor, raridade);
    }

    
    private int cura;

    public int getCura(){
        return cura;
    }

    

}


