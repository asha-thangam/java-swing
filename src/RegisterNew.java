import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.regex.*;

import java.time.*;
public class RegisterNew extends javax.swing.JFrame {
    public RegisterNew() {
        setTitle("New Registration");
        initComponents();
        JCState.setSelectedItem(null);
    }
    public String[][] disList={{"Anakapalli","Alluri Seetharama Raju","Kakinada","Konaseema","Eluru","Palnadu",},
        {"Anjaw","Changlang","Dibang Valley","East Kameng","East Siang","Itanagar","Kra Daadi","Kurung Kumey"},
        {"Charaideo","Dhemaji","Dibrugarh","Golaghat","Jorhat","Lakhimpur","Majuli Sivasagar","Tinsukia"},
        {"Araria","Jokihat","Kursakanta","Raniganj","Sikti","Palasi","Forbesganj","Narpatganj","Bhargama"},
        {"Bijapur","Sukma","Dantewada",	"Bastar","Kondagaon","Narayanpur"},
        {"North Goa","South Goa"},
        {"Ahmedabad","Amreli","Banaskantha","Bharuch","Bhavnagar","Dang","Jamnagar","Junagadh","Kheda","Kachchh","Mehsana", "Panchmahal"},
        {"Ambala","Bhiwani","Charkhi Dadri","Faridabad","Fatehabad","Gurugram","Jhajjar","Kaithal"},
        {"Bilaspur","Chamba","Hamirpur","Kangra","Kinnaur","Kullu","Lahaul & Spiti","Mandi"},
        {"Ariyalur", "Chennai","Coimbatore", "Cuddalore","Dharmapuri","Dindigul","Erode", "Kancheepuram", "Kanyakumari","Karur","Krishnagiri","Madurai","Nagapattinam","Namakkal","Perambalur","Pudukottai","Ramanathapuram","Salem","Sivaganga","Thanjavur", "The Nilgiris","Theni","Thiruvallur","Thiruvannamalai","Thiruvarur","Tirunelveli", "Tiruppur","Trichirappalli","Tuticorin","Vellore", "Villupuram","Virudhunagar"}
    };
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonGroup = new javax.swing.ButtonGroup();
        Heading = new javax.swing.JLabel();
        Lname = new javax.swing.JLabel();
        Ldob = new javax.swing.JLabel();
        Lgender = new javax.swing.JLabel();
        LAadhar = new javax.swing.JLabel();
        LMobile = new javax.swing.JLabel();
        LFather = new javax.swing.JLabel();
        LState = new javax.swing.JLabel();
        LDistrict = new javax.swing.JLabel();
        LDoorNo = new javax.swing.JLabel();
        LStreet = new javax.swing.JLabel();
        LCity = new javax.swing.JLabel();
        LPin = new javax.swing.JLabel();
        BtnSubmit = new javax.swing.JButton();
        TName = new javax.swing.JTextField();
        RBmale = new javax.swing.JRadioButton();
        RBFemale = new javax.swing.JRadioButton();
        TAadhar = new javax.swing.JTextField();
        TMobile = new javax.swing.JTextField();
        TFather = new javax.swing.JTextField();
        Tdoor = new javax.swing.JTextField();
        TStreet = new javax.swing.JTextField();
        TCity = new javax.swing.JTextField();
        TPin = new javax.swing.JTextField();
        LPass = new javax.swing.JLabel();
        Tpass = new javax.swing.JPasswordField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        BClear = new javax.swing.JButton();
        JCState = new javax.swing.JComboBox<>();
        JCDistrict = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Heading.setFont(new java.awt.Font("Microsoft Himalaya", 1, 36)); // NOI18N
        Heading.setForeground(new java.awt.Color(51, 204, 0));
        Heading.setText("New User Registration Form");
        Heading.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        Lname.setFont(new java.awt.Font("Microsoft Himalaya", 1, 18)); // NOI18N
        Lname.setText("Name");

        Ldob.setFont(new java.awt.Font("Microsoft Himalaya", 1, 18)); // NOI18N
        Ldob.setText("Date Of Birth");

        Lgender.setFont(new java.awt.Font("Microsoft Himalaya", 1, 18)); // NOI18N
        Lgender.setText("Gender");

        LAadhar.setFont(new java.awt.Font("Microsoft Himalaya", 1, 18)); // NOI18N
        LAadhar.setText("Aadhar Number");

        LMobile.setFont(new java.awt.Font("Microsoft Himalaya", 1, 18)); // NOI18N
        LMobile.setText("Mobile Number");

        LFather.setFont(new java.awt.Font("Microsoft Himalaya", 1, 18)); // NOI18N
        LFather.setText("Father Name");

        LState.setFont(new java.awt.Font("Microsoft Himalaya", 1, 18)); // NOI18N
        LState.setText("State");

        LDistrict.setFont(new java.awt.Font("Microsoft Himalaya", 1, 18)); // NOI18N
        LDistrict.setText("District");

        LDoorNo.setFont(new java.awt.Font("Microsoft Himalaya", 1, 18)); // NOI18N
        LDoorNo.setText("Door No");

        LStreet.setFont(new java.awt.Font("Microsoft Himalaya", 1, 18)); // NOI18N
        LStreet.setText("Street Name");

        LCity.setFont(new java.awt.Font("Microsoft Himalaya", 1, 18)); // NOI18N
        LCity.setText("City");

        LPin.setFont(new java.awt.Font("Microsoft Himalaya", 1, 18)); // NOI18N
        LPin.setText("PinCode");

        BtnSubmit.setFont(new java.awt.Font("Microsoft Himalaya", 1, 18)); // NOI18N
        BtnSubmit.setText("SUBMIT");
        BtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSubmitActionPerformed(evt);
            }
        });

        TName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TNameActionPerformed(evt);
            }
        });

        ButtonGroup.add(RBmale);
        RBmale.setFont(new java.awt.Font("Microsoft Himalaya", 1, 18)); // NOI18N
        RBmale.setText("Male");
        RBmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBmaleActionPerformed(evt);
            }
        });

        ButtonGroup.add(RBFemale);
        RBFemale.setFont(new java.awt.Font("Microsoft Himalaya", 1, 18)); // NOI18N
        RBFemale.setText("Female");
        RBFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBFemaleActionPerformed(evt);
            }
        });

        TAadhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TAadharActionPerformed(evt);
            }
        });

        TStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TStreetActionPerformed(evt);
            }
        });

        TCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCityActionPerformed(evt);
            }
        });

        LPass.setFont(new java.awt.Font("Microsoft Himalaya", 1, 18)); // NOI18N
        LPass.setText("Password");

        jDateChooser1.setDateFormatString("dd/MM/yyyy");

        BClear.setFont(new java.awt.Font("Microsoft Himalaya", 1, 18)); // NOI18N
        BClear.setText("CLEAR");
        BClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BClearActionPerformed(evt);
            }
        });

        JCState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "TamilNadu" }));
        JCState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCStateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Lname, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Ldob, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Lgender, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LAadhar, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                .addComponent(LFather, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(LMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LState, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(LStreet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                .addComponent(LDoorNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(LCity, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LPin, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LPass, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tdoor, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tpass, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TAadhar, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RBmale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RBFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TName, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(JCDistrict, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JCState, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TPin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                .addComponent(TCity, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TStreet, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TFather, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TMobile, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(BtnSubmit)
                        .addGap(70, 70, 70)
                        .addComponent(BClear))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(Heading)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(Heading)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lname))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Ldob)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lgender)
                    .addComponent(RBmale)
                    .addComponent(RBFemale))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LAadhar)
                    .addComponent(TAadhar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LMobile)
                    .addComponent(TMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LFather)
                    .addComponent(TFather, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LState)
                    .addComponent(JCState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LDistrict)
                    .addComponent(JCDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LDoorNo)
                    .addComponent(Tdoor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LStreet)
                    .addComponent(TStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LCity)
                    .addComponent(TCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LPin)
                    .addComponent(TPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LPass)
                    .addComponent(Tpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnSubmit)
                    .addComponent(BClear))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RBmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBmaleActionPerformed
        
    }//GEN-LAST:event_RBmaleActionPerformed

    private void RBFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBFemaleActionPerformed
        
    }//GEN-LAST:event_RBFemaleActionPerformed

    private void TAadharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TAadharActionPerformed
        
    }//GEN-LAST:event_TAadharActionPerformed
    public boolean validateAadhar(String aadhar){
        String regex= "^[0-9]{12}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(aadhar);
        return m.matches();
    }
    public boolean validateMobileNo(String mo){
        String regex= "(0/91)?[7-9][0-9]{9}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(mo);
        return m.matches();
    }
    private void BtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSubmitActionPerformed

        String name=TName.getText();
        
        String dob =((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
        String[] d=dob.split("/");
        int day=Integer.parseInt(d[0]);
        int mon=Integer.parseInt(d[1]);
        int yr=Integer.parseInt(d[2]);
        LocalDate selectedDate=LocalDate.of(yr,mon,day);
        LocalDate currentDate=LocalDate.now();
        int age=Period.between(selectedDate,currentDate).getYears();
        System.out.println(age);
      
        String gender="Male";
        if(RBFemale.isSelected()) gender="Female";
        else if(RBmale.isSelected()) gender="Male";
        boolean aa=validateAadhar(TAadhar.getText());
        System.out.print(aa);
        if(aa==false){
            JOptionPane.showMessageDialog(this, "Enter a valid Aadhar number","WARNING", JOptionPane.WARNING_MESSAGE);
        }
        else{
        long aadhar=Long.parseLong(TAadhar.getText());
        boolean mo=validateMobileNo(TMobile.getText());
        if(mo==false){
            JOptionPane.showMessageDialog(this, "Enter a valid Mobile number","WARNING", JOptionPane.WARNING_MESSAGE);
        }
        else{
        long mobile=Long.parseLong(TMobile.getText());
        String fatherName=TFather.getText();
        String state=(String)JCState.getSelectedItem();
        String dis=(String)JCDistrict.getSelectedItem();
        int door=Integer.parseInt(Tdoor.getText());
        String street=TStreet.getText();
        String city=TCity.getText();
        int pin=Integer.parseInt(TPin.getText());
        String pass=Tpass.getText();
        if(age>=18){
            try{
            PreparedStatement pst;
            Class.forName("org.postgresql.Driver");
            Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/VoterIdRegistration","postgres","123456");
            System.out.print("connected");
            try{
                pst = con.prepareStatement("insert into userdetail (username, age, fathername, aadharnumber, gender, doorno, streetname, city, district, pincode, state, password, dob, mobileno) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                pst.setString(1,name);
                pst.setInt(2,age);
                pst.setString(3,fatherName);
                pst.setLong(4, aadhar);
                pst.setString(5,gender);
                pst.setInt(6,door);
                pst.setString(7, street);
                pst.setString(8, city);
                pst.setString(9,dis);
                pst.setInt(10,pin);
                pst.setString(11,state);
                pst.setString(12, pass);
                pst.setString(13,dob);
                pst.setLong(14,mobile);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this,"Details Updated");
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        catch(Exception e){
            System.out.println("not connected");
        }
        }
        else{
            JOptionPane.showMessageDialog(this, "Age should be more than 18 years","WARNING", JOptionPane.WARNING_MESSAGE);
        }
        }
        }
    }//GEN-LAST:event_BtnSubmitActionPerformed

    private void TNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TNameActionPerformed

    private void TStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TStreetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TStreetActionPerformed

    private void TCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TCityActionPerformed

    private void BClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BClearActionPerformed
        TName.setText("");
        jDateChooser1.setCalendar(null);
        ButtonGroup.clearSelection();
        TAadhar.setText("");
        TMobile.setText("");
        JCState.setSelectedItem(null);
        JCDistrict.setSelectedItem(null);
        Tdoor.setText("");
        TStreet.setText("");
        TCity.setText("");
        TPin.setText("");
        Tpass.setText("");
    }//GEN-LAST:event_BClearActionPerformed

    private void JCStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCStateActionPerformed
        int item=JCState.getSelectedIndex();
        try{
            JCDistrict.removeAllItems();
            JCDistrict.setModel(new javax.swing.DefaultComboBoxModel(disList[item]));
        }
        catch(Exception e){}
        
    }//GEN-LAST:event_JCStateActionPerformed

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegisterNew rn= new RegisterNew();
                ImageIcon img = new ImageIcon("D:\\elcCom.PNG");
                rn.setIconImage(img.getImage()); 
                rn.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BClear;
    private javax.swing.JButton BtnSubmit;
    private javax.swing.ButtonGroup ButtonGroup;
    private javax.swing.JLabel Heading;
    private javax.swing.JComboBox<String> JCDistrict;
    private javax.swing.JComboBox<String> JCState;
    private javax.swing.JLabel LAadhar;
    private javax.swing.JLabel LCity;
    private javax.swing.JLabel LDistrict;
    private javax.swing.JLabel LDoorNo;
    private javax.swing.JLabel LFather;
    private javax.swing.JLabel LMobile;
    private javax.swing.JLabel LPass;
    private javax.swing.JLabel LPin;
    private javax.swing.JLabel LState;
    private javax.swing.JLabel LStreet;
    private javax.swing.JLabel Ldob;
    private javax.swing.JLabel Lgender;
    private javax.swing.JLabel Lname;
    private javax.swing.JRadioButton RBFemale;
    private javax.swing.JRadioButton RBmale;
    private javax.swing.JTextField TAadhar;
    private javax.swing.JTextField TCity;
    private javax.swing.JTextField TFather;
    private javax.swing.JTextField TMobile;
    private javax.swing.JTextField TName;
    private javax.swing.JTextField TPin;
    private javax.swing.JTextField TStreet;
    private javax.swing.JTextField Tdoor;
    private javax.swing.JPasswordField Tpass;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    // End of variables declaration//GEN-END:variables
}
