
package com.mycompany.mavenproject;
import java.io.File; 
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(NewJFrame.class.getName());

    public NewJFrame() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        carType = new javax.swing.JLabel();
        cartype = new javax.swing.JTextField();
        carModel = new javax.swing.JLabel();
        carmodel = new javax.swing.JTextField();
        ManufactureDate = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        NumberPassenger = new javax.swing.JLabel();
        numberpassenger = new javax.swing.JTextField();
        CarPrice = new javax.swing.JLabel();
        carprice = new javax.swing.JTextField();
        CarNumber = new javax.swing.JLabel();
        carnumber = new javax.swing.JTextField();
        Delete = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        Exite = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        carType.setBackground(new java.awt.Color(255, 0, 0));
        carType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        carType.setText("Car Type");
        carType.setOpaque(true);
        jPanel1.add(carType);
        carType.setBounds(0, 0, 140, 30);

        cartype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartypeActionPerformed(evt);
            }
        });
        jPanel1.add(cartype);
        cartype.setBounds(160, 0, 160, 30);

        carModel.setBackground(new java.awt.Color(255, 0, 0));
        carModel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        carModel.setText("Car Model");
        carModel.setToolTipText("");
        carModel.setOpaque(true);
        jPanel1.add(carModel);
        carModel.setBounds(0, 60, 140, 30);
        jPanel1.add(carmodel);
        carmodel.setBounds(160, 60, 160, 30);

        ManufactureDate.setBackground(new java.awt.Color(255, 0, 0));
        ManufactureDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ManufactureDate.setText("Manufacture date");
        ManufactureDate.setOpaque(true);
        jPanel1.add(ManufactureDate);
        ManufactureDate.setBounds(0, 120, 140, 30);
        jPanel1.add(date);
        date.setBounds(160, 120, 160, 30);

        NumberPassenger.setBackground(new java.awt.Color(255, 0, 0));
        NumberPassenger.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NumberPassenger.setText("Number passenger");
        NumberPassenger.setOpaque(true);
        jPanel1.add(NumberPassenger);
        NumberPassenger.setBounds(0, 180, 140, 30);
        jPanel1.add(numberpassenger);
        numberpassenger.setBounds(160, 180, 160, 30);

        CarPrice.setBackground(new java.awt.Color(255, 0, 0));
        CarPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CarPrice.setText("Car Price");
        CarPrice.setOpaque(true);
        jPanel1.add(CarPrice);
        CarPrice.setBounds(0, 240, 140, 30);
        jPanel1.add(carprice);
        carprice.setBounds(160, 240, 160, 30);

        CarNumber.setBackground(new java.awt.Color(255, 0, 0));
        CarNumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CarNumber.setText("Car number");
        CarNumber.setOpaque(true);
        jPanel1.add(CarNumber);
        CarNumber.setBounds(0, 300, 140, 30);

        carnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carnumberActionPerformed(evt);
            }
        });
        jPanel1.add(carnumber);
        carnumber.setBounds(160, 300, 170, 30);

        Delete.setBackground(new java.awt.Color(255, 0, 0));
        Delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Delete.setText("Delete");
        Delete.setToolTipText("");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(Delete);
        Delete.setBounds(460, 190, 120, 29);

        Update.setBackground(new java.awt.Color(255, 0, 0));
        Update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(Update);
        Update.setBounds(460, 130, 120, 29);

        Search.setBackground(new java.awt.Color(255, 0, 0));
        Search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        jPanel1.add(Search);
        Search.setBounds(460, 80, 120, 29);

        Save.setBackground(new java.awt.Color(255, 0, 0));
        Save.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel1.add(Save);
        Save.setBounds(460, 30, 120, 29);

        Exite.setBackground(new java.awt.Color(255, 0, 0));
        Exite.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Exite.setText("Exit");
        Exite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExiteActionPerformed(evt);
            }
        });
        jPanel1.add(Exite);
        Exite.setBounds(460, 250, 120, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\A&Z\\Pictures\\Screenshots\\istockphoto-1186679390-612x612.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-3, 0, 600, 408);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carnumberActionPerformed
       
        
    }//GEN-LAST:event_carnumberActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
   
        
        String CarType= cartype.getText();
        int CarModel= Integer.parseInt(carmodel.getText());
        String ManfDate= date.getText();
        int NumberPassenger=Integer.parseInt(numberpassenger.getText());
        int CarPrice=Integer.parseInt(carprice.getText());
        String number=carnumber.getText();
        if(evt.getSource()==Save){
                   
     try( FileWriter writer=new FileWriter("Car.txt",true)){
         writer.write(CarType+","+CarModel+","+ManfDate+","+NumberPassenger+","+CarPrice+","+number+"\n");
         JOptionPane.showMessageDialog(this, "Saved Successfully!");
     }
     catch(IOException e){
 JOptionPane.showMessageDialog(this, "Error saving file: " + e.getMessage());
     
     
     }
        }
        
       
    }//GEN-LAST:event_SaveActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed

        if(evt.getSource()==Search){                                       
    String searchValue ="";
    int fieldIndex = -1;
    if (!cartype.getText().isEmpty()) {
        searchValue = cartype.getText();
        fieldIndex = 0;
    } 
    else if (!carmodel.getText().isEmpty()) {
        searchValue = carmodel.getText();
        fieldIndex = 1;
    } 
    else if (!date.getText().isEmpty()) {
        searchValue = date.getText();
        fieldIndex = 2;
    } 
    else if (!numberpassenger.getText().isEmpty()) {
        searchValue = numberpassenger.getText();
        fieldIndex = 3;
    } 
    else if (!carprice.getText().isEmpty()) {
        searchValue = carprice.getText();
        fieldIndex = 4;
    } 
    else if (!carnumber.getText().isEmpty()) {
        searchValue = carnumber.getText();
        fieldIndex = 5;
    }
    if (searchValue == "") {
        JOptionPane.showMessageDialog(this, "Please enter at least one field to search!");
        return;
    }

    boolean found = false;

    try (Scanner scanner = new Scanner(new File("Car.txt"))) {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
if (parts.length >= 6 && parts[fieldIndex].equalsIgnoreCase(searchValue)) {
 cartype.setText(parts[0]);
 carmodel.setText(parts[1]);
 date.setText(parts[2]);
numberpassenger.setText(parts[3]);
carprice.setText(parts[4]);
carnumber.setText(parts[5]);
JOptionPane.showMessageDialog(this, "Car found!");
found = true;
break;
            }
        }
    } 
    
    catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error reading file: " + e.getMessage());
    }

    if (!found) {
        JOptionPane.showMessageDialog(this, "Car not found!");
    }
         
}
        
    
    
    }//GEN-LAST:event_SearchActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
      if(evt.getSource()==Update) {                                      
    String searchValue = "";
    int fieldIndex = -1;
    if(!cartype.getText().isEmpty()){
        searchValue = cartype.getText();
        fieldIndex = 0;
    } 
    else if(!carmodel.getText().isEmpty()){
        searchValue = carmodel.getText();
        fieldIndex = 1;
    } 
    else if(!date.getText().isEmpty()){
        searchValue = date.getText();
        fieldIndex = 2;
    } 
    else if(!numberpassenger.getText().isEmpty()){
        searchValue = numberpassenger.getText();
        fieldIndex = 3;
    } 
    else if(!carprice.getText().isEmpty()){
        searchValue = carprice.getText();
        fieldIndex = 4;
    }
    else if(!carnumber.getText().isEmpty()){
        searchValue = carnumber.getText();
        fieldIndex = 5;
    }

    if(searchValue.isEmpty()){
        JOptionPane.showMessageDialog(this, "Please enter a value to update!");
        return;
    }

    boolean found = false;
    ArrayList<String> arraylist = new ArrayList<>();

    try (Scanner scanner = new Scanner(new File("Car.txt"))) {
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            if(parts.length >= 6 && parts[fieldIndex].equalsIgnoreCase(searchValue)){
                line = cartype.getText() + "," + carmodel.getText() + "," +
                       date.getText() + "," + numberpassenger.getText() + "," +
                       carprice.getText() + "," + carnumber.getText();
                found = true;
            }
            arraylist.add(line);
        }
    } catch(IOException e){
        JOptionPane.showMessageDialog(this, "Error reading file: " + e.getMessage());
        return;
    }

    if(found){
        try (FileWriter writer = new FileWriter("Car.txt")) { 
            for(String l : arraylist){
                writer.write(l + "\n");
            }
            JOptionPane.showMessageDialog(this, "Record updated successfully!");
        } catch(IOException e){
            JOptionPane.showMessageDialog(this, "Error writing file: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(this, "Record not found!");
    }
}

    }//GEN-LAST:event_UpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
       if(evt.getSource()==Delete){
                                                
    String searchValue = "";
    int fieldIndex = -1;
    if(!cartype.getText().isEmpty()){
        searchValue = cartype.getText();
        fieldIndex = 0;
    } 
    else if(!carmodel.getText().isEmpty()){
        searchValue = carmodel.getText();
        fieldIndex = 1;
    } 
    else if(!date.getText().isEmpty()){
        searchValue = date.getText();
        fieldIndex = 2;
    } 
    else if(!numberpassenger.getText().isEmpty()){
        searchValue = numberpassenger.getText();
        fieldIndex = 3;
    } 
    else if(!carprice.getText().isEmpty()){
        searchValue = carprice.getText();
        fieldIndex = 4;
    } 
    else if(!carnumber.getText().isEmpty()){
        searchValue = carnumber.getText();
        fieldIndex = 5;
    }

    if(searchValue==""){
        JOptionPane.showMessageDialog(this, "Please enter a value to delete!");
        return;
    }
    boolean found = false;
    ArrayList<String> arraylist = new ArrayList<>();

    try (Scanner scanner = new Scanner(new File("Car.txt"))) {
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            if(parts.length >= 6 && parts[fieldIndex].equalsIgnoreCase(searchValue)){
                found = true;  
                continue;
            }
            arraylist.add(line);
        }
    } catch(IOException e){
        JOptionPane.showMessageDialog(this, "Error reading file: " + e.getMessage());
        return;
    }

    if(found){
        try (FileWriter writer = new FileWriter("Car.txt")) {
            for(String l : arraylist){
                writer.write(l + "\n");
            }
            JOptionPane.showMessageDialog(this, "Record deleted successfully!");
        } catch(IOException e){
            JOptionPane.showMessageDialog(this, "Error writing file: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(this, "Record not found!");
    }
}

       
    }//GEN-LAST:event_DeleteActionPerformed

    private void cartypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartypeActionPerformed

    private void ExiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExiteActionPerformed
       if(evt.getSource()==Exite){
            System.exit(0);
           
       }
    }//GEN-LAST:event_ExiteActionPerformed

  
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> new NewJFrame().setVisible(true));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CarNumber;
    private javax.swing.JLabel CarPrice;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Exite;
    private javax.swing.JLabel ManufactureDate;
    private javax.swing.JLabel NumberPassenger;
    private javax.swing.JButton Save;
    private javax.swing.JButton Search;
    private javax.swing.JButton Update;
    private javax.swing.JLabel carModel;
    private javax.swing.JLabel carType;
    private javax.swing.JTextField carmodel;
    private javax.swing.JTextField carnumber;
    private javax.swing.JTextField carprice;
    private javax.swing.JTextField cartype;
    private javax.swing.JTextField date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField numberpassenger;
    // End of variables declaration//GEN-END:variables


}
