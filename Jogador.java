public class Jogador {
    private String nome;
    private double dinheiro;
    private Inventario inventarioJogador;

    public Jogador(String nome, double dinheiro, Inventario inventarioJogador){
        this.nome = nome;
        this.dinheiro = dinheiro;
        this.inventarioJogador = inventarioJogador;
    }

    public String getNome(){
        return nome;
    }

    public double getDinheiro(){
        return dinheiro;
    }

    public Inventario getInventario(){
        return inventarioJogador;
    }

    public void gastarDinheiro(double valor){
        dinheiro -= valor;
    }

    public void receberDinheiro(double valor){
        dinheiro += valor;
    }
    

}
