package HNB;

public class Cajero automatico {
   public static void main(string[]args){
       double saldo =1000.0;
           Scanner scanner = new;
       Scanner(System.in);
       
       System.out.print("Welcome al cajero automatico xd");
       System.out.print("¿Que desea realizar?");
       
       System.out.print("1. Su Saldo ");
       System.out.print("2. Realizar depocito ");
       System.out.print("3.Realizar retiro ");
       
       int opcion = scanner.nextInt();
       
       
       switch (opcion){
           case 1:
           System.out.print("Su saldo es..:$" + saldo);
           
           case 2:
           System.out.print("Ingrese la cantidad a depocitar");
           double  deposito = 
               Scanner.nextDouble();
                saldo += depocito;
           System.out.print("Realizo depocito. Su nuevo saldo es: $" + saldo);
           break;
           
           case 3;
            System.out.print("Solicite cantidad a retirar:");
           double retiro =
               scanner.nextDouble();
           if(retiro > saldo){
               
           System.out.print("Saldo insuficiente");
       } else {
           saldo-=retiro;
           System.out.print("Realizó retiro. Su nuevo saldo es: $" + saldo);
       }
           break;
           defaul:
           System.out.print("Opcion invalida.");
           
           break;
       }
   }
    
}
