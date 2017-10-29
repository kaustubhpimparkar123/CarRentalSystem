
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *6
 * @author pratik rathod
 */
public class SelectCar extends javax.swing.JFrame {

    /**
     * Creates new form SelectCar
     */
    public static String temp;
     public static String temp1;
    public SelectCar() {
         initComponents();
           this.setSize(977,650);
         
         try {
          
         
    
      // jLabel4.setText("ppp");
       System.out.println("hello");
            DefaultTableModel dm=new DefaultTableModel(new String[]{"Vehicle Name","Vehicle Company","Seater","Air Bag","Fule Type","Transmission","Base Price","Cost Per KM"},0);
            
            Connection cn=LoginForm.guicon();
            PreparedStatement pstmt;
            
            pstmt=cn.prepareStatement("Select * from Vehicle1 where availability>0");
            
            ResultSet rs=pstmt.executeQuery();
            while(rs.next())
            {
                //String vid=rs.getString("vehicle_id");
                String vehinm=rs.getString("vehicle_name");
                String comp=rs.getString("vehicle_company");  
                int set=rs.getInt("seater");
                int air=rs.getInt("air_bag");
                String ful=rs.getString("fule_type");
                String tra=rs.getString("tranmission");
                int bas=rs.getInt("base_price");
                float cos1=rs.getFloat("costkm");
                //int tot=rs.getInt("total");
                //int ava=rs.getInt("availability");
              
                
                
                Object[] row=new Object[11];
               // row[0]=vid;
                row[0]=vehinm;
                row[1]=comp;
                row[2]=set;
                row[3]=air;
                row[4]=ful;
                row[5]=tra;
                row[6]=bas;
                row[7]=cos1;
               // row[9]=tot;
                //row[10]=ava;
                 dm.addRow(row);
                  jLabel4.setText(temp);
            }
             jTable1.setModel(dm);
    }
            
           
            
         catch (SQLException ex) {
            Logger.getLogger(Vehicle1.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
         
         
    }
    public SelectCar(String para,String para1) {
        
         initComponents();
        temp=para;
        temp1=para1;
        jLabel4.setText(temp);
         this.setSize(977,650);
          vnm.setEditable(false);
           vcomp.setEditable(false);
         
         try {
          
         
    
       
       System.out.println("hello");
            DefaultTableModel dm=new DefaultTableModel(new String[]{"Vehicle Name","Vehicle Company","Seater","Air Bag","Fule Type","Transmission","Base Price","Cost Per KM"},0);
            
            Connection cn=LoginForm.guicon();
            PreparedStatement pstmt;
            
            pstmt=cn.prepareStatement("Select * from Vehicle1 where availability>0");
            
            ResultSet rs=pstmt.executeQuery();
            while(rs.next())
            {
                //String vid=rs.getString("vehicle_id");
                String vehinm=rs.getString("vehicle_name");
                String comp=rs.getString("vehicle_company");  
                int set=rs.getInt("seater");
                int air=rs.getInt("air_bag");
                String ful=rs.getString("fule_type");
                String tra=rs.getString("tranmission");
                int bas=rs.getInt("base_price");
                float cos1=rs.getFloat("costkm");
                //int tot=rs.getInt("total");
                //int ava=rs.getInt("availability");
              
                
                
                Object[] row=new Object[11];
               // row[0]=vid;
                row[0]=vehinm;
                row[1]=comp;
                row[2]=set;
                row[3]=air;
                row[4]=ful;
                row[5]=tra;
                row[6]=bas;
                row[7]=cos1;
               // row[9]=tot;
                //row[10]=ava;
                 dm.addRow(row);
                  jLabel4.setText(temp);
            }
             jTable1.setModel(dm);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        vnm = new javax.swing.JTextField();
        vcomp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 554, 256));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 103, -1));

        jButton3.setText("RESET");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 420, 105, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Car Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 240, 70, 20));

        vnm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vnmActionPerformed(evt);
            }
        });
        getContentPane().add(vnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 240, 85, -1));
        getContentPane().add(vcomp, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 85, -1));

        jButton1.setText("PAYMENT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 268, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Booking-ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 190, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Car Company");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("SELECT YOUR CAR!!!");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\pratik rathod\\Downloads\\PHOTOS\\Dark Blue Background Wallpaper 1920x1080 Dark Blue Background.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        this.setVisible(false); 
        new BookVehicle(temp1).setVisible(true);
       
             }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
// VID.setText((String) jTable1.getValueAt(jTable1.getSelectedRow(),0));
        vnm.setText((String) jTable1.getValueAt(jTable1.getSelectedRow(),0));
        vcomp.setText((String) jTable1.getValueAt(jTable1.getSelectedRow(),1));
//         // VCOLOR.setText((String) jTable1.getValueAt(jTable1.getSelectedRow(),4));
//         vse.setText( Integer.toString((int) jTable1.getValueAt(jTable1.getSelectedRow(),3)));
//         air.setText( Integer.toString((int) jTable1.getValueAt(jTable1.getSelectedRow(),4)));
//         ful.setText((String) jTable1.getValueAt(jTable1.getSelectedRow(),5));
//         tra.setText((String) jTable1.getValueAt(jTable1.getSelectedRow(),6));
//         bas.setText( Integer.toString((int) jTable1.getValueAt(jTable1.getSelectedRow(),7)));
//         cos.setText( Float.toString((float) jTable1.getValueAt(jTable1.getSelectedRow(),8)));
//         VTOT.setText( Integer.toString((int) jTable1.getValueAt(jTable1.getSelectedRow(),9)));
//         VAVA.setText( Integer.toString((int) jTable1.getValueAt(jTable1.getSelectedRow(),10)));
//



    }//GEN-LAST:event_jTable1MouseClicked

    private void vnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vnmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vnmActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

     String vnm1 =vnm.getText();
     String vcomp1 =vcomp.getText();
     String insert2="select *from vehicle1"; 
     String p=null;
     try{
              Connection cn=null;
              cn=LoginForm.guicon();
              PreparedStatement pstmt;
              pstmt=cn.prepareStatement(insert2);  
              ResultSet rs=pstmt.executeQuery();
               while(rs.next())
                 {    
                     String mail=rs.getString("vehicle_name");
                     
                     if(vnm.getText().equals(mail))
                         { 
                             p = rs.getString("vehicle_id");
                             System.out.println(p);
                              
                         }
                         
               
                 }
               
              String insert1="update booking1 set vehicle_id=? where bid=?";
              pstmt=cn.prepareStatement(insert1);        
              pstmt.setString(1,p);
              pstmt.setString(2,temp);
                int r=pstmt.executeUpdate();
        System.out.println("Rows affected: "+r);
         JOptionPane.showMessageDialog(null,"Selection Is Done");
     
        this.setVisible(false); 
        new Payment(temp,vnm1,temp1).setVisible(true);
     }
catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    
     
     
    
     
     
     
     
     
     
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SelectCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField vcomp;
    private javax.swing.JTextField vnm;
    // End of variables declaration//GEN-END:variables
}
