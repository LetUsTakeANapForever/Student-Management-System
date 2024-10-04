import java.awt.Color;
import javax.swing.UIManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class MenuGrade extends javax.swing.JFrame {
    static Connection connection;
    /**
     * Creates new form MenuGrade
     */
    public MenuGrade() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
    }
    
    public void JBlackground2(){
        this.JBack.setBorderPainted(false);
        this.JBack.setFocusPainted(false);
        this.JBack.setContentAreaFilled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        LabelStudent_ID = new javax.swing.JLabel();
        LabelSubject_id = new javax.swing.JLabel();
        LabelGrade = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        ID_Student = new javax.swing.JTextField();
        item_Grade = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        JBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        ID_Subject = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        LabelStudent_ID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelStudent_ID.setText("STUDENT ID :");

        LabelSubject_id.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelSubject_id.setText("SUBJECT ID :");

        LabelGrade.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelGrade.setText(" GRADE :");

        Submit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Submit.setText("SUBMIT");
        Submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Submit.addActionListener(e -> {
            String stdIDInput = ID_Student.getText();
            String subjectIDInput = ID_Subject.getText();
            String gradeInput = item_Grade.getSelectedItem().toString();
            try{
                connection = SQLConnection.getConnection1();
                Statement statement = connection.createStatement();
                
                if (!doesExists(stdIDInput)){
                    JOptionPane.showMessageDialog(this, "Unknown student ID", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (!hasRegistered(stdIDInput, subjectIDInput)){
                    String msg = String.format("%s hasn't registered %s", stdIDInput, subjectIDInput);
                    JOptionPane.showMessageDialog(this, msg, "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (!doesTeach(subjectIDInput)){
                    String msg = String.format("%s doesn't teach %s", Login.teacherId, subjectIDInput);
                    JOptionPane.showMessageDialog(this, msg, "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                    
                String query = String.format("UPDATE registration SET grade = \"%s\" WHERE std_id = \"%s\" AND subject_id = \"%s\";", gradeInput, stdIDInput, subjectIDInput);
                statement.executeUpdate(query);
                String msg = String.format("Submitted Grade %s to %s (%s)", gradeInput, stdIDInput, subjectIDInput);
                JOptionPane.showMessageDialog(this, msg, "Successful submission", JOptionPane.INFORMATION_MESSAGE);

            }catch (SQLException except){
                except.printStackTrace();
            }
        });

        item_Grade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item_Grade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B+", "B", "C+", "C", "D+", "D", "F" }));
        item_Grade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel1.setBackground(new java.awt.Color(12, 137, 112));
        jPanel1.setPreferredSize(new java.awt.Dimension(378, 63));

        JBack.setBackground(new java.awt.Color(0, 102, 102));
        JBack.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JBack.setForeground(new java.awt.Color(255, 255, 255));
        JBack.setText("BACK");
        JBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JBack, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(695, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(12, 137, 112));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelStudent_ID)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(LabelGrade)
                        .addComponent(LabelSubject_id)))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(item_Grade, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ID_Student)
                    .addComponent(ID_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelStudent_ID)
                    .addComponent(ID_Student, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelSubject_id)
                    .addComponent(ID_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelGrade)
                    .addComponent(item_Grade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>                        

    private void JBackActionPerformed(java.awt.event.ActionEvent evt) {                                      
        MenuTeacher backmenu = new MenuTeacher();
        backmenu.setVisible(true);
        backmenu.pack();
        backmenu.setLocationRelativeTo(null);
        this.dispose();
    }

    public boolean doesExists(String std_id) throws SQLException{
        Statement statement = connection.  createStatement();
        String fectchStdQuery = String.format("SELECT std_id FROM students WHERE std_id = \"%s\"", std_id);
        ResultSet rs = statement.executeQuery(fectchStdQuery);
        return rs.next();
    }

    public boolean hasRegistered(String std_id, String subject_id) throws SQLException {
        Statement statement = connection.  createStatement();
        String fectchStdQuery = String.format("SELECT std_id, subject_id FROM registration WHERE std_id = \"%s\" AND subject_id = \"%s\"", std_id, subject_id);
        ResultSet rs = statement.executeQuery(fectchStdQuery);
        return rs.next();
    }

    public boolean doesTeach(String subject_id) throws SQLException {
        Statement statement = connection.  createStatement();
        String fectchStdQuery = String.format("SELECT teacher_id, subject_id FROM teachers WHERE teacher_id = \"%s\" AND subject_id = \"%s\"", Login.teacherId, subject_id);
        ResultSet rs = statement.executeQuery(fectchStdQuery);
        return rs.next();
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
            java.util.logging.Logger.getLogger(MenuGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new MenuGrade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField ID_Student;
    private javax.swing.JTextField ID_Subject;
    private javax.swing.JButton JBack;
    private javax.swing.JLabel LabelGrade;
    private javax.swing.JLabel LabelStudent_ID;
    private javax.swing.JLabel LabelSubject_id;
    private javax.swing.JButton Submit;
    private javax.swing.JComboBox<String> item_Grade;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration                   
}
