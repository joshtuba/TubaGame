
import java.awt.Color;
import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;
import java.util.Random;
import javax.swing.JOptionPane;

//

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

    String StartButtonText = "Start Game";
    int NumberOfQuestionsToAsk = 20;

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
        noteNameLbl = new javax.swing.JLabel();
        startStopGameBtn = new javax.swing.JButton();
        valveBtn1 = new javax.swing.JButton();
        valveBtn2 = new javax.swing.JButton();
        valveBtn3 = new javax.swing.JButton();
        valveBtn4 = new javax.swing.JButton();
        playNoteBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        noteImageLbl = new javax.swing.JLabel();
        scoreCorrectLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        scoreAttemptsLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        QuestionAttemptsLbl = new javax.swing.JLabel();
        QuestionsAskLbl = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        noteNameLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        noteNameLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noteNameLbl.setText("Click \"Start Game\" to begin");

        startStopGameBtn.setText(StartButtonText);
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Score:");

        noteImageLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noteImageLbl.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://raw.githubusercontent.com/joshtuba/TubaGame/master/src/main/java/Images/Staff.jpg")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        scoreCorrectLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        scoreCorrectLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        scoreCorrectLbl.setText("0");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("/");

        scoreAttemptsLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        scoreAttemptsLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        scoreAttemptsLbl.setText("0");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Question:");

        QuestionAttemptsLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        QuestionAttemptsLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        QuestionAttemptsLbl.setText("0");

        QuestionsAskLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        QuestionsAskLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        QuestionsAskLbl.setText("of  " + NumberOfQuestionsToAsk);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(noteImageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 229, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(QuestionAttemptsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(33, 33, 33)
                                .addComponent(scoreCorrectLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(scoreAttemptsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(QuestionsAskLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(startStopGameBtn)
                                .addGap(47, 47, 47))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(noteNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valveBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(valveBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(valveBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(valveBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(playNoteBtn)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(scoreCorrectLbl)
                            .addComponent(jLabel3)
                            .addComponent(scoreAttemptsLbl))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(QuestionAttemptsLbl)
                            .addComponent(QuestionsAskLbl))
                        .addGap(12, 12, 12)
                        .addComponent(noteNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(startStopGameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(noteImageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valveBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valveBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valveBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valveBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(playNoteBtn)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startStopGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startStopGameBtnActionPerformed
        // TODO add your handling code here:
        String buttonText;
        buttonText = startStopGameBtn.getText();

        if (buttonText.equals(StartButtonText)) {
            System.out.println("This line was printed out");
            newNote();
            startStopGameBtn.setText("Stop Game");
            scoreCorrectLbl.setText("0");
            scoreAttemptsLbl.setText("0");
            QuestionAttemptsLbl.setText("1");
        } else {
            endGame();
        }


    }//GEN-LAST:event_startStopGameBtnActionPerformed

    private String getScoreString() {
        String outputString = "null";
        int finalPercentage = getFinalScore();
        String fractionScore = scoreCorrectLbl.getText() + "/" + scoreAttemptsLbl.getText();
        String line1 = "Score: " + fractionScore;
        String line2 = "Your final score was: " + finalPercentage + "%";

        outputString = line1 + "\r\n" + line2;

        return outputString;
    }

    private int getFinalScore() {
        double Correct = parseInt(scoreCorrectLbl.getText());
        double Attpepts = parseInt(scoreAttemptsLbl.getText());

        double fraction = Correct / Attpepts;
        fraction *= 100;
        fraction = Math.round(fraction);
        int percentage = (int) fraction;
        return percentage;
    }

    private void isGameRunning() throws GameNotRunningException {
        String buttonText = startStopGameBtn.getText();
        if (buttonText.equals(StartButtonText)) {
            throw new GameNotRunningException("Game not Running");
        }
    }

    private void playNoteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playNoteBtnActionPerformed
        // TODO add your handling code here:

        try {
            isGameRunning();
        } catch (GameNotRunningException ex) {
            JOptionPane.showMessageDialog(this, "Game is not currently running. \r\n Press the \"" + StartButtonText + "\" button to begin");
            return;
        }

        System.out.println("--------------");
        System.out.println("Play Note Button Pressed");

        //check to see if played correctly
        boolean correct = false;

        try {
            correct = isPlayedCorrectly();

        } catch (WrongNoteException ex) {
            JOptionPane.showMessageDialog(this, "Sorry, that was incorrect");
        } finally {
            updateScore(correct);
            newNote();
            isGameFinished();
            System.out.println("played correctly: " + correct);

        }

        //reset valve colors
        valveBtn1.setBackground(Color.green);
        valveBtn2.setBackground(Color.green);
        valveBtn3.setBackground(Color.green);
        valveBtn4.setBackground(Color.green);
    }//GEN-LAST:event_playNoteBtnActionPerformed

    private void isGameFinished() {
        int attpempts = parseInt(scoreAttemptsLbl.getText());
        if (attpempts >= NumberOfQuestionsToAsk) {
            QuestionAttemptsLbl.setText(NumberOfQuestionsToAsk + "");
            System.out.println("This is where I'm at");
            endGame();

        }
    }

    private void endGame() {
        System.out.println("Game has ended");
        clearNote();
        startStopGameBtn.setText(StartButtonText);

        String ScoreString = getScoreString();
        JOptionPane.showMessageDialog(this, ScoreString);
    }

    private void updateScore(boolean correct) {
        int oldCorrect = parseInt(scoreCorrectLbl.getText());
        int oldAttempts = parseInt(scoreAttemptsLbl.getText());

        int newAttempts = oldAttempts + 1;
        int newCorrect = oldCorrect;
        if (correct) {
            newCorrect += 1;
        }
        scoreCorrectLbl.setText(valueOf(newCorrect));
        scoreAttemptsLbl.setText(valueOf(newAttempts));

        updateQuestionsAsked();
    }

    private void clearNote() {
        noteNameLbl.setText("");
        newImage("Staff");
    }

    private void newNote() {
        Random rand = new Random();
        int noteIndex;
        NoteManager tubaNotes = new NoteManager();

        noteIndex = rand.nextInt(tubaNotes.getSize());
        System.out.println(noteIndex);
        System.out.println(tubaNotes.getNameByIndex(noteIndex));
        String newNoteName = tubaNotes.getNameByIndex(noteIndex);
        noteNameLbl.setText(newNoteName);
        newImage(newNoteName);

    }

    private void updateQuestionsAsked() {
        int oldNum = parseInt(QuestionAttemptsLbl.getText());
        int newNum = oldNum + 1;
        QuestionAttemptsLbl.setText(newNum + "");
    }

    private void newImage(String note) {
        String myURL;

        myURL = "https://raw.githubusercontent.com/joshtuba/TubaGame/master/src/main/java/Images/" + note + ".jpg";

        noteImageLbl.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                            new java.net.URL(myURL)
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }

    private boolean isPlayedCorrectly() throws WrongNoteException {
        boolean playedCorrectly;
        int playedFingering = 0;

        NoteManager tubaNotes = new NoteManager();

        String NoteName = noteNameLbl.getText();
        int correctFingering = tubaNotes.getFingeringByName(NoteName);

        //get input from buttons
        if (valveBtn1.getBackground() == Color.red) {
            playedFingering += 1000;
        }
        if (valveBtn2.getBackground() == Color.red) {
            playedFingering += 200;
        }
        if (valveBtn3.getBackground() == Color.red) {
            playedFingering += 30;
        }
        if (valveBtn4.getBackground() == Color.red) {
            playedFingering += 4;
        }

        System.out.println("Buttons pressed are " + playedFingering);

        //is input == correct
        if (playedFingering == correctFingering) {
            playedCorrectly = true;

        } else {
            playedCorrectly = false;
            System.out.println("Correct fingering was " + correctFingering);
            throw new WrongNoteException("Wrong Note");
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
    }
    //my methods begins here

    // my methods end here

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel QuestionAttemptsLbl;
    private javax.swing.JLabel QuestionsAskLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel noteImageLbl;
    private javax.swing.JLabel noteNameLbl;
    private javax.swing.JButton playNoteBtn;
    private javax.swing.JLabel scoreAttemptsLbl;
    private javax.swing.JLabel scoreCorrectLbl;
    private javax.swing.JButton startStopGameBtn;
    private javax.swing.JButton valveBtn1;
    private javax.swing.JButton valveBtn2;
    private javax.swing.JButton valveBtn3;
    private javax.swing.JButton valveBtn4;
    // End of variables declaration//GEN-END:variables

    /*
    
    Josh's Final Project for Intermediate Programming
    Ready to submit
    
     */
}
