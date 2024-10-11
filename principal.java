package CARTAO;
import java.util.Scanner;
public class principal {
public static void main(String[] args) {
    cartaodeCredito c = new cartaodeCredito();
  c.cpf = "123.123.132-54";
  c.limite = 100;
  Scanner sc = new Scanner(System.in);

  System.out.println(c.consultarLimite());
  c.realizarCompra(0);
   System.out.println(c.consultarSaldo());
    int opçao = 1;
    do {
   System.out.println("1 - Consultar Limite");
   System.out.println("2 - Consultar Fatura");
   System.out.println("3 - Realizar compra");
  
   opçao = sc.nextInt();
   

    
   
   switch (opçao) {

    case 1: 
        System.out.println("Seu limite é de: " + c.consultarLimite());
        break;
    case 2: 
        System.out.println("Seu saldo devedor é de: " + c.consultarSaldo());
        break;
    case 3:
    System.out.println("Digite o valor da compra: "); 
    double valor = sc.nextInt();
    c.realizarCompra(valor);
        break;
    default:
    System.err.println("Selecione a opção correta!");
        break;
   }
} while(opçao !=0);

        }
    }
    

