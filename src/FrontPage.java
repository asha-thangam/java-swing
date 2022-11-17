import java.awt.*;
import javax.swing.*;
public class FrontPage extends JFrame {
    public FrontPage(){
    initComponents();
    }
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BtnReg = new javax.swing.JButton();
        Btnchng = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        setForeground(new java.awt.Color(0, 51, 255));

        jLabel1.setBackground(new java.awt.Color(0, 255, 204));
        jLabel1.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("VOTER ID REGISTRATION FORM");

        BtnReg.setForeground(new java.awt.Color(0, 153, 51));
        BtnReg.setText("NEW USER");
        BtnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegActionPerformed(evt);
            }
        });

        Btnchng.setForeground(new java.awt.Color(0, 153, 51));
        Btnchng.setText("CHANGE DETAILS");
        Btnchng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnchngActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btnchng)
                    .addComponent(BtnReg))
                .addContainerGap(150, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BtnReg, Btnchng});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(BtnReg)
                .addGap(51, 51, 51)
                .addComponent(Btnchng)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnchngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnchngActionPerformed
        LoginChangeDetails lcd=new LoginChangeDetails();
        lcd.setVisible(true);
    }//GEN-LAST:event_BtnchngActionPerformed

    private void BtnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegActionPerformed
        RegisterNew reg=new RegisterNew();
        reg.setVisible(true);
    }//GEN-LAST:event_BtnRegActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrontPage fp=new FrontPage();
                fp.getContentPane().setBackground(Color.PINK);
                fp.setResizable(false);
                fp.setTitle("Indian Election Commison");
                ImageIcon img = new ImageIcon("D:\\elcCom.PNG");
                fp.setIconImage(img.getImage()); 
                fp.setVisible(true);
                fp.setDefaultCloseOperation(JFrame. DISPOSE_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnReg;
    private javax.swing.JButton Btnchng;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
