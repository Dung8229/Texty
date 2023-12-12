package com.example.texty;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;

public class ChatBubble extends TextField {
    private String text;

    public ChatBubble(String text) {
        this.text = text;
        setText(text);
        setStyle("-fx-background-color: #570987;"
                + "-fx-background-radius: 90 90 90 90;");
        setEditable(false);
        setAlignment(Pos.CENTER);
        setPrefWidth(11 * text.length() + 30);
    }
}
