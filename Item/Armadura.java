package Item;

public class Armadura extends Item{
      private int armadura;

    public Armadura(String nome, double valor, String raridade, int armadura){
        super(nome, valor, raridade);
        this.armadura = armadura;
    }

   

    public int getArmadura(){
        return armadura;
    }
}
