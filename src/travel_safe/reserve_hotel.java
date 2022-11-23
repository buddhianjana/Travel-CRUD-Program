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
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author SHEHARA
 */

public class reserve_hotel extends javax.swing.JFrame {
    
     int positionX = 0, positionY = 0;
     
    /**
     * Creates new form manager menu
     */
    public reserve_hotel() {
        
        setUndecorated(true);
        initComponents();
        Fillcombo();
        autoID();
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 50, 50)) ;
    }
    
    
    private void Fillcombo(){
    
        try {
        
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost/travelsafe","root","");
           String sql = "select * from requirement ";
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet rs = pst.executeQuery();
        
           while(rs.next()) {
           
           String reqID = rs.getString("reqID");
           reqid.addItem(reqID);
           
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
        roomtype = new javax.swing.JComboBox<>();
        hotelname = new javax.swing.JComboBox<>();
        specialreq = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BookNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        room = new javax.swing.JComboBox<>();
        l1 = new javax.swing.JLabel();
        sDate = new com.toedter.calendar.JDateChooser();
        reqid = new javax.swing.JComboBox<>();
        stat = new javax.swing.JLabel();

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
        jButton1.setText("VIEW CLIENT REQUIRMENT");
        jButton1.setBorder(null);
        jButton1.setFocusable(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 66, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        roomtype.setBackground(new java.awt.Color(0, 0, 0));
        roomtype.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        roomtype.setForeground(new java.awt.Color(255, 255, 255));
        roomtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Luxary", "AC Room", "Non AC Room" }));

        hotelname.setBackground(new java.awt.Color(0, 0, 0));
        hotelname.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        hotelname.setForeground(new java.awt.Color(255, 255, 255));
        hotelname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Oyo Hotel", "Centric Hotel", "Beach Sidein Hotel", "Lanis Place", "Kandy Riverstone Hotel" }));
        hotelname.setToolTipText("");

        specialreq.setBackground(new java.awt.Color(0, 0, 0));
        specialreq.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        specialreq.setForeground(new java.awt.Color(255, 255, 255));
        specialreq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NONE", "KIDS AREA", "SICK AND ELDERLY PEOPLE", "VIP PEOPLE" }));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel1.setText("NO OF ROOMS");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel2.setText("ROOM TYPE");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel3.setText("HOTEL NAME");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel4.setText("SPECIAL REQUIRMENTS ");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel5.setText("REQUEST ID");

        BookNo.setEditable(false);
        BookNo.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel6.setText("BOOKING HOTEL");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/SUBMIT.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel8.setText("BOOKING ID");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel9.setText("CHECK-IN DATE");

        room.setBackground(new java.awt.Color(0, 0, 0));
        room.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        room.setForeground(new java.awt.Color(255, 255, 255));
        room.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        l1.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        l1.setForeground(new java.awt.Color(204, 0, 51));

        sDate.setBackground(new java.awt.Color(0, 165, 247));
        sDate.setDateFormatString("yyyy-MM-dd");
        sDate.setFocusable(false);
        sDate.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N

        reqid.setBackground(new java.awt.Color(0, 0, 0));
        reqid.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        reqid.setForeground(new java.awt.Color(255, 255, 255));

        stat.setBackground(new java.awt.Color(0, 165, 247));
        stat.setForeground(new java.awt.Color(0, 165, 247));
        stat.setText("ACTIVE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(stat, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(roomtype, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BookNo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel7))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(hotelname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(specialreq, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(room, 0, 200, Short.MAX_VALUE)
                                    .addComponent(sDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(reqid, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(258, 258, 258))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(stat, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BookNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(reqid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(l1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(sDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(roomtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(hotelname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(specialreq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jLabel7)
                .addGap(28, 28, 28))
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
        reservationex_menu go_menu = new reservationex_menu ();
        go_menu.show();
        dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
      
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
       
        l1.setText("");
        
        if(sDate.getDate()== null){
        l1.setText("Required Date");
        
        }
        
        else if(sDate.getDate()== null){
            l1.setText("Required Date");
        }
       
        else{    
        try {
                // TODO add your handling code here:
                String bookingID = BookNo.getText();
                String reqID = (String) reqid.getSelectedItem();
                SimpleDateFormat dat = new SimpleDateFormat ("yyyy-MM-dd");
                String date = dat.format (sDate.getDate());
                String roomno = (String) room.getSelectedItem();
                String roomtype_ = (String) roomtype.getSelectedItem();
                String hname = (String) hotelname.getSelectedItem();
                String sreq = (String) specialreq.getSelectedItem();
                String status = stat.getText();
                BookNo.requestFocus();

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/travelsafe","root","");
                PreparedStatement pst = con.prepareStatement("insert into booking (bookingID,reqID,date,roomno,roomtype_,hname,sreq,Status)values(?,?,?,?,?,?,?,?)");
                
                pst.setString(1, bookingID);
                pst.setString(2, reqID);
                pst.setString(3, date);
                pst.setString(4, roomno);
                pst.setString(5, roomtype_);
                pst.setString(6, hname);
                pst.setString(7, sreq);
                pst.setString(8, status);
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this,"Booking Added Successfully.");

                autoID();
                
                reqid.setSelectedItem("");
                sDate.setDate(null);
                room.setSelectedItem("");
                roomtype.setSelectedItem("");
                hotelname.setSelectedItem("");
                specialreq.setSelectedItem(""); 


               }catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(autoIn.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      View_requirment go_menu = new View_requirment ();
        go_menu.show();
        dispose();
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reserve_hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new reserve_hotel().setVisible(true);
        });
    }
    
     public final void autoID() {
        
         try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/travelsafe","root","");
            Statement s = con.createStatement();

            ResultSet rs = s.executeQuery("select Max(bookingID) from booking");
            rs.next();

            rs.getString("Max(bookingID)");


            if(rs.getString("Max(bookingID)") == null)
            {

                BookNo.setText("B-001");
            }
            else
            {
                Long bookingID = Long.parseLong(rs.getString("Max(bookingID)").substring(2,rs.getString("Max(bookingID)").length()));
                bookingID++;
                BookNo.setText(String.format("B-"+"%03d", bookingID));

            }


        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(autoIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BookNo;
    private javax.swing.JComboBox<String> hotelname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel l1;
    private javax.swing.JComboBox<String> reqid;
    private javax.swing.JComboBox<String> room;
    private javax.swing.JComboBox<String> roomtype;
    private com.toedter.calendar.JDateChooser sDate;
    private javax.swing.JComboBox<String> specialreq;
    private javax.swing.JLabel stat;
    // End of variables declaration//GEN-END:variables

};

