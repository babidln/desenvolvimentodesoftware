import java.util.Random;

public class Sorteio {
      //Atributos, propriedades, variáveis globais
      
      //Funcoes e procedimentos
      
      //Rotina principal

    public static void main(String[] args) {
          Random gerador = new Random();
          int c = 1;
          int soma = 0;
          int maior = 0; // ou 1
          int menor = 101;  // ou 100
          while (c <= 1000) {
              //ler o número
              int n = 1 + gerador.nextInt(100);
              soma+= n; //soma = soma + n
              if (c == 1) {
                  maior = n;
                  menor = n;
              }
              if (n < menor) {
                  menor = n;
              }
              c++; //c += 1 ou c = c + 1
          System.out.println(n);
        }
       System.out.println("Maior = " + maior);
       System.out.println("Menor = " + menor);
       System.out.println("Soma = " + soma / 1000f); //soma // (float) 1000;
    } 
}