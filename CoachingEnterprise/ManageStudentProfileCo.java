/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package CoachingEnterprise;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Deepak
 */
public class ManageStudentProfileCo extends javax.swing.JPanel {
private static final String username="root"; 
    private static final String password="Rajkumar123#";
    private static final String dataconn="jdbc:mysql://localhost:3306/finalproject";
    
    Connection sqlConn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
     int q,i;
     String branch;
     String enterprise;
     String name,pass;
     byte[] image;
     
    /**
     * Creates new form MSP
     */
    public ManageStudentProfileCo() {
        initComponents();
    }
public void upDateDb()
    {
    try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
         sqlConn=DriverManager.getConnection(dataconn,username,password);
         pst=sqlConn.prepareStatement("select * from managestudentprofilecounsellor");
         
         rs=pst.executeQuery();
         ResultSetMetaData stData= rs.getMetaData();
         q=stData.getColumnCount();
         
   
         while (rs.next())
         {
            Vector columnData = new Vector();
            
            
                for(i=1;i<q;i++){
                  
                  columnData.add(rs.getString("ID"));
                  columnData.add(rs.getString("Name"));
                  columnData.add(rs.getString("Age"));
                  columnData.add(rs.getString("Gender"));
                  columnData.add(rs.getString("Email"));
                  columnData.add(rs.getString("Mobile"));
                  columnData.add(rs.getString("Branch"));
                  columnData.add(rs.getString("Enterprise"));
                  columnData.add(rs.getString("Degree"));
                  columnData.add(rs.getString("Countries"));
                  columnData.add(rs.getBytes("Image"));
                  columnData.add(rs.getString("Username"));
                  columnData.add(rs.getString("Password"));
                }         
            
             
         }
         
} 
    catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    
    }}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        managetbl = new javax.swing.JTable();
        viewbtn = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        managetbl.setBackground(new java.awt.Color(204, 204, 204));
        managetbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Age", "Gender", "Email", "Mobile", "Branch", "Enterprise", "Degree", "Countries"
            }
        ));
        managetbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managetblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(managetbl);

        viewbtn.setText("View");
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(viewbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(viewbtn)
                .addContainerGap(249, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 976, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void managetblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managetblMouseClicked
        // TODO add your handling code here:
         DefaultTableModel recordTable=(DefaultTableModel)managetbl.getModel();
         int SelectedRows= managetbl.getSelectedRow();
   
         StudentClassDetailsJFrame sc=new StudentClassDetailsJFrame();
         sc.setVisible(true);
         sc.namelbl.setText(recordTable.getValueAt(SelectedRows, 1).toString());
sc.agelbl.setText(recordTable.getValueAt(SelectedRows, 2).toString());
sc.genderlbl.setText(recordTable.getValueAt(SelectedRows, 3).toString());
sc.emaillbl.setText(recordTable.getValueAt(SelectedRows, 4).toString());
sc.mobilelbl.setText(recordTable.getValueAt(SelectedRows, 5).toString());
sc.branchlbl.setText(recordTable.getValueAt(SelectedRows, 6).toString());
sc.enterpriselbl.setText(recordTable.getValueAt(SelectedRows, 7).toString());
sc.degreelbl.setText(recordTable.getValueAt(SelectedRows, 8).toString());
sc.countrieslbl.setText(recordTable.getValueAt(SelectedRows, 9).toString());


    }//GEN-LAST:event_managetblMouseClicked

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed
        // TODO add your handling code here:
       
       try{
            Class.forName("com.mysql.cj.jdbc.Driver");
         sqlConn=DriverManager.getConnection(dataconn,username,password);
         pst=sqlConn.prepareStatement("select * from managestudentprofilecounsellor");
            
             rs=pst.executeQuery();
            DefaultTableModel model=(DefaultTableModel)managetbl.getModel();
            model.setRowCount(0);
            while(rs.next())
            {
                
                
                String id=String.valueOf(rs.getString("ID"));
                String name=String.valueOf(rs.getString("Name"));
                String age=String.valueOf(rs.getString("Age"));
                String gender=String.valueOf(rs.getString("Gender"));
                String email=String.valueOf(rs.getString("Email"));
                String mobile=String.valueOf(rs.getString("Mobile"));
                String branch=String.valueOf(rs.getString("Branch"));
                String enterprise=String.valueOf(rs.getString("Enterprise"));
                String degree=String.valueOf(rs.getString("Degree"));
                String countries=String.valueOf(rs.getString("Countries"));
                String image=String.valueOf(rs.getBytes("Image"));
                String username=String.valueOf(rs.getString("Username"));
                String password=String.valueOf(rs.getString("Password"));
                
                String tbdata[]={id,name,age,gender,email,mobile,branch,enterprise,degree,countries,image,username,password};
                
                model.addRow(tbdata);
            }
           
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_viewbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable managetbl;
    private javax.swing.JButton viewbtn;
    // End of variables declaration//GEN-END:variables
}
