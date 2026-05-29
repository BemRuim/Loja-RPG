package Item;

public class Armadura extends Item{
    public Armadura(String nome, double valor, String raridade){
        super(nome, valor, raridade);
    }

    private int armadura;

    int getArmadura(){
        return armadura;
    }
}
