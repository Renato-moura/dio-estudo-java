import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        
        try (Scanner scanner = new Scanner(System.in)) {
           try {

                System.out.println("Digite um numero inteiro");
                int parametroUm = scanner.nextInt();
            
                System.out.println("Digite um numero inteiro");
                int parametroDois = scanner.nextInt();

                try {
                    System.out.println("dafdsaffa");
                } catch (ParamentrosInvalidosException e) {
                   System.out.println("dia");
                }
                
            } catch (Exception e) {

                System.out.println("entrada invalida não coresponde a um numero inteiro");
           
            } 
        }
        
       
    }
    public class ParamentrosInvalidosException extends Exception {
            
    }
    public static class InnerContador {
    
        
    }  void validarParamentros(int parametroUm, int parametroDois) throws ParamentrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParamentrosInvalidosException();
        }
     }
     
}

