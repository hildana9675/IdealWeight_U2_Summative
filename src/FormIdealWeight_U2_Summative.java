/* Hildana.M
 * IdealWeight_U2_Summative.java
 * This program is a BMI calculator and informs the individual their 
 * ideal weight in kg or lb
 * April/06/2018
 */

/**
 *
 * @author himel9675
 */
import java.text.*; //allows to use the rounding statement 
public class FormIdealWeight_U2_Summative extends javax.swing.JFrame {

    /**
     * Creates new form FormIdealWeight_U2_Summative
     */
    public FormIdealWeight_U2_Summative() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        radioButtonMetric = new javax.swing.JRadioButton();
        radioButtonImperial = new javax.swing.JRadioButton();
        labelHeight = new javax.swing.JLabel();
        textHeight = new javax.swing.JTextField();
        labelDisplayWeight = new javax.swing.JLabel();
        labelSystem = new javax.swing.JLabel();
        buttonCalculate = new javax.swing.JButton();
        labelMorI = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuExit = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitle.setFont(new java.awt.Font("Vani", 0, 27)); // NOI18N
        labelTitle.setText("Ideal Weight Calculator");

        labelName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelName.setText("Name:");

        textName.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        textName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNameActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioButtonMetric);
        radioButtonMetric.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        radioButtonMetric.setText("Metric");

        buttonGroup1.add(radioButtonImperial);
        radioButtonImperial.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        radioButtonImperial.setText("Imperial");

        labelHeight.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelHeight.setText("Height:");

        textHeight.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N

        labelDisplayWeight.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N

        labelSystem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelSystem.setText("System of measure:");

        buttonCalculate.setText("Calculate");
        buttonCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalculateActionPerformed(evt);
            }
        });

        labelMorI.setText("(Meters or Inches) ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelName)
                        .addGap(54, 54, 54)
                        .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelSystem)
                        .addGap(18, 18, 18)
                        .addComponent(radioButtonMetric)
                        .addGap(31, 31, 31)
                        .addComponent(radioButtonImperial))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelHeight)
                        .addGap(51, 51, 51)
                        .addComponent(textHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelMorI))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(buttonCalculate))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelDisplayWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(labelTitle)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelName)
                    .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSystem)
                    .addComponent(radioButtonMetric)
                    .addComponent(radioButtonImperial))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHeight)
                    .addComponent(textHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelMorI)
                .addGap(3, 3, 3)
                .addComponent(buttonCalculate)
                .addGap(37, 37, 37)
                .addComponent(labelDisplayWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuExit.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuExit.add(jMenuItem1);

        menuBar.add(menuExit);

        jMenu2.setText("Edit");
        menuBar.add(jMenu2);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0); //alows to exit the program 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void textNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNameActionPerformed
        
    }//GEN-LAST:event_textNameActionPerformed

    private void buttonCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalculateActionPerformed
        double height, weight; //height and weight variable
        String name; //name varaible 
        
        name = textName.getText(); //retrieve individual's name
        //retrieve individual's height
        height = Double.parseDouble (textHeight.getText());
        
        //Instruction to round a number to 2 decimal point
        DecimalFormat round = new DecimalFormat ("###.##");
        
        if (radioButtonMetric.isSelected()) //if metric button is selected
        {
           //Metric formula to find weight in kg
           weight = (height * height) * 25;
           
           //Display the ideal weight
           labelDisplayWeight.setText(name + "'s ideal weight is " + 
                   round.format(weight) + " kg");
        } else if (radioButtonImperial.isSelected())//if the imperial button is selected
        {
           //Imperial formula to find the weight in lb 
           weight = (height * height) * 25 / 703; 
           
           //Dsiplay the ideal weight 
           labelDisplayWeight.setText(name + "'s ideal weight is " + 
                   round.format(weight) + " lb");
        } else //if non of the options are selected
        {  
           //Dsiplay "need more info"
           labelDisplayWeight.setText("Need more Information!"); 
        }
        
    }//GEN-LAST:event_buttonCalculateActionPerformed

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
            java.util.logging.Logger.getLogger(FormIdealWeight_U2_Summative.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormIdealWeight_U2_Summative.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormIdealWeight_U2_Summative.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormIdealWeight_U2_Summative.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormIdealWeight_U2_Summative().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCalculate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelDisplayWeight;
    private javax.swing.JLabel labelHeight;
    private javax.swing.JLabel labelMorI;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelSystem;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuExit;
    private javax.swing.JRadioButton radioButtonImperial;
    private javax.swing.JRadioButton radioButtonMetric;
    private javax.swing.JTextField textHeight;
    private javax.swing.JTextField textName;
    // End of variables declaration//GEN-END:variables
}
