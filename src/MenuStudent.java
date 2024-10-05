/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import static javax.swing.SwingConstants.*;

/**
 *
 * @author ASUS
 */
public class MenuStudent extends javax.swing.JFrame {

    /**
     * Creates new form MenuStudent
     */
    public MenuStudent() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        Icon();
        JButtonBlackground();
        jLabel1.setText(LoginStd.stdName);
    }
    
    public void JButtonBlackground(){
        this.IconSeeGrade.setBorderPainted(false);
        this.IconSeeGrade.setFocusPainted(false);
        this.IconSeeGrade.setContentAreaFilled(false);
                
        this.IconHomeWorkStd.setBorderPainted(false);
        this.IconHomeWorkStd.setFocusPainted(false);
        this.IconHomeWorkStd.setContentAreaFilled(false);
        
        this.IconViewAllcourses.setBorderPainted(false);
        this.IconViewAllcourses.setFocusPainted(false);
        this.IconViewAllcourses.setContentAreaFilled(false);
        
        this.ViewAllCourseStd.setBorderPainted(false);
        this.ViewAllCourseStd.setFocusPainted(false);
        this.ViewAllCourseStd.setContentAreaFilled(false);
        
        this.CheckGrade.setBorderPainted(false);
        this.CheckGrade.setFocusPainted(false);
        this.CheckGrade.setContentAreaFilled(false);
        
        this.SeeHMStd.setBorderPainted(false);
        this.SeeHMStd.setFocusPainted(false);
        this.SeeHMStd.setContentAreaFilled(false);
    }
    public void Icon(){
                ImageIcon icon = new ImageIcon("C:\\PicturePJ\\2641409.png");
                Image img = icon.getImage();
                Image resizedImg = img.getScaledInstance(110, 110, java.awt.Image.SCALE_SMOOTH);
                ImageIcon resizedIcon = new ImageIcon(resizedImg);
                this.IconSeeGrade.setIcon(resizedIcon);
                
                ImageIcon icon2 = new ImageIcon("C:\\PicturePJ\\online-course-icon-style-free-vector.png");
                Image img2 = icon2.getImage();
                Image resizedImg2 = img2.getScaledInstance(110, 110, java.awt.Image.SCALE_SMOOTH);
                ImageIcon resizedIcon2 = new ImageIcon(resizedImg2);
                this.IconViewAllcourses.setIcon(resizedIcon2);
                
                ImageIcon icon3 = new ImageIcon("C:\\PicturePJ\\ImageIcon2.png");
                Image img3 = icon3.getImage();
                Image resizedImg3 = img3.getScaledInstance(140, 120, java.awt.Image.SCALE_SMOOTH);
                ImageIcon resizedIcon3 = new ImageIcon(resizedImg3);
                this.IconHomeWorkStd.setIcon(resizedIcon3);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Logoutbotton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        IconSeeGrade = new javax.swing.JButton();
        IconHomeWorkStd = new javax.swing.JButton();
        CheckGrade = new javax.swing.JButton();
        SeeHMStd = new javax.swing.JButton();
        IconViewAllcourses = new javax.swing.JButton();
        ViewAllCourseStd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(204, 204, 204));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(234, 234, 234));

        jPanel2.setBackground(new java.awt.Color(12, 137, 112));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SomSri Poonsiri 6621600xxx(STUDENT)");

        Logoutbotton.setBackground(new java.awt.Color(12, 137, 112));
        Logoutbotton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Logoutbotton.setForeground(new java.awt.Color(255, 255, 255));
        Logoutbotton.setText("LOGOUT");
        Logoutbotton.setBorder(null);
        Logoutbotton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logoutbotton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LogoutbottonFocusGained(evt);
            }
        });
        Logoutbotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutbottonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logoutbotton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Logoutbotton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(12, 137, 112));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        IconSeeGrade.setBorder(null);
        IconSeeGrade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IconSeeGrade.setPreferredSize(new java.awt.Dimension(110, 110));
        IconSeeGrade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                IconSeeGradeFocusGained(evt);
            }
        });
        IconSeeGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IconSeeGradeActionPerformed(evt);
            }
        });

        IconHomeWorkStd.setBorder(null);
        IconHomeWorkStd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IconHomeWorkStd.setPreferredSize(new java.awt.Dimension(130, 110));
        IconHomeWorkStd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IconHomeWorkStdActionPerformed(evt);
            }
        });

        CheckGrade.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        CheckGrade.setText("CHECK GRADE");
        CheckGrade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckGradeActionPerformed(evt);
            }
        });

        SeeHMStd.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        SeeHMStd.setText("CHECK HW/ASSIGNMENTS");
        SeeHMStd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SeeHMStd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeeHMStdActionPerformed(evt);
            }
        });

        IconViewAllcourses.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IconViewAllcourses.setPreferredSize(new java.awt.Dimension(140, 120));
        IconViewAllcourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IconViewAllcoursesActionPerformed(evt);
            }
        });

        ViewAllCourseStd.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        ViewAllCourseStd.setText("VIEW ALL COURSES");
        ViewAllCourseStd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewAllCourseStd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAllCourseStdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IconViewAllcourses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IconHomeWorkStd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IconSeeGrade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CheckGrade)
                    .addComponent(SeeHMStd)
                    .addComponent(ViewAllCourseStd))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IconSeeGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(CheckGrade)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(IconViewAllcourses, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ViewAllCourseStd)
                        .addGap(62, 62, 62)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IconHomeWorkStd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(SeeHMStd)
                        .addGap(26, 26, 26)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }
    
    private void LogoutbottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutbottonActionPerformed
        Login LoginTHR = new Login();
        LoginTHR.setVisible(true);
        LoginTHR.pack();
        LoginTHR.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_LogoutbottonActionPerformed

    private void LogoutbottonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LogoutbottonFocusGained
        Logoutbotton.setBorderPainted(false);
        Logoutbotton.setFocusPainted(false);
        Logoutbotton.setContentAreaFilled(false);  
    }//GEN-LAST:event_LogoutbottonFocusGained

    private void IconSeeGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IconSeeGradeActionPerformed
        SeeGrade GotoSeeGrade = new SeeGrade();
        GotoSeeGrade.setVisible(true);
        GotoSeeGrade.pack();
        GotoSeeGrade.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_IconSeeGradeActionPerformed

    private void IconHomeWorkStdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IconHomeWorkStdActionPerformed
        HomeworkStd GotoHomework = new HomeworkStd();
        GotoHomework.setVisible(true);
        GotoHomework.pack();
        GotoHomework.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_IconHomeWorkStdActionPerformed
    //not use
    private void IconSeeGradeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IconSeeGradeFocusGained
     
    }//GEN-LAST:event_IconSeeGradeFocusGained

    private void CheckGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckGradeActionPerformed
        SeeGrade GotoSeeGrade = new SeeGrade();
        GotoSeeGrade.setVisible(true);
        GotoSeeGrade.pack();
        GotoSeeGrade.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_CheckGradeActionPerformed

    private void SeeHMStdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeeHMStdActionPerformed
        HomeworkStd gotoHomeworkStd = new HomeworkStd();
        gotoHomeworkStd.setVisible(true);
        gotoHomeworkStd.pack();
        gotoHomeworkStd.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_SeeHMStdActionPerformed

    private void IconViewAllcoursesActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        Register GotoRegister = new Register();
        GotoRegister.setVisible(true);
        GotoRegister.pack();
        GotoRegister.setLocationRelativeTo(null);
        this.dispose();
    }

    private void ViewAllCourseStdActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        Register GotoRegister = new Register();
        GotoRegister.setVisible(true);
        GotoRegister.pack();
        GotoRegister.setLocationRelativeTo(null);
        this.dispose();
    }
    
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
            java.util.logging.Logger.getLogger(MenuStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuStudent().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CheckGrade;
    private javax.swing.JButton IconHomeWorkStd;
    private javax.swing.JButton IconSeeGrade;
    private javax.swing.JButton IconViewAllcourses;
    private javax.swing.JButton Logoutbotton;
    private javax.swing.JButton SeeHMStd;
    private javax.swing.JButton ViewAllCourseStd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
