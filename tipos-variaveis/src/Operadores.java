public class Operadores {

    public static void main (String[] args) {
        
        //Operadores, tipos e como usa-los

        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        //x repetição
        int numero = 5;

        //numero = numero +1

        System.out.println(++ numero);

        System.out.println(numero);

        //condicional if/else
        int a,b;

        a = 5;
        b = 10;

        String resultado = a == b ? "verdadeiro" : "falso";
        System.out.println(resultado);
        

        int numeroUm = 1;
        int numeroDois = 2;

        System.out.println(numeroUm == numeroDois);

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && (8 < 12));{
            System.out.println("As duas condições são verdadeiras");
        }
            

        if(condicao1 || condicao2);{
            System.out.println("Uma das condições é verdadeira");

        }
           


    }
    
}
