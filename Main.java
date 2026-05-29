import java.util.Scanner;
import java.util.InputMismatchException;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


    
        Jogador  j1 = new Jogador("Isagi", 1000, new Inventario());
        Loja loja = new Loja();

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
                case 1:
                    System.out.println("Digite o numero do item que deseja comprar");
                    int numeroComprar = scanner.nextInt();
                    scanner.nextLine();
                    loja.comprarItem(j1, numeroComprar);
                    break;
            
                case 2:
                    System.out.println("Qual item deseja vender? ");
                    j1.getInventario().mostrarItens();
                    System.out.println(" ");
                    System.out.println("Escolha: ");
                    int numeroVender = scanner.nextInt();
                    loja.venderItem(j1, numeroVender);

                    break;

                case 3:
                    System.out.println("=============================\n"+ //
                        "        INVENTÁRIO\n" + //
                        "============================="
                    );

                    System.out.println("Dinheiro: "+ j1.getDinheiro());
                    System.out.println(" ");
                    j1.getInventario().mostrarItens();

                    System.out.println("=============================");
                    System.out.println("1- Vender item");
                    System.out.println("0- Voltar");
                    opcao = scanner.nextInt();
                    scanner.nextLine();

                    if (opcao == 1) {
                        System.out.println("Digite o numero do item que deseja vender: ");
                        numeroVender = scanner.nextInt();
                        scanner.nextLine();
                        loja.venderItem(j1, numeroVender);
                    }else if(opcao == 0){
                        opcao = -1;
                    }else{
                        System.out.println("Item não encontrado! ");
                    }

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

        
    
    }

       
}