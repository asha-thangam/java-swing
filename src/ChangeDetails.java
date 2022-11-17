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
import javax.swing.JTextField;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class ChangeDetails extends javax.swing.JFrame {
    public Long mobile;
    public String pass,details; 
    public ChangeDetails() {
        initComponents();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TDoorNo = new javax.swing.JTextField();
        TStreet = new javax.swing.JTextField();
        TCity = new javax.swing.JTextField();
        TPin = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        BSubmit = new javax.swing.JButton();
        BReset = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        TPass = new javax.swing.JPasswordField();
        TxtArea = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        JCState = new javax.swing.JComboBox<>();
        JCDistrict = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Microsoft Himalaya", 1, 18)); // NOI18N
        jLabel1.setText("City");

        jLabel2.setFont(new java.awt.Font("Microsoft Himalaya", 1, 18)); // NOI18N
        jLabel2.setText("State");

        jLabel3.setFont(new java.awt.Font("Microsoft Himalaya", 1, 18)); // NOI18N
        jLabel3.setText("District");

        jLabel4.setFont(new java.awt.Font("Microsoft Himalaya", 1, 18)); // NOI18N
        jLabel4.setText("DoorNo");

        jLabel5.setFont(new java.awt.Font("Microsoft Himalaya", 1, 18)); // NOI18N
        jLabel5.setText("Street Name");

        jLabel6.setFont(new java.awt.Font("Microsoft Himalaya", 1, 18)); // NOI18N
        jLabel6.setText("PinCode");

        TDoorNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TDoorNoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Microsoft Himalaya", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("CHANGE DETAILS");

        BSubmit.setFont(new java.awt.Font("Microsoft Himalaya", 1, 18)); // NOI18N
        BSubmit.setText("SUBMIT");
        BSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSubmitActionPerformed(evt);
            }
        });

        BReset.setFont(new java.awt.Font("Microsoft Himalaya", 1, 18)); // NOI18N
        BReset.setText("RESET");
        BReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BResetActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Microsoft Himalaya", 1, 18)); // NOI18N
        jLabel8.setText("Confirm Password");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        TxtArea.setViewportView(jTextArea1);

        jLabel9.setFont(new java.awt.Font("Microsoft Himalaya", 1, 18)); // NOI18N
        jLabel9.setText("User Details");

        JCState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JCState.setSelectedIndex(-1);
        JCState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCStateActionPerformed(evt);
            }
        });

        JCDistrict.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JCDistrict.setSelectedIndex(-1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(BSubmit)
                        .addGap(72, 72, 72)
                        .addComponent(BReset))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TPin, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addComponent(TDoorNo, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addComponent(TStreet, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addComponent(TCity, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addComponent(TPass)
                                    .addComponent(JCDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JCState, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(TxtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {JCDistrict, JCState, TCity, TDoorNo, TPass, TPin, TStreet});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel7)
                .addGap(1, 1, 1)
                .addComponent(jLabel9)
                .addGap(1, 1, 1)
                .addComponent(TxtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JCState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JCDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TDoorNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(TPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BSubmit)
                    .addComponent(BReset))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6});

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void TDoorNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TDoorNoActionPerformed
        
    }//GEN-LAST:event_TDoorNoActionPerformed
    private void BSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSubmitActionPerformed
        String state=(String)JCState.getSelectedItem();
        String dis=(String)JCDistrict.getSelectedItem();
        int door=Integer.parseInt(TDoorNo.getText());
        String street=TStreet.getText();
        String city=TCity.getText();
        int pin=Integer.parseInt(TPin.getText());
        String confirmPass=TPass.getText();
        
        if(confirmPass.equals(pass)){
        try{
                Connection con=null;
                Class.forName("org.postgresql.Driver");
                con=DriverManager.getConnection("jdbc:postgresql://localhost/VoterIdRegistration","postgres","123456");
                System.out.print("connected");
                PreparedStatement pst;
                pst = con.prepareStatement("UPDATE userdetail SET doorno=?, streetname=?, city=?, district=?, pincode=?, state=? WHERE password=?;");
                pst.setInt(1,door);
                pst.setString(2, street);
                pst.setString(3,city);
                pst.setString(4, dis);
                pst.setInt(5, pin);
                pst.setString(6,state);
                pst.setString(7, confirmPass);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this,"Your Details are Updated");
            }
            catch(Exception e)
            {
                System.out.print("not connected");
                System.out.println("exception part");
                e.printStackTrace();
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Password Incorrect","WARNING", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BSubmitActionPerformed

    private void BResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BResetActionPerformed
        JCState.setSelectedItem(null);
        JCDistrict.setSelectedItem(null);
        TDoorNo.setText("");
        TStreet.setText("");
        TCity.setText("");
        TPin.setText("");
        TPass.setText("");
    }//GEN-LAST:event_BResetActionPerformed

    private void JCStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCStateActionPerformed
         int item=JCState.getSelectedIndex();
        try{
            JCDistrict.removeAllItems();
            JCDistrict.setModel(new javax.swing.DefaultComboBoxModel(disList[item]));
        }
        catch(Exception e){}
    }//GEN-LAST:event_JCStateActionPerformed
    public void userValue(Long mobile,String pass,String details){
        this.mobile=mobile;
        this.pass=pass;
        jTextArea1.setText(details);
    }

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                ChangeDetails cd=new ChangeDetails();
//                
//                cd.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BReset;
    private javax.swing.JButton BSubmit;
    private javax.swing.JComboBox<String> JCDistrict;
    private javax.swing.JComboBox<String> JCState;
    private javax.swing.JTextField TCity;
    private javax.swing.JTextField TDoorNo;
    private javax.swing.JPasswordField TPass;
    private javax.swing.JTextField TPin;
    private javax.swing.JTextField TStreet;
    private javax.swing.JScrollPane TxtArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
