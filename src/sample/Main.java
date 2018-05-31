package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("sample.fxml"));

        Parent p = fxmlLoader.load();

        Controller c = fxmlLoader.getController();

        Scene scene = new Scene( p );

        String css = this.getClass().getResource("style.css").toExternalForm();
        scene.getStylesheets().add(css);

        // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Palladium Combat Matrix");
        primaryStage.setScene( scene );
        primaryStage.setOnShown( (windowEvent) -> c.addCharacter() );
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
