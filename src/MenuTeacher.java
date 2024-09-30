import java.awt.Button;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.AbstractMultiResolutionImage;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class MenuTeacher extends javax.swing.JFrame {
    public MenuTeacher(String teachername) {
        initComponents();
        JButtonBlackground();
        JSetimageIcon();
        this.getContentPane().setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        Name_Teacher.setText(teachername);
    }
    public MenuTeacher() {
        initComponents();
        JButtonBlackground();
        JSetimageIcon();
        this.getContentPane().setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        
    }
    
    public void JButtonBlackground(){
                this.Logout.setBorderPainted(false);
                this.Logout.setFocusPainted(false);
                this.Logout.setContentAreaFilled(false);
                
                this.Submit_Grade.setBorderPainted(false);
                this.Submit_Grade.setFocusPainted(false);
                this.Submit_Grade.setContentAreaFilled(false);
                
                this.Add_HW.setBorderPainted(false);
                this.Add_HW.setFocusPainted(false);
                this.Add_HW.setContentAreaFilled(false);
                
                this.IconGrade.setBorderPainted(false);
                this.IconGrade.setFocusPainted(false);
                this.IconGrade.setContentAreaFilled(false);
                
                this.IconHomeWork.setBorderPainted(false);
                this.IconHomeWork.setFocusPainted(false);
                this.IconHomeWork.setContentAreaFilled(false);
    }
    
    public void JSetimageIcon(){
        
                ImageIcon icon = new ImageIcon("src/pics/2641409.png");
                Image img = icon.getImage();
                Image resizedImg = img.getScaledInstance(110, 110, java.awt.Image.SCALE_SMOOTH);
                ImageIcon resizedIcon = new ImageIcon(resizedImg);
                this.IconGrade.setIcon(resizedIcon);
                
                ImageIcon icon2 = new ImageIcon("src/pics/ImageIcon2.png");
                Image img2 = icon2.getImage();
                Image resizedImg2 = img2.getScaledInstance(130, 110, java.awt.Image.SCALE_SMOOTH);
                ImageIcon resizedIcon2 = new ImageIcon(resizedImg2);
                this.IconHomeWork.setIcon(resizedIcon2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Logout = new javax.swing.JButton();
        Name_Teacher = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Submit_Grade = new javax.swing.JButton();
        Add_HW = new javax.swing.JButton();
        IconGrade = new javax.swing.JButton();
        IconHomeWork = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(12, 137, 112));
        setForeground(new java.awt.Color(12, 137, 112));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(12, 137, 112));

        Logout.setBackground(new java.awt.Color(12, 137, 112));
        Logout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setText("Logout");
        Logout.setAlignmentY(0.0F);
        Logout.setBorder(null);
        Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        Name_Teacher.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Name_Teacher.setForeground(new java.awt.Color(255, 255, 255));
        Name_Teacher.setText("Name Teacher");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Name_Teacher, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name_Teacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
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
            .addGap(0, 29, Short.MAX_VALUE)
        );

        Submit_Grade.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Submit_Grade.setText("SUBMIT GRADE");
        Submit_Grade.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Submit_Grade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Submit_Grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_GradeActionPerformed(evt);
            }
        });

        Add_HW.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Add_HW.setText("ADD HW/ASSINGMENTS");
        Add_HW.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Add_HW.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Add_HW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_HWActionPerformed(evt);
            }
        });

        IconGrade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IconGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IconGradeActionPerformed(evt);
            }
        });

        IconHomeWork.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IconHomeWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IconHomeWorkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IconGrade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IconHomeWork, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Add_HW, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Submit_Grade))
                .addGap(154, 154, 154))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(Submit_Grade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                        .addComponent(Add_HW, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(IconGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(IconHomeWork, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>                        

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {                                                                          
        Login login = new Login();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        this.dispose();
    }                                      

    private void Submit_GradeActionPerformed(java.awt.event.ActionEvent evt) {                                             
        MenuGrade backgrade = new MenuGrade();
        backgrade.setVisible(true);
        backgrade.pack();
        backgrade.setLocationRelativeTo(null);
        this.dispose();
    }                                            

    private void Add_HWActionPerformed(java.awt.event.ActionEvent evt) {                                       
        Homework backHomework = new Homework();
        backHomework.setVisible(true);
        backHomework.pack();
        backHomework.setLocationRelativeTo(null);
        this.dispose();
        
    }                                      

    private void IconGradeActionPerformed(java.awt.event.ActionEvent evt) {                                          
        MenuGrade backgrade = new MenuGrade();
        backgrade.setVisible(true);
        backgrade.pack();
        backgrade.setLocationRelativeTo(null);
        this.dispose();
    }                                         

    private void IconHomeWorkActionPerformed(java.awt.event.ActionEvent evt) {                                             
        Homework backHomework = new Homework();
        backHomework.setVisible(true);
        backHomework.pack();
        backHomework.setLocationRelativeTo(null);
        this.dispose();
    }                                            

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                MenuTeacher menu = new MenuTeacher();
                menu.setVisible(true);
                

            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Add_HW;
    private javax.swing.JButton IconGrade;
    private javax.swing.JButton IconHomeWork;
    private javax.swing.JButton Logout;
    private javax.swing.JLabel Name_Teacher;
    private javax.swing.JButton Submit_Grade;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration                   
}
