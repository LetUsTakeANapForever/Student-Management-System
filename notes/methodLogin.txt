 @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==b){
            System.out.println(checkAccount(userid.getText(), userpw.getText()));
            if(checkAccount(userid.getText(),userpw.getText())){
                JOptionPane.showMessageDialog(this,"Login Succeeded!","Succeeded",JOptionPane.INFORMATION_MESSAGE);
            }
            else 
                JOptionPane.showMessageDialog(this,"Wrong User or Password","Try Again",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    private boolean checkAccount(String ID,String Password){
        String connectorURL = "jdbc:mysql://localhost:3306/student-management?user=root&password=sukung34"; // url database ที่อยู่ในเครื่อง 
        try{
            // DriverManager เป็นตัวจัดการการเชื่อมต่อกับฐานข้อมูล
            // Connection เป็นตัวเชื่อมตัวฐานข้อมูล
            Connection connection = DriverManager.getConnection(connectorURL); //DriverManager สร้างการConnection กับฐานข้อมูล โดยใช้ URL ที่กำหนดไว้ใน connectorURL
           //Statement ใช้สำหรับส่งคำสั่ง SQL ไปยังฐานข้อมูลและดำเนินการกับข้อมูลที่อยู่ในฐานข้อมูล
           //createStatement() สร้างวัตถุของ statement ที่เชื่อมกับฐานข้อมูล
            Statement statement = connection.createStatement(); 

            // ดึงข้อมูลจาก column นักเรียนที่เป็น id/password นักเรียน ว่าตรงกับที่รับค่า ID,Password ไหม
            // \" ใช้เพื่อหลีกเลี่ยงการตีความเครื่องหมายคำพูดในสตริง ซึ่งทำให้คำสั่ง SQL
            String sql = String.format("SELECT std_id, std_password FROM students WHERE std_id = \"%s\" AND std_password = \"%s\"", ID, Password);
            
            //เก็บผลลัพท์ที่ได้จากการดำเนินการของ sql
            ResultSet resultSet = statement.executeQuery(sql);
        
            return resultSet.next(); //return ออกไปเป็น true ถ้ายังสามารถเลื่อนไปตัวต่อไปได้
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
    }
