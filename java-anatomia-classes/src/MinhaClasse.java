public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Cassio";
        String segundoNome = "Jhones";
        // variavel nomeCompleto que usa o metodo nomeCompleto com dois argumentos
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    // ----METODO QUE USA AS VARIAVES PRIMEIRO E SEGUNDO NOME PARA TER NOME COMPLETO----
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do Método " + primeiroNome.concat(" ").concat(segundoNome);
        
    }

}
