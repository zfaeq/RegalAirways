/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regalairways;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Zeyad
 */
public class ViewItinerary extends javax.swing.JFrame {
ResultSet rs;
ResultSet rs2;
ResultSet rs3;
ResultSet rs4;
Statement statement;
Connection con;
String customerPhone;
String cID;
String first;
String last;
String fromAID;
String toAID;
String departure;
String arrival;
String type;
String fromCity;
String fromCountry;
String fromCode;
String toCity;
String toCountry;
String toCode;
    /**
     * Creates new form ViewItinerary
     */
    public ViewItinerary() {
        initComponents();
        roundfromLbl.setVisible(false);
        roundtoLbl.setVisible(false);
        departureLbl.setVisible(false);
        arrivalLbl.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fromLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        toLbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        phoneTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        roundfromLbl = new javax.swing.JLabel();
        roundtoLbl = new javax.swing.JLabel();
        departureLbl = new javax.swing.JLabel();
        typeLbl = new javax.swing.JLabel();
        arrivalLbl = new javax.swing.JLabel();
        lastLbl = new javax.swing.JLabel();
        firstLbl = new javax.swing.JLabel();
        fromairportLbl = new javax.swing.JLabel();
        toairportLbl = new javax.swing.JLabel();
        departurefromLbl = new javax.swing.JLabel();
        fromRoundLbl = new javax.swing.JLabel();
        toRoundLbl = new javax.swing.JLabel();
        departureRoundLbl = new javax.swing.JLabel();
        arrivalRoundLbl = new javax.swing.JLabel();
        arrivalfromLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setText("First Name:");

        fromLbl.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        fromLbl.setText("From:");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel3.setText("Last Name:");

        toLbl.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        toLbl.setText("To:");

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel5.setText("Departure Time:");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel6.setText("Arrival Time:");

        lbl2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lbl2.setText("Type:");

        phoneTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTxtActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel9.setText("Customer Phone:");

        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        roundfromLbl.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        roundfromLbl.setText("From:");

        roundtoLbl.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        roundtoLbl.setText("To:");

        departureLbl.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        departureLbl.setText("Departure Time:");

        arrivalLbl.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        arrivalLbl.setText("Arrival Time:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lastLbl))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(firstLbl))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(typeLbl)))
                        .addGap(203, 203, 203)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roundtoLbl)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(roundfromLbl)
                                            .addGap(93, 93, 93))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(departureLbl)
                                                .addComponent(fromLbl)
                                                .addComponent(toLbl))
                                            .addGap(34, 34, 34)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(arrivalLbl)
                                            .addComponent(jLabel6))
                                        .addGap(54, 54, 54)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(arrivalfromLbl)
                                    .addComponent(arrivalRoundLbl)
                                    .addComponent(departureRoundLbl)
                                    .addComponent(fromRoundLbl)
                                    .addComponent(departurefromLbl)
                                    .addComponent(toRoundLbl)
                                    .addComponent(fromairportLbl)
                                    .addComponent(toairportLbl)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(27, 27, 27)
                                .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)))))
                .addContainerGap(253, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(firstLbl))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(lastLbl))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl2)
                                    .addComponent(typeLbl)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fromLbl)
                                    .addComponent(fromairportLbl))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(toairportLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(toLbl))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(departurefromLbl))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(arrivalfromLbl))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(roundfromLbl)
                                    .addComponent(fromRoundLbl))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(roundtoLbl)
                                    .addComponent(toRoundLbl))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(departureLbl)
                            .addComponent(departureRoundLbl))
                        .addGap(27, 27, 27)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arrivalLbl)
                    .addComponent(arrivalRoundLbl))
                .addContainerGap(174, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void phoneTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // VIEW BUTTON
        
        customerPhone=phoneTxt.getText();
        
    try {
        // grab customer id and store it in variable cID
        con = new Connect().getConnection();
        statement = con.createStatement();
        
        String infoQuery="SELECT cID FROM customers WHERE Phone ="+customerPhone;
       
         if (customerPhone!=null){
            rs= statement.executeQuery(infoQuery);
      
          
            while(rs.next()){
           
                cID = rs.getString(1);
                
                
          
           
            }
      
            }
         else{
             JOptionPane.showMessageDialog(null,"Please Enter a phone number" );
         }
        
           
       
    } catch (Exception ex) {
        Logger.getLogger(ViewItinerary.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null,"Failed to locate customer" );
    }
      
    try {
        // use cID to grab itinerary
        con = new Connect().getConnection();
        statement = con.createStatement();
         String itinerary="select*from(Select customers.cID, customers.Fname,customers.Lname, flightreservations.DepartureTime, flightreservations.ArrivalTime,flightreservations.flightWay, routes.fromAID, routes.toAID from flightreservations join customers using(cID) join routes using(rID)) as t1 where cID="+cID+";";
        rs2= statement.executeQuery(itinerary);
        while(rs2.next()){
            
         first = rs2.getString(2);
         last = rs2.getString(3);
         departure = rs2.getString(4);
         arrival = rs2.getString(5);
         type=rs2.getString(6);
         fromAID = rs2.getString(7);
         toAID=rs2.getString(8);
         
            
            
        }
        
    } catch (Exception ex) {
        Logger.getLogger(ViewItinerary.class.getName()).log(Level.SEVERE, null, ex);
         JOptionPane.showMessageDialog(null,"Unable to get itinerary" );
    }
       
    try {
        // use fromAID to get airport information
        con = new Connect().getConnection();
        statement = con.createStatement();
        String getFromAirport="SELECT Country, City, airportCode FROM airports where aID="+fromAID+";";
        rs3 = statement.executeQuery(getFromAirport);
        while(rs3.next()){
            fromCountry= rs3.getString(1);
            fromCity=rs3.getString(2);
            fromCode=rs3.getString(3);
              
        }
      
    } catch (Exception ex) {
        Logger.getLogger(ViewItinerary.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    try {
        // use toAID to get airport information
        con = new Connect().getConnection();
        statement = con.createStatement();
        String getToAirport="SELECT Country, City, airportCode FROM airports where aID="+toAID+";";
        rs4= statement.executeQuery(getToAirport);
        while(rs4.next()){
            toCountry= rs4.getString(1);
            toCity=rs4.getString(2);
            toCode=rs4.getString(3);
                  
        }
      
    } catch (Exception ex) {
        Logger.getLogger(ViewItinerary.class.getName()).log(Level.SEVERE, null, ex);
    }
        
       if (type.equalsIgnoreCase("0")){
           // if flight type is one way, set round trip labels to invisible
        roundfromLbl.setVisible(false);
        roundtoLbl.setVisible(false);
        departureLbl.setVisible(false);
        arrivalLbl.setVisible(false);
        departureRoundLbl.setVisible(false);
        arrivalRoundLbl.setVisible(false);
        fromRoundLbl.setVisible(false);
        toRoundLbl.setVisible(false);
        
        // set lable values using variables
           firstLbl.setText(first);
           lastLbl.setText(last);
           typeLbl.setText("One Way");
           fromairportLbl.setText(fromCode+", "+fromCity+", "+fromCountry);
           toairportLbl.setText(toCode+", "+toCity+", "+toCountry);
           departurefromLbl.setText(departure);
           arrivalfromLbl.setText(arrival);
           

       } else {
           //if flight type is 1(round trip), set round trip lables to visible and 
           
           typeLbl.setText("Round Trip");
           roundfromLbl.setVisible(true);
           roundtoLbl.setVisible(true);
           arrivalLbl.setVisible(true);
           departureLbl.setVisible(true);
           // grab values from variables and change lable text
           firstLbl.setText(first);
           lastLbl.setText(last);
           fromairportLbl.setText(fromCode+", "+fromCity+", "+fromCountry);
           toairportLbl.setText(toCode+", "+toCity+", "+toCountry);
           departurefromLbl.setText(departure);
           arrivalfromLbl.setText(arrival);
           departureRoundLbl.setText(departure);
           arrivalRoundLbl.setText(arrival);
           fromRoundLbl.setText(toCode+", "+toCity+", "+toCountry);
           toRoundLbl.setText(fromCode+", "+fromCity+", "+fromCountry);
           
    }
    
    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrivalLbl;
    private javax.swing.JLabel arrivalRoundLbl;
    private javax.swing.JLabel arrivalfromLbl;
    private javax.swing.JLabel departureLbl;
    private javax.swing.JLabel departureRoundLbl;
    private javax.swing.JLabel departurefromLbl;
    private javax.swing.JLabel firstLbl;
    private javax.swing.JLabel fromLbl;
    private javax.swing.JLabel fromRoundLbl;
    private javax.swing.JLabel fromairportLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lastLbl;
    private javax.swing.JLabel lbl2;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JLabel roundfromLbl;
    private javax.swing.JLabel roundtoLbl;
    private javax.swing.JLabel toLbl;
    private javax.swing.JLabel toRoundLbl;
    private javax.swing.JLabel toairportLbl;
    private javax.swing.JLabel typeLbl;
    // End of variables declaration//GEN-END:variables
}
