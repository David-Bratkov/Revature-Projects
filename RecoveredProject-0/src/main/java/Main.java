import frontcontroller.FrontController;
import io.javalin.Javalin;


public class Main {

    public static void main(String[] args) {
        Javalin app = Javalin.create().start(8000);
        new FrontController(app);

    }

}