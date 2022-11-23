/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package travel_safe;

import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author SHEHARA
 *
 */

public class Arr_tour_guide extends javax.swing.JFrame {
    
     int positionX = 0, positionY = 0;
     
    /**
     * Creates new form manager menu
     */
     
    public Arr_tour_guide() {
        
        setUndecorated(true);
        initComponents();
        Fillcombo();
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 50, 50)) ;
    }
    
    
    private void Fillcombo(){
    
        try {
        
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost/travelsafe","root","");
           String sql = "select * from tour ";
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet rs = pst.executeQuery();
        
           while(rs.next()) {
           
           String tourID = rs.getString("tourID");
           id.addItem(tourID);
           
           }
       
        } catch( ClassNotFoundException | SQLException ex){
        
          JOptionPane.showMessageDialog(null, ex);
     
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        guide = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        loca = new javax.swing.JComboBox<>();
        id = new javax.swing.JComboBox<>();
        stat = new javax.swing.JLabel();
        loca1 = new javax.swing.JComboBox<>();
        loca2 = new javax.swing.JComboBox<>();
        loca3 = new javax.swing.JComboBox<>();
        loca4 = new javax.swing.JComboBox<>();
        guide1 = new javax.swing.JComboBox<>();
        guide2 = new javax.swing.JComboBox<>();
        guide3 = new javax.swing.JComboBox<>();
        guide4 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(380, 215, 1100, 650));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 165, 247));

        jPanel2.setBackground(new java.awt.Color(0, 0, 26));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("www.travelsafe.com");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/29-290936_location-clipart-travel-tourism-world-travel-logo-png (1).png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 165, 247));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        jButton1.setText("ARRANGE TOUR");
        jButton1.setBorder(null);
        jButton1.setFocusable(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 165, 247));
        jButton7.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        jButton7.setText("LOG OUT");
        jButton7.setBorder(null);
        jButton7.setFocusable(false);
        jButton7.setPreferredSize(new java.awt.Dimension(79, 30));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(151, 42, 42));
        jButton8.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        jButton8.setText("EXIT");
        jButton8.setBorder(null);
        jButton8.setFocusable(false);
        jButton8.setPreferredSize(new java.awt.Dimension(27, 30));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 165, 247));
        jButton2.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        jButton2.setText("CALCULATE TOUR COST");
        jButton2.setBorder(null);
        jButton2.setFocusable(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        guide.setBackground(new java.awt.Color(0, 0, 0));
        guide.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        guide.setForeground(new java.awt.Color(255, 255, 255));
        guide.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT GUIDE", "MR. Nihal", "MR. Saman", "MR. Mahee", "MR. Maneesha", "MR. Pasan" }));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel1.setText("LOCATION");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel5.setText("TOUR ID");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel6.setText("ARRANGE TOUR GUIDE");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/SUBMIT.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        loca.setBackground(new java.awt.Color(0, 0, 0));
        loca.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        loca.setForeground(new java.awt.Color(255, 255, 255));
        loca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT LOCATION 01", "GALLE", "MATARA", "KANDY", "JAFFNA", "TRINCOMALEE" }));

        id.setBackground(new java.awt.Color(0, 0, 0));
        id.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));

        stat.setBackground(new java.awt.Color(0, 165, 247));
        stat.setForeground(new java.awt.Color(0, 165, 247));
        stat.setText("ACTIVE");

        loca1.setBackground(new java.awt.Color(0, 0, 0));
        loca1.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        loca1.setForeground(new java.awt.Color(255, 255, 255));
        loca1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT LOCATION 02", "GALLE", "MATARA", "KANDY", "JAFFNA", "TRINCOMALEE" }));

        loca2.setBackground(new java.awt.Color(0, 0, 0));
        loca2.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        loca2.setForeground(new java.awt.Color(255, 255, 255));
        loca2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT LOCATION 03", "GALLE", "MATARA", "KANDY", "JAFFNA", "TRINCOMALEE" }));

        loca3.setBackground(new java.awt.Color(0, 0, 0));
        loca3.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        loca3.setForeground(new java.awt.Color(255, 255, 255));
        loca3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT LOCATION 04", "GALLE", "MATARA", "KANDY", "JAFFNA", "TRINCOMALEE" }));

        loca4.setBackground(new java.awt.Color(0, 0, 0));
        loca4.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        loca4.setForeground(new java.awt.Color(255, 255, 255));
        loca4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT LOCATION 05", "GALLE", "MATARA", "KANDY", "JAFFNA", "TRINCOMALEE" }));

        guide1.setBackground(new java.awt.Color(0, 0, 0));
        guide1.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        guide1.setForeground(new java.awt.Color(255, 255, 255));
        guide1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT GUIDE", "MR. Nihal", "MR. Saman", "MR. Mahee", "MR. Maneesha", "MR. Pasan" }));

        guide2.setBackground(new java.awt.Color(0, 0, 0));
        guide2.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        guide2.setForeground(new java.awt.Color(255, 255, 255));
        guide2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT GUIDE", "MR. Nihal", "MR. Saman", "MR. Mahee", "MR. Maneesha", "MR. Pasan" }));

        guide3.setBackground(new java.awt.Color(0, 0, 0));
        guide3.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        guide3.setForeground(new java.awt.Color(255, 255, 255));
        guide3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT GUIDE", "MR. Nihal", "MR. Saman", "MR. Mahee", "MR. Maneesha", "MR. Pasan" }));

        guide4.setBackground(new java.awt.Color(0, 0, 0));
        guide4.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        guide4.setForeground(new java.awt.Color(255, 255, 255));
        guide4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT GUIDE", "MR. Nihal", "MR. Saman", "MR. Mahee", "MR. Maneesha", "MR. Pasan" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(stat, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(199, 199, 199))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(327, 327, 327))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(loca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(loca1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(guide1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(guide, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(guide2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(guide3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(guide4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(87, 87, 87)))
                                .addComponent(loca2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(loca3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(loca4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(stat, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guide1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loca2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guide2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loca3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guide3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loca4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guide4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jLabel7)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
       tourplanner_menu go_menu = new tourplanner_menu ();
        go_menu.show();
        dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        single_tour go_user_r = new single_tour ();
        go_user_r.show();
        dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        JFrame frame_log = new JFrame("EXIT");
        if(JOptionPane.showConfirmDialog(frame_log, "Do You Want To Log Out?","Log Out",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
        role_selection back_log = new role_selection ();
        back_log.show();
        dispose();
        }        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        JFrame frame = new JFrame("EXIT");
        if(JOptionPane.showConfirmDialog(frame, "Do You Want To Exit?","EXIT",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
        System.exit(0);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
       
          
        try {
                // TODO add your handling code here:
               
                String tourID = (String) id.getSelectedItem();
                String location1 = (String) loca.getSelectedItem();
                String guide1_ = (String) guide.getSelectedItem();
                String location2 = (String) loca1.getSelectedItem();
                String guide2_ = (String) guide1.getSelectedItem();
                String location3 = (String) loca2.getSelectedItem();
                String guide3_ = (String) guide2.getSelectedItem();
                String location4 = (String) loca3.getSelectedItem();
                String guide4_ = (String) guide3.getSelectedItem();
                String location5 = (String) loca3.getSelectedItem();
                String guide5_ = (String) guide3.getSelectedItem();

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/travelsafe","root","");
                PreparedStatement pst = con.prepareStatement("insert into tourguide (tourID,location1,guide1,location2,guide2,location3,guide3,location4,guide4,location5,guide5)values(?,?,?,?,?,?,?,?,?,?,?)");
                
                pst.setString(1, tourID);
                pst.setString(2, location1);
                pst.setString(3, guide1_);
                pst.setString(4, location2);
                pst.setString(5, guide2_);
                pst.setString(6, location3);
                pst.setString(7, guide3_);
                pst.setString(8, location4);
                pst.setString(9, guide4_);
                pst.setString(10, location5);
                pst.setString(11, guide5_);
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this,"Guide Added Successfully."); 


               }catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(autoIn.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        calculate_bill go_user_r = new calculate_bill ();
        go_user_r.show();
        dispose();
    }//GEN-LAST:event_jButton2MouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arr_tour_guide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Arr_tour_guide().setVisible(true);
        });
    }
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> guide;
    private javax.swing.JComboBox<String> guide1;
    private javax.swing.JComboBox<String> guide2;
    private javax.swing.JComboBox<String> guide3;
    private javax.swing.JComboBox<String> guide4;
    private javax.swing.JComboBox<String> id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> loca;
    private javax.swing.JComboBox<String> loca1;
    private javax.swing.JComboBox<String> loca2;
    private javax.swing.JComboBox<String> loca3;
    private javax.swing.JComboBox<String> loca4;
    private javax.swing.JLabel stat;
    // End of variables declaration//GEN-END:variables

};