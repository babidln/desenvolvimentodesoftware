 import java.util.Random;
 public class parimpar {
// Atributos e propriedades

//Funcoes e procedimentos
public static String verificarparimpar(int n){
     if (n % 2 = 0) {
         return "Par";
     } else {
         return "Impar";
  }    
}
// Funcao principal
public static vaid main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int n;
    // codigo
    do {
        n = teclado.nextInt();
        if = (n >= 0) {
            System.out.println(verificarparimpar(n);
        } 
    }while (n >= 0);
    teclado.close();
}