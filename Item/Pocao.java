package Item;
public class Pocao extends Item{
    private int cura;

    public Pocao(String nome, double valor, String raridade, int cura){
        super(nome, valor, raridade);
        this.cura = cura;
    }

    public int getCura(){
        return cura;
    }

    

}


