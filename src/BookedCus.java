/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import static SelectCar.temp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/**
 *
 * @author pratik rathod
 */
public class BookedCus extends javax.swing.JFrame {

    /**
     * Creates new form Employee
     */
    public BookedCus() {
        String status="NO";
        try {
            initComponents();
            DefaultTableModel dm=new DefaultTableModel(new String[]{"Pid","fname","lname","email","pickUp Date","Drop Date","PickUp Time","Drop Time","PickUp Add","Drop Add","vehicle_name","bill_id","status"},0);
            
            Connection cn=LoginForm.guicon();
            PreparedStatement pstmt;
            
            pstmt=cn.prepareStatement("Select person.Pid,fname,lname,email,fromd,tod,pickup_time,drop_time,pickadd,dropadd,vehicle_name,bill_id,billing1.Pid from person,booking1,vehicle1,billing1 where person.Pid=booking1.Pid AND booking1.vehicle_id=vehicle1.vehicle_id AND booking1.bid=billing1.bid");
            
            ResultSet rs=pstmt.executeQuery();
            while(rs.next())
            {
                String pid1=rs.getString("Pid");
                String fnm1=rs.getString("fname");
                String lnm1=rs.getString("lname");
                String ema1=rs.getString("email");
                String frmd=rs.getString("fromd"); 
                String tod1=rs.getString("tod");
                
                String picti=rs.getString("pickup_time");
                String dropti=rs.getString("drop_time");
                String picadd=rs.getString("pickadd");
                String drpadd=rs.getString("dropadd");
                String vnm=rs.getString("vehicle_name");
                int exp1=rs.getInt("bill_id");
                String status1=rs.getString("billing1.Pid");
                   
                Object[] row=new Object[13];
             
                row[0]=pid1;
                row[1]=fnm1;
                row[2]=lnm1;
                row[3]=ema1;
                row[4]=frmd;
                row[5]=tod1;
                row[6]=picti;
                row[7]=dropti;
                row[8]=picadd;
                row[9]=drpadd;
                row[10]=vnm;
               row[11]=exp1; 
               row[12]=status1;
                            dm.addRow(row);

            }
            jTable1.setModel(dm);
             DefaultTableModel dm1=new DefaultTableModel(new String[]{"Pid","fname","lname","Gender","mobile_no","email","dob","city","pincode","license","join_date","experiance","sal","status"},0);
            
//            Connection cn=LoginForm.guicon();
//            PreparedStatement pstmt;
            
            pstmt=cn.prepareStatement("Select * from person,driver where person.Pid=driver.Pid AND status='Available'");
            
             rs=pstmt.executeQuery();
            while(rs.next())
            {
                String pid1=rs.getString("Pid");
                String fnm1=rs.getString("fname");
                String lnm1=rs.getString("lname");  
                String gen1=rs.getString("Gender"); 
                int mob1=rs.getInt("mobile_no");
                String ema1=rs.getString("email");
                String dob1=rs.getString("dob");
                String cit1=rs.getString("city");
                int pin1=rs.getInt("pincode");
                int lic1=rs.getInt("license");
                String joi1=rs.getString("join_date");
                int exp1=rs.getInt("experiance");
                int sal1=rs.getInt("sal");
                String ava=rs.getString("status");

                
                //int tot=rs.getInt("total");
                //int ava=rs.getInt("availability");
              
                
                
                Object[] row=new Object[14];
               // row[0]=vid;
                row[0]=pid1;
                row[1]=fnm1;
                row[2]=lnm1;
                row[3]=gen1;
                row[4]=mob1;
                row[5]=ema1;
                row[6]=dob1;
                row[7]=cit1;
                row[8]=pin1;
                row[9]=lic1;
                row[10]=joi1;
                row[11]=exp1;
                row[12]=sal1;
                row[13]=ava;
                
                
                            dm1.addRow(row);

            }
            jTable2.setModel(dm1);
        } catch (SQLException ex) {
            Logger.getLogger(Vehicle1.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        bill = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        dri = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cus = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        mon = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        ppp = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Vehicle Id", "Total", "Availbility", "Company", "Color", "Capicity", "Vehicle Name"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 1260, 186));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BILLING ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 610, -1, 20));

        bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billActionPerformed(evt);
            }
        });
        getContentPane().add(bill, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 610, 83, 30));

        jButton1.setText("ASSIGN DRIVER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 580, 120, 30));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Vehicle Id", "Total", "Availbility", "Company", "Color", "Capicity", "Vehicle Name"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 1250, 186));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DRIVER ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, -1, 30));

        dri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driActionPerformed(evt);
            }
        });
        getContentPane().add(dri, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 570, 83, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CUSTOMER:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 670, -1, 20));

        cus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusActionPerformed(evt);
            }
        });
        getContentPane().add(cus, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 670, 83, -1));

        jButton2.setText("MAIL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 660, 109, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("CUSTOMERS BOOKING DETAILS::");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 250, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("CHOOSE DRIVER FOR CUSTOMER::");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 660, 120, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Higgest Booking Month:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 570, -1, 20));
        getContentPane().add(mon, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 610, 90, -1));

        jButton4.setText("CLICK HERE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 660, -1, -1));

        ppp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        getContentPane().add(ppp, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 570, 90, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Number Of Booking");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 610, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\pratik rathod\\Downloads\\PHOTOS\\Dark Blue Background Wallpaper 1920x1080 Dark Blue Background.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1340, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked


   bill.setText( Integer.toString((int) jTable1.getValueAt(jTable1.getSelectedRow(),11)));
     cus.setText((String) jTable1.getValueAt(jTable1.getSelectedRow(),0));
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

   

        dri.setText((String) jTable2.getValueAt(jTable2.getSelectedRow(),0));

    }//GEN-LAST:event_jTable2MouseClicked

    private void driActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_driActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        String did=dri.getText();
           int set=Integer.parseInt(bill.getText());
         String insert2="select count(bid) from billing1 where";
    
 Connection cn = null;
        try{
              
                  cn=LoginForm.guicon();
                  PreparedStatement pstmt;
                  String insert="update billing1 set Pid=? where bill_id=?";
                  pstmt=cn.prepareStatement(insert);
                  pstmt.setString(1,did);
              pstmt.setInt(2,set);
                int r=pstmt.executeUpdate();
        System.out.println("Rows affected: "+r);
        
        String insert1="update driver set status='Unavailable' where Pid=?";
                  pstmt=cn.prepareStatement(insert1);
                  pstmt.setString(1,did); 
                      int r1=pstmt.executeUpdate();
        System.out.println("Rows affected: "+r1);
         JOptionPane.showMessageDialog(null,"Driver Succesfully Assign To customer");
         dri.setEditable(false);
          bill.setEditable(false);
         this.setVisible(false);
                        new BookedCus().setVisible(true);
       
        
        }
         catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }  
        

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 String did=bill.getText();
 String did1=null;
 
 String p=null;
 String p1=null;
 System.out.println("hello");
           String fnm=null;
           String fnm1=null;
           String gen=null;
                   String lnm=null;
                    String lnm1=null;
                  String car=null;
                  String pas=null;
                   String pic=null;
                   String drp=null;
                   String drpt=null;
                   String pict=null;
                   String vid=null;
                   String vname=null;
                   int bprice=0;
                   int mob;
                   String PID1=null;
 try{
  Connection cn=null;
              cn=LoginForm.guicon();
              PreparedStatement pstmt;
              String insert2="SELECT *FROM billing1;";
              pstmt=cn.prepareStatement(insert2);  
              ResultSet rs=pstmt.executeQuery();
               while(rs.next())
                 {    
                     String mail=rs.getString("bill_id");
                     
                     if(bill.getText().equals(mail))
                         { 
                             p = rs.getString("bid");
                             System.out.println(p);
                                p1 = rs.getString("Pid");
                             System.out.println(p1);
                              
                         }
                         
               
                 }
                String insert1="SELECT *FROM booking1 where bid=?;";
               pstmt=cn.prepareStatement(insert1);  
                pstmt.setString(1,p);
               rs=pstmt.executeQuery();
                 while(rs.next())
                 {    

                     pas=rs.getString("fromd");
                    System.out.print(pas);
                      car=rs.getString("tod");
                    System.out.print(car);
                    pict=rs.getString("pickup_time");
                    System.out.print(pict);
                     drpt=rs.getString("drop_time");
                    System.out.print(drpt);
                     pic=rs.getString("pickadd");
                    System.out.print(pic);
                     drp=rs.getString("dropadd");
                    System.out.print(drp);
                     vid=rs.getString("vehicle_id");
                      System.out.print(vid);
                     PID1=rs.getString("Pid");
                      System.out.print(PID1);
                     
                     
                         
               
                 }
                   String insert3="SELECT *FROM vehicle1 where vehicle_id=?;";
               pstmt=cn.prepareStatement(insert3);  
                pstmt.setString(1,vid);
               rs=pstmt.executeQuery();
                 while(rs.next())
                 {

                     vname=rs.getString("vehicle_name");
                      System.out.print(vname);
                    bprice=rs.getInt("base_price");
                  System.out.print(bprice);
                  
                 }
                 String insert4="SELECT *FROM person where Pid=?;";
               pstmt=cn.prepareStatement(insert4);  
                pstmt.setString(1,PID1);
               rs=pstmt.executeQuery();
                 while(rs.next())
                 {    
                       fnm=rs.getString("fname");
                      System.out.print(fnm);
                       lnm=rs.getString("lname");
                      System.out.print(lnm);
                      did1=rs.getString("email");
                      System.out.print(did1);
                 }
               
                 String insert5="SELECT *FROM person where Pid=?;";
               pstmt=cn.prepareStatement(insert5);  
                pstmt.setString(1,p1);
               rs=pstmt.executeQuery();
                 while(rs.next())
                 {    
                       fnm1=rs.getString("fname");
                      System.out.print(fnm);
                       lnm1=rs.getString("lname");
                      System.out.print(lnm);
                      mob=rs.getInt("mobile_no");
                      System.out.print(mob);
                      gen=rs.getString("Gender");
                      System.out.print(gen);
                 }
 }
 catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }  
 Properties prop=new Properties();
        prop.put("mail.smtp.host","smtp.gmail.com");
        prop.put("mail.smtp.socketFactory.port","465");
         prop.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
          prop.put("mail.smtp.auth","true");
           prop.put("mail.smtp.port","465");
           
           Session sess=Session.getDefaultInstance(prop,
                   new javax.mail.Authenticator()
                   {
                    protected PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication("rathodpratik557@gmail.com","942216672725");
                    }
                   }
           );
           
           try{
               Message mess=new MimeMessage(sess);
               mess.setFrom(new InternetAddress("rathodpratik557@gmail.com"));
               mess.setRecipients(Message.RecipientType.TO, InternetAddress.parse(did1));
               mess.setSubject("OS RECEIPTS");
               mess.setText("THANKS" + fnm + lnm + "For Booking");
               mess.setText("Your PickUp Date:" + pas);
               mess.setText("Your Drop Date:" + car);
               mess.setText("Your PicUp Time:" + pict);
               mess.setText("Your Drop Time:" + drpt);
               mess.setText("Your PickUp Address:" + pic);
               mess.setText("Your Drop Address:" + drp);
               mess.setText("Your Vehicle Name:" + vname);
               mess.setText("Your Drop Date:" + bprice);
               mess.setText("THANKS :" + fnm +"  "+ lnm + " For Booking!!! " +" \n\n"+ "Your PickUp Date: " + pas+"\n\n"+"Your Drop Date: " + car+"\n\n"+"Your PicUp Time: " + pict+"\n\n"+"Your Drop Time: " + drpt+"\n\n"+"Your PickUp Address: " + pic+"\n\n"+"Your Drop Address: " + drp + "\n\n" + "Your Vehicle Name: " + vname + "\n\n"+"Your Paid Amount:" + bprice+ "\n" + "Your Driver Name: " + fnm1 +"  " +  lnm1);
               //mess.setText("Driver's Mobile Number:" + mob);
               Transport.send(mess);
               JOptionPane.showMessageDialog(null,"MAIL SEND SUCCESSFULLY");
               
           } 
         catch (Exception e) {
                    JOptionPane.showMessageDialog(null,e);
            }
           
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  this.setVisible(false);
        new Admin2().setVisible(true);   

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 
                   String value = ppp.getSelectedItem().toString(); 
String bide=null;
        Connection cn=LoginForm.guicon();
        try{
              
                  cn=LoginForm.guicon();
                  PreparedStatement pstmt;
                  String insert="select count(bill_id) from billing1 where curdate between'2017-"+value+"-01' AND '2017-"+value+"-31';";
                  pstmt=cn.prepareStatement(insert);
          
           // System.out.println(value);
//            pstmt.setString(1,value);
//            pstmt.setString(2,value);
            //int r=pstmt.executeUpdate();
        //System.out.println("Rows affected: "+r);
             //pstmt=cn.prepareStatement(insert);
            ResultSet rs=pstmt.executeQuery();
            while(rs.next())
            {
                    bide=rs.getString("count(bill_id)");
    
            }
              mon.setText(bide);
             
         mon.setEditable(false);
 }
  catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } 
 

    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(BookedCus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookedCus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookedCus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookedCus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookedCus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bill;
    private javax.swing.JTextField cus;
    private javax.swing.JTextField dri;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField mon;
    private javax.swing.JComboBox<String> ppp;
    // End of variables declaration//GEN-END:variables
}
