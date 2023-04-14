import java.util.Date;

//mostrar data e hora do sistema

public class App {
    public static void main(String[] args) throws Exception {
        Date clock = new Date(); // new -> criacao de um novo objetp

        System.out.println(clock.toString());
    }
}
