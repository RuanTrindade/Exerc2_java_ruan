package aplication;

import ex1.Terreno;
import ex10.Duracao;
import ex2.Retangulo;
import ex3.Pessoa;
import ex4.Soma;
import ex5.Produto;
import ex6.Circulo;
import ex7.Funcionario;
import ex8.Consumo;
import ex9.Medidas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //ex1 Problema "Terreno"
        System.out.println("EXERCICIO 1");
        System.out.println("Digite a largura do terreno: ");
        double largura = sc.nextDouble();
        System.out.println("Digite o comprimento do terreno: ");
        double comprimento = sc.nextDouble();
        System.out.println("Digite o valor do metro quadrado do terreno: ");
        double valor = sc.nextDouble();

        Terreno terreno = new Terreno(largura, comprimento, valor);
        System.out.printf("Tamanho da area do terreno: %.2f", terreno.tamanhoTerreno());
        System.out.println();
        System.out.printf("Preco do terreno: R$%.2f", terreno.valorTerreno());
        System.out.println();

        //ex2 Problema "Retangulo"
        System.out.println();
        System.out.println("EXERCICIO 2");
        System.out.println("Digite a base do retangulo: ");
        double base = sc.nextDouble();
        System.out.println("Digite a altura do retangulo: ");
        double altura = sc.nextDouble();

        Retangulo retangulo = new Retangulo(base, altura);
        System.out.printf("AREA = %.4f", retangulo.area());
        System.out.println();
        System.out.printf("PERIMETRO = %.4f", retangulo.perimetro());
        System.out.println();
        System.out.printf("DIAGONAL = %.4f", retangulo.diagonal());
        System.out.println();


        //ex3 problema "Idades"
        System.out.println();
        System.out.println("EXERCICIO 3");
        List<Pessoa> pessoas = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            System.out.println("Dados da pessoa " + (i+1));
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            Pessoa p = new Pessoa(nome, idade);
            pessoas.add(p);
        }

        String p1 = pessoas.get(0).getNome();
        String p2 = pessoas.get(1).getNome();
        Double media = Pessoa.media(pessoas);

        System.out.println("A idade media de " + p1 + " e " + p2 + " é de " + media + " Anos.");

        //ex4 Problema "Soma"
        System.out.println();
        System.out.println("EXERCICIO 4");
        List<Soma> numeros = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            System.out.print("Digite um numero: ");
            int num = sc.nextInt();

            Soma soma = new Soma(num);
            numeros.add(soma);
        }

        System.out.println("Soma dos 2 numeros: " + Soma.somar(numeros));


        //ex5 Problema "Troco"
        System.out.println();
        System.out.println("EXERCICIO 5");
        System.out.println("Qual produto: ");
        String nome = sc.nextLine();
        System.out.println("Preço do produto: R$");
        Double preco = sc.nextDouble();
        sc.nextLine();
        System.out.println("Quantidade do produto a ser comprado R$:");
        int qtd = sc.nextInt();
        System.out.println("Valor recebido do pagamento: R$");
        Double valorDinheiro = sc.nextDouble();
        Produto produto = new Produto(nome, preco, qtd, valorDinheiro);

        System.out.println("TROCO: R$" + produto.troco());


        //ex6 Problema "Circulo"
        System.out.println();
        System.out.println("EXERCICIO 6");
        System.out.print("Digite o valor do raio do circulo: ");
        double raio = sc.nextDouble();

        Circulo circulo = new Circulo(raio);
        double area = circulo.calcularArea();

        System.out.printf("AREA = %.3f%n", area);

        //ex7 Problema "Pagamento"
        System.out.println();
        System.out.println("EXERCICIO 7");
        System.out.print("Nome: ");
        String n = sc.nextLine();
        System.out.print("Valor por hora: ");
        double valorHora = sc.nextDouble();
        System.out.print("Horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();

        Funcionario funcionario = new Funcionario(n, valorHora, horasTrabalhadas);

        double pagamento = funcionario.calcularPagamento();

        System.out.print("O pagamento para ");
        System.out.print(funcionario.getNome());
        System.out.printf(" deve ser %.2f%n", pagamento);


        //ex8 Problema "Consumo"
        System.out.println();
        System.out.println("EXERCICIO 8");
        System.out.print("Distancia percorrida: ");
        double distancia = sc.nextDouble();
        System.out.print("Combustível gasto: ");
        double combustivel = sc.nextDouble();

        Consumo c = new Consumo(distancia, combustivel);
        double consumoMedio = c.consumoMedio();

        System.out.printf("Consumo medio = %.3f%n", consumoMedio);

        //ex9 Problemas "Medidas"
        System.out.println();
        System.out.println("EXERCICIO 9");
        System.out.print("Digite a medida A: ");
        double a = sc.nextDouble();
        System.out.print("Digite a medida B: ");
        double b = sc.nextDouble();
        System.out.print("Digite a medida C: ");
        double y = sc.nextDouble();

        Medidas m = new Medidas(a, b, y);

        System.out.printf("AREA DO QUADRADO = %.4f%n", m.areaQuadrado());
        System.out.printf("AREA DO TRIANGULO = %.4f%n", m.areaTriangulo());
        System.out.printf("AREA DO TRAPEZIO = %.4f%n", m.areaTrapezio());

        //ex10 Problemas "Duracao"
        System.out.println();
        System.out.println("EXERCICIO 10");
        System.out.print("Digite a duracao em segundos: ");
        int segundos = sc.nextInt();

        Duracao duracao = new Duracao(segundos);
        String resultado = duracao.formatarTempo();

        System.out.println(resultado);








        sc.close();
    }
}
