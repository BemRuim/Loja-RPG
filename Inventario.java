import java.util.Scanner;

import Item.Item;

import java.util.ArrayList;

public class Inventario {
    Scanner scanner = new Scanner(System.in);

    private ArrayList<Item> itens = new ArrayList<>();

    public void mostrarItens(){
        if (itens.size() > 0) {
            for(int i = 0; i < itens.size(); i++){
            System.out.println("Nome do item : "+ itens.get(i).getNome());
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

        public ArrayList<Item> selecionarItem(){
            return this.itens;
        }

}
