import java.util.Locale;
import java.util.Scanner;

public class testeConta {
    public static void main(String[] args) {
        
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //exibir as mensagens para os usuários
        System.out.println
        ("Olá, para criar uma conta conosco, por favor, insira os dados a seguir e aperte ENTER para continuar");

            System.out.println("Digite seu nome");
            String nome = scanner.next();
        
            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua agência");
            String agencia = scanner.next();
        
            System.out.println("Digite sua conta");
            int numero = scanner.nextInt();

            System.out.println( "Digite o valor a ser depositado");
            double saldo = scanner.nextDouble();

            System.out.println("Insira as cédulas de dinheiro no compartimento abaixo...");

        
        //Exibir mensagem de conta criada
        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é "
         + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
                      
    }
}
