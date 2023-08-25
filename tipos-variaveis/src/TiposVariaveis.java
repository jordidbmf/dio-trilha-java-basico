public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
    
        int numero = 5;

        numero = 10;
        
        System.out.println(numero);

        double VALOR_DE_PI = 3.14;
        VALOR_DE_PI = 3.15; //PERMITE

        final double VALOR_PI = 3.14;
        //VALOR_PI = 3.15; -> da erro

        String meuNome = "Jordi";
    }
}
