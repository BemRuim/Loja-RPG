import java.util.ArrayList;

public class Loja {

  private ArrayList<Item> itensLoja = new ArrayList<>();
    
  Loja(){
    itensLoja.add(new Item("Adaga", 360.6, "Raro"));
    itensLoja.add(new Item("Botas", 896.7, "Épico"));
    itensLoja.add(new Item("Arco", 100, "Comum"));


  }

  public void mostrarItems(){
    for(int i = 0; i < itensLoja.size(); i++){
      System.out.println(i + " - Nome do item: "+ itensLoja.get(i).getNome());
      System.out.println("Preço: "+ itensLoja.get(i).getValor()+ " ouro");
      System.out.println("Raridade: "+ itensLoja.get(i).getRaridade());
      System.out.println("");
    }
  }

  public void comprarItem(Jogador jogador, int indice){
      
    if (indice < itensLoja.size() && indice >= 0) {
      if (jogador.getDinheiro() >= itensLoja.get(indice).getValor()) {
        jogador.gastarDinheiro(itensLoja.get(indice).getValor());
        jogador.getInventario().adicionarItem(itensLoja.get(indice));
        itensLoja.remove(indice);

        System.out.println("Item comprado! ");
      }else{
        System.out.println("dinheiro insuficiente! ");
      }
    }else{
      System.out.println("Item não encontrado! ");
    }


  }

  public void venderItem(Jogador jogador, int indice){
    if (indice < jogador.getInventario().quantidadeItens() && indice >= 0) {
      jogador.receberDinheiro(jogador.getInventario().selecionarItem().get(indice).getValor());
      itensLoja.add(jogador.getInventario().selecionarItem().get(indice));
      jogador.getInventario().removerItem(indice);
      

      System.out.println("Item vendido com sucesso!");
    }else{
      System.out.println("Item não encontrado! ");
    }
  }



}
