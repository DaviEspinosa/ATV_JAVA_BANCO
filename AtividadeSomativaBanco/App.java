package AtividadeSomativaBanco;

import java.util.Scanner;

public class App{
   

    public static  void main(String[]args){

        Scanner lendo = new Scanner(System.in);
        boolean verdade = true;
        int receber = 0;
        Banco obj = new Banco();

        while (verdade) {
            
            System.out.println("========================================");
            System.out.println("1- Criar conta Pessoa Física ");
            System.out.println("2- Criar conta pessoa Jurídica ");
            System.out.println("3- Acessar conta ");
            System.out.println("4- Sair ");
            System.out.println("========================================");

            receber = lendo.nextInt();
            
            switch(receber) {

                case 1:{
                    obj.criarContaPf();
                    break;
                }

                case 2:{
                    obj.criarContaPj();
                    break;
                }

                case 3:{

                    break;
                }

                case 4:{
                    verdade = false;
                    break;
                }

                default:{
                    System.out.println("Informe um desses valores!");
                    break;
                }
            }

        }
        
    }
}
