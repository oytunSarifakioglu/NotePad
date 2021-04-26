package Command;


import javax.swing.JTextPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Oytun
 */
public class Document {//execute edilince buradan yararlanılır

    private JTextPane textbox;

    public Document(JTextPane textbox) {
        this.textbox = textbox;
    }

    public void Cut() {
        textbox.cut();
    }

    public void Copy() {
        textbox.copy();
    }

    public void Paste() {
        textbox.paste();
    }

    public String getText() {
        return textbox.getText();
    }

    public void setText(String value) {
        textbox.setText(value);
    }
}


