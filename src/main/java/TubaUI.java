
import java.awt.Color;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raspb
 */
public class TubaUI extends javax.swing.JFrame {

    /**
     * Creates new form TubaUI
     */
    public TubaUI() {
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

        jButton1 = new javax.swing.JButton();
        noteImageLbl = new javax.swing.JLabel();
        startStopGameBtn = new javax.swing.JButton();
        valveBtn1 = new javax.swing.JButton();
        valveBtn2 = new javax.swing.JButton();
        valveBtn3 = new javax.swing.JButton();
        valveBtn4 = new javax.swing.JButton();
        playNoteBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        scoreLbl = new javax.swing.JLabel();
        answerLbl = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        noteImageLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noteImageLbl.setText("Note will Display Here");

        startStopGameBtn.setText("Start Game");
        startStopGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startStopGameBtnActionPerformed(evt);
            }
        });

        valveBtn1.setBackground(Color.green);
        valveBtn1.setText("1");
        valveBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valveBtn1ActionPerformed(evt);
            }
        });

        valveBtn2.setBackground(Color.green);
        valveBtn2.setText("2");
        valveBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valveBtn2ActionPerformed(evt);
            }
        });

        valveBtn3.setBackground(Color.green);
        valveBtn3.setText("3");
        valveBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valveBtn3ActionPerformed(evt);
            }
        });

        valveBtn4.setBackground(Color.green);
        valveBtn4.setText("4");
        valveBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valveBtn4ActionPerformed(evt);
            }
        });

        playNoteBtn.setText("Play Note");
        playNoteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playNoteBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Score:");

        scoreLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        scoreLbl.setText("0");

        answerLbl.setText("Click Start to Begin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(valveBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noteImageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(valveBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(valveBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(valveBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(playNoteBtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(scoreLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(answerLbl)))
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(startStopGameBtn)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(startStopGameBtn)
                .addGap(99, 99, 99)
                .addComponent(noteImageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valveBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valveBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valveBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valveBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playNoteBtn))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(scoreLbl)
                    .addComponent(answerLbl))
                .addGap(71, 71, 71))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startStopGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startStopGameBtnActionPerformed
        // TODO add your handling code here:
        
        newNote();
        answerLbl.setText("The Game has begun");
        
    }//GEN-LAST:event_startStopGameBtnActionPerformed

    private void playNoteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playNoteBtnActionPerformed
        // TODO add your handling code here:
        System.out.println("--------------");
        System.out.println("Play Note Button Pressed");
        
        int noteIndex;
        NoteManager tubaNotes = new NoteManager();
        
        //check to see if played correctly
        boolean correct;
        correct = isPlayedCorrectly();
        System.out.println("played correctly: " + correct);
        
        
        //get random note and display
        if (correct) {
            newNote();
        }

    }//GEN-LAST:event_playNoteBtnActionPerformed
    
    private void newNote() {
        Random rand = new Random();
        int noteIndex;
        NoteManager tubaNotes = new NoteManager();
        
        noteIndex = rand.nextInt(tubaNotes.getSize());
        System.out.println(noteIndex);
        System.out.println(tubaNotes.getNameByIndex(noteIndex));
        String newNoteName = tubaNotes.getNameByIndex(noteIndex);
        noteImageLbl.setText(newNoteName);
    }
    
    
    private boolean isPlayedCorrectly() {
        boolean playedCorrectly;
        int playedFingering = 0;
        
        NoteManager tubaNotes = new NoteManager();
        
        String NoteName = noteImageLbl.getText();
        int correctFingering = tubaNotes.getFingeringByName(NoteName);
        
        //get input from buttons
        if (valveBtn1.getBackground() == Color.red) {
            playedFingering += 1000;
        }
        if (valveBtn2.getBackground() == Color.red) {
            playedFingering +=  200;
        }
        if (valveBtn3.getBackground() == Color.red) {
            playedFingering +=   30;
        }
        if (valveBtn4.getBackground() == Color.red) {
            playedFingering +=    4;
        }
        
        System.out.println("Buttons pressed are " + playedFingering);
        
        //is input == correct
        if (playedFingering == correctFingering) {
            playedCorrectly = true;
            
            //reset valve colors
            valveBtn1.setBackground(Color.green);
            valveBtn2.setBackground(Color.green);
            valveBtn3.setBackground(Color.green);
            valveBtn4.setBackground(Color.green);
            
        } else {
            playedCorrectly = false;
            System.out.println("Correct fingering was " + correctFingering);
        }
        
        return playedCorrectly;        
    }
    
    private void valveBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valveBtn1ActionPerformed
        // TODO add your handling code here:
        System.out.println("-------");
        System.out.println("Valve 1 toggled");
        if (valveBtn1.getBackground() == Color.green) {
            valveBtn1.setBackground(Color.red);
        } else {
            valveBtn1.setBackground(Color.green);
        }
        
    }//GEN-LAST:event_valveBtn1ActionPerformed

    private void valveBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valveBtn2ActionPerformed
        // TODO add your handling code here:
        System.out.println("-------");
        System.out.println("Valve 2 toggled");
        if (valveBtn2.getBackground() == Color.green) {
            valveBtn2.setBackground(Color.red);
        } else {
            valveBtn2.setBackground(Color.green);
        }
    }//GEN-LAST:event_valveBtn2ActionPerformed

    private void valveBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valveBtn3ActionPerformed
        // TODO add your handling code here:
        System.out.println("-------");
        System.out.println("Valve 3 toggled");
        if (valveBtn3.getBackground() == Color.green) {
            valveBtn3.setBackground(Color.red);
        } else {
            valveBtn3.setBackground(Color.green);
        }
    }//GEN-LAST:event_valveBtn3ActionPerformed

    private void valveBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valveBtn4ActionPerformed
        // TODO add your handling code here:
        System.out.println("-------");
        System.out.println("Valve 4 toggled");
        if (valveBtn4.getBackground() == Color.green) {
            valveBtn4.setBackground(Color.red);
        } else {
            valveBtn4.setBackground(Color.green);
        }
    }//GEN-LAST:event_valveBtn4ActionPerformed

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
            java.util.logging.Logger.getLogger(TubaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TubaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TubaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TubaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TubaUI().setVisible(true);
            }
        });
        
        // the rest of the psvm is my code
        //This doesnt work ------> NoteManager notesToPlay = new NoteManager(createNoteObjs());
        NoteManager tubaNotes = new NoteManager();
        //System.out.println(tubaNotes.getbyName("C2"));
        
        GameStats game = new GameStats();
        System.out.println(game.toString());
    }

    //my methods begins here
    /*
    public NoteManager createNoteObjs() {
        NoteManager noteDm = new NoteManager();
        
        Note C2 = new Note("C2", 0004); //C below the staff
        noteDm.create(C2);
        
        Note D2 = new Note("D2", 1200); //D below the staff
        noteDm.create(D2);
        
        return noteDm;
    }
    */
    
    
    // my methods end here
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel answerLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel noteImageLbl;
    private javax.swing.JButton playNoteBtn;
    private javax.swing.JLabel scoreLbl;
    private javax.swing.JButton startStopGameBtn;
    private javax.swing.JButton valveBtn1;
    private javax.swing.JButton valveBtn2;
    private javax.swing.JButton valveBtn3;
    private javax.swing.JButton valveBtn4;
    // End of variables declaration//GEN-END:variables
}
