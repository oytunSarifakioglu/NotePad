package Strategy;


import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oytun
 */
public class OperationAlignCenter implements IAlignmentStrategy{//seçilen texti oralama
    @Override
    public SimpleAttributeSet Align(){ //simpleattributeset kullanılarak yapılıyor
    SimpleAttributeSet attribs = new SimpleAttributeSet();
StyleConstants.setAlignment(attribs , StyleConstants.ALIGN_CENTER);
    return attribs;
    }
}
