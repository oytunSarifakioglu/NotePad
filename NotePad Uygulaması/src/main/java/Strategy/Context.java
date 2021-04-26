package Strategy;


import javax.swing.text.SimpleAttributeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oytun
 */
public class Context { //strategy pattern ı 
    private IAlignmentStrategy strategy;
    
    public Context(IAlignmentStrategy strategy){
        this.strategy = strategy;
    }
    
    public SimpleAttributeSet Align(){
        return strategy.Align();
    }
}
