package CursoEmVideo.aula6;

import java.util.Scanner;

public class Aula6 {
  public static void main(String[] args) {

    Integer idade = new Integer(3); // declarando uma variavel como uma class
    float sal = (float) 7; // declaracao de numeros float, plota com "," mesmo quando nao colocamos
    char letra = (char) 'g'; // letras, a instancia char recebe apenas uma letra
    boolean casado = false; // tipo de instancia booleana
    String name = "Michael";

    float nota = (float) 9.5;

    System.out.printf("Realizando um teste sobre a aula 6 onde %s contem %.1f letras \n", name, sal);
    System.out.format("Realizando um teste sobre a aula 6 onde %s contem %.1f letras", name, sal);

    // SCANNER

    Scanner teclado = new Scanner(System.in);
  }
}
