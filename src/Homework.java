/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

 import java.sql.Connection;
 import java.sql.ResultSet;
 import java.sql.Statement;
 
 import javax.swing.UIManager;
 import javax.swing.table.DefaultTableModel;
 
 /**
  *
  * @author G15
  */
 public class Homework extends javax.swing.JFrame {
     /**
      * Creates new form Homework
      */
     public Homework() {
         initComponents();
         this.setLocationRelativeTo(null);
     }
 
     /**
      * This method is called from within the constructor to initialize the form.
      * WARNING: Do NOT modify this code. The content of this method is always
      * regenerated by the Form Editor.
      */
     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
     private void initComponents() {
 
         jPanel1 = new javax.swing.JPanel();
         jPanel3 = new javax.swing.JPanel();
         jScrollPane1 = new javax.swing.JScrollPane();
         jTableHW = new javax.swing.JTable();
         ButtonBackMENU = new javax.swing.JToggleButton();
         ButtonAddHomework = new javax.swing.JButton();
         jButton_Delete = new javax.swing.JButton();
         jButton_Modify = new javax.swing.JButton();
      
 
         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
         setResizable(false);
 
         jPanel1.setBackground(new java.awt.Color(12, 137, 112));
 
         jPanel3.setBackground(new java.awt.Color(255, 255, 255));
 
         // jTableHW.setModel(new javax.swing.table.DefaultTableModel(
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
         addHomeworkInfo();
         jScrollPane1.setViewportView(jTableHW);
         
         javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
         jPanel3.setLayout(jPanel3Layout);
         jPanel3Layout.setHorizontalGroup(
             jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
         );
         jPanel3Layout.setVerticalGroup(
             jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
         );
 
         ButtonBackMENU.setBackground(new java.awt.Color(0, 102, 102));
         ButtonBackMENU.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
         ButtonBackMENU.setForeground(new java.awt.Color(255, 255, 255));
         ButtonBackMENU.setText("BACK");
         ButtonBackMENU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
         ButtonBackMENU.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 ButtonBackMENUActionPerformed(evt);
             }
         });
 
         ButtonAddHomework.setBackground(new java.awt.Color(0, 102, 102));
         ButtonAddHomework.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
         ButtonAddHomework.setForeground(new java.awt.Color(255, 255, 255));
         ButtonAddHomework.setText("Add Homework");
         ButtonAddHomework.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
         ButtonAddHomework.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 ButtonAddHomeworkActionPerformed(evt);
             }
         });

         jButton_Modify.setBackground(new java.awt.Color(0, 102, 102));
         jButton_Modify.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
         jButton_Modify.setForeground(new java.awt.Color(255, 255, 255));
         jButton_Modify.setText("Modify Homework");
         jButton_Modify.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 jButton_ModifyActionPerformed(evt);
             }
         });

         jButton_Delete.setBackground(new java.awt.Color(0, 102, 102));
         jButton_Delete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
         jButton_Delete.setForeground(new java.awt.Color(255, 255, 255));
         jButton_Delete.setText("Delete Homework");
         jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 jButton_DeleteActionPerformed(evt);
             }
         });

 
         javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
         jPanel1.setLayout(jPanel1Layout);
         jPanel1Layout.setHorizontalGroup(
             jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
             .addGroup(jPanel1Layout.createSequentialGroup()
                 .addContainerGap()
                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                         .addComponent(ButtonBackMENU, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addGap(0, 0, Short.MAX_VALUE))
                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                         .addComponent(jButton_Modify)
                         .addGap(18, 18, 18)
                         .addComponent(jButton_Delete)
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                         .addComponent(ButtonAddHomework, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                 .addContainerGap())
         );
         jPanel1Layout.setVerticalGroup(
             jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(jPanel1Layout.createSequentialGroup()
                 .addContainerGap()
                 .addComponent(ButtonBackMENU, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                 .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(ButtonAddHomework)
                     .addComponent(jButton_Modify)
                     .addComponent(jButton_Delete))
                 .addContainerGap())
         );

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
     }// </editor-fold>                        
 
     private void ButtonBackMENUActionPerformed(java.awt.event.ActionEvent evt) {                                               
         MenuTeacher backMenuTaecher = new MenuTeacher();
         backMenuTaecher.setVisible(true);
         backMenuTaecher.pack();
         backMenuTaecher.setLocationRelativeTo(null);
         this.dispose();
         
     }                                              
 
     private void ButtonAddHomeworkActionPerformed(java.awt.event.ActionEvent evt) {                                                  
         AddHomeWork backAddHW = new AddHomeWork();
         backAddHW.setVisible(true);
         backAddHW.pack();
         backAddHW.setLocationRelativeTo(null);
         this.dispose();
     }    


     private void jButton_ModifyActionPerformed(java.awt.event.ActionEvent evt) {                                               
         ModifyHomework MHW = new ModifyHomework();
         MHW.pack();
         MHW.setVisible(true);
         MHW.setLocationRelativeTo(null);
    }                                              

    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {                                               
         DeleteHomework DHW = new DeleteHomework(this);
         DHW.pack();
         DHW.setVisible(true);
         DHW.setLocationRelativeTo(null);
    }  
 
     /**
      * @param args the command line arguments
      */
     public void addHomeworkInfo(){
         DefaultTableModel model = new DefaultTableModel(
             new String[]{"Homework_id","ASSIGNED DATE", "SUBJECT", "DESCRIPTION","DUE DATE","ASSIGNED TO"}, 0
         );
         try{
         Connection connection = SQLConnection.getConnection2();
         Statement statement = connection.createStatement();
         String sql = String.format("SELECT homework_id, homework.assigned_date,all_subjects.subject_name,homework.description,homework.due_date, homework.assigned_to_std FROM homework JOIN teachers ON teachers.teacher_id = homework.assigned_by_teacher JOIN all_subjects ON all_subjects.subject_id = homework.subject_id WHERE homework.assigned_by_teacher = \"%S\"",Login.teacherId);
 
         ResultSet resultSet = statement.executeQuery(sql);
         while(resultSet.next()) {
             String Homework_id = resultSet.getString("homework_id");
             String assigneddate = resultSet.getString("assigned_date");
             String subjectName = resultSet.getString("subject_name");
             String description = resultSet.getString("description");
             String duedate = resultSet.getString("due_date");
             String assignedto = resultSet.getString("assigned_to_std");
             model.addRow(new Object[]{Homework_id,assigneddate, subjectName, description,duedate,assignedto});
         }
             jTableHW.setModel(model);
             jTableHW.getTableHeader().setReorderingAllowed(false);
 
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
             java.util.logging.Logger.getLogger(Homework.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (InstantiationException ex) {
             java.util.logging.Logger.getLogger(Homework.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (IllegalAccessException ex) {
             java.util.logging.Logger.getLogger(Homework.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (javax.swing.UnsupportedLookAndFeelException ex) {
             java.util.logging.Logger.getLogger(Homework.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         }
         //</editor-fold>
 
         /* Create and display the form */
         java.awt.EventQueue.invokeLater(new Runnable() {
             public void run() {
                 
                 new Homework().setVisible(true);
             }
         });
     }
 
     // Variables declaration - do not modify                     
     private javax.swing.JButton ButtonAddHomework;
     private javax.swing.JToggleButton ButtonBackMENU;
     private javax.swing.JButton jButton_Delete;
     private javax.swing.JButton jButton_Modify;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JPanel jPanel3;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JTable jTableHW;
     // End of variables declaration                   
 }
 
