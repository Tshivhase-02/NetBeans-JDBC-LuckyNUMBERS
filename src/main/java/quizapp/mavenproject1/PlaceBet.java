/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quizapp.mavenproject1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author zwavh
 */
public class PlaceBet extends javax.swing.JFrame {

    /**
     * Creates new form PlaceBet
     */
    public PlaceBet() {
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

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NumText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        ComboBox1 = new javax.swing.JComboBox<>();
        ComboBox3 = new javax.swing.JComboBox<>();
        ComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Place Bet");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Play Lucky Numbers");
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        NumText.setEditable(false);
        NumText.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        NumText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NumText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));
        NumText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumTextActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 51, 0));
        jButton1.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Bet");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jButton2.setText("View Results");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jButton3.setText("Withdraw Token");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jButton4.setText("LogOut");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextArea2.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(0, 51, 51));
        jTextArea2.setRows(3);
        jTextArea2.setText(" 1   2    3   4    5   6   7   8   9   10    11   12   13  14   15  16  17\n\n18  19  20  21  22  23 24  25  26  27  28   29  30   31  32  33  34");
        jTextArea2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 2, true));
        jScrollPane2.setViewportView(jTextArea2);

        ComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Choose Number", "1 ", "2 ", "3", "4", "5", "6", "7 ", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21 ", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32 ", "33", "34" }));
        ComboBox1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 51), 2, true));

        ComboBox3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Choose Number", "1 ", "2 ", "3", "4", "5", "6", "7 ", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21 ", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32 ", "33", "34" }));
        ComboBox3.setToolTipText("");
        ComboBox3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51), 2));

        ComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Choose Number", "1 ", "2 ", "3", "4", "5", "6", "7 ", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21 ", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32 ", "33", "34" }));
        ComboBox2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51), 2));
        ComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(323, 323, 323))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(NumText, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NumText, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NumTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumTextActionPerformed
        // TODO add your handling code here:.
        
          NumText.setText(null);
    }//GEN-LAST:event_NumTextActionPerformed

    private void ComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
           //JDBC CONNECCTION
                              final String url = "jdbc:mysql://localhost:3306/javaprojects";
                              final String user = "root";
                              final String password = "";
                
                  Connection con = null;
                  PreparedStatement ps ;
                  String sql;
    
                             
                                 
              
                     try { 
                             
                            
                              //get current date
                              
                              Date dt = new Date();
                              SimpleDateFormat sdf = new  SimpleDateFormat("dd/MM/yyy  HH:mm");
                              String date = sdf.format(dt);
 
                              
                              
                              //initialise Random number object
                        
                             Random Number = new Random();
                             
                             int random_number =  Number.nextInt(1,34);
                             
                             String Rnumber = Integer.toString(random_number);
       
                                 //hashSet help to reduce duplicates
              
                             HashSet<Integer> betNumber = new HashSet<>();
          
                           betNumber.add(ComboBox1.getSelectedIndex());
                           betNumber.add(ComboBox2.getSelectedIndex());
                           betNumber.add(ComboBox3.getSelectedIndex());
                  
                           
                           
                           
                           
                           
                           
                           
                           
                            // id the size != 3 then theres duplicate, the user must not duplicate numbers
                       
                                 if( betNumber.size() == 3){
                      
                    
                                    //Treeset get sorted numbers
                             TreeSet<Integer>  set = new TreeSet<Integer>(betNumber);
                             
                             
                           
                     
                                            for(int x  : set){
                                 
                                                
                                                
                               // the thread will awake after 2 seconds then set Random number to the textField
                                             Thread.sleep(2000);
                             
                                 JOptionPane.showMessageDialog(rootPane, set+" " , "Bet Numbers", 1);
                                        
                                      
                           
                                            break;
                                 
                                 }
                                        
                                  // the thread will awake after 4seconds then set Random number to the textField
                                 
                                             Thread.sleep(4000);
                                        
                                           NumText.setText(Rnumber);
                                           
                     
                             //Iterator through the TreeSet and find the match
                             
                             
                             
                             Iterator bets = set.iterator(); 
                         
                             while(bets.hasNext()){
                              
                                 //Casting
                             int a = (int) bets.next();
                             
                            
                                  //if the betNumber == random number then the user WON
                            if( a == random_number){
                                     
                                                  
                                
                                     JOptionPane.showMessageDialog(this,"YOU WON !!!");
                                     
                                       
                                     JOptionPane.showMessageDialog(this," +350 Token Awarded ");
                                       jButton1.setEnabled(true);
                                     break;
                                 }
                                 
                            
                                 else{     
                                
                                                  JOptionPane.showMessageDialog(this," You lose\n Stupid Boy MXM!!");
               
                 
                                                 
                                     break;
                                 }
                                     
                                 }
                             }else{   
                    JOptionPane.showMessageDialog(this,"CHOOSE 3 MainSet");  
                    
                        PlaceBet pb = new PlaceBet();
                                pb.setVisible(true);
                                 }
                                   
                 //Random number will be stored to database  with current time so that users can see previous rresults
                            
             con = DriverManager.getConnection(url, user, password);
             
             sql = "INSERT INTO results VALUES (?,?)";
             
                     ps = con.prepareStatement(sql);
                     
                
                  ps.setString(1, Rnumber);
                  ps.setString(2, date);
              
                   ps.execute();
                   con.close();
                   ps.close();
 
                             
 }      catch (SQLException ex) {
            Logger.getLogger(PlaceBet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(PlaceBet.class.getName()).log(Level.SEVERE, null, ex);
        }

                
                                    
        
        
        



                   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        LoginPage lp = new LoginPage();
                  lp.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        try {
            // TODO add your handling code here:
            Thread.sleep(1000);
            
                ViewResults vr = new ViewResults();
                     vr.setVisible(true); 
        } catch (InterruptedException ex) {
            Logger.getLogger(PlaceBet.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    
   
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        
          JOptionPane.showMessageDialog(this,"The system is currently under construction \n please again later!");
        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(PlaceBet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaceBet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaceBet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaceBet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaceBet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox1;
    private javax.swing.JComboBox<String> ComboBox2;
    private javax.swing.JComboBox<String> ComboBox3;
    private javax.swing.JTextField NumText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}