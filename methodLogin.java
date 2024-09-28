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
        String connectorURL = "jdbc:mysql://localhost:3306/student-management?user=root&password=sukung34";
        try{
            Connection connection = DriverManager.getConnection(connectorURL);
            Statement statement = connection.createStatement();
    
            String sql = String.format("SELECT std_id, std_password FROM students WHERE std_id = \"%s\" AND std_password = \"%s\"", ID, Password);
            ResultSet resultSet = statement.executeQuery(sql);
        
            return resultSet.next();
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
    }
