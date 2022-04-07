package com.mycompany.quizgame;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;



public class GameQuiz extends javax.swing.JFrame  {
    JMenuBar mainbar = new JMenuBar();
    JMenu members= new JMenu("Members Contribution");
    JMenuItem aliana = new JMenuItem("Porras, Ross Aliana Claire: Lead Programmer");
    JMenuItem dreian = new JMenuItem("Malaga, Dreian Ira: Lead Designer");
    JMenuItem prince = new JMenuItem("Sancho, Princeler: Question Maker");
    JMenuItem kim= new JMenuItem("Palma, Kimberly Faith: Question Maker");
  
    public static final String ALPHABET = "ABC";
    public final List<Questions> questions = new LinkedList<>();
    public int currentIndex = 0;
    public List<String> answers = new LinkedList<>();
    public final Map<Integer, AnswerUser> userAnswers = new HashMap<>();
    
    public GameQuiz() {
        initComponents();
        setJMenuBar(mainbar); 
           mainbar.add(members);
           members.add(aliana);
           members.add(dreian);
           members.add(prince);
           members.add(kim);
           
        questions.add( new Questions(1, "What is the letter next to P?", Arrays.asList(new Choices("A"), new Choices("B"), new Choices("Q", true)), "The answer is the letter before letter R.") );
        questions.add( new Questions(2, "The most popular song that BlackPink released?", Arrays.asList(new Choices("Playing with fire", true), new Choices("Kill this Love"), new Choices("How you like that")), "The song was realeased on 2016.") );
        questions.add( new Questions(3, "The smallest fish in the Philippines?", Arrays.asList(new Choices("Gold Fish"), new Choices("Pandaka", true), new Choices("Whale Shark")), "Can be found in Mangrove Areas.") );
        questions.add( new Questions(4, "The fourth planet in our Solar System ", Arrays.asList(new Choices("Earth"), new Choices("Uranus"), new Choices("Mars", true)), "Also known as the Red Planet.") );
        questions.add( new Questions(5, "30 + 25 = ", Arrays.asList(new Choices("55", true), new Choices("60"), new Choices("75")), "The answer is not the highest but not the lowest.") );
        questions.add( new Questions(6, "Where can we find the Blue Whale in the Philippines? ", Arrays.asList(new Choices("Cebu", true), new Choices("Iloilo"), new Choices("Davao")), "It is located in Visayas.") );
        questions.add( new Questions(7, "25 x 4?", Arrays.asList(new Choices("75"), new Choices("100", true), new Choices("125")), "The number is divisible by 10.") );
        questions.add( new Questions(8, "What does C6h1206 means?", Arrays.asList(new Choices("Carbon Dioxide"), new Choices("Glucose", true), new Choices("Water")), "Mixture of Carbon,Hyrogen and Oxygen.") );
        questions.add( new Questions(9, "Lowest point on Earth? ", Arrays.asList(new Choices("Dead Sea", true), new Choices("Death Valley"), new Choices("Mariana's Trench")), "Can be found in Asia") );
        questions.add( new Questions(10, "Smallest country in Asia", Arrays.asList(new Choices("Singapore", true), new Choices("Mongolia"), new Choices("Cyprus")), "Located in SouthEast Asia.") );
        
        answers = questions.stream().map(Questions::getAnswer).collect(Collectors.toList());
        setCurrentQuestion(currentIndex);
        previousBtn.setEnabled(false);
    }
    
    private void setCurrentQuestion(final int currentIndex) {
        Questions currentQuestion = questions.get(currentIndex);
        
        questionLabel.setText(currentQuestion.getQuestionNumber() + ")  " + currentQuestion.getQuestion());
        choiceA.setText(ALPHABET.charAt(0) +")  "+ currentQuestion.getChoices().get(0).getChoice());
        choiceB.setText(ALPHABET.charAt(1) +")  " + currentQuestion.getChoices().get(1).getChoice());
        choiceC.setText(ALPHABET.charAt(2) +")  "+ currentQuestion.getChoices().get(2).getChoice());
        
        hintLabel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                hintLabel.setText( currentQuestion.getHint() );
            }
            
            public void mouseExited(MouseEvent evt) {
                hintLabel.setText( "Show hint!" );
            }
        });
        
        if( currentIndex > 0 && !previousBtn.isEnabled() ) {
            previousBtn.setEnabled(true);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        
// Swing Components 
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        hintLabel = new javax.swing.JLabel();
        questionLabel = new javax.swing.JLabel();
        choiceA = new javax.swing.JRadioButton();
        choiceB = new javax.swing.JRadioButton();
        choiceC = new javax.swing.JRadioButton();
        previousBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
      
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUIZ GAME");
        setResizable(false);
        
       jPanel2.setBackground(new java.awt.Color(255, 255, 255));
       questionLabel.setText("Question");
       questionLabel.setBounds(40,80,200,60);
       
        choiceA.setText("jRadioButto1");
        choiceA.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceAActionPerformed(evt);
            }
        });

        choiceB.setText("jRadioButton1");
        choiceB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceBActionPerformed(evt);
            }
        });

        choiceC.setText("jRadioButton1");
        choiceC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceCActionPerformed(evt);
            }
        });

        hintLabel.setText("Show Hint");
        previousBtn.setText("Previous");
        previousBtn.setBackground(new java.awt.Color(255, 0, 51));
        previousBtn.setFont(new java.awt.Font("Century Schoolbook", 1, 16));
        previousBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousBtnActionPerformed(evt);
            }
        });

        nextBtn.setText("Next");
        nextBtn.setBackground(new java.awt.Color(51, 255, 51));
        nextBtn.setFont(new java.awt.Font("Century Schoolbook", 0, 14));
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(23, 23, 23)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(questionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel2Layout.createSequentialGroup()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(44, 44, 44)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
        .addComponent(choiceC, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(choiceB, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(choiceA, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGroup(jPanel2Layout.createSequentialGroup()
        .addComponent(previousBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(58, 58, 58)
        .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addComponent(hintLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(0, 73, Short.MAX_VALUE)))
        .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(choiceA, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(choiceB, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(choiceC, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(previousBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(hintLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Previous button action performed 

    private void previousBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousBtnActionPerformed
        setCurrentQuestion(--currentIndex);
        choiceA.setSelected(false);
        choiceB.setSelected(false);
        choiceC.setSelected(false);
        setPreviouslySetAnswers();
        if( currentIndex <= 0 ) {
            previousBtn.setEnabled(false);
        }
    }//GEN-LAST:event_previousBtnActionPerformed
    
    private void setPreviouslySetAnswers() {
        if( userAnswers.containsKey(currentIndex+1) ) {
            AnswerUser userAnswer = userAnswers.get(currentIndex+1);
            switch(userAnswer.getChoiceNumber()) {
                case 1: 
                    choiceA.setSelected(true);
                    break;
                case 2:
                    choiceB.setSelected(true);
                    break;
                default:
                    choiceC.setSelected(true);
                    break;
            }
        }
    }
    // This method will get the total score of the user
    public int getScore() {
        int totalScore = 0;
        
        for( int i = 0; i < answers.size(); i++ ) {
            System.out.println("real answer: " + answers.get(i) + ", user answer: " + userAnswers.get(i+1).getAnswer());
            if( answers.get(i).equalsIgnoreCase(userAnswers.get(i+1).getAnswer()) ) {
                totalScore++;
            }
        }
        return totalScore;
    }
     // This method will get the total score of the user and it will save it to the text file
      public void writer() throws IOException {
        BufferedWriter bw;

     
            FileWriter fw = null;
            try {
                // This will create the new file named GameScore
                File f = new File("C:\\Users\\Student\\Documents\\PorrasRossAlianaClaire\\QuizGame\\GameScore.txt"); 
                fw = new FileWriter(f, true);
            } catch (IOException e) {
              JOptionPane.showMessageDialog(this, "An error occured!", "error", JOptionPane.ERROR_MESSAGE);
            }
 
            // This will be written on the text file
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Your score is " + getScore()+ " out of " + questions.size() + "!") ; 
                         pw.flush();
                         fw.flush();
               JOptionPane.showMessageDialog(this, "Your score was saved!", "Score", JOptionPane.INFORMATION_MESSAGE);
    
      }
    
    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
            
        if( !choiceA.isSelected() && !choiceB.isSelected() && !choiceC.isSelected() ) {
            JOptionPane.showMessageDialog(this,  "Please choose a choice", "No choice detected", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if( !userAnswers.containsKey(currentIndex+1) ) {
            userAnswers.put(currentIndex+1, getUserAnswer() );
        }
        
        if( ++currentIndex >= questions.size() ) {
            userAnswers.forEach( (k,v) -> System.out.println("question " + k + ", answer: " + v) );
            
              // Option Pane will show if the user finished the quiz
            JOptionPane.showMessageDialog(this,  "You got " + getScore() + " out of " + questions.size() + "!\n", "Your Score",JOptionPane.INFORMATION_MESSAGE);

            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(GameQuiz.class.getName()).log(Level.SEVERE, null, ex);
            }
            
             try {
                    writer();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            this.dispose();
        }
        
        setCurrentQuestion(currentIndex);
        choiceA.setSelected(false);
        choiceB.setSelected(false);
        choiceC.setSelected(false);
    }//GEN-LAST:event_nextBtnActionPerformed

    
    private AnswerUser getUserAnswer() {
        List<Choices> choices = questions.get(currentIndex).getChoices();
        if( choiceA.isSelected() ) {
            return new AnswerUser(choices.get(0).getChoice(), 1);
        }else if( choiceB.isSelected() ) {
            return new AnswerUser(choices.get(1).getChoice(), 2);
        }else {
            return new AnswerUser(choices.get(2).getChoice(), 3);
        }
    }
    
    private void choiceBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceABoxActionPerformed
        
        if( choiceA.isSelected() || choiceC.isSelected() ) {
            JOptionPane.showMessageDialog(this,  "You must only click only ONE choice", "Multiple choice not allowed", JOptionPane.WARNING_MESSAGE);
            choiceA.setSelected(false);
        }
        
    }//GEN-LAST:event_choiceABoxActionPerformed

    private void choiceAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceBBoxActionPerformed
        if( choiceB.isSelected() || choiceC.isSelected() ) {
            JOptionPane.showMessageDialog(this,  "You must only click only ONE choice", "Multiple choice not allowed", JOptionPane.WARNING_MESSAGE);
            choiceB.setSelected(false);
        }
    }//GEN-LAST:event_choiceBBoxActionPerformed

    private void choiceCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceCBoxActionPerformed
        if( choiceA.isSelected() || choiceB.isSelected() ) {
            JOptionPane.showMessageDialog(this,  "You must only click only ONE choice", "Multiple choice not allowed", JOptionPane.WARNING_MESSAGE);
            choiceC.setSelected(false);
        }
    }//GEN-LAST:event_choiceCBoxActionPerformed

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
            java.util.logging.Logger.getLogger(GameQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameQuiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton choiceA;
    private javax.swing.JRadioButton choiceB;
    private javax.swing.JRadioButton choiceC;
    private javax.swing.JLabel hintLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton previousBtn;
    private javax.swing.JLabel questionLabel;

    // End of variables declaration//GEN-END:variables
}





