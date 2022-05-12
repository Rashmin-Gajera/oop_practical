import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.util.*;

public class prc_17 extends Application {
    @Override
    public void start(Stage primaryStage) {

        GridPane pane = new GridPane();
        Random rn = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int n = rn.nextInt(2);
                if (n == 0)
                    pane.add(new ImageView(new Image("image/X_Image.gif")), j, i);
                else if (n == 1)
                    pane.add(new ImageView(new Image("image/O_Image.gif")), j, i);
                else
                    pane.add(new ImageView(new Image("image/empty.gif")), j, i);
            }
        }

        Scene scene = new Scene(pane, 1600, 900);
        primaryStage.setTitle("Prc_17");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}