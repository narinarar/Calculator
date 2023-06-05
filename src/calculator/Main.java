package calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("calculator.fxml"));
        stage.setTitle("Calculator (JavaFX App)");
        stage.setScene(new Scene(root,435,560));


        String iconPath = getClass().getResource("/resources/icon.png").getPath()
                        .replaceAll("%80", " ");
        stage.getIcons().add(new Image(new File(iconPath).getAbsolutePath()));


        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}