/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.shelter;

import business.ecosystem.Business;
import business.validations.Validations;

/**
 *
 * @author nishi
 */
public class ViewExpense extends javax.swing.JPanel {

    /**
     * Creates new form ViewExpense
     */
    Validations validations;

    javax.swing.JSplitPane splitpane;
    Business system;
    public ViewExpense(javax.swing.JSplitPane splitpane, Business system) {
        initComponents();
        this.splitpane = splitpane;
        this.system = system;
        this.validations = new Validations();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBack3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(206, 229, 242));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(17, 53, 81));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Expense");

        btnBack3.setBackground(new java.awt.Color(17, 53, 81));
        btnBack3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBack3.setForeground(new java.awt.Color(255, 255, 255));
        btnBack3.setText("Back");
        btnBack3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnBack3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 335, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(461, 461, 461))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack3))
                .addGap(0, 770, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack3ActionPerformed
        // TODO add your handling code here:

        if(system.getCurrentRole().equals("ShelterAdmin")){
            ShelterAdmin panel = new ShelterAdmin(splitpane, system);
            splitpane.setRightComponent(panel);
        }
        else if(system.getCurrentRole().equals("ShelterManager")){
            ShelterManagerWorkarea panel = new ShelterManagerWorkarea(splitpane, system);
            splitpane.setRightComponent(panel);
        }
        else if(system.getCurrentRole().equals("Accountant")){
            AccountingWorkarea panel = new AccountingWorkarea(splitpane, system);
            splitpane.setRightComponent(panel);
        }
        else{
            StaffWorkarea panel = new StaffWorkarea(splitpane, system);
            splitpane.setRightComponent(panel);
        }
    }//GEN-LAST:event_btnBack3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}