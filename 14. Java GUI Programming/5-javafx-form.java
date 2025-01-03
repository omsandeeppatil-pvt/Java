import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class JavaFXFormApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a GridPane layout
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setVgap(10);
        grid.setHgap(10);

        // Add form components
        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();
        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();
        Button submitButton = new Button("Submit");
        Label statusLabel = new Label();

        // Add components to the grid
        grid.add(nameLabel, 0, 0);
        grid.add(nameField, 1, 0);
        grid.add(emailLabel, 0, 1);
        grid.add(emailField, 1, 1);
        grid.add(submitButton, 1, 2);
        grid.add(statusLabel, 1, 3);

        // Add button action
        submitButton.setOnAction(e -> {
            String name = nameField.getText();
            String email = emailField.getText();
            statusLabel.setText("Submitted: " + name + ", " + email);
        });

        // Configure the scene and stage
        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setTitle("JavaFX Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
