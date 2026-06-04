package Inventario;
import java.util.Scanner;
import Item.Item;
import Item.Pocao;
import Item.Arma;
import Item.Armadura;
import Jogadores.Jogador;
import java.util.ArrayList;

public class Inventario {
    Scanner scanner = new Scanner(System.in);

    private ArrayList<Item> itens = new ArrayList<>();

    public void mostrarItens(){
        if (itens.size() > 0) {
            for(int i = 0; i < itens.size(); i++){
            System.out.println(i+ " - Nome do item : "+ itens.get(i).getNome());
            System.out.println("Valor: "+ itens.get(i).getValor());
            System.out.println("Raridade: "+ itens.get(i).getRaridade());
        }
        }else{
            System.out.println("Inventario vazio! ");
        }
        
    }

    public void adicionarItem(Item item){
        itens.add(item);
    }
   
    public void removerItem(int item){
        if (item >= 0 && item < itens.size()) {
            itens.remove(item);
        }else{
            System.out.println("Item  não encontrado! ");
        }
    }
    
    public int quantidadeItens(){
        return itens.size();
    }

    public ArrayList<Item> listaItem(){
        return this.itens;
    }

    public Item selecionarItem (int indice){
        if (indice < itens.size()) {
            return itens.get(indice);
        }else{
            return null;
        }
    }

   public void usarItem(Jogador jogador, int itemEscolhido){
        Item item = itens.get(itemEscolhido);
        
        if (itemEscolhido >= 0 && itemEscolhido < itens.size()) {
            if (item instanceof Pocao) {
                Pocao pocao = (Pocao) item;
                jogador.receberCura(pocao.getCura());
                System.out.println(pocao.getNome()+ " recuperou "+ pocao.getCura()+ "de Hp");
                itens.remove(itemEscolhido);
            }

            if (item instanceof Arma) {
                Arma arma = (Arma) item;
                jogador.equiparArma(arma);
                System.out.println(arma.getNome()+ " equipada");
            }
            
            if (item instanceof Armadura) {
                Armadura armadura = (Armadura) item;
                jogador.equiparArmadura(armadura);
                System.out.println(armadura.getArmadura()+ " equipada");
            }


        }else{
            System.out.println("Item não encontrado! ");
        }
   }

}
