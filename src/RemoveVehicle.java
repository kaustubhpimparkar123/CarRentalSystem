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
 *
 * @author pratik rathod
 */
public class RemoveVehicle extends javax.swing.JFrame {

    /**
     * Creates new form Addvehicle
     */
    public RemoveVehicle() {
         try {
            initComponents();
                VTOT.setEditable(false);
                 VTOT.setEnabled(false);
                  AVA.setEditable(false);
                 AVA.setEnabled(false);
            DefaultTableModel dm=new DefaultTableModel(new String[]{"Vehicle Id","Vehicle Name","Vehicle Company","Seater","Air Bag","Fule Type","Transmission","Base Price","Cost Per KM","Total","Availability"},0);
            
            Connection cn=LoginForm.guicon();
            PreparedStatement pstmt;
            
            pstmt=cn.prepareStatement("Select * from Vehicle1");
            
            ResultSet rs=pstmt.executeQuery();
            while(rs.next())
            {
                String vid=rs.getString("vehicle_id");
                String vehinm=rs.getString("vehicle_name");
                String comp=rs.getString("vehicle_company");  
                int set=rs.getInt("seater");
                int air=rs.getInt("air_bag");
                String ful=rs.getString("fule_type");
                String tra=rs.getString("tranmission");
                int bas=rs.getInt("base_price");
                float cos1=rs.getFloat("costkm");
                int tot=rs.getInt("total");
                int ava=rs.getInt("availability");
              
                
                
                Object[] row=new Object[11];
                row[0]=vid;
                row[1]=vehinm;
                row[2]=comp;
                row[3]=set;
                row[4]=air;
                row[5]=ful;
                row[6]=tra;
                row[7]=bas;
                row[8]=cos1;
                row[9]=tot;
                row[10]=ava;
             
              
                
                
                            dm.addRow(row);

            }
            jTable1.setModel(dm);
        } catch (SQLException ex) {
            Logger.getLogger(Vehicle1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        VID = new javax.swing.JTextField();
        VNM = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        count = new javax.swing.JLabel();
        spin = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        VTOT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        AVA = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vehicle ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 113, 90, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Vehicle Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 160, -1, -1));

        VID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VIDActionPerformed(evt);
            }
        });
        getContentPane().add(VID, new org.netbeans.lib.awtextra.AbsoluteConstraints(779, 110, 138, -1));
        getContentPane().add(VNM, new org.netbeans.lib.awtextra.AbsoluteConstraints(779, 157, 138, -1));

        jButton1.setText("Remove");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 422, -1, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 64, 541, 391));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 420, 91, -1));

        count.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        count.setForeground(new java.awt.Color(255, 255, 255));
        count.setText("Number Of Quantity");
        getContentPane().add(count, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 288, -1, 20));
        getContentPane().add(spin, new org.netbeans.lib.awtextra.AbsoluteConstraints(779, 288, 138, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 207, -1, -1));
        getContentPane().add(VTOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(779, 204, 138, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Availbility");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 253, -1, -1));

        AVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AVAActionPerformed(evt);
            }
        });
        getContentPane().add(AVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(779, 250, 138, -1));

        jButton4.setText("SEARCH");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("REMOVE VEHICLE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\pratik rathod\\Downloads\\PHOTOS\\Dark Blue Background Wallpaper 1920x1080 Dark Blue Background.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                 
                 String v_id=VID.getText();
                 String vvnm=VNM.getText(); 
                 int tot=Integer.parseInt(VTOT.getText());
                  int ava1=Integer.parseInt(AVA.getText());

//                 VTOT.setEditable(false);
//                 VTOT.setEnabled(false);
//                  AVA.setEditable(false);
//                 AVA.setEnabled(false);
                // int vc=Integer.parseInt(vcount.getText());

                 int value = (Integer) spin.getValue();
                 
               // String insert="DELETE FROM vehicle WHERE vehicle_id=? AND vehicle_name=? AND total=availbility;";
                String insert3="Update vehicle1 set total=total-?,availability=0 WHERE vehicle_id=?;";

              try{
               if(value>0){   
                 Connection cn=LoginForm.guicon();
                  PreparedStatement pstmt;
                  if(value==ava1)
                  {
                  pstmt=cn.prepareStatement(insert3);
                  
                   pstmt.setInt(1,value);
                  pstmt.setString(2, v_id);             
                 // pstmt.setString(2,vvnm);
                  
                  int r=pstmt.executeUpdate();
                  System.out.println("Rows affected: "+r);
                  }
                 
                  
                  
                String insert1="Update vehicle1 set total=total-?,availability=availability-? WHERE vehicle_id=? AND availability>? AND total>?;";

                  
                   pstmt=cn.prepareStatement(insert1);
                  pstmt.setInt(1,value);
                  pstmt.setInt(2,value);
                  pstmt.setString(3,v_id);
                  pstmt.setInt(4,value);
                  pstmt.setInt(5,value);

                  
                  int r=pstmt.executeUpdate();
                  System.out.println("Rows affected: "+r);
                  
                   JOptionPane.showMessageDialog(null,+value+ "  Vehicle Removed From " +vvnm+ "");
               }
               
               else{
                   JOptionPane.showMessageDialog(null,"Number Of Quantity Must Be Greater Than Zero");
               }
                 }
              catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
               this.setVisible(false);
                new RemoveVehicle().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         this.setVisible(false);
                new Vehicle1().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
   
         VID.setText((String) jTable1.getValueAt(jTable1.getSelectedRow(),0));
       VNM.setText((String) jTable1.getValueAt(jTable1.getSelectedRow(),1));
       
         VTOT.setText( Integer.toString((int) jTable1.getValueAt(jTable1.getSelectedRow(),9)));
         AVA.setText( Integer.toString((int) jTable1.getValueAt(jTable1.getSelectedRow(),10)));

    }//GEN-LAST:event_jTable1MouseClicked

    private void VIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VIDActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      String sea=VNM.getText();
     
            Connection cn=LoginForm.guicon();
        try{
         
          PreparedStatement pstmt;
            String insert="SELECT * FROM vehicle1 WHERE vehicle_name=?";
            pstmt=cn.prepareStatement(insert);
              pstmt.setString(1,sea);
            
            ResultSet rs=pstmt.executeQuery();
            rs=pstmt.executeQuery();
            while(rs.next())
            {
                String name=rs.getString("vehicle_name");
                if(VNM.getText().equals(name))
                {
                    
                    VID.setText(rs.getString("vehicle_id"));
//                    VNAME.setText(rs.getString("vehicle_name"));
//                    VCOMP.setText(rs.getString("vehicle_company"));
//                    vse.setText(rs.getString("seater"));
//                    air.setText(rs.getString("air_bag"));
//                    ful.setText(rs.getString("fule_type"));
//                    tra.setText(rs.getString("tranmission"));
//                    bas.setText(rs.getString("base_price"));
//                    cos.setText(rs.getString("costkm"));
                    VTOT.setText(rs.getString("total"));
                    AVA.setText(rs.getString("availability"));
                    
                }
            }
        }
        
        catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } 

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void AVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AVAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AVAActionPerformed

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
            java.util.logging.Logger.getLogger(RemoveVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveVehicle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AVA;
    private javax.swing.JTextField VID;
    private javax.swing.JTextField VNM;
    private javax.swing.JTextField VTOT;
    private javax.swing.JLabel count;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JSpinner spin;
    // End of variables declaration//GEN-END:variables
}
