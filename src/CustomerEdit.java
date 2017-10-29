
//import static Customer.temp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pratik rathod
 */
public class CustomerEdit extends javax.swing.JFrame {

    /**
     * Creates new form Thanks
     */public static String temp;
      String pid=null;
    public CustomerEdit() {
        initComponents();
        
        dob1.setDateFormatString("yyyy-MM-dd");
    }

     public CustomerEdit(String para) {
        initComponents();
         temp=para;
                  pp.setText(temp);
        String fnm=null;
        String fnm2=null;
        String lnm1=null;
        String gen=null;
        String mob=null;
        String lic=null;
        String ema=null;
        String dob=null;
        String cit=null;
        String pin=null;
      
        String Lic3=null;
        String occ2=null;
        String ema3=null;
        String passw=null;
        String usern=null;
         Connection cn=LoginForm.guicon();
        try{
         
          PreparedStatement pstmt;
            String insert="SELECT * FROM cuslogin WHERE email=? or username=?";
            pstmt=cn.prepareStatement(insert);
              pstmt.setString(1,temp);
               pstmt.setString(2,temp);
              // System.out.println("ssd");
               ResultSet rs=pstmt.executeQuery();
               while(rs.next())
               {
                     fnm=rs.getString("email");
                     System.out.println(fnm);
                     
               }
               String insert1="SELECT * FROM person WHERE email=?";
            pstmt=cn.prepareStatement(insert1);
              pstmt.setString(1,fnm);
                rs=pstmt.executeQuery();
               while(rs.next())
               {
                   pid=rs.getString("Pid");
                     System.out.println(pid);
                        
                    fnm2=rs.getString("fname");
                     System.out.println(fnm1);
                        
                          lnm1=rs.getString("lname");
                     System.out.println(fnm1);
                           gen=rs.getString("Gender");
                     System.out.println(fnm1);
                          mob=rs.getString("mobile_no");
                     System.out.println(fnm1);
                          lic=rs.getString("fname");
                     System.out.println(fnm1);
//                          String usen=rs.getString("fname");
//                     System.out.println(fnm1);
                           ema=rs.getString("email");
                     System.out.println(fnm1);
                           dob=rs.getString("dob");
                     System.out.println(fnm1);
                           cit=rs.getString("city");
                     System.out.println(fnm1);
                          pin=rs.getString("pincode");
                     System.out.println(fnm1);
                      
                     
               } 
                fnm1.setText(fnm2);
                         lnm.setText(lnm1);
                      //String gen1 = ppp.getSelectedItem().toString(); 
                       ppp.addItem(gen);
                      //ppp.setText(gen);
                         mob1.setText(mob);
                         lic1.setText(lic);
                         ema1.setText(ema);
                        // SimpleDateFormat formater=new SimpleDateFormat("yyyy-mm-dd");
                        Date date1=null;
            try {
                date1 = new SimpleDateFormat("yyyy-MM-dd").parse(dob);
            } catch (ParseException ex) {
                Logger.getLogger(CustomerEdit.class.getName()).log(Level.SEVERE, null, ex);
            }
                         dob1.setDate(date1);
                         cit1.setText(cit);
                         pin1.setText(pin);
                         
            String insert2="SELECT * FROM customer1 WHERE Pid=?";
            pstmt=cn.prepareStatement(insert2);
              pstmt.setString(1,pid);
                rs=pstmt.executeQuery();
               while(rs.next())
               {
                       occ2=rs.getString("occupation");
                     System.out.println(occ2);
                       Lic3=rs.getString("ID");
                     System.out.println(Lic3);
               }
                 occ.setText(occ2);
                 lic1.setText(Lic3);
                 
                  String insert3="SELECT * FROM cuslogin WHERE email=?";
            pstmt=cn.prepareStatement(insert3);
              pstmt.setString(1,fnm);
                rs=pstmt.executeQuery();
               while(rs.next())
               {
                       ema3=rs.getString("email");
                     System.out.println(occ2);
                       passw=rs.getString("password");
                     System.out.println(Lic3);
                       usern=rs.getString("username");
                     System.out.println(Lic3);
               }
                 //occ.setText(ema3);
             //    unm.setText(usern);
        }
               
               catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cit1 = new javax.swing.JTextField();
        pin1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dob1 = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ppp = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fnm1 = new javax.swing.JTextField();
        occ = new javax.swing.JTextField();
        lnm = new javax.swing.JTextField();
        mob1 = new javax.swing.JTextField();
        lic1 = new javax.swing.JTextField();
        ema1 = new javax.swing.JTextField();
        pp = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cit1ActionPerformed(evt);
            }
        });
        getContentPane().add(cit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 269, 177, 30));

        pin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pin1ActionPerformed(evt);
            }
        });
        getContentPane().add(pin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 339, 177, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("FIRST NAME");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 140, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("LAST NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 150, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("GENDER");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 140, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("MOBILE NUMBER");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 345, 140, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("EMAIL");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 116, 60, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("DOB");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 205, 110, 30));
        getContentPane().add(dob1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 205, 177, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("CITY");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 274, 120, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("PINCODE");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 342, 100, 30));

        ppp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));
        getContentPane().add(ppp, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 266, 169, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("LICENSE NUMBER");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 150, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("OCCUPATION");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 402, 110, 20));
        getContentPane().add(fnm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 125, 175, 30));
        getContentPane().add(occ, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 394, 177, 30));

        lnm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnmActionPerformed(evt);
            }
        });
        getContentPane().add(lnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 193, 169, 30));

        mob1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mob1ActionPerformed(evt);
            }
        });
        getContentPane().add(mob1, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 336, 169, 30));

        lic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lic1ActionPerformed(evt);
            }
        });
        getContentPane().add(lic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 401, 169, 30));
        getContentPane().add(ema1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 118, 177, 30));

        pp.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        pp.setForeground(new java.awt.Color(255, 0, 0));
        pp.setText("jLabel13");
        getContentPane().add(pp, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 42, 80, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("YOUR PRESONAL DETAILS");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 44, -1, -1));

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 491, -1, -1));

        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 490, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\pratik rathod\\Downloads\\150324_cars-hero-image_1330x742.jpg")); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnmActionPerformed

    private void lic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lic1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lic1ActionPerformed

    private void mob1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mob1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mob1ActionPerformed

    private void cit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cit1ActionPerformed

    private void pin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pin1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.setVisible(false);
        new Customer(temp).setVisible(true); 

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 String vid=fnm1.getText();
           String vnm=lnm.getText();
           String vcp=cit1.getText();
           int set=Integer.parseInt(mob1.getText());
           int air1=Integer.parseInt(lic1.getText());
            String ful1=ema1.getText();
           String tra1=occ.getText();
                 SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
             String dob11=dateFormat.format(dob1.getDate());
          int bas1=Integer.parseInt(pin1.getText()); 
          //  int use1=Integer.parseInt(unm.getText()); 
            String gen1 = ppp.getSelectedItem().toString(); 
//          float cos1=Float.parseFloat(cos.getText());
//          int vtot1=Integer.parseInt(VTOT.getText());
//          int vava1=Integer.parseInt(VAVA.getText());

        try{
                 Connection cn=LoginForm.guicon();
                 PreparedStatement pstmt;
                 String insert="Update person set fname=?,lname=?,Gender=?,mobile_no=?,email=?,dob=?,city=?,pincode=? where Pid=?;";
                 pstmt=cn.prepareStatement(insert);
            pstmt.setString(1,vid);
            pstmt.setString(2,vnm);
            pstmt.setString(3,gen1);
            pstmt.setInt(4,set);
            pstmt.setString(5,ful1);
            pstmt.setString(6,dob11);
             pstmt.setString(7,vcp);
            pstmt.setInt(8,bas1);
            pstmt.setString(9,pid);
//            pstmt.setFloat(8,cos1);
//            pstmt.setInt(9,vtot1);
//            pstmt.setInt(10,vava1);
           // pstmt.setString(11,vid);
            int r=pstmt.executeUpdate();
            System.out.println("Rows affected: "+r);

            
              String insert1="Update customer1 set ID=?,occupation=?  where Pid=?;";
                 pstmt=cn.prepareStatement(insert1);
                  pstmt.setInt(1,air1);
                   pstmt.setString(2,tra1);
                    pstmt.setString(3,pid);
                    int r1=pstmt.executeUpdate();
            System.out.println("Rows affected: "+r1);
                                JOptionPane.showMessageDialog(null,"Your Details Updated Successfully!!!!");

                    this.setVisible(false);
        new Customer(temp).setVisible(true); 
            
        }
        catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        



                                       

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cit1;
    private com.toedter.calendar.JDateChooser dob1;
    private javax.swing.JTextField ema1;
    private javax.swing.JTextField fnm1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lic1;
    private javax.swing.JTextField lnm;
    private javax.swing.JTextField mob1;
    private javax.swing.JTextField occ;
    private javax.swing.JTextField pin1;
    private javax.swing.JLabel pp;
    private javax.swing.JComboBox<String> ppp;
    // End of variables declaration//GEN-END:variables
}
