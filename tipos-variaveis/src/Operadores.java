public class Operadores {
    public static void main(String[] args) {
        // String nomeCompleto = "LINGUAGEM" + "JAVA";

        // System.out.println(nomeCompleto);

        // String concatenacao = "?";

        // concatenacao = 1+1+1+"1";

        // System.out.println(concatenacao);

        // concatenacao = 1+"1"+1+1;

        // System.out.println(concatenacao);

        // concatenacao = "1"+1+1+1;

        // System.out.println(concatenacao);

        // concatenacao = "1"+(1+1+1);

        // System.out.println(concatenacao);

        // int numero = 5;
        // System.out.println(-numero);

        // System.out.println(numero);

        // numero = -5;
        // System.out.println(numero);

        // numero = numero * -1;

        // int numero = 5;
        // numero++;

        // System.out.println(numero);
        // System.out.println(numero++);
        // System.out.println(++numero);

        // boolean variavel = true;

        // System.out.println(!variavel);

        // variavel =!variavel;

        /*operadores ternários: */
        // int a, b;

        // a = 5;
        // b = 6;
        // /*String resultado = "";

        // if(a == b)
        //     resultado = "verdadeiro";
        // else
        //     resultado = "falso";
        // substituo pela expressão abaixo:*/

        // String resultado = a == b ? "verdadeiro" : "falso";
        // int resultado2 = a == b ? 1 : 0;

        // System.out.println(resultado);
        // System.out.println(resultado2);
        ////////////////////////////////////////
        // int numero1 = 1;
        // int numero2 = 2;

        // boolean simNao = numero1 == numero2;

        // System.out.println("numero1 é igual a numero2? " + simNao);

        // simNao = numero1 != numero2;

        // System.out.println("numero1 é diferente de numero2? " + simNao);

        // simNao = numero1 > numero2;

        // System.out.println("numero1 é maior que numero2? " + simNao);

        // if(numero1 < numero2){
        //     System.out.println("A nossa condição é verdadeira");
        // }

        // String nomeUm = "Jordi";
        // String nomeDois = "Jordi";

        // System.out.println(nomeUm.equals(nomeDois));
        ////////////////////////////////////////
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras.");
        }
        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira.");
        }
        System.out.println("Fim");
    }
}
