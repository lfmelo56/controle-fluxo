import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {
        
        try{
            // criando objeto scanner
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        //dados obtidos:
        System.out.println("Olá! Me chamo " + nome.toUpperCase() + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("Minha altura é " + altura + " cm");
        scanner.close();
        }
        catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura devem ser exibidos de forma numérica, e, na altura, o formato deve ser: M.cm");
        }
    }
}