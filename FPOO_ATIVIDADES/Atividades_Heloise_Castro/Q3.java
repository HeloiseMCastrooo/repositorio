package Atividades_Heloise_Castro;

import java.util.Scanner;

public class Q3 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
        int sorteio = (int) (Math.random() *30) +1;
        int tentativas;
        int contador = 0;        
        while (true) {
            tentativas = entrada.nextInt();
            contador = contador +1;
        if (sorteio == tentativas) {
            System.out.println("Parabens você acertou");
            System.out.println("voce jogou: " + contador);
        }else if (sorteio > tentativas) {
            System.out.println("Digite um numero maior");
        }else if (sorteio < tentativas){
            System.out.println("Digite um numero menor");
        }
        }

    }

 

}