
import Strategy.OperationAlignCenter;
import Strategy.Context;
import Strategy.OperationAlignRight;
import Strategy.OperationAlignLeft;
import Command.Document;
import Command.Commander;
import Command.CutCommand;
import Command.PasteCommand;
import Command.WordCommand;
import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Oytun
 */
public class JFrameNotepad extends javax.swing.JFrame {

    String filename;
    Document dc;
    Commander commander = new Commander();

    /**
     * Creates new form JFrameNotepad
     */
    public JFrameNotepad() {
        this.dc = new Document(jTextPane1);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        searchboxWord = new javax.swing.JTextField();
        changeboxWord = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        changeCheck = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuNew = new javax.swing.JMenuItem();
        menuOpen = new javax.swing.JMenuItem();
        menuSave = new javax.swing.JMenuItem();
        menuSaveAs = new javax.swing.JMenuItem();
        manuClear = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        editFind = new javax.swing.JMenuItem();
        editDeneme = new javax.swing.JMenuItem();
        editPaste = new javax.swing.JMenuItem();
        editAlignLeft = new javax.swing.JMenuItem();
        editCenter = new javax.swing.JMenuItem();
        editAlignRight = new javax.swing.JMenuItem();
        editUndo = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setViewportView(jTextPane1);

        searchboxWord.setText("Search");

        changeboxWord.setText("Change");

        jButton1.setText("Find");

        changeCheck.setText("Change?");
        changeCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeCheckActionPerformed(evt);
            }
        });

        menuFile.setText("File");

        menuNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menuNew.setText("New");
        menuNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNewActionPerformed(evt);
            }
        });
        menuFile.add(menuNew);

        menuOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menuOpen.setText("Open");
        menuOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpenActionPerformed(evt);
            }
        });
        menuFile.add(menuOpen);

        menuSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuSave.setText("Save");
        menuSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSaveActionPerformed(evt);
            }
        });
        menuFile.add(menuSave);

        menuSaveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuSaveAs.setText("Save As");
        menuSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSaveAsActionPerformed(evt);
            }
        });
        menuFile.add(menuSaveAs);

        manuClear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        manuClear.setText("Clear All");
        manuClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manuClearActionPerformed(evt);
            }
        });
        menuFile.add(manuClear);

        menuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        menuFile.add(menuExit);

        jMenuBar1.add(menuFile);

        jMenu2.setText("Edit");

        editFind.setText("Find");
        editFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editFindActionPerformed(evt);
            }
        });
        jMenu2.add(editFind);

        editDeneme.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        editDeneme.setText("Cut");
        editDeneme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editDenemeActionPerformed(evt);
            }
        });
        jMenu2.add(editDeneme);

        editPaste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        editPaste.setText("Paste");
        editPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPasteActionPerformed(evt);
            }
        });
        jMenu2.add(editPaste);

        editAlignLeft.setText("Align Left");
        editAlignLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAlignLeftActionPerformed(evt);
            }
        });
        jMenu2.add(editAlignLeft);

        editCenter.setText("Center");
        editCenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCenterActionPerformed(evt);
            }
        });
        jMenu2.add(editCenter);

        editAlignRight.setText("Align Right");
        editAlignRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAlignRightActionPerformed(evt);
            }
        });
        jMenu2.add(editAlignRight);

        editUndo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        editUndo.setText("Undo");
        editUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUndoActionPerformed(evt);
            }
        });
        editUndo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editUndoKeyPressed(evt);
            }
        });
        jMenu2.add(editUndo);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_SPACE, 0));
        jMenuItem1.setText("Word LOL");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuItem1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItem1KeyPressed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchboxWord, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(changeCheck)
                .addGap(18, 18, 18)
                .addComponent(changeboxWord, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeboxWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(changeCheck)
                    .addComponent(searchboxWord))
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNewActionPerformed
        jTextPane1.setText(""); //text s??f??rlar
    }//GEN-LAST:event_menuNewActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        System.exit(0); //????k????
    }//GEN-LAST:event_menuExitActionPerformed

    private void menuOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpenActionPerformed
        //Dosyadan okuma i??lemi
        FileDialog fileDialog = new FileDialog(JFrameNotepad.this, "Open File", FileDialog.LOAD);
        fileDialog.setVisible(true);

        if (fileDialog.getFile() != null) {
            filename = fileDialog.getDirectory() + fileDialog.getFile();
            setTitle(filename);
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
            StringBuilder stringBuilder = new StringBuilder();

            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line + "\r\n");
                jTextPane1.setText(stringBuilder.toString());

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JFrameNotepad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JFrameNotepad.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_menuOpenActionPerformed

    private void menuSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSaveActionPerformed
        //Save as
        FileDialog fileDialog = new FileDialog(JFrameNotepad.this, "Save File", FileDialog.SAVE);
        fileDialog.setVisible(true);
        if (fileDialog.getFile() != null) {
            filename = fileDialog.getDirectory() + fileDialog.getFile();
            setTitle(filename);
        }
        try {
            FileWriter fileWriter = new FileWriter(filename);
            fileWriter.write(jTextPane1.getText());
            setTitle(filename);
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(JFrameNotepad.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_menuSaveActionPerformed

    private void menuSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSaveAsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuSaveAsActionPerformed

    private void manuClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manuClearActionPerformed
        jTextPane1.setText(""); //b??t??n texti s??f??rlar

    }//GEN-LAST:event_manuClearActionPerformed

    private void editFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editFindActionPerformed
        String s[] = jTextPane1.getText().split("\\r?\\n"); //iterator kullan??larak find i??lemi
        ArrayList<String> arrList = new ArrayList<String>(Arrays.asList(s));
        LineClass lines;
        lines = new LineClass(arrList);
        lines.search(searchboxWord.getText(), changeboxWord.getText(), changeCheck.isSelected());
        jTextPane1.setText(lines.get());
    }//GEN-LAST:event_editFindActionPerformed

    private void editDenemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editDenemeActionPerformed
        dc = new Document(jTextPane1);
        commander.ExecuteCommand(new CutCommand(dc)); //command ile cut i??lemi
    }//GEN-LAST:event_editDenemeActionPerformed

    private void editAlignLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAlignLeftActionPerformed
        Context context = new Context(new OperationAlignLeft());
        jTextPane1.setParagraphAttributes(context.Align(), true); //Strategy ile sola yat??rma
    }//GEN-LAST:event_editAlignLeftActionPerformed

    private void editAlignRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAlignRightActionPerformed
        Context context = new Context(new OperationAlignRight());
        jTextPane1.setParagraphAttributes(context.Align(), true); //strategy ile sa??a yat??rma
    }//GEN-LAST:event_editAlignRightActionPerformed

    private void editCenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCenterActionPerformed
        Context context = new Context(new OperationAlignCenter());
        jTextPane1.setParagraphAttributes(context.Align(), true); //Strategy ile ortalama
    }//GEN-LAST:event_editCenterActionPerformed

    private void editUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUndoActionPerformed
        commander.Undo(); //command ile undo yap??m??
    }//GEN-LAST:event_editUndoActionPerformed

    private void editUndoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editUndoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_editUndoKeyPressed

    private void editPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPasteActionPerformed
        dc = new Document(jTextPane1);
        commander.ExecuteCommand(new PasteCommand(dc)); //command ile paste i??lemi
    }//GEN-LAST:event_editPasteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dc = new Document(jTextPane1);
        commander.ExecuteCommand(new WordCommand(dc)); // command ile her kelimeden sonra kay??t al??nmas??
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItem1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1KeyPressed

    private void changeCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeCheckActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameNotepad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox changeCheck;
    private javax.swing.JTextField changeboxWord;
    private javax.swing.JMenuItem editAlignLeft;
    private javax.swing.JMenuItem editAlignRight;
    private javax.swing.JMenuItem editCenter;
    private javax.swing.JMenuItem editDeneme;
    private javax.swing.JMenuItem editFind;
    private javax.swing.JMenuItem editPaste;
    private javax.swing.JMenuItem editUndo;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JMenuItem manuClear;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuNew;
    private javax.swing.JMenuItem menuOpen;
    private javax.swing.JMenuItem menuSave;
    private javax.swing.JMenuItem menuSaveAs;
    private javax.swing.JTextField searchboxWord;
    // End of variables declaration//GEN-END:variables

}
