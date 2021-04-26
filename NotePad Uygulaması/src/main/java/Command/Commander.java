package Command;


import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oytun
 */
public class Commander { //command patternındaki commander. Gelen işlem execute edilip stack e yerleştirilir.
    private Stack commandStack = new Stack();

    public void ExecuteCommand(ICommand cmd)
    {
        cmd.Execute();
        if (cmd instanceof IUndoCommand)
        {
            commandStack.push(cmd);
        }
    }


    public void Undo() //Stackten çıkarılıp undo işlemi yapılır
    {
        if (!commandStack.isEmpty())
        {
            IUndoCommand cmd = (IUndoCommand)commandStack.pop();
            cmd.Undo();
        }
    }
}
