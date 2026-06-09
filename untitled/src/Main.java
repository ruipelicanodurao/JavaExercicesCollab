import java.util.Scanner;

public class Main {
    void main(String[] args) {
        classificarMediaTemperaturas(17, 30, 21);
        validarIdade(180);
        contarTiposDeValores();
    }

    public void classificarMediaTemperaturas(float t1, float t2, float t3) {
        //Nome do Aluno: Alex Filho
        //Crie uma função que receba três valores de temperatura,
        // calcule a média e indique se essa média é baixa, normal ou elevada.

        float media = (t1 + t2 + t3) / 3;

        String media_arredondada = String.format("%.2f", media);
        System.out.println("Média: " + media_arredondada);
        if (media < 18f) {
            System.out.println("Classificação: Baixa");
        } else if (media <= 25f) {
            System.out.println("Classificação: Normal");
        } else {
            System.out.println("Classificação: Elevada");
        }
    }

    public void validarIdade(int idade) {
        //Nome do Aluno: Alex Filho
        //Crie uma função que receba uma idade e devolva uma mensagem
        // a indicar se o valor é inválido, se corresponde a menor de idade
        // ou a maior de idade.
        // Modifica o void para algo que faça sentido para o exercício
        // podes implementar ou não um return, mas deves justificar a tua escolha

        // Decidi não implementar um return, pois como devo devolver uma mensagem, achei mais fácil já fazer o print dentro da função comparado com retornar uma String e usar o print na main.
        if (idade < 18 & idade >= 0) {
            System.out.println("Menor de idade");
        } else if (idade > 17 & idade < 120) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Valor inválido");
        }
    }

    public int[] contarTiposDeValores() {
        //Nome do Aluno: Alex Filho
        //Crie uma função que receba 10 números e conte quantos são positivos,
        // quantos são negativos e quantos são iguais a zero.
        // Modifica o void para algo que faça sentido para o exercício
        // podes implementar ou não um return, mas deves justificar a tua escolha

        // Decidi retornar os valores, pois a função tem a função de contar os tipos de valores, o que pode ser útil no futuro, então achei mais fácil retornar um array com as contagens do que fazer 3 prints dentro da função.
        Scanner sc = new Scanner(System.in);
        int positivos = 0, negativos = 0, zeros = 0;

        System.out.println("Introduza 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = sc.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                zeros++;
            }
        }
        sc.close();

        return new int[]{positivos, negativos, zeros};
    }

    public String mostrarTabuada(int numero) {
        //Nome do Aluno: Alex Filho
        //Crie uma função que receba um número inteiro
        // e apresente a tabuada desse número de 1 a 10.
        // Modifica o void para algo que faça sentido para o exercício
        // podes implementar ou não um return, mas deves justificar a tua escolha

        return "";
    }

    public static int obterMaiorValor() {
        //Nome do Aluno: Alex Filho
        //Crie uma função que receba 8 números
        // e determine qual é o maior valor introduzido.
        // Modifica o void para algo que faça sentido para o exercício
        // podes implementar ou não um return, mas deves justificar a tua escolha

        return 1;
    }

    public void classificarNota() {
        //Nome do Aluno: Alex Filho
        //Crie uma função que receba uma nota entre 0 e 20,
        // valide o valor de entrada e devolva a respetiva classificação qualitativa.
        // Modifica o void para algo que faça sentido para o exercício
        // podes implementar ou não um return, mas deves justificar a tua escolha
    }

    public void contarParesNoIntervalo() {
        //Nome do Aluno: Alex Filho
        //Crie uma função que receba dois números inteiros,
        // correspondentes ao início e ao fim de um intervalo,
        // e conte quantos valores pares existem nesse intervalo.
        // Modifica o void para algo que faça sentido para o exercício
        // podes implementar ou não um return, mas deves justificar a tua escolha
    }

    public void executarMenu() {
        //Nome do Aluno: Alex Filho
        //Crie uma função que apresente repetidamente um menu com várias opções
        // e termine apenas quando o utilizador escolher a opção de saída.
        // Modifica o void para algo que faça sentido para o exercício
        // podes implementar ou não um return, mas deves justificar a tua escolha
        // Sugestão: fazer um manual que permita escolher que função executar das que
        //  estão neste documento
    }

    public void calcularMediaAteSentinel() {
        //Nome do Aluno: Alex Filho
        //Crie uma função que leia vários números reais até surgir o valor -1,
        // calculando depois a média dos valores válidos introduzidos.
        // Modifica o void para algo que faça sentido para o exercício
        // podes implementar ou não um return, mas deves justificar a tua escolha

        return;
    }

    public void calcularDobro() {
        //Nome do Aluno: Alex Filho
        //Crie uma função que receba um número inteiro e devolva o seu dobro.
        // Modifica o void para algo que faça sentido para o exercício
        // podes implementar ou não um return, mas deves justificar a tua escolha
    }

    public void maiorValor() {
        //Nome do Aluno: Alex Filho
        //Crie uma função que receba dois números inteiros e devolva o maior dos dois.
        // Modifica o void para algo que faça sentido para o exercício
        // podes implementar ou não um return, mas deves justificar a tua escolha
    }

    public void ehPar() {
        //Nome do Aluno: Alex Filho
        //Crie uma função que receba um número inteiro
        // e devolva true se ele for par ou false caso contrário.
        // Modifica o void para algo que faça sentido para o exercício
        // podes implementar ou não um return, mas deves justificar a tua escolha
    }

    public void calcularMediaVetor() {
        //Nome do Aluno:
        //Crie uma função que receba um vetor com 5 números reais
        // e devolva a média dos seus elementos.
        // Modifica o void para algo que faça sentido para o exercício
        // podes implementar ou não um return, mas deves justificar a tua escolha
        //Dica: para definires o tipo de dados do vetor, relembra a definição
        // Matemática do que são números reais
    }

    public void contarAcimaLimite() {
        //Nome do Aluno:
        //Crie uma função que receba um vetor de 10 números inteiros
        // e um valor limite, contando quantos elementos do vetor
        // são superiores a esse limite.
        // Modifica o void para algo que faça sentido para o exercício
        // podes implementar ou não um return, mas deves justificar a tua escolha

        return;
    }
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