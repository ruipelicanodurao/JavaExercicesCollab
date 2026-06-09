import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {
        //Implementação das Funções
        System.out.println(somarAteN(5));
        System.out.println("maior valor:" +obterMaiorValor());
        System.out.println(classificarNota(15));
    }



    public float classificarMediaTemperaturas(float t1,float t2, float t3) {
        //Nome do Aluno: Melvin Edner Araújo Pires
        //Crie uma função que receba três valores de temperatura,
        // calcule a média e indique se essa média é baixa, normal ou elevada.

        Scanner teclado= new Scanner(System.in);
        System.out.println("Indique a primeira temperatura");
        try {
            t1= teclado.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("O valor inserido tem que ser um float");
        }


        System.out.println("Indique a segunda temperatura");
        try{
        t2= teclado.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("O valor inserido tem que ser um float");
        }


        System.out.println("Indique a terceira temperatura");

        try {
            t1 = teclado.nextFloat();
        }catch (InputMismatchException e){
            System.out.println("O valor inserido tem que ser um float");
        }

        float media = (t1+t2+t3)/3;

        return media;
        //Coloquei return pois eu poderei precisar do valor fora da função;
    }
    

    
    

    public void validarIdade(int idade) {
        //Nome do Aluno: Melvin Pires
        //Crie uma função que receba uma idade e devolva uma mensagem
        // a indicar se o valor é inválido, se corresponde a menor de idade
        // ou a maior de idade.
        // modifica o void para algo que faça sentido para o exercicio
        // podes implementar ou nao um return, mas deves justificar a tua escolha

        if (idade < 0){
            System.out.println("A idade é invalida");
        } else if (idade < 18){
            System.out.println("Você é menor de idade");
        } else if (idade >= 18 && idade <= 130){
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("A idade é inválida");
        }

    }

    public void contarTiposDeValores() {
        //Nome do Aluno: Hugo Pina
        //Crie uma função que receba 10 números e conte quantos são positivos,
        // quantos são negativos e quantos são iguais a zero.
        // modifica o void para algo que faça sentido para o exercicio
        // podes implementar ou nao um return, mas deves justificar a tua escolha

        int positivos = 0;
        int negativos = 0;
        int zeros = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {


            int numero = sc.nextInt();
        System.out.ptintln ("Número aleatorio: " + numero);


            if (numero > 0) {
                positivos++;
            }
            else if (numeros < 0) {
                negativos++;
            }
            else {
                zeros++;

            }
        System.out.println("Positivos " + positivos);
        System.out.println("Negativos " + negativos);
        System.out.println("Zeros " + zeros);
        }


        public static int somarAteN(int n) {
            //Nome do Aluno: Kushal Danai
            //Crie uma função que receba um número inteiro N
            // e calcule a soma de todos os números entre 1 e N.
            // modifica o void para algo que faça sentido para o exercicio
            // podes implementar ou nao um return, mas deves justificar a tua escolha
            int soma = 0;
                for (int i = 1; i <= n; i++) {
                soma += i;
            }
            return soma;
        }
    }

        public String mostrarTabuada (int numero) {
            //Nome do Aluno:Hugo Pina
            //Crie uma função que receba um número inteiro
            // e apresente a tabuada desse número de 1 a 10.
            // modifica o void para algo que faça sentido para o exercicio
            // podes implementar ou nao um return, mas deves justificar a tua escolha



            //o que estava aqui não fazia sentido
        } 

        public static int  obterMaiorValor () {
            //Nome do Aluno kushal Danai :
            //Crie uma função que receba 8 números
            // e determine qual é o maior valor introduzido.
            // modifica o void para algo que faça sentido para o exercicio
            // podes implementar ou nao um return, mas deves justificar a tua escolha
            Scanner scanner = new Scanner(System.in);
            int maior = Integer.min_value;
            for (int i = 1; i <=8; i++){
                System.out.println("insira numer" + i);
                int numero = scanner.nextInt();

                if (numero > maior ){
                    maior = numero;
                }
            }
           return maior;
        }

        public string  classificarNota (int nota) {
            //Nome do Aluno Kushal danai.
            //Crie uma função que receba uma nota entre 0 e 20,
            // valide o valor de entrada e devolva a respetiva classificação qualitativa.
            // modifica o void para algo que faça sentido para o exercicio
            // podes implementar ou nao um return, mas deves justificar a tua escolha
            if (nota < 0 || nota > 20) {
                return Nota invalida;
            } else if (nota >= 18) {
                return Excelente;
            } else if (nota >= 14) {
                return Bom;
            } else if (nota >= 10) {
                return Suficiente;
            } else {
                return Insuficiente;
            }
        }
        }

        public void contarParesNoIntervalo () {
            //Nome do Aluno:
            //Crie uma função que receba dois números inteiros,
            // correspondentes ao início e ao fim de um intervalo,
            // e conte quantos valores pares existem nesse intervalo.
            // modifica o void para algo que faça sentido para o exercicio
            // podes implementar ou nao um return, mas deves justificar a tua escolha

        }

        public void executarMenu () {
            //Nome do Aluno:
            //Crie uma função que apresente repetidamente um menu com várias opções
            // e termine apenas quando o utilizador escolher a opção de saída.
            // modifica o void para algo que faça sentido para o exercicio
            // podes implementar ou nao um return, mas deves justificar a tua escolha
            // Sugestão: fazer um manual que permita escolher que função executar das que
            // que estão neste documento
        }

        public void calcularMediaAteSentinel () {
            //Nome do Aluno:
            //Crie uma função que leia vários números reais até surgir o valor -1,
            // calculando depois a média dos valores válidos introduzidos.
            // modifica o void para algo que faça sentido para o exercicio
            // podes implementar ou nao um return, mas deves justificar a tua escolha
        }

        public void calcularDobro () {
            //Nome do Aluno:
            //Crie uma função que receba um número inteiro e devolva o seu dobro.
            // modifica o void para algo que faça sentido para o exercicio
            // podes implementar ou nao um return, mas deves justificar a tua escolha
        }

        public void maiorValor () {
            //Nome do Aluno:
            //Crie uma função que receba dois números inteiros e devolva o maior dos dois.
            // modifica o void para algo que faça sentido para o exercicio
            // podes implementar ou nao um return, mas deves justificar a tua escolha
        }

        public void ehPar () {
            //Nome do Aluno:
            //Crie uma função que receba um número inteiro
            // e devolva true se ele for par ou false caso contrário.
            // modifica o void para algo que faça sentido para o exercicio
            // podes implementar ou nao um return, mas deves justificar a tua escolha
        }

        public void calcularMediaVetor () {
            //Nome do Aluno:
            //Crie uma função que receba um vetor com 5 números reais
            // e devolva a média dos seus elementos.
            // modifica o void para algo que faça sentido para o exercicio
            // podes implementar ou nao um return, mas deves justificar a tua escolha
            //Dica: para definires o tipo de dados do vector, relembra a definição
            // Matemática do que são números reais
        }

        public void contarAcimaLimite () {
            //Nome do Aluno:
            //Crie uma função que receba um vetor de 10 números inteiros
            // e um valor limite, contando quantos elementos do vetor
            // são superiores a esse limite.
            // modifica o void para algo que faça sentido para o exercicio
            // podes implementar ou nao um return, mas deves justificar a tua escolha
        }

    /*
    Os seguintes 5 exercícios são mais abertos e exigentes,
    pensados para vos obrigar a interpretar o problema,
    decompor a solução e aplicar em código Java com organização modular
    por métodos/funções.
    Foram formulados para treinar: raciocínio lógico, validação, repetição,
    decisão e estruturação de código.

    Passos sugeridos antes de iniciar a programação dos seguintes problemas:
    - Inferir quais são as variáveis relevantes
    - Condições que precisam de ser testadas
    - Quando usar ciclos
    - Como repartir a solução por funções em Java
    Sugestão: fazer um esquema em papel ou num software que permita fazer esquemas
     */

    /*
    Posto de observação ambiental
    Um posto automático regista valores ao longo de um dia,
    mas nem todas as leituras recolhidas devem ser consideradas fiáveis.
    No final, o sistema precisa de produzir uma pequena síntese do
    comportamento observado, distinguindo situações normais de situações que
    merecem atenção. O operador apenas sabe que os registos são introduzidos
    manualmente e que o processo deve terminar quando for dada uma indicação
    própria para encerrar a recolha. A forma de validar, classificar e resumir
    os dados deve ser decidida por quem implementa a solução.
     */

    /*
    Triagem de candidatos a estágio
    Uma empresa recebeu várias candidaturas de estudantes e pretende uma primeira
    triagem automática antes da análise final por um técnico. Cada candidato
    apresenta um conjunto reduzido de indicadores, mas nem todos têm o mesmo peso
    e alguns podem até invalidar de imediato a candidatura. No final do processo,
    a aplicação deve permitir perceber quantos candidatos ficaram em cada situação
    relevante e destacar os casos mais fortes. Cabe ao aluno decidir que dados são
    realmente necessários, como os organizar e que regras fazem sentido para
    sustentar a decisão produzida.
     */



    /*
    Terminal de apoio a uma pequena bilheteira
    Numa bilheteira local, o atendimento é feito através de um programa simples
    que vai registando operações sucessivas até o funcionário encerrar o turno.
    Há diferentes tipos de pedido, alguns podem originar valores distintos para
    clientes diferentes, e certas combinações exigem tratamento especial.
    O sistema deverá deixar um rasto coerente do turno, evitando entradas absurdas
    e apresentando informação útil no fecho. O enunciado não fixa a estrutura exata
    da interação, pelo que essa modelação faz parte da resolução.
     */

    /*
    Leitura e interpretação de uma sequência numérica
    Um utilizador introduz uma sequência de números com o objetivo de obter uma
    análise rápida dos valores fornecidos. A utilidade do programa não está apenas
    em fazer contas diretas, mas em encontrar padrões, separar comportamentos
    distintos e produzir uma leitura global da sequência. A introdução dos dados
    não é necessariamente de tamanho fixo, e a solução deve lidar adequadamente
    com situações pouco informativas ou contraditórias. O critério de análise
    deve ser suficientemente rico para justificar a divisão do problema em várias
    partes.
     */

public void ExercícioMelvin4(){
    //Melvin
}
Scanner teclado=new Scanner(System.in);


int numero,maior,menor,pares= 0, impares= 0,positivo= 0,negativo = 0,soma=0;


    System.out.println("Introduza uma sequencia de numeros\n" +
                         "Escreva 0 para terminar");

    numero= teclado.nextInt();

    if(numero !=0){
        maior=numero;
        menor=numero;

while (numero!=0){
    soma=soma+numero;

    if (numero > maior) {
        maior = numero;
    }

     if(numero<menor) {
         menor = numero;

         if (numero % 2 == 0) {
             pares++;
         } else {
             impares++;
         }


         if (numero >= 0) {
             positivo++;
         } else {
             negativo++;
         }
     }
    }
        System.out.println("------------Analise da sequencia---------------");
        System.out.println("Soma= "+soma);
        System.out.println("Maior valor"+maior);
        System.out.println("Menor valor"+menor);
        System.out.println("Positivos"+positivo);
        System.out.println("Negativos"+negativo);
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);

        if (positivos>negativos){




    }















}


    /*
    Relatório simplificado de desempenho académico
    Uma coordenação de curso pretende um programa que ajude a interpretar o
    desempenho de um conjunto de alunos a partir de informação recolhida durante
    o semestre. O objetivo não é apenas obter médias, mas produzir uma leitura mais
    fundamentada, distinguindo situações estáveis, preocupantes ou potencialmente
    enganosas. Existem casos em que um valor aparentemente positivo pode não
    traduzir um bom resultado global, e essa nuance deve ser captada pela solução.
    A forma como o programa decide, agrega resultados e comunica conclusões deve
    emergir da análise feita pelo aluno.
     */



public void ExercicioMelvin5(){
        Scanner teclado = new Scanner(System.in);
        String nome;
        double nota1;
        double nota2;
        double nota3;

        double faltas = 0;

        double media;
        double maior;
        double menor;
        double diferenca;


        System.out.println("Nome do aluno: ");
        nome = teclado.nextLine();

        System.out.println("Nota de 1ºteste: ");
        nota1 = teclado.nextDouble();

        System.out.println("Nota de 2ºteste: ");
        nota2 = teclado.nextDouble();

        System.out.println("Nota de 3ºteste: ");
        nota3 = teclado.nextDouble();

        media=(nota1+nota2+nota3)/3;

        //Descobrir a maior nota
        maior=nota1;

        if(nota2>maior){
            maior= nota2;
        }


        if (nota3>maior) {
            maior=nota3;
        }

        menor=nota1;

        if(nota2<menor){
            menor= nota2;
        }


        if (nota3<menor) {
            menor=nota3;
        }

        diferenca=maior-menor;

        System.out.println("-----------Relatório------------");

        if (media >= 16 && faltas < 10 && diferenca <= 3) {

            System.out.println("Situação: Excelente");

        } else if (media >= 10 &&
                (nota1 < 5 || nota2 < 5 || nota3 < 5)) {

            System.out.println("Situação: Resultado enganoso");

        } else if (media < 10 || faltas > 25) {

            System.out.println("Situação: Preocupante");

        } else {

            System.out.println("Situação: Estável");
        }

        // Informação extra

        System.out.println("Diferença entre notas: " + diferenca);
        System.out.println("Faltas: " + faltas + "%");

        teclado.close();
    }



}








