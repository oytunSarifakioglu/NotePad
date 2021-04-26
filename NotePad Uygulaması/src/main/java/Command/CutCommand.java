package Command;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oytun
 */
public class CutCommand implements IUndoCommand{

    private Document document;
    private String previousText;

    public CutCommand(Document document) {
        this.document = document;
        previousText = this.document.getText();
    }
    
    @Override
    public void Execute() {
        document.Cut();
    }
    
    @Override
    public void Undo() {
        document.setText(previousText);
    }

}
