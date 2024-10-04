/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.awt.Color;
import javax.swing.ImageIcon;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.table.*;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author ASUS
 */
public class SeeGrade extends javax.swing.JFrame {

    /**
     * Creates new form SeeGrade
     */
    public SeeGrade() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        ImageIcon icon = new ImageIcon("src/pics/nontri-59_19.jpg");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGPanel = new javax.swing.JPanel();
        Toppanel = new javax.swing.JPanel();
        ScholasticTitle = new javax.swing.JLabel();
        BackBT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        BGPanel.setBackground(new java.awt.Color(236, 236, 236));

        Toppanel.setBackground(new java.awt.Color(12, 137, 112));
        Toppanel.setPreferredSize(new java.awt.Dimension(880, 62));

        ScholasticTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ScholasticTitle.setForeground(new java.awt.Color(255, 255, 255));
        ScholasticTitle.setText("Scholastic Record");

        BackBT.setBackground(new java.awt.Color(0, 102, 102));
        BackBT.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BackBT.setForeground(new java.awt.Color(255, 255, 255));
        BackBT.setText("BACK");
        BackBT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BackBT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackBT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BackBTFocusGained(evt);
            }
        });
        BackBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ToppanelLayout = new javax.swing.GroupLayout(Toppanel);
        Toppanel.setLayout(ToppanelLayout);
        ToppanelLayout.setHorizontalGroup(
            ToppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ToppanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackBT, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250)
                .addComponent(ScholasticTitle)
                .addContainerGap(368, Short.MAX_VALUE))
        );
        ToppanelLayout.setVerticalGroup(
            ToppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ToppanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ToppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ScholasticTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(BackBT))
                .addContainerGap())
        );

        
        getGradeInfo();
        jScrollPane3.setViewportView(jTable2);

        
        
        jScrollPane3.setViewportView(jTable2);
        

        jPanel1.setBackground(new java.awt.Color(12, 137, 112));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BGPanelLayout = new javax.swing.GroupLayout(BGPanel);
        BGPanel.setLayout(BGPanelLayout);
        BGPanelLayout.setHorizontalGroup(
            BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Toppanel, javax.swing.GroupLayout.DEFAULT_SIZE, 917, Short.MAX_VALUE)
            .addGroup(BGPanelLayout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BGPanelLayout.setVerticalGroup(
            BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGPanelLayout.createSequentialGroup()
                .addComponent(Toppanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBTActionPerformed
        MenuStudent BackMenuStd = new MenuStudent();
        BackMenuStd.setVisible(true);
        BackMenuStd.pack();
        BackMenuStd.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BackBTActionPerformed

    private void BackBTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BackBTFocusGained
        BackBT.setBorderPainted(false);
        BackBT.setFocusPainted(false);
    }//GEN-LAST:event_BackBTFocusGained

    /**
     * @param args the command line arguments
     */
    public void getGradeInfo(){
        Map<String, Double> grades = new HashMap<>();
        grades.put("A", 4.0);
        grades.put("B+", 3.5);
        grades.put("B", 3.0);
        grades.put("C+", 2.5);
        grades.put("C", 2.0);
        grades.put("D+", 1.5);
        grades.put("D", 1.0);
        grades.put("F", 0.0);
        double sumGrade=0.0;
        double GPA = 0.0;
        double allCredit = 15.0;
        DefaultTableModel model = new DefaultTableModel(
            new String[]{"ID Subject", "Subject", "Grade"}, 0
        );
        DefaultTableModel model2 = new DefaultTableModel(
            new String[]{"Cumulative credit", "Cumutive GPA"}, 0
        );
        try{
        Connection connection = SQLConnection.getConnection2();
        Statement statement = connection.createStatement();
        String sql = String.format("SELECT all_subjects.subject_name,registration.subject_id, students.std_id,REGISTRATION.grade FROM registration JOIN students ON REGISTRATION.std_id = students.std_id JOIN all_subjects ON REGISTRATION.subject_id = all_subjects.subject_id WHERE students.std_id = \"%s\" AND grade IS NOT NULL",LoginStd.std_id);

        ResultSet resultSet = statement.executeQuery(sql);
        while(resultSet.next()) {
            String subjectId = resultSet.getString("subject_id");
            String subjectName = resultSet.getString("subject_name");
            String grade = resultSet.getString("grade");
            model.addRow(new Object[]{subjectId, subjectName, grade});
            sumGrade += grades.get(resultSet.getString("grade"))*3;
        }   
            GPA = sumGrade/allCredit;
            String gpa  = String.format("%.2f",GPA);
            jTable2.setModel(model);
            jTable2.getTableHeader().setReorderingAllowed(false);
            
            model2.addRow(new Object[]{allCredit,gpa});
            jTable1.setModel(model2);
            jTable1.setEditingColumn(10);
            jTable1.setEditingRow(10);
            jTable1.setRowHeight(30);
            jTable1.getTableHeader().setReorderingAllowed(false);
            jScrollPane1.setViewportView(jTable1);
    }catch(Exception e){
        System.out.println(e);
    }
}
    
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
            java.util.logging.Logger.getLogger(SeeGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeeGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeeGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeeGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeeGrade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BGPanel;
    private javax.swing.JButton BackBT;
    private javax.swing.JLabel ScholasticTitle;
    private javax.swing.JPanel Toppanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
