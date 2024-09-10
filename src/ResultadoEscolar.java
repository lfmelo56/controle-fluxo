public class ResultadoEscolar {
    public static void main(String[] args) {
        
        int nota = 5;

        String resultado = nota >= 7 ? "Parabéns! Você foi aprovado." : nota >=5 && nota <7 ? "Direcionado à recuperação." : "Infelizmente, você foi reprovado.";
        System.out.println(resultado);

    }
}
