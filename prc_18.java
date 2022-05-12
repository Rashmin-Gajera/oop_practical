import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class prc_18 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        pane.setPadding(new Insets(20, 20, 20, 20));
        Circle circle = new Circle(40, 40, 40);
        circle.setFill(Color.RED);
        pane.getChildren().add(circle);

        pane.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP:
                    circle.setCenterY(
                            circle.getCenterY() > circle.getRadius() ? circle.getCenterY() - 15 : circle.getCenterY());
                    break;
                case DOWN:
                    circle.setCenterY(
                            circle.getCenterY() < pane.getHeight() - circle.getRadius() ? circle.getCenterY() + 15
                                    : circle.getCenterY());
                    break;
                case LEFT:
                    circle.setCenterX(
                            circle.getCenterX() > circle.getRadius() ? circle.getCenterX() - 15 : circle.getCenterX());
                    break;
                case RIGHT:
                    circle.setCenterX(
                            circle.getCenterX() < pane.getWidth() - circle.getRadius() ? circle.getCenterX() + 15
                                    : circle.getCenterX());
                default:    
                    break;
            }
        });

        Scene scene = new Scene(pane, 900, 900);
        primaryStage.setTitle("Moving Circle Using Arrow keys");
        primaryStage.setScene(scene);
        primaryStage.show();
        pane.requestFocus();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
