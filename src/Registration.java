import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Registration extends javax.swing.JFrame {
    public Registration() {
        initComponents();
        IconFrame();
        this.getContentPane().setBackground(Color.WHITE);
    }

    private void IconFrame() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("2118256.png")));

    }

    private void initComponents() {

        Topblock = new javax.swing.JPanel();
        BackBT = new javax.swing.JButton();
        Downblock = new javax.swing.JPanel();
        BGUi = new javax.swing.JPanel();
        TextFieldNewUser = new javax.swing.JTextField();
        TextUser = new javax.swing.JLabel();
        TextPass = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ShowBox = new javax.swing.JCheckBox();
        TextFieldNewPass = new javax.swing.JPasswordField();
        SignUpBT = new javax.swing.JButton();
        TextFieldSurname = new javax.swing.JTextField();
        TextSurname = new javax.swing.JLabel();
        TextFieldFirstname = new javax.swing.JTextField();
        TextFirst = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Topblock.setBackground(new java.awt.Color(12, 137, 112));
        Topblock.setPreferredSize(new java.awt.Dimension(369, 62));

        BackBT.setBackground(new java.awt.Color(0, 102, 102));
        BackBT.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BackBT.setForeground(new java.awt.Color(255, 255, 255));
        BackBT.setText("BACK");
        BackBT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackBT.setPreferredSize(new java.awt.Dimension(65, 34));
        BackBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TopblockLayout = new javax.swing.GroupLayout(Topblock);
        Topblock.setLayout(TopblockLayout);
        TopblockLayout.setHorizontalGroup(
                TopblockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TopblockLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(BackBT, javax.swing.GroupLayout.PREFERRED_SIZE, 94,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        TopblockLayout.setVerticalGroup(
                TopblockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TopblockLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(BackBT, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(14, Short.MAX_VALUE)));

        Downblock.setBackground(new java.awt.Color(12, 137, 112));
        Downblock.setPreferredSize(new java.awt.Dimension(0, 30));

        javax.swing.GroupLayout DownblockLayout = new javax.swing.GroupLayout(Downblock);
        Downblock.setLayout(DownblockLayout);
        DownblockLayout.setHorizontalGroup(
                DownblockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE));
        DownblockLayout.setVerticalGroup(
                DownblockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 30, Short.MAX_VALUE));

        BGUi.setBackground(new java.awt.Color(234, 234, 234));

        TextFieldNewUser.setPreferredSize(new java.awt.Dimension(64, 25));
        TextFieldNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNewUserActionPerformed(evt);
            }
        });

        TextUser.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        TextUser.setText("USERNAME");

        TextPass.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        TextPass.setText("PASSWORD");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Create an account");

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(160, 160, 160));
        jLabel2.setText("Fill your Username & Password for Sign up");

        ShowBox.setText("Show");
        ShowBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShowBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowBoxActionPerformed(evt);
            }
        });

        TextFieldNewPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNewPassActionPerformed(evt);
            }
        });

        SignUpBT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SignUpBT.setText("SIGN UP");
        SignUpBT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignUpBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpBTActionPerformed(evt);
            }
        });

        TextFieldSurname.setPreferredSize(new java.awt.Dimension(64, 25));

        TextSurname.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        TextSurname.setText("SURNAME");

        TextFieldFirstname.setPreferredSize(new java.awt.Dimension(71, 25));

        TextFirst.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        TextFirst.setText("FIRSTNAME");

        javax.swing.GroupLayout BGUiLayout = new javax.swing.GroupLayout(BGUi);
        BGUi.setLayout(BGUiLayout);
        BGUiLayout.setHorizontalGroup(
                BGUiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGUiLayout.createSequentialGroup()
                                .addContainerGap(63, Short.MAX_VALUE)
                                .addGroup(BGUiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                BGUiLayout.createSequentialGroup()
                                                        .addComponent(jLabel2)
                                                        .addGap(93, 93, 93))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGUiLayout
                                                .createSequentialGroup()
                                                .addGroup(BGUiLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(TextFieldNewUser,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(TextPass)
                                                        .addComponent(TextUser)
                                                        .addComponent(ShowBox)
                                                        .addComponent(TextFieldNewPass,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 248,
                                                                Short.MAX_VALUE)
                                                        .addComponent(TextSurname)
                                                        .addComponent(TextFieldSurname,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(TextFirst)
                                                        .addComponent(TextFieldFirstname,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(61, 61, 61))))
                        .addGroup(BGUiLayout.createSequentialGroup()
                                .addGroup(BGUiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(BGUiLayout.createSequentialGroup()
                                                .addGap(131, 131, 131)
                                                .addComponent(SignUpBT))
                                        .addGroup(BGUiLayout.createSequentialGroup()
                                                .addGap(83, 83, 83)
                                                .addComponent(jLabel1)))
                                .addGap(0, 83, Short.MAX_VALUE)));
        BGUiLayout.setVerticalGroup(
                BGUiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BGUiLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26,
                                        Short.MAX_VALUE)
                                .addComponent(TextFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 8,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextFieldFirstname, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TextSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 8,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextFieldSurname, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(TextUser, javax.swing.GroupLayout.PREFERRED_SIZE, 8,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextFieldNewUser, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TextPass, javax.swing.GroupLayout.PREFERRED_SIZE, 8,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextFieldNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ShowBox)
                                .addGap(28, 28, 28)
                                .addComponent(SignUpBT)
                                .addGap(24, 24, 24)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Topblock, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                        .addComponent(Downblock, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(BGUi, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(73, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(Topblock, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25,
                                        Short.MAX_VALUE)
                                .addComponent(BGUi, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Downblock, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void ShowBoxActionPerformed(java.awt.event.ActionEvent evt) {
        if (ShowBox.isSelected()) {
            TextFieldNewPass.setEchoChar((char) 0);
        } else {
            TextFieldNewPass.setEchoChar('*');
        }
    }

    private void TextFieldFirstnameActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void TextFieldSurnameActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void TextFieldNewUserActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void TextFieldNewPassActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void BackBTActionPerformed(java.awt.event.ActionEvent evt) {
        LoginStd LoginStd = new LoginStd();
        LoginStd.setVisible(true);
        LoginStd.pack();
        LoginStd.setLocationRelativeTo(null);
        this.dispose();
    }

    private void SignUpBTActionPerformed(java.awt.event.ActionEvent evt) {
        if (isValidInput() && SignUP()) {
            Login login = new Login();
            login.setVisible(true);
            login.pack();
            login.setLocationRelativeTo(null);
            this.dispose();
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    public boolean SignUP() {
        String userID = TextFieldNewUser.getText();
        char checkFirstLetter = userID.charAt(0);
        String password = new String(TextFieldNewPass.getPassword());

        if (!isValidID(checkFirstLetter, userID)) {
            JOptionPane.showMessageDialog(Registration.this, "Invalid input", "Error",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (checkFirstLetter == 'b') {
            try {
                Connection connection = SQLConnection.getConnection1();
                String sql = String.format(
                        "INSERT INTO students (std_id, std_password, std_firstname, std_lastname) VALUES (\"%s\",\"%s\",\"%s\",\"%s\")",
                        TextFieldNewUser.getText(), password, TextFieldFirstname.getText(), TextFieldSurname.getText());
                Statement statement = connection.createStatement();
                int checkRowInsert = statement.executeUpdate(sql);
                if (checkRowInsert > 0) {
                    JOptionPane.showMessageDialog(Registration.this, "Success!", "Success Register",
                            JOptionPane.INFORMATION_MESSAGE);
                    return true;
                } else {
                    System.out.println("failed");
                    return false;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        else if (checkFirstLetter == 't') {
            try {
                Connection connection = SQLConnection.getConnection1();
                String sql = String.format(
                        "INSERT INTO teachers (teacher_id, teacher_password, teacher_firstname, teacher_lastname) VALUES (\"%s\",\"%s\",\"%s\",\"%s\")",
                        TextFieldNewUser.getText(), password, TextFieldFirstname.getText(), TextFieldSurname.getText());
                Statement statement = connection.createStatement();
                int checkRowInsert = statement.executeUpdate(sql);
                if (checkRowInsert > 0) {
                    JOptionPane.showMessageDialog(Registration.this, "Success!", "Success Register",
                            JOptionPane.INFORMATION_MESSAGE);
                    return true;
                } else{
                    System.out.println("failed");
                    return false;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean isValidInput() {
        try {
            String password = new String(TextFieldNewPass.getPassword());
            Connection connection = SQLConnection.getConnection1();
            Statement statement = connection.createStatement();
            String sql = "SELECT std_id FROM students";

            ResultSet resultSet = statement.executeQuery(sql);
            if (TextFieldFirstname.getText().trim().isEmpty() || TextFieldFirstname.getText().matches("[!0-9]+")) {
                JOptionPane.showMessageDialog(Registration.this, "FirstName is empty or contain number",
                        "Empty Surname or Contain Number", JOptionPane.WARNING_MESSAGE);
                return false;
            } else if (TextFieldSurname.getText().trim().isEmpty() || TextFieldSurname.getText().matches("[!0-9]+")) {
                JOptionPane.showMessageDialog(Registration.this, "Surname is empty or contain number",
                        "Empty Surname or Contain Number", JOptionPane.WARNING_MESSAGE);
                return false;
            } else if (TextFieldNewUser.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(Registration.this, "UserID is empty", "Empty UserID",
                        JOptionPane.WARNING_MESSAGE);
                return false;
            }
            while (resultSet.next()) {
                if (TextFieldNewUser.getText().equals(resultSet.getString("std_id"))) {
                    JOptionPane.showMessageDialog(Registration.this, "UserID already existed", "Duplicate UserID",
                            JOptionPane.WARNING_MESSAGE);
                    return false;
                }
            }
            if (password.trim().isEmpty()) {
                JOptionPane.showMessageDialog(Registration.this, "Password is empty", "PasswordField is empty",
                        JOptionPane.WARNING_MESSAGE);
                return false;
            }

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    public boolean isValidID(char checkFirstLetter, String userID) {
        if (checkFirstLetter == 'b' && TextFieldNewUser.getText().length() == 11) {
            return true;
        } else if (checkFirstLetter == 't' && TextFieldNewUser.getText().length() == 5) {
            return true;
        }
        return false;
    }

    private javax.swing.JPanel BGUi;
    private javax.swing.JButton BackBT;
    private javax.swing.JPanel Downblock;
    private javax.swing.JCheckBox ShowBox;
    private javax.swing.JButton SignUpBT;
    private javax.swing.JTextField TextFieldFirstname;
    private javax.swing.JPasswordField TextFieldNewPass;
    private javax.swing.JTextField TextFieldNewUser;
    private javax.swing.JTextField TextFieldSurname;
    private javax.swing.JLabel TextFirst;
    private javax.swing.JLabel TextPass;
    private javax.swing.JLabel TextSurname;
    private javax.swing.JLabel TextUser;
    private javax.swing.JPanel Topblock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
}
