package Item;
public class Item {
    private String nome;
    private double valor;
    private String raridade;

    public Item(String nome, double valor, String raridade){
        this.nome = nome;
        this.valor = valor;
        this.raridade = raridade;
    }

    public String getNome(){
        return nome;
    }

    public double getValor(){
        return valor;
    }

    public String getRaridade(){
        return raridade;
    }


}

