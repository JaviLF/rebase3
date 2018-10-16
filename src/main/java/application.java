import javafx.application.Application;
import javafx.stage.Stage;

public class application extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        System.out.println("Hola mundo");

        for (int i=0;i<5;i++){
            System.out.println(i);
            int j=1;
            while(j<=i) {
                System.out.println(j);
                j++;
            }
        }

        System.out.println(5+7);
        System.out.println(7-2);
        System.out.println(5*7);
        System.out.println((5*7)/5);

    }
}
