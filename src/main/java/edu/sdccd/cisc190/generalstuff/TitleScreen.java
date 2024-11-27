package edu.sdccd.cisc190.generalstuff;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TitleScreen {
    private Scene scene;

    public TitleScreen(Stage primaryStage) {
        // Create the title text
        Text titleText = new Text("The NightShift at SevenGuys");
        titleText.setStyle("-fx-font-size: 30px; -fx-font-weight: bold;");

        // Create the start button
        Button startButton = new Button("Prelude to Insanity");
        startButton.setStyle("-fx-font-size: 20px;");
        startButton.setOnAction(e -> primaryStage.setScene(new MainMenu(primaryStage).getScene()));

        // Set up the BorderPane layout
        BorderPane layout = new BorderPane();

        // Add the titleText to the center of the BorderPane
        layout.setTop(titleText);

        // Add the startButton to the bottom of the BorderPane
        layout.setCenter(startButton);

        // Create the scene with the layout and set the preferred size
        scene = new Scene(layout, 400, 300);
    }

    // Getter for the scene
    public Scene getScene() {
        return scene;
    }
}
