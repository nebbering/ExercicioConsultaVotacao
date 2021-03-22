package PROGRAMA;

import java.util.Scanner;

    public class ConsultaVotacao {
    
        public static void main(String[] args) {

            Scanner tec = new Scanner(System.in);

            int now = 2021;
            int idade;
            
            //SOLICITA O NOME DO ELEITOR
            System.out.print("INFORME O SEU NOME: ");
            String nome = tec.nextLine();

            //SOLICITA O ANO DE NASCIMENTO DO ELEITOR

            System.out.print("INFORME O ANO DE NASCIMENTO: ");
            int anonas = tec.nextInt();

            

            /*FAZ O CÁLCULO PARA SABER A IDADE DO ELEITOR.
            * A VAR "IDADE" RECEBE O RESULTADO DA SUBTRAÇÃO DO ANO DE NASCIMENOTO DO ANO ATUAL.
            * */
            idade = now-anonas;

            /*CRITÉRIOS PARA VOTAR:
            *
            * O VOTO SERÁ OPCIONAL SE:
            *
            * 1. A IDADE FOR MAIOR OU IGUAL A 70 ANOS;
            * 2. A IDADE FOR MENOR QUE 18 ANOS E MAIOR OU IGUAL A 16 ANOS.
            *
            * O VOTO SERÁ OBRIGATÓRIO SE:
            *
            * 1. O ELEITOR TIVER ENTRE 69 e 18 ANOS.
            *
            */    
            if ((idade >= 70 || idade<18) && (idade>=16)) {
            System.out.println(nome + ", SEU VOTO É OPCIONAL, POIS VOCÊ TEM " + idade + " anos.");
            } else {

                if (idade<70 && idade>18) {
                System.out.println(nome + ", SEU VOTO É OBRIGATÓRIO, POIS VOCÊ TEM " + idade + " anos!");
                    } if (idade<16 || idade<=0) {
                        System.out.println(nome + ", VOCÊ AINDA NÃO VOTA, POIS SÓ TEM " + idade + " anos.");
                } 


            }

        }

}
