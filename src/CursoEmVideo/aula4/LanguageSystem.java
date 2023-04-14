package CursoEmVideo.aula4;

import java.util.Locale;
import java.awt.Dimension;
import java.awt.Toolkit;

public class LanguageSystem {

  public static void main(String[] args) {
    Locale language = Locale.getDefault();
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

    int width = (int) screen.getWidth();
    int height = (int) screen.getHeight();

    System.out.println("A resolucao da tela seria: " + width + " X " + height);
    System.out.println("-----");
    System.out.println("A linguagem do sistema esta em " + language.getDisplayLanguage());
  }

}
