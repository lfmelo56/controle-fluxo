public class ResultadoEscolar {
    public static void main(String[] args) {
        
        int nota = 7;

        if (nota >= 6)
         System.out.println("Parabéns! Você foi aprovado.");

        else if (nota >= 5 && nota < 7)
         System.out.println("Direcionado à recuperação.");

        else 
         System.out.println("Infelizmente, você foi reprovado.");
    }
}
