package CursoEmVideo.aula6;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class setYears {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the year you were born: ");
    int birthYear = scanner.nextInt();

    LocalDate currentDate = LocalDate.now();
    int currentYear = currentDate.getYear();

    Period period = Period.between(LocalDate.of(birthYear, 1, 1), LocalDate.of(currentYear, 1, 1));

    int age = period.getYears();

    System.out.println(age);
  }

}
