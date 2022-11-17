import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
public class LoginChangeDetails extends javax.swing.JFrame {
    public LoginChangeDetails() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Tmobile = new javax.swing.JTextField();
        LMobile = new javax.swing.JLabel();
        Lpass = new javax.swing.JLabel();
        TPass = new javax.swing.JPasswordField();
        Btnlogin = new javax.swing.JButton();
        BtnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Microsoft Himalaya", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Login Page");

        Tmobile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TmobileMouseEntered(evt);
            }
        });
        Tmobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TmobileActionPerformed(evt);
            }
        });

        LMobile.setFont(new java.awt.Font("Microsoft Himalaya", 1, 20)); // NOI18N
        LMobile.setText("Mobile Number");

        Lpass.setFont(new java.awt.Font("Microsoft Himalaya", 1, 20)); // NOI18N
        Lpass.setText("Password");

        TPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TPassMouseEntered(evt);
            }
        });

        Btnlogin.setFont(new java.awt.Font("Microsoft Himalaya", 1, 18)); // NOI18N
        Btnlogin.setText("LOGIN");
        Btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnloginActionPerformed(evt);
            }
        });

        BtnReset.setFont(new java.awt.Font("Microsoft Himalaya", 1, 18)); // NOI18N
        BtnReset.setText("RESET");
        BtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lpass, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Tmobile, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(TPass)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(Btnlogin)
                        .addGap(38, 38, 38)
                        .addComponent(BtnReset))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LMobile)
                    .addComponent(Tmobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lpass)
                    .addComponent(TPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btnlogin)
                    .addComponent(BtnReset))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TmobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TmobileActionPerformed
        
    }//GEN-LAST:event_TmobileActionPerformed
    
    private void BtnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnloginActionPerformed
          try{
                int f=0;
                Connection con=null;
                Class.forName("org.postgresql.Driver");
                con=DriverManager.getConnection("jdbc:postgresql://localhost/VoterIdRegistration","postgres","123456");
                System.out.print("connected");
                String sql="select * from userdetail";
                Statement st=con.createStatement();
                ResultSet rs=null;
                rs=st.executeQuery(sql);
                long mobile=Long.parseLong(Tmobile.getText());
                String pass=TPass.getText();
                while(rs.next()){
                    if((mobile==rs.getLong(14)) && (pass.equals(rs.getString(12)))){
                        String details="";//username, age, fathername, aadharnumber, gender, doorno, streetname, city, district, pincode, state, password, dob, mobileno
                        details+="Name: "+rs.getString(1)+"\nDate of Birth:"+rs.getString(13)+"\nAge: "+rs.getInt(2)+"\nFather name:"+rs.getString(3)+"\nAadhar Number: "+rs.getLong(4)+"\nGender:"+rs.getString(5)+"\nMobile Number: "+rs.getLong(14)+"\nAddress:\n "+rs.getInt(6)+"\n"+rs.getString(7)+"\n"+rs.getString(8)+"\n"+rs.getString(9)+"\n"+rs.getInt(10)+"\n"+rs.getString(11);
                        ChangeDetails cd=new ChangeDetails();
                        cd.setResizable(false);
                        cd.setTitle("Details Changing Requisition Form");
                        ImageIcon img = new ImageIcon("D:\\elcCom.PNG");
                        cd.setIconImage(img.getImage()); 
                        System.out.println(details);
                        cd.userValue(mobile,pass,details);
                        cd.setVisible(true);
                        f=1;
                        break;
                    }
                }
                if(f==0){
                        JOptionPane.showMessageDialog(this, "Mobile No / Password Incorrect","WARNING", JOptionPane.WARNING_MESSAGE);
                }
                rs.close();
            }
            catch(Exception e)
            {
                System.out.print("not connected");
            }
    }//GEN-LAST:event_BtnloginActionPerformed

    private void BtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResetActionPerformed
        Tmobile.setText("");
        TPass.setText("");
    }//GEN-LAST:event_BtnResetActionPerformed

    private void TmobileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TmobileMouseEntered
        Tmobile.setToolTipText("Enter Your Registered Mobile Number");
    }//GEN-LAST:event_TmobileMouseEntered

    private void TPassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TPassMouseEntered
        TPass.setToolTipText("Enter Your Password");
    }//GEN-LAST:event_TPassMouseEntered

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginChangeDetails lcd=new LoginChangeDetails();
                lcd.setTitle("Login Page");
                ImageIcon img = new ImageIcon("D:\\elcCom.PNG");
                lcd.setIconImage(img.getImage()); 
                lcd.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnReset;
    private javax.swing.JButton Btnlogin;
    private javax.swing.JLabel LMobile;
    private javax.swing.JLabel Lpass;
    private javax.swing.JPasswordField TPass;
    private javax.swing.JTextField Tmobile;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
