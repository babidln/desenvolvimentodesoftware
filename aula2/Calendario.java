import java.util.Scanner;

public class Calendario {
   //funcoes e procedimentos
   

     public static String mostrarNomeSwitch(int mes) {
          String nomeMes = "";
          switch (mes) {
               case 1:
               nomeMes = "Janeiro";
               break;
               case 2:
               nomeMes = "Fevereiro";
               break;
               case 3:
               nomeMes = "Março";
               break;
               case 4:
               nomeMes = "Abril";
               break;
               case 5:
               nomeMes = "Maio";
               break;
               case 6:
               nomeMes = "Junho";
               break;
               case 7:
               nomeMes = "Julho";
               break;
               case 8:
               nomeMes = "Agosto";
               break;
               case 9:
               nomeMes = "Setembro";
               break;
               case 10:
               nomeMes = "Outubro";
               break;
               case 11:
               nomeMes = "Novembro";
               break;
               case 12:
               nomeMes = "Dezembro";
               break;
     //fazer assim até dezembro
     }
     return nomeMes;
 }
 //funcao principal
 public static String mostrarNomeMesif(int mes) {
   String nomeMes = "";
   if (mes == 1) {
          nomeMes = "Janeiro";
     } else if (mes == 2){
          nomeMes = "Fevereiro";
     } else if (mes == 3){
        nomeMes = "Março";
     }else if (mes == 4){
               nomeMes = "Abril";
     }else if (mes == 5){
               nomeMes = "Maio";
     }else if (mes == 6){
               nomeMes = "Junho";
     }else if (mes == 7){
               nomeMes = "Julho";
     }else if (mes == 8){
               nomeMes = "Agosto";
     }else if (mes == 9){
               nomeMes = "Setembro";
     }else if (mes == 10){
               nomeMes = "Outubro";
     }else if (mes == 11){
               nomeMes = "Novembro";
     }else if (mes == 12){
               nomeMes = "Dezembro";
     }
     // vai assim até dezembro
     return nomeMes;


}
  
 // funcao principal
  public static void main(String[] args) {
  //mostrar uma mensagem para o usuario
  System.out.println("Digite o mes:");
  Scanner entrada = new Scanner (System.in);
 
  //ler um numero digitado no teclado
  int mes = entrada.nextInt();
 
  //mostrar o nome do mes
  //     usando if
  //     usando switch
 System.out.println("Numero digitado = " + mes);
 System.out.println("Nome do mês (if) = " + mostrarNomeMesif(mes));
 System.out.println("Nome do mês (switch) = " + mostrarNomeSwitch(mes));
 entrada.close();
}
}