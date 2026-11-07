import java.util.Scanner;

public class Nevegador {
   static  String[] historico = new String[5];
   static    int topo = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do{

            System.out.println("/n===Navegador===");
            System.out.println("1 - visitar nova pagina");
            System.out.println("2 - voltar a pagina anterior");
             System.out.println("3 - mostar pagina atual");
            System.out.println("4  - exibir historico");
            System.out.println("0 - sair");
        
            opcao= scanner.nextInt();

            switch (opcao) {
                case 1 :
                     System.out.println("Digite a URL:");
                     String pagina = scanner.nextLine();
                    visitarPagina (pagina);
                    break;

                    case 2: 
                         voltarPagina();  
                           break;
                           case 3:
                            paginaAtual();
                            break;
                            case 4:
                       break;
                    default:

                    break;
                

            }

        }while( opcao != 0);

    
    }
     public static void visitarPagina(String pagina){
            if (pilhacheia()) {
                System.out.println("Historico cheio");
            }
        topo++;
        historico[topo] = pagina;
        System.out.println("voce visitou a pagina" + pagina);

        }

        public static boolean pilhacheia(){
            return topo == historico.length -1;
           
                
            }

            public static void voltarPagina(){
            if (pilhavazia()) {
             System.out.println("Nenhuma pagina aberta");
}                return;
            }
        
            public static void  voltarPagina(){
                historico[topo]= null;
                topo--;
                System.out.println("voltando para" + historico[topo]);
            }
            public static void paginaAtual(){
                if (pilhavazia()) {
                    System.out.println("nenhuma pagina aberta");
                 } else{
                    System.out.println("pagina atual:" + historico[topo]);

                }
            }
            public static void exibirHistorico(){
            if (pilhavazia()) {
                System.out.println("historico vazio!");
                return;
            }
            }
            System.out.println("Historico do mais recente ao ")
        }


