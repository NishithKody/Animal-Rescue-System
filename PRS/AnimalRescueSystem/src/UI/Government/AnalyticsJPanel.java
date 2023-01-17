/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Government;

import business.ecosystem.Business;
import business.population.FundDonation;
import business.population.Report;
import business.shelter.CaseFile;
import business.shelter.FundRequest;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author nishi
 */
public class AnalyticsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AnalyticsJPanel
     */
    javax.swing.JSplitPane splitpane;
    Business system;
    
    public AnalyticsJPanel(javax.swing.JSplitPane splitpane, Business system) {
        initComponents();
        this.splitpane = splitpane;
        this.system = system;
        
    }
    
    private void createDonationChart() {
        DefaultPieDataset dataset = new DefaultPieDataset();

        int accepted = 0;
        int rejected = 0;
        int pending = 0;
        
        for(FundDonation fund : system.getFundDonationDirectory().getFundDonationList()){
            if(fund.getStatus().equals("PENDING")){
                pending++;
            }
            else if(fund.getStatus().equals("ACCEPTED")){
                accepted++;
            }
            else if(fund.getStatus().equals("REJECTED")){
                rejected++;
            }
        }
        
        if (accepted == 0 && rejected == 0 && pending==0) {
            JOptionPane.showMessageDialog(this, "More data is needed");
            return;
        } else {
            dataset.setValue("Donations Pending", pending);
            dataset.setValue("Donations Accepted", accepted);
            dataset.setValue("Donations Rejected", rejected);

            JFreeChart chart = ChartFactory.createPieChart3D("Donation Details",dataset,true,true,false);
            final PiePlot3D plot = (PiePlot3D) chart.getPlot();

            ChartFrame chartFrame = new ChartFrame("Donation Pie chart", chart);
            chartFrame.setVisible(true);
            chartFrame.setSize(600, 600);
        }
    }
    
    private void createFundRequestChart() {
        DefaultPieDataset dataset = new DefaultPieDataset();

        int accepted = 0;
        int rejected = 0;
        int pending = 0;
        
        for(FundRequest fund : system.getFundRequestDirectory().getFundRequest()){
            if(fund.getStatus().equals("PENDING")){
                pending++;
            }
            else if(fund.getStatus().equals("ACCEPTED")){
                accepted++;
            }
            else if(fund.getStatus().equals("REJECTED")){
                rejected++;
            }
        }
        
        if (accepted == 0 && rejected == 0 && pending==0) {
            JOptionPane.showMessageDialog(this, "More data is needed");
            return;
        } else {
            dataset.setValue("Request Pending", pending);
            dataset.setValue("Request Accepted", accepted);
            dataset.setValue("Request Rejected", rejected);

            JFreeChart chart = ChartFactory.createPieChart3D("Donation Details",dataset,true,true,false);
            final PiePlot3D plot = (PiePlot3D) chart.getPlot();

            ChartFrame chartFrame = new ChartFrame("Fund Request Pie chart", chart);
            chartFrame.setVisible(true);
            chartFrame.setSize(600, 600);
        }
    }
    
    private void createIncidentStatusChart() {
        DefaultPieDataset dataset = new DefaultPieDataset();

        int accepted = 0;
        int rejected = 0;
        
        for(Report fund : system.getReportDirectory().getReportList()){
            if(fund.getStatus().equals("PENDING")){
                accepted++;
            }
            else if(fund.getStatus().equals("RESOLVED")){
                rejected++;
            }
        }
        
        if (accepted == 0 && rejected == 0 ) {
            JOptionPane.showMessageDialog(this, "More data is needed");
            return;
        } else {
            dataset.setValue("Pending", accepted);
            dataset.setValue("Resolved", rejected);

            JFreeChart chart = ChartFactory.createPieChart3D("Incident",dataset,true,true,false);
            final PiePlot3D plot = (PiePlot3D) chart.getPlot();

            ChartFrame chartFrame = new ChartFrame("Incident Pie chart", chart);
            chartFrame.setVisible(true);
            chartFrame.setSize(600, 600);
        }
    }
    
    private void createCaseStatusChart() {
        DefaultPieDataset dataset = new DefaultPieDataset();

        int pending = 0;
        int active = 0;
        int shelter = 0;
        int hospital = 0;
        int adopted = 0;
        
        for(CaseFile fund : system.getCaseFileDirectory().getCaseFile()){
            if(fund.getStatus().equals("PENDING")){
                pending++;
            }
            else if(fund.getStatus().equals("ACTIVE")){
                active++;
            }
            else if(fund.getStatus().equals("SHELTER")){
                shelter++;
            }
            else if(fund.getStatus().equals("HOSPITAL")){
                hospital++;
            }
            else if(fund.getStatus().equals("ADOPTED")){
                adopted++;
            }
        }
        
        if (pending == 0 && active == 0 && shelter == 0  && hospital == 0 && adopted == 0) {
            JOptionPane.showMessageDialog(this, "More data is needed");
            return;
        } else {
//            dataset.setValue("Pending", pending);
            dataset.setValue("Active", active);
            dataset.setValue("Shelter", shelter);
            dataset.setValue("Hospital", hospital);
            dataset.setValue("Adopted", adopted);

            JFreeChart chart = ChartFactory.createPieChart3D("Case report",dataset,true,true,false);
            final PiePlot3D plot = (PiePlot3D) chart.getPlot();

            ChartFrame chartFrame = new ChartFrame("Case report Pie chart", chart);
            chartFrame.setVisible(true);
            chartFrame.setSize(600, 600);
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(206, 229, 242));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(17, 53, 81));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Analytics");

        jButton1.setBackground(new java.awt.Color(17, 53, 81));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Donation Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(17, 53, 81));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Fund Request Report");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(17, 53, 81));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Incident Report");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/Gov copy.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/dollar.jpeg"))); // NOI18N
        jLabel3.setText("jLabel3");

        jButton4.setBackground(new java.awt.Color(17, 53, 81));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Shelter Case Report");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(131, 131, 131)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(256, 256, 256))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        createDonationChart();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        createFundRequestChart();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        createIncidentStatusChart();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        createCaseStatusChart();
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
