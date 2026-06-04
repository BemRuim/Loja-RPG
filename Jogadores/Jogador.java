package Jogadores;
import Inventario.Inventario;
import Item.Armadura;
import Item.Arma;


public class Jogador {
    private String nome;
    private double dinheiro;
    private int vida;
    private int vidaMaxima;
    private int dano;
    private int defesa;
    private Inventario inventarioJogador;

    private Arma armaEquipada;
    private Armadura armaduraEquipada;
    public Jogador(String nome, double dinheiro, int vida, int vidaMaxima, int dano, int defesa, Inventario inventarioJogador){
        this.nome = nome;
        this.dinheiro = dinheiro;
        this.vida = vida;
        this.vidaMaxima = vidaMaxima;
        this.dano = dano;
        this.defesa = defesa;
        this.inventarioJogador = inventarioJogador;
    }

    public String getNome(){
        return nome;
    }

    public double getDinheiro(){
        return dinheiro;
    }

    public int getVida(){
        return vida;
    }


    public int getVidaMaxima(){
        return vidaMaxima;
    }

    public int getDano(){
        if (armaEquipada == null) {
            return dano;
        }else{
            return dano + armaEquipada.getDano();
        }
        
    }

    public int getDefesa(){
        if (armaduraEquipada == null) {
            return defesa;
        }else{
            return defesa + armaduraEquipada.getArmadura();
        }
        
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

    public void receberCura(int cura){
        if (vida < vidaMaxima) {
            if (vida + cura > vidaMaxima) {
                vida = vidaMaxima;
            }else{
                vida += cura;
            }
            System.out.println("Poção usada, vida atual: "+ vida);

        }else{
            System.out.println("Já esta com vida maxima!");
        }
    }
    
    public void receberDano(int danoRecebido){
        if (vida - danoRecebido < 0) {
            vida = 0;
        }else{
            vida -= danoRecebido;
        }
    }

    public void atacar(Jogador jogadorEscolhido){
        this.receberDano(jogadorEscolhido.vida);
    }

    public void equiparArmadura(Armadura armadura){
        int defesaTotal =  defesa += armadura.getArmadura();
        defesa = defesaTotal;
    }

    public void equiparArma(Arma arma){
       armaEquipada = arma;
      
       
    }

  

}
