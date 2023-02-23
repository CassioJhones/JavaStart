public class OpRelacionais {
    public static void main(String[] args) {

        int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 == numero2;

        System.out.println("1 --UM é igual a DOIS? = " + simNao);

        simNao = numero1 != numero2;
        System.out.println("2 --UM é diferente de DOIS? = " + simNao);

        String nomeUM = "Cassio";
        String nomeDOIS = "Cassio";
        if (nomeUM == nomeDOIS) {
            System.out.println("--NOMES IGUAIS?? = " + simNao);
        } else {
            System.out.println("--NOMES DIFERENTES?? " + simNao);
        }

    }
}
