/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.table.*;
import javax.swing.ImageIcon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author ASUS
 */
public class HomeworkStd extends javax.swing.JFrame {

    /**
     * Creates new form HomeworkStd
     */
    public HomeworkStd() {
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

        jPanel1 = new javax.swing.JPanel();
        BackBT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(12, 137, 112));
        jPanel1.setPreferredSize(new java.awt.Dimension(92, 204));

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
        getHomeworkInfo();
        // jTable1.setModel(new javax.swing.table.DefaultTableModel(
        //     new Object [][] {
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null},
        //         {null, null, null, null, null}
        //     },
        //     new String [] {
        //         "ASSIGNED DATE", "SUBJECT", "DESCRIPTION", "DUE DATE", "ASSIGNED TO"
        //     }
        // ) {
        //     boolean[] canEdit = new boolean [] {
        //         false, false, false, false, false
        //     };

        //     public boolean isCellEditable(int rowIndex, int columnIndex) {
        //         return canEdit [columnIndex];
        //     }
        // });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackBT, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackBT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BackBTFocusGained
        BackBT.setBorderPainted(false);
        BackBT.setFocusPainted(false);
    }//GEN-LAST:event_BackBTFocusGained

    private void BackBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBTActionPerformed
        MenuStudent BackMenuStd = new MenuStudent();
        BackMenuStd.setVisible(true);
        BackMenuStd.pack();
        BackMenuStd.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BackBTActionPerformed

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
            java.util.logging.Logger.getLogger(HomeworkStd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeworkStd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeworkStd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeworkStd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeworkStd().setVisible(true);
            }
        });
    }
    public void getHomeworkInfo(){
        DefaultTableModel model = new DefaultTableModel(
            new String[]{"ASSIGNED DATE", "SUBJECT", "DESCRIPTION","DUE DATE","ASSIGNED TO"}, 0
        );
        try{
        Connection connection = SQLConnection.getConnection2();
        Statement statement = connection.createStatement();
        String sql = String.format("SELECT homework.assigned_date,all_subjects.subject_name,homework.description,homework.due_date, homework.assigned_to_std FROM homework JOIN students ON homework.assigned_to_std = students.std_id JOIN all_subjects ON all_subjects.subject_id = homework.subject_id WHERE homework.assigned_to_std = \"%s\"",LoginStd.std_id);

        ResultSet resultSet = statement.executeQuery(sql);
        while(resultSet.next()) {
            String assigneddate = resultSet.getString("assigned_date");
            String subjectName = resultSet.getString("subject_name");
            String description = resultSet.getString("description");
            String duedate = resultSet.getString("due_date");
            String assignedto = resultSet.getString("assigned_to_std");
            model.addRow(new Object[]{assigneddate, subjectName, description,duedate,assignedto});
        }
            jTable1.setModel(model);
            jTable1.getTableHeader().setReorderingAllowed(false);

    }catch(Exception e){
        System.out.println(e);
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBT;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
