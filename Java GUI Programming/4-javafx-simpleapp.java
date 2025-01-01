import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXSimpleApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a label
        Label label = new Label("Welcome to JavaFX!");

        // Create a button
        Button button = new Button("Click Me");
        button.setOnAction(e -> label.setText("Button Clicked!"));

        // Create a layout
        StackPane root = new StackPane();
        root.getChildren().addAll(label, button);

        // Set the scene
        Scene scene = new Scene(root, 300, 200);

        // Configure the stage
        primaryStage.setTitle("JavaFX Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
