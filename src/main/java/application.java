import javafx.application.Application;
import javafx.stage.Stage;

public class application extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        System.out.println("Hola mundo");
        System.out.println(5+7);
        System.out.println(7-2);
    }
}
