/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author pratik rathod
 */
public class Driver extends javax.swing.JFrame {

    /**
     * Creates new form Driver
     */
    public Driver() {
            try {
            initComponents();
            DefaultTableModel dm=new DefaultTableModel(new String[]{"Pid","fname","lname","Gender","mobile_no","email","dob","city","pincode","license","join_date","experiance","sal","status","Total_Rides"},0);
            
            Connection cn=LoginForm.guicon();
            PreparedStatement pstmt;
            
            pstmt=cn.prepareStatement("Select * from person,driver where person.Pid=driver.Pid");
            
            ResultSet rs=pstmt.executeQuery();
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
                  int tot1=rs.getInt("total_rides");

                
                //int tot=rs.getInt("total");
                //int ava=rs.getInt("availability");
              
                
                
                Object[] row=new Object[15];
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
                row[14]=tot1;
                
                
                            dm.addRow(row);

            }
            jTable1.setModel(dm);
            //jTable1.set(false);
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        fnm = new javax.swing.JTextField();
        lnm = new javax.swing.JTextField();
        mob = new javax.swing.JTextField();
        ema = new javax.swing.JTextField();
        cit = new javax.swing.JTextField();
        pin = new javax.swing.JTextField();
        lic = new javax.swing.JTextField();
        joi = new javax.swing.JTextField();
        exp = new javax.swing.JTextField();
        sal = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        statu = new javax.swing.JTextField();
        gen = new javax.swing.JTextField();
        dob = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(102, 255, 255));
        jButton1.setText("Add ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1015, 287, 71, -1));

        jButton2.setBackground(new java.awt.Color(102, 255, 255));
        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1157, 287, -1, -1));

        jTable1.setBackground(new java.awt.Color(204, 255, 255));
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 219));

        jButton3.setBackground(new java.awt.Color(102, 255, 255));
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1098, 339, -1, -1));

        jButton4.setBackground(new java.awt.Color(102, 255, 255));
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1078, 428, 104, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 291, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FIRST NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 343, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LAST NAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 395, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("GENDER");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 439, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MOBILE NO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 490, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("EMAIL");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 291, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DOB");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 343, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CITY");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 395, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PINCODE");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 439, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("LICENSE NO");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("JOIN DATE");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 290, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("EXPERIANCE");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 339, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("SALARY");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 389, -1, -1));

        pid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidActionPerformed(evt);
            }
        });
        getContentPane().add(pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 288, 100, -1));

        fnm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnmActionPerformed(evt);
            }
        });
        fnm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fnmKeyTyped(evt);
            }
        });
        getContentPane().add(fnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 340, 100, -1));

        lnm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lnmKeyTyped(evt);
            }
        });
        getContentPane().add(lnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 392, 100, -1));

        mob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobActionPerformed(evt);
            }
        });
        mob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mobKeyTyped(evt);
            }
        });
        getContentPane().add(mob, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 487, 100, -1));
        getContentPane().add(ema, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 288, 100, -1));

        cit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                citKeyTyped(evt);
            }
        });
        getContentPane().add(cit, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 392, 100, -1));

        pin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinActionPerformed(evt);
            }
        });
        pin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pinKeyTyped(evt);
            }
        });
        getContentPane().add(pin, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 436, 100, -1));

        lic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                licKeyTyped(evt);
            }
        });
        getContentPane().add(lic, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 487, 100, -1));
        getContentPane().add(joi, new org.netbeans.lib.awtextra.AbsoluteConstraints(728, 287, 100, -1));

        exp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                expKeyTyped(evt);
            }
        });
        getContentPane().add(exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(728, 336, 100, -1));

        sal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                salKeyTyped(evt);
            }
        });
        getContentPane().add(sal, new org.netbeans.lib.awtextra.AbsoluteConstraints(728, 386, 100, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("STATUS");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 439, -1, -1));

        statu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                statuKeyTyped(evt);
            }
        });
        getContentPane().add(statu, new org.netbeans.lib.awtextra.AbsoluteConstraints(728, 436, 100, -1));

        gen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                genKeyTyped(evt);
            }
        });
        getContentPane().add(gen, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 436, 100, -1));
        getContentPane().add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 342, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("TOTAL RIDES");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 485, 110, 20));

        total.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                totalKeyTyped(evt);
            }
        });
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 480, 100, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\pratik rathod\\Downloads\\PHOTOS\\Dark Blue Background Wallpaper 1920x1080 Dark Blue Background.jpg")); // NOI18N
        jLabel15.setText("jLabel15");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
               String pid1=pid.getText();
               String fnm1=fnm.getText();
               String lnm1=lnm.getText();
               String gen1 = gen.getText();
               int mob1=Integer.parseInt(mob.getText());
               String ema1=ema.getText();
              SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
             String aaa=dateFormat.format(dob.getDate());
               String cit1=cit.getText();
               int pin1=Integer.parseInt(pin.getText());
               int lic1=Integer.parseInt(lic.getText());
               String joi1=joi.getText();
               int exp1=Integer.parseInt(exp.getText());
               int sal1=Integer.parseInt(sal.getText());
                  String stat=statu.getText();
                 int tot2=Integer.parseInt(total.getText());           
    

               String insert="INSERT INTO person VALUES(?,?,?,?,?,?,?,?,?);";
               
   Connection cn = null;
        try{
              
                  cn=LoginForm.guicon();
                  PreparedStatement pstmt;
                  if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", ema.getText()))) 
{
            JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
               // JOptionPane.showMessageDialog(null, "The email is valid", "Good!", JOptionPane.INFORMATION_MESSAGE);

            
                  pstmt=cn.prepareStatement(insert);
          
            
            pstmt.setString(1,pid1);
            pstmt.setString(2,fnm1);
            pstmt.setString(3,lnm1);
            pstmt.setString(4,gen1);
            pstmt.setInt(5,mob1);
            pstmt.setString(6,ema1);
            pstmt.setString(7,aaa);
            pstmt.setString(8,cit1);
            pstmt.setInt(9,pin1);
            
             int r=pstmt.executeUpdate();
            System.out.println("Rows affected: "+r);
            
            String insert2="INSERT INTO driver VALUES(?,?,?,?,?,?,?);";
                            pstmt=cn.prepareStatement(insert2);

            pstmt.setString(1,pid1);
            pstmt.setInt(2,lic1);
            pstmt.setString(3,joi1);
            pstmt.setInt(4,exp1);
            pstmt.setInt(5,sal1);
             pstmt.setString(6,stat);
             pstmt.setInt(7,tot2);
           
            
                   boolean e=pstmt.execute();
            System.out.println("Rows affected: "+e);
            
             JOptionPane.showMessageDialog(null,""+fnm1+" ADDED SUCCESSFULLY");
             this.setVisible(false);
        new Driver().setVisible(true);
            }
                  
           }
        
        catch (SQLException ex) {
                   //try {
                     
                       Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                   //} catch (SQLException ex1) {
                     //  Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex1);
                   //}
        }  
        
         
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        new Admin2().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void pidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pidActionPerformed

    private void pinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinActionPerformed

    private void fnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnmActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            pid.setText((String) jTable1.getValueAt(jTable1.getSelectedRow(),0));
            fnm.setText((String) jTable1.getValueAt(jTable1.getSelectedRow(),1));
            lnm.setText((String) jTable1.getValueAt(jTable1.getSelectedRow(),2));
            gen.setText((String) jTable1.getValueAt(jTable1.getSelectedRow(),3));
            mob.setText( Integer.toString((int) jTable1.getValueAt(jTable1.getSelectedRow(),4)));
            ema.setText((String) jTable1.getValueAt(jTable1.getSelectedRow(),5));
            String da=(String) jTable1.getValueAt(jTable1.getSelectedRow(),6);
            SimpleDateFormat formater=new SimpleDateFormat("yyyy-mm-dd");
            Date d=formater.parse(da);
            dob.setDateFormatString("yyyy-mm-dd");
            dob.setDate(d);
            
            
            
            cit.setText((String) jTable1.getValueAt(jTable1.getSelectedRow(),7));
            pin.setText( Integer.toString((int) jTable1.getValueAt(jTable1.getSelectedRow(),8)));
            lic.setText( Integer.toString((int) jTable1.getValueAt(jTable1.getSelectedRow(),9)));
            joi.setText((String) jTable1.getValueAt(jTable1.getSelectedRow(),10));
            exp.setText( Integer.toString((int) jTable1.getValueAt(jTable1.getSelectedRow(),11)));
            sal.setText( Integer.toString((int) jTable1.getValueAt(jTable1.getSelectedRow(),12)));
            statu.setText((String) jTable1.getValueAt(jTable1.getSelectedRow(),13));
              total.setText( Integer.toString((int) jTable1.getValueAt(jTable1.getSelectedRow(),14)));
        } catch (ParseException ex) {
            Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   String pid1=pid.getText();
               String fnm1=fnm.getText();
               String lnm1=lnm.getText();
               String gen1=gen.getText();
               int mob1=Integer.parseInt(mob.getText());
               String ema1=ema.getText();
              
               SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
             String aaa=dateFormat.format(dob.getDate());
               String cit1=cit.getText();
               int pin1=Integer.parseInt(pin.getText());
               int lic1=Integer.parseInt(lic.getText());
               String joi1=joi.getText();
               int exp1=Integer.parseInt(exp.getText());
               int sal1=Integer.parseInt(sal.getText());
                String stat=statu.getText();
                 int tot3=Integer.parseInt(total.getText());           
    

               String insert="UPDATE person SET fname=?,lname=?,gender=?,mobile_no=?,email=?,dob=?,city=?,pincode=? WHERE Pid=?;";
               

        try{
                 Connection cn=LoginForm.guicon();
                  PreparedStatement pstmt;
                  pstmt=cn.prepareStatement(insert);
               

          //  pstmt.setString(1,pid1);
            pstmt.setString(1,fnm1);
            pstmt.setString(2,lnm1);
            pstmt.setString(3,gen1);
            pstmt.setInt(4,mob1);
            pstmt.setString(5,ema1);
            pstmt.setString(6,aaa);
            pstmt.setString(7,cit1);
            pstmt.setInt(8,pin1);
            pstmt.setString(9,pid1);
            
            int r=pstmt.executeUpdate();
            System.out.println("Rows affected: "+r);
               String insert1="UPDATE driver SET license=?,join_date=?,experiance=?,sal=?,status=?,total_rides=? WHERE Pid=?;";
                            pstmt=cn.prepareStatement(insert1);

           // pstmt.setString(1,pid1);
            pstmt.setInt(1,lic1);
            pstmt.setString(2,joi1);
            pstmt.setInt(3,exp1);
            pstmt.setInt(4,sal1);
                        pstmt.setString(5,stat);
                          pstmt.setInt(6,tot3);
                         pstmt.setString(7,pid1);
                       
            
           
            
            int e=pstmt.executeUpdate();
            System.out.println("Rows affected: "+e);
             JOptionPane.showMessageDialog(null,""+fnm1+"'s Details Updated Successfully ");

        }
        catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }  
        this.setVisible(false);
        new Driver().setVisible(true);   


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                  String pid1=pid.getText();

                 String insert="DELETE FROM person WHERE Pid=?;";
           
              try{
                 Connection cn=LoginForm.guicon();
                  PreparedStatement pstmt;
                  pstmt=cn.prepareStatement(insert);
                  
                  pstmt.setString(1,pid1);             
                 
                     int r=pstmt.executeUpdate();
                  System.out.println("Rows affected: "+r);
               
                                  String insert1="DELETE FROM driver WHERE Pid=?;";
                                                              pstmt=cn.prepareStatement(insert1);

                                  pstmt.setString(1,pid1);

                    int e=pstmt.executeUpdate();
                  System.out.println("Rows affected: "+e);
                   JOptionPane.showMessageDialog(null,""+pid1+"Remoed Sucesfully");
                 }
              catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
               this.setVisible(false);
                new Driver().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void mobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobKeyTyped
  char vchar=evt.getKeyChar();
  if(!(Character.isDigit(vchar)) || (vchar==KeyEvent.VK_BACK_SPACE) || (vchar==KeyEvent.VK_DELETE))
  {
      evt.consume();
  }



    }//GEN-LAST:event_mobKeyTyped

    private void mobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobActionPerformed

    private void pinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pinKeyTyped
char vchar=evt.getKeyChar();
  if(!(Character.isDigit(vchar)) || (vchar==KeyEvent.VK_BACK_SPACE) || (vchar==KeyEvent.VK_DELETE))
  {
      evt.consume();
  }

        // TODO add your handling code here:
    }//GEN-LAST:event_pinKeyTyped

    private void licKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_licKeyTyped
char vchar=evt.getKeyChar();
  if(!(Character.isDigit(vchar)) || (vchar==KeyEvent.VK_BACK_SPACE) || (vchar==KeyEvent.VK_DELETE))
  {
      evt.consume();
  }

        // TODO add your handling code here:
    }//GEN-LAST:event_licKeyTyped

    private void salKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salKeyTyped
char vchar=evt.getKeyChar();
  if(!(Character.isDigit(vchar)) || (vchar==KeyEvent.VK_BACK_SPACE) || (vchar==KeyEvent.VK_DELETE))
  {
      evt.consume();
  }

        // TODO add your handling code here:
    }//GEN-LAST:event_salKeyTyped

    private void expKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_expKeyTyped
char vchar=evt.getKeyChar();
  if(!(Character.isDigit(vchar)) || (vchar==KeyEvent.VK_BACK_SPACE) || (vchar==KeyEvent.VK_DELETE))
  {
      evt.consume();
  }
        // TODO add your handling code here:
    }//GEN-LAST:event_expKeyTyped

    private void fnmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnmKeyTyped
//enter code here
char c=evt.getKeyChar();

    if(!(Character.isAlphabetic(c) ||  (c==KeyEvent.VK_BACK_SPACE)||  c==KeyEvent.VK_DELETE ))
        evt.consume();
//char vchar=evt.getKeyChar();
//  if(!(Character.isDigit(vchar)) || (vchar==KeyEvent.VK_BACK_SPACE) || (vchar==KeyEvent.VK_DELETE))
//  {
//      evt.consume();
//  }

    }//GEN-LAST:event_fnmKeyTyped

    private void lnmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnmKeyTyped

char c=evt.getKeyChar();

    if(!(Character.isAlphabetic(c) ||  (c==KeyEvent.VK_BACK_SPACE)||  c==KeyEvent.VK_DELETE ))
        evt.consume();

    }//GEN-LAST:event_lnmKeyTyped

    private void genKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_genKeyTyped
char c=evt.getKeyChar();

    if(!(Character.isAlphabetic(c) ||  (c==KeyEvent.VK_BACK_SPACE)||  c==KeyEvent.VK_DELETE ))
        evt.consume();
        // TODO add your handling code here:
    }//GEN-LAST:event_genKeyTyped

    private void citKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_citKeyTyped
char c=evt.getKeyChar();

    if(!(Character.isAlphabetic(c) ||  (c==KeyEvent.VK_BACK_SPACE)||  c==KeyEvent.VK_DELETE ))
        evt.consume();
        // TODO add your handling code here:
    }//GEN-LAST:event_citKeyTyped

    private void statuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_statuKeyTyped
char c=evt.getKeyChar();

    if(!(Character.isAlphabetic(c) ||  (c==KeyEvent.VK_BACK_SPACE)||  c==KeyEvent.VK_DELETE ))
        evt.consume();
        // TODO add your handling code here:
    }//GEN-LAST:event_statuKeyTyped

    private void totalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalKeyTyped
char vchar=evt.getKeyChar();
  if(!(Character.isDigit(vchar)) || (vchar==KeyEvent.VK_BACK_SPACE) || (vchar==KeyEvent.VK_DELETE))
  {
      evt.consume();
  }        // TODO add your handling code here:
    }//GEN-LAST:event_totalKeyTyped

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
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Driver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cit;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField ema;
    private javax.swing.JTextField exp;
    private javax.swing.JTextField fnm;
    private javax.swing.JTextField gen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField joi;
    private javax.swing.JTextField lic;
    private javax.swing.JTextField lnm;
    private javax.swing.JTextField mob;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pin;
    private javax.swing.JTextField sal;
    private javax.swing.JTextField statu;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
