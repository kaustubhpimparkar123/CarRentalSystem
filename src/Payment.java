

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.io.FileOutputStream;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.sql.*;
import java.lang.String;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Document;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pratik rathod
 */
public class Payment extends javax.swing.JFrame {

    /**
     * Creates new form Payment
     */ String bid11=null;
     String email1=null;
      public static String temp1;
     public static String temp;
     public static String temp2;
    public Payment() {
         
            initComponents();
            
            
            //String insert="select distinct fname,lname,fromd,tod,picup_time,drop_time,picadd,dropadd,base_price from person,booking1,vehicle1 where person.Pid=booking1.Pid AND booking1.vehicl1_id=vehicle1.vehicle_id";
            Connection cn;
             try{
        cn=LoginForm.guicon();
                         String book=null;
                   String to=null;
                  String car=null;
                  String pas=null;
                   String pic=null;
                   String drp=null;
                   String drpt=null;
                   String pict=null;
                   String vname=null;
                   String email1=null;
                        
                   int vprice=0;
            PreparedStatement pstmt;
            String insert="select distinct bid,fname,lname,email,fromd,tod,pickup_time,drop_time,pickadd,dropadd,vehicle_name,base_price from person,booking1,vehicle1 where bid=?";
            pstmt=cn.prepareStatement(insert);
            pstmt.setString(1,temp);
            ResultSet rs=pstmt.executeQuery();
            rs=pstmt.executeQuery();
           
                   
           
                 while(rs.next())
                    {    
                        bid11=rs.getString("bid");
                         System.out.print(bid11);
                           email1=rs.getString("email");
                         //System.out.print(bid11);
                      book=rs.getString("fname");
                    System.out.print(book);
                     to=rs.getString("lname");
                    System.out.print(to);
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
                    vname=rs.getString("vehicle_name");
                    System.out.print(vname);
                    vprice=rs.getInt("base_price");
                    System.out.print(vprice);
                    }
                      haha.setText(bid11);
                         vnm.setText(book);
                         lnm.setText(to);
                         fr.setText(pas);
                         t1.setText(car);
                         picti.setText(pict);
                         dropti.setText(drpt);
                         picu.setText(pic);
                         drop.setText(drp);
                         name.setText(vname);
                       amount.setText(Integer.toString(vprice));

    }
    catch (SQLException ex) {
            Logger.getLogger(Vehicle1.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
     public Payment(String para,String para1,String para2) {
         
            initComponents();
            temp=para;
        haha.setText(temp);
        
            temp1=para1;
        name.setText(temp1);  
           temp2=para2;
           
            Connection cn;
             try{
        cn=LoginForm.guicon();
                         String book=null;
                   String to=null;
                  String car=null;
                  String pas=null;
                   String pic=null;
                   String drp=null;
                   String drpt=null;
                   String pict=null;
                   String vname=null;
                 //  String email1=null;
                        
                   int vprice=0;
            PreparedStatement pstmt;
            String insert="select distinct booking1.pid,bid,fname,lname,email,fromd,tod,pickup_time,drop_time,pickadd,dropadd,vehicle_name,base_price from person,booking1,vehicle1 where bid=?";
            pstmt=cn.prepareStatement(insert);
            pstmt.setString(1,temp);
            ResultSet rs=pstmt.executeQuery();
            rs=pstmt.executeQuery();
           
                   
           
                 while(rs.next())
                    {    
//                        bid11=rs.getString("bid");
//                         String bi=rs.getString("booking1.pid");
//                         System.out.print(bi);
//                         email1=rs.getString("email");
//                      book=rs.getString("fname");
//                    System.out.print(book);
//                     to=rs.getString("lname");
//                    System.out.print(to);
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
                    vname=rs.getString("vehicle_name");
                    System.out.print(vname);
                    vprice=rs.getInt("base_price");
                    System.out.print(vprice);
                           System.out.print(temp2);
                    }
                 
                 String insert2="select *from person where email=?";
                 pstmt=cn.prepareStatement(insert2);
            pstmt.setString(1,temp2);
            rs=pstmt.executeQuery();
                   System.out.print("hello");
                  while(rs.next())
                 {
                            System.out.print("hello");
                      book=rs.getString("fname");
                      System.out.print(book);
                      to=rs.getString("lname");
                     System.out.print(to);
                     
                 }
                     
                         vnm.setText(book);
                         lnm.setText(to);
                         fr.setText(pas);
                         t1.setText(car);
                         picti.setText(pict);
                         dropti.setText(drpt);
                         picu.setText(pic);
                         drop.setText(drp);
                        // name.setText(vname);
                       amount.setText(Integer.toString(vprice));

    }
    catch (SQLException ex) {
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

        ppp = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        vnm = new javax.swing.JLabel();
        fr = new javax.swing.JLabel();
        t1 = new javax.swing.JLabel();
        picti = new javax.swing.JLabel();
        dropti = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        picu = new javax.swing.JLabel();
        drop = new javax.swing.JLabel();
        amount = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lnm = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        haha = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ppp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Debit Card", "Credit Card", "Cash", "Payapl" }));
        ppp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pppActionPerformed(evt);
            }
        });
        getContentPane().add(ppp, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Choose Method Of Payment  :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 200, -1));

        jButton1.setText("DONE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 111, -1));

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 79, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Amount To Pay");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 140, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 70, 50, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("From");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 172, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("To");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 237, 70, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PickUp Time");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 291, 80, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Drop Time");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 345, 70, -1));

        vnm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        vnm.setForeground(new java.awt.Color(255, 255, 255));
        vnm.setText("jLabel8");
        getContentPane().add(vnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 70, 103, -1));

        fr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fr.setForeground(new java.awt.Color(255, 255, 255));
        fr.setText("jLabel9");
        getContentPane().add(fr, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 172, 103, -1));

        t1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t1.setForeground(new java.awt.Color(255, 255, 255));
        t1.setText("jLabel10");
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 237, 103, -1));

        picti.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        picti.setForeground(new java.awt.Color(255, 255, 255));
        picti.setText("jLabel11");
        getContentPane().add(picti, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 291, 103, -1));

        dropti.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dropti.setForeground(new java.awt.Color(255, 255, 255));
        dropti.setText("jLabel12");
        getContentPane().add(dropti, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 345, 103, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("PickUp");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 392, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Drop");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 429, 60, -1));

        picu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        picu.setForeground(new java.awt.Color(255, 255, 255));
        picu.setText("jLabel15");
        getContentPane().add(picu, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 392, 218, -1));

        drop.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        drop.setForeground(new java.awt.Color(255, 255, 255));
        drop.setText("jLabel16");
        getContentPane().add(drop, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 429, 218, -1));

        amount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        amount.setForeground(new java.awt.Color(255, 255, 255));
        amount.setText("jLabel8");
        getContentPane().add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(686, 113, 96, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Last Name");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 113, -1, -1));

        lnm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lnm.setForeground(new java.awt.Color(255, 255, 255));
        lnm.setText("jLabel15");
        getContentPane().add(lnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 113, 103, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Vehicle Name");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, -1, 20));

        name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("jLabel16");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(686, 70, 96, -1));

        haha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        haha.setForeground(new java.awt.Color(255, 255, 255));
        haha.setText("jLabel9");
        getContentPane().add(haha, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, 140, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Your Booking ID");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("RENTAL DETAILS");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\pratik rathod\\Downloads\\PHOTOS\\Dark Blue Background Wallpaper 1920x1080 Dark Blue Background.jpg")); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pppActionPerformed

         // payment.setText((String) jComboBox1.getSelectedItem().toString());


    }//GEN-LAST:event_pppActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


        
          
           String value = ppp.getSelectedItem().toString(); 
           System.out.print(value);
            String insert="select *from vehicle1 where vehicle_name=?;";
           
       
        try{
            
                 Connection cn=LoginForm.guicon();
                  PreparedStatement pstmt;
                  pstmt=cn.prepareStatement(insert);
                  pstmt.setString(1,temp1);
                  ResultSet rs=pstmt.executeQuery();
                               
                  String mail=null;
                  while(rs.next())
                 {    
                     String name12=rs.getString("vehicle_name");
                     if(name.getText().equals(name12))
                     {
                      mail=rs.getString("vehicle_id");
                     System.out.print(mail);
                     }
                 }
                  
                  String date1="select now()";
                   pstmt=cn.prepareStatement(date1);
                   rs=pstmt.executeQuery();
                       String date=null;
                  while(rs.next())
                 {    
                      date=rs.getString("now()");
                     System.out.print(date);
                    
                 }
                 String insert3="INSERT INTO billing1 (vehicle_id,bid,Pid,method,curdate) VALUES(?,?,?,?,?);";  
        pstmt=cn.prepareStatement(insert3);
            pstmt.setString(1,mail);
            pstmt.setString(2,temp);
             System.out.print(bid11);
            pstmt.setString(3,null);
            pstmt.setString(4,value);
            pstmt.setString(5,date);
            
                 int r=pstmt.executeUpdate();
        System.out.println("Rows affected: "+r);
            
        
         String insert2="update vehicle1 set availability=availability-1 where vehicle_id=?";
                pstmt=cn.prepareStatement(insert2);
                pstmt.setString(1,mail); 
                
    int w=pstmt.executeUpdate();
        System.out.println("Rows affected: "+w);
            
              
//            int r=pstmt.executeUpdate();
//            System.out.println("Rows affected: "+r);


//   Document document=new Document();
//   pdfWriter.getInstance(document,new FileOutputStream("d:/hello.pdf"));
//   document.add(new paragraph("Example"));
//   document.close();
                    JOptionPane.showMessageDialog(null,"YOur Booking Is Confirm");

this.setVisible(false);
        new Customer(temp2).setVisible(true); 
        }
        catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }  
        //this.setVisible(false);
        //new ().setVisible(true);   
      
//           this.setVisible(false);
//            new Card().setVisible(true);
//       

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.setVisible(false);
        new SelectCar().setVisible(true); 

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amount;
    private javax.swing.JLabel drop;
    private javax.swing.JLabel dropti;
    private javax.swing.JLabel fr;
    private javax.swing.JLabel haha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lnm;
    private javax.swing.JLabel name;
    private javax.swing.JLabel picti;
    private javax.swing.JLabel picu;
    private javax.swing.JComboBox<String> ppp;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel vnm;
    // End of variables declaration//GEN-END:variables
}
