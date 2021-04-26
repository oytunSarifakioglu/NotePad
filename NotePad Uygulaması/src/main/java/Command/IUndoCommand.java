package Command;


import Command.ICommand;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oytun
 */
public interface IUndoCommand extends ICommand{ //Geri Alınabilir
    public void Undo();
}
