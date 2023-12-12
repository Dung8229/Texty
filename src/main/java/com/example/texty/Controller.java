package com.example.texty;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private AnchorPane mainBoard;
    @FXML
    private Button sendButton;
    @FXML
    private TextField textField;
    @FXML
    private VBox chatBox;
    @FXML
    private ImageView avatar;

    public void handleSendButton() {
        if (Objects.equals(textField.getText(), "")) return;
        ChatBubble chatBubble = new ChatBubble(textField.getText());
        chatBox.getChildren().add(chatBubble);
        textField.clear();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Circle clip = new Circle();
        clip.setCenterX(27.5);
        clip.setCenterY(27.5);
        clip.setRadius(27.5);

        avatar.setClip(clip);
    }
}