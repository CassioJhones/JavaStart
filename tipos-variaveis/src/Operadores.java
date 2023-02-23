public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);
        // ----CONCATENAÇÃO DE STRINGS----

        
        int numero = 5;
        System.out.println(numero);
        numero++;
        System.out.println(numero);
        // ----OPERADOR ++ INCREMENTA MAIS 1 NA VARIAVEL----
  

        boolean teste = true;
        System.out.println(teste);
        System.out.println(!teste);
        // ----O OPERADOR ! INVERTE O RESULTADO----


        int a, b, c, d;
            a = 5;
            b = 5;
            c = 6;
            d = 7;
        // ----LOOP IF-ELSE NORMAL----LOOP IF-ELSE NORMAL----LOOP IF-ELSE NORMAL----
        String resultado = "";
            if (a == b)
                resultado = "verdadeiro";
            else
                resultado = "falso";

        System.out.println(" A STRING É " + resultado);
        // LOOP IF-ELSE NORMAL----LOOP IF-ELSE NORMAL----LOOP IF-ELSE NORMAL----


        // ----OPERADOR TERNARIO - MENOS CODIGOS PARA REALIZAR O LOOP E COMPARAÇÃO----
            String Ternario = c == d ? "---VERDADEIRO---" : "---FALSO---";

            System.out.println(Ternario);
        // ----OPERADOR TERNARIO - MENOS CODIGOS PARA REALIZAR O LOOP E COMPARAÇÃO----

    }
}
