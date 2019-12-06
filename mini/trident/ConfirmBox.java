package trident;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.scene.image.Image;

public class ConfirmBox {
    static boolean answer;

    public static boolean display(String title, String message) {
        Stage window = new Stage();
        window.setOnCloseRequest(e->
        {
            e.consume();
        });
        window.initModality(Modality.APPLICATION_MODAL);
        window.getIcons().add(new Image("/trident/img/trident.png"));
        window.setResizable(false);
        window.setTitle(title);
        window.setMinWidth(250);
        Label label = new Label();
        label.setText(message);
        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");
        yesButton.setOnAction(e -> {
            answer = true;
            window.close();
        });
        noButton.setOnAction(e -> {
            answer = false;
            window.close();
        });
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, yesButton, noButton);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
        return answer;
    }

}