import java.util.Scanner;
import Inventario.Inventario;
import Jogadores.Jogador;
import Lojas.Loja;

import java.util.InputMismatchException;
public class Main{

    private Scanner scanner = new Scanner(System.in);
    private Loja loja = new Loja();
    private Jogador j1 = new Jogador("Hugo", 12000, 70, 100, 30, 40, new Inventario());
    public void executar(){
        int opcao = -1;

        do{

            System.out.println("=============================\n"+ //
            "      LOJA DO FERREIRO\n" + //
            "=============================");
            System.out.println("Seu dinheiro: "+ j1.getDinheiro()+ " ouro");

            loja.mostrarItems();
            System.out.println("=============================");
            System.out.println("1- Comprar item");
            System.out.println("2- Vender item");
            System.out.println("3- Ver inventário");
            System.out.println("0- Sair");
            System.out.println("=============================");
            System.out.println(" ");
            System.out.print("Escolha: ");


            try{
                opcao = scanner.nextInt();
                scanner.nextLine();
                
                switch (opcao) {

                    case 0:
                        System.out.println("Saindo da loja");
                        break;

                    case 1:
                        comprarItem(j1);
                        break;
                
                    case 2:
                        venderItem(j1);

                        break;

                    case 3:
                        mostrarInventario(j1);

                        break;

                    default:

                        System.out.println("Opção invalida! ");

                        break;
                }

            }catch(InputMismatchException e){
                System.out.println("Entrada invalida! ");
                scanner.nextLine();
            }
        }while(opcao != 0);
        scanner.close();
        
    }

    public void comprarItem(Jogador j1){
        System.out.println("Digite o numero do item que deseja comprar");
        int numeroComprar = scanner.nextInt();
        scanner.nextLine();
        loja.comprarItem(j1, numeroComprar);

    }

    public void venderItem(Jogador j1){
        System.out.println("Qual item deseja vender? ");
        j1.getInventario().mostrarItens();
        System.out.println(" ");
        System.out.println("Escolha: ");
        int numeroVender = scanner.nextInt();
        loja.venderItem(j1, numeroVender);

    }

    public void mostrarInventario(Jogador j1){
        System.out.println("=============================\n"+ //
                            "        INVENTÁRIO\n" + //
                            "============================="
                        );
        System.out.println("Vida: "+ j1.getVida()+ "/" + j1.getVidaMaxima());
        System.out.println("Dano: "+ j1.getDano());
        System.out.println("Defesa: "+ j1.getDefesa());
        System.out.println("Dinheiro: "+ j1.getDinheiro());
        System.out.println(" ");
        j1.getInventario().mostrarItens();

        System.out.println("=============================");
        System.out.println("1- Vender item");
        System.out.println("2- selecionar item");
        System.out.println("0- Voltar");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (j1.getInventario().quantidadeItens() == 0) {
            System.out.println("Inventario vazio");
            opcao = -1;
        }else{

            switch (opcao) {
                case 0:

                    opcao = -1;

                    break;


                case 1:
                    System.out.println("Digite o numero do item que deseja vender: ");
                    int numeroVender = scanner.nextInt();
                    scanner.nextLine();
                    loja.venderItem(j1, numeroVender);
                    break;
            
                case 2:

                    System.out.println("Digite o numero do item que deseja usar: ");
                    int itemEscolhido = scanner.nextInt();
                    scanner.nextLine();
                    j1.getInventario().usarItem(j1, itemEscolhido);

                    break;


                default:

                    System.out.println("Item não encontrado! ");

                break;
            }

        }
                            
                        



        
    }
  

    public static void main(String[] args) {
        
        Main programa = new Main();
        programa.executar();


    
    }
   

}

   