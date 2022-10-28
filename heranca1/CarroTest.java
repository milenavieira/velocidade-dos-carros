package heranca1;

import java.util.Scanner;

public class CarroTest {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Carro carro = new Carro();
    carro.velocidadeAtual = 0;
    System.out.println("Velocidade atual: " + carro.velocidadeAtual);

    carro.acelerar();
    System.out.println(carro.velocidadeAtual);
    carro.frear();
    carro.frear();
    System.out.println("Depois de frear 2 vezes: " + carro.velocidadeAtual);

    Ferrari ferrari = new Ferrari();

    System.out.println(ferrari.velocidadeAtual);
     ferrari.acelerar();
     ferrari.acelerar();

    System.out.println(ferrari.velocidadeAtual);

}

}
