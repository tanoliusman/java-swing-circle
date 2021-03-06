/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.swing.appswing;

import javax.swing.JPanel;
import javax.swing.JSlider;

/**
 *
 * @author UsmanAli
 */
public class CircleFrame extends javax.swing.JFrame {
    CirclePanel circlePanel = null;
    private int radius=100;
    private int red=255;
    private int green = 255;
    private int blue=255;
    private String language = "English";
    /** Creates new form CircleFrame */
    public CircleFrame() {
        initComponents();
        addCirclePanel();
        updateLabels();
    }

    
    public void addCirclePanel() {
       
        circlePanel = new CirclePanel(radius,red,green,blue);
        circlePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        circlePanel.setName("circlePanel"); // NOI18N

        javax.swing.GroupLayout circlePanelLayout = new javax.swing.GroupLayout(circlePanel);
        circlePanel.setLayout(circlePanelLayout);
        circlePanelLayout.setHorizontalGroup(
            circlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 586, Short.MAX_VALUE)
        );
        circlePanelLayout.setVerticalGroup(
            circlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );

        getContentPane().add(circlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 590, 380));
        

    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sizeSlider = new javax.swing.JSlider();
        bSlider = new javax.swing.JSlider();
        rSlider = new javax.swing.JSlider();
        gSlider = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        aLabel = new javax.swing.JLabel();
        dLabel = new javax.swing.JLabel();
        cLabel = new javax.swing.JLabel();
        languageDropdown = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Circle");
        setAlwaysOnTop(true);
        setFocusable(false);
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sizeSlider.setMajorTickSpacing(5);
        sizeSlider.setMaximum(180);
        sizeSlider.setMinimum(100);
        sizeSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        sizeSlider.setToolTipText("");
        sizeSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sizeSliderStateChanged(evt);
            }
        });
        getContentPane().add(sizeSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 10, 420));

        bSlider.setMajorTickSpacing(1);
        bSlider.setMaximum(255);
        bSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        bSlider.setValue(255);
        bSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                bSliderStateChanged(evt);
            }
        });
        getContentPane().add(bSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, 420));

        rSlider.setMajorTickSpacing(1);
        rSlider.setMaximum(255);
        rSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        rSlider.setValue(255);
        rSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rSliderStateChanged(evt);
            }
        });
        getContentPane().add(rSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 420));

        gSlider.setMajorTickSpacing(1);
        gSlider.setMaximum(255);
        gSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        gSlider.setValue(255);
        gSlider.setName("gSlider"); // NOI18N
        gSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                gSliderStateChanged(evt);
            }
        });
        getContentPane().add(gSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 420));

        jLabel1.setText("Size");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        jLabel2.setText("B");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 10, -1));

        jLabel3.setText("R");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        jLabel4.setText("G");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, -1, -1));

        jLabel5.setText("G");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 930, 10));

        aLabel.setText("Area: ");
        getContentPane().add(aLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        dLabel.setText("Diameter:");
        dLabel.setName("dLabel"); // NOI18N
        getContentPane().add(dLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, -1));

        cLabel.setText("Circumference:");
        getContentPane().add(cLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, -1, -1));

        languageDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English", "French" }));
        languageDropdown.setName("languageDropdown"); // NOI18N
        languageDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                languageDropdownActionPerformed(evt);
            }
        });
        getContentPane().add(languageDropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 500, 180, -1));

        jLabel6.setText("Language:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sizeSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sizeSliderStateChanged
        // TODO add your handling code here:
        JSlider size= (JSlider)evt.getSource();
        this.radius = size.getValue();
        updateLabels();
        this.circlePanel.setRadius(radius);
        this.circlePanel.revalidate();
        this.repaint();
    }//GEN-LAST:event_sizeSliderStateChanged

    private void updateLabels(){
        if(this.language.equals("English")){
            dLabel.setText("Diameter: "+(radius*2));
            aLabel.setText("Area: "+Math.PI*Math.sqrt(radius));
            cLabel.setText("Circumference: "+2*Math.PI*radius);
        } else {
             dLabel.setText("Diam??tre: "+(radius*2));
            aLabel.setText("Rayon: "+Math.PI*Math.sqrt(radius));
            cLabel.setText("Circonf??rence: "+2*Math.PI*radius);
        }
    }
    
    private void rSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rSliderStateChanged
        // TODO add your handling code here:
         JSlider size= (JSlider)evt.getSource();
        this.red = size.getValue();
        this.circlePanel.setRed(this.red);
        this.circlePanel.revalidate();
        this.repaint();
    }//GEN-LAST:event_rSliderStateChanged

    private void gSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_gSliderStateChanged
        // TODO add your handling code here:
         JSlider size= (JSlider)evt.getSource();
        this.green = size.getValue();
        this.circlePanel.setGreen(green);
        this.circlePanel.revalidate();
        this.repaint();
    }//GEN-LAST:event_gSliderStateChanged

    private void bSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_bSliderStateChanged
        // TODO add your handling code here:
        JSlider size= (JSlider)evt.getSource();
        this.blue = size.getValue();
        this.circlePanel.setBlue(blue);
        this.circlePanel.revalidate();
        this.repaint();
    }//GEN-LAST:event_bSliderStateChanged

    private void languageDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_languageDropdownActionPerformed
        // TODO add your handling code here:
        this.language = this.languageDropdown.getSelectedItem().toString();
        updateLabels();
    }//GEN-LAST:event_languageDropdownActionPerformed

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
            java.util.logging.Logger.getLogger(CircleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CircleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CircleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CircleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CircleFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aLabel;
    private javax.swing.JSlider bSlider;
    private javax.swing.JLabel cLabel;
    private javax.swing.JLabel dLabel;
    private javax.swing.JSlider gSlider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> languageDropdown;
    private javax.swing.JSlider rSlider;
    private javax.swing.JSlider sizeSlider;
    // End of variables declaration//GEN-END:variables

}
