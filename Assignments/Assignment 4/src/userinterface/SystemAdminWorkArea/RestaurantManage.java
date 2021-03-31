/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author snehalchavan
 */
public class RestaurantManage extends javax.swing.JPanel {

    /**
     * Creates new form RestaurantManage
     */
    EcoSystem system;
    JPanel userProcessContainer;
    DefaultTableModel model;
    
    public RestaurantManage(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.system = system;
        this.userProcessContainer = userProcessContainer;
        jPanel1DelUpManager.setVisible(false);
        showRestaurants();
        showRstaurantTable();
        showRestaurantManagerList();
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
        restaurantList = new javax.swing.JComboBox<>();
        AddRestaurantjbutton = new javax.swing.JButton();
        deleteRestaurant = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField_restaurantName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_manager = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_managerUsername = new javax.swing.JTextField();
        jPasswordFieldManager = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jButton1_back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1Restaurants = new javax.swing.JTable();
        jPanel1DelUpManager = new javax.swing.JPanel();
        jButton1Upadte = new javax.swing.JButton();
        jButton2Delete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextDelManager = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField_updateUsername = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPasswordField_updatepass = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jTextField_managernameCreate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_managernameUsername = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPasswordFieldManagercreate = new javax.swing.JPasswordField();
        jButton2CreateManager = new javax.swing.JButton();
        jComboBox1RestaurantManagerList = new javax.swing.JComboBox<>();
        jLabelManagerList = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        AddRestaurantjbutton.setText("Add Restaurant");
        AddRestaurantjbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRestaurantjbuttonActionPerformed(evt);
            }
        });

        deleteRestaurant.setText("Delete Restaurant");
        deleteRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRestaurantActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter Restaurant Name");

        jLabel2.setText("Enter Manager Name");

        jLabel3.setText("Enter Username");

        jLabel4.setText("Enter Password");

        jPasswordFieldManager.setText("jPasswordField1");

        jLabel5.setText("Restaurants");

        jButton1_back.setText("Back");
        jButton1_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_backActionPerformed(evt);
            }
        });

        jTable1Restaurants.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1Restaurants.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1RestaurantsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1Restaurants);

        jButton1Upadte.setText("Update");
        jButton1Upadte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1UpadteActionPerformed(evt);
            }
        });

        jButton2Delete.setText("Delete");
        jButton2Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2DeleteActionPerformed(evt);
            }
        });

        jLabel6.setText("Restaurant Manager");

        jLabel7.setText("Name");

        jTextDelManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDelManagerActionPerformed(evt);
            }
        });

        jLabel12.setText("Password");

        jLabel11.setText("Username");

        jPasswordField_updatepass.setText("jPasswordField1");

        javax.swing.GroupLayout jPanel1DelUpManagerLayout = new javax.swing.GroupLayout(jPanel1DelUpManager);
        jPanel1DelUpManager.setLayout(jPanel1DelUpManagerLayout);
        jPanel1DelUpManagerLayout.setHorizontalGroup(
            jPanel1DelUpManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1DelUpManagerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(55, 55, 55))
            .addGroup(jPanel1DelUpManagerLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1DelUpManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1DelUpManagerLayout.createSequentialGroup()
                        .addGroup(jPanel1DelUpManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel1DelUpManagerLayout.createSequentialGroup()
                                .addGroup(jPanel1DelUpManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel7))
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1DelUpManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPasswordField_updatepass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1DelUpManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextDelManager, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_updateUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)))))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(jPanel1DelUpManagerLayout.createSequentialGroup()
                        .addComponent(jButton1Upadte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2Delete)
                        .addGap(19, 19, 19))))
        );
        jPanel1DelUpManagerLayout.setVerticalGroup(
            jPanel1DelUpManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1DelUpManagerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1DelUpManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextDelManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1DelUpManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_updateUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1DelUpManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jPasswordField_updatepass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1DelUpManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1Upadte)
                    .addComponent(jButton2Delete))
                .addGap(19, 19, 19))
        );

        jLabel8.setText("Enter Manager Name");

        jLabel9.setText("Enter Username");

        jLabel10.setText("Enter Password");

        jPasswordFieldManagercreate.setText("jPasswordField1");

        jButton2CreateManager.setText("Create Manager");
        jButton2CreateManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2CreateManagerActionPerformed(evt);
            }
        });

        jLabelManagerList.setText("Restaurant Managers");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(deleteRestaurant)
                        .addGap(63, 63, 63)
                        .addComponent(jButton1_back)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(59, 59, 59))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton2CreateManager)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordFieldManagercreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField_managernameCreate)
                                .addComponent(jTextField_managernameUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(374, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordFieldManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField_manager)
                                .addComponent(jTextField_restaurantName)
                                .addComponent(jTextField_managerUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(restaurantList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddRestaurantjbutton))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1DelUpManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabelManagerList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1RestaurantManagerList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField_restaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_manager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_managerUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jPasswordFieldManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(AddRestaurantjbutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(restaurantList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteRestaurant)
                            .addComponent(jButton1_back))
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1DelUpManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox1RestaurantManagerList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelManagerList))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2CreateManager))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_managernameCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_managernameUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jPasswordFieldManagercreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24))))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddRestaurantjbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRestaurantjbuttonActionPerformed
        // TODO add your handling code here:
        String Restaurantname = jTextField_restaurantName.getText();
        String managerName = jTextField_manager.getText();
        Employee manager = system.getEmployeeDirectory().createEmployee(managerName);
        String username = jTextField_managerUsername.getText();
        String password = String.valueOf(jPasswordFieldManager.getPassword());
        
        UserAccount managerAdmin = system.getUserAccountDirectory().createUserAccount(username, password, manager, new AdminRole());
        system.getRestaurantDirectory().createRestaurant(Restaurantname,managerAdmin);
        restaurantList.addItem(system.getRestaurantDirectory().getRestaurantList().get(system.getRestaurantDirectory().getRestaurantList().size()-1).getName());
        jComboBox1RestaurantManagerList.addItem(system.getRestaurantDirectory().getRestaurantList().get(system.getRestaurantDirectory().getRestaurantList().size()-1).getManager().getEmployee().getName());
        model.addRow(new Object[]{
                system.getRestaurantDirectory().getRestaurantList().get(system.getRestaurantDirectory().getRestaurantList().size()-1).getName(),
                system.getRestaurantDirectory().getRestaurantList().get(system.getRestaurantDirectory().getRestaurantList().size()-1).getManager().getEmployee().getName()
            });
        System.out.println("new rest...."+system.getRestaurantDirectory().getRestaurantList().get(2).getName());
        System.out.println("new manager...."+system.getRestaurantDirectory().getRestaurantList().get(2).getManager().getEmployee().getName());
        jTextField_manager.setText("");
        jTextField_managerUsername.setText("");
        jTextField_restaurantName.setText("");
        jPasswordFieldManager.setText("");
        JOptionPane.showMessageDialog(null, "Restaurant Added Successfully.");
    }//GEN-LAST:event_AddRestaurantjbuttonActionPerformed

    private void jButton1_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_backActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1_backActionPerformed

    private void deleteRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRestaurantActionPerformed
        // TODO add your handling code here:
        String selectedItem = (String) restaurantList.getSelectedItem();
        ArrayList<Restaurant> restaurantList1 = system.getRestaurantDirectory().getRestaurantList();
        try{
        for(int i=0;i<restaurantList1.size();i++){
            if(selectedItem == restaurantList1.get(i).getName()){
                restaurantList1.remove(i);
                model.removeRow(i);
                JOptionPane.showMessageDialog(null, "Restaurant Deleted Successfully.");
                break;
            }
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Restaurant not found.");
        }
        
        System.out.println("size of restaurant...."+restaurantList1.size());
    }//GEN-LAST:event_deleteRestaurantActionPerformed

    private void jTable1RestaurantsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1RestaurantsMouseClicked
        // TODO add your handling code here:
        jPanel1DelUpManager.setVisible(true);
        Vector elementAt = model.getDataVector().elementAt(jTable1Restaurants.getSelectedRow());
        jTextDelManager.setText((String) elementAt.get(1));
        ArrayList<UserAccount> userAccountList = system.getUserAccountDirectory().getUserAccountList();
        for(int i=0;i<userAccountList.size();i++){
            if(userAccountList.get(i).getEmployee().getName().equals(jTextDelManager.getText())){
                jTextField_updateUsername.setText(userAccountList.get(i).getUsername());
                jPasswordField_updatepass.setText(userAccountList.get(i).getPassword());
            }
        }
    }//GEN-LAST:event_jTable1RestaurantsMouseClicked

    private void jTextDelManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDelManagerActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextDelManagerActionPerformed

    private void jButton2DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2DeleteActionPerformed
        // TODO add your handling code here:
       
        ArrayList<Employee> employeeList = system.getEmployeeDirectory().getEmployeeList();
        for(int i=0;i<employeeList.size();i++){
            if(jTextDelManager.getText().equals(employeeList.get(i).getName())){
                
                if(system.getUserAccountDirectory().getUserAccountList().get(i).getEmployee().getName().equals(jTextDelManager.getText())){
                
                
                for(int j=0;j<system.getRestaurantDirectory().getRestaurantList().size();j++){
                    if(system.getRestaurantDirectory().getRestaurantList().get(j).getManager().getEmployee().getName().equals(jTextDelManager.getText())){
                        system.getRestaurantDirectory().getRestaurantList().get(j).setManager(null);
                    }
                }
                system.getUserAccountDirectory().getUserAccountList().remove(i);
                employeeList.remove(i);
                showRstaurantTable();
                    
                JOptionPane.showMessageDialog(null, "Manager Deleted successfully.");
                break;
            }
                
                
            }
            
        }
        
    }//GEN-LAST:event_jButton2DeleteActionPerformed

    private void jButton1UpadteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1UpadteActionPerformed
        // TODO add your handling code here:
        //to be continued
        String username = jTextField_updateUsername.getText();
        
        String password = String.valueOf(jPasswordField_updatepass.getPassword());
        ArrayList<UserAccount> user = system.getUserAccountDirectory().getUserAccountList();
        for(int i=0;i<user.size();i++){
            if(jTextDelManager.getText().equals(user.get(i).getEmployee().getName())){
                user.get(i).setUsername(username);
                user.get(i).setPassword(password);
                JOptionPane.showMessageDialog(null, "Details updated.");
                break;
            }
        }
    }//GEN-LAST:event_jButton1UpadteActionPerformed

    private void jButton2CreateManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2CreateManagerActionPerformed
        // TODO add your handling code here:
        String managerName1 = jTextField_managernameCreate.getText();
        Employee manager = system.getEmployeeDirectory().createEmployee(managerName1);
        String username = jTextField_managernameUsername.getText();
        String password = String.valueOf(jPasswordFieldManagercreate.getPassword());
        
        UserAccount managerAdmin = system.getUserAccountDirectory().createUserAccount(username, password, manager, new AdminRole());
        jTextField_managernameCreate.setText("");
        jTextField_managernameUsername.setText("");
        jPasswordFieldManagercreate.setText("");
        jComboBox1RestaurantManagerList.removeAllItems();
        showRestaurantManagerList();
        JOptionPane.showMessageDialog(null, "Manager created.");
    }//GEN-LAST:event_jButton2CreateManagerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddRestaurantjbutton;
    private javax.swing.JButton deleteRestaurant;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1Upadte;
    private javax.swing.JButton jButton1_back;
    private javax.swing.JButton jButton2CreateManager;
    private javax.swing.JButton jButton2Delete;
    private javax.swing.JComboBox<String> jComboBox1RestaurantManagerList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelManagerList;
    private javax.swing.JPanel jPanel1DelUpManager;
    private javax.swing.JPasswordField jPasswordFieldManager;
    private javax.swing.JPasswordField jPasswordFieldManagercreate;
    private javax.swing.JPasswordField jPasswordField_updatepass;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1Restaurants;
    private javax.swing.JTextField jTextDelManager;
    private javax.swing.JTextField jTextField_manager;
    private javax.swing.JTextField jTextField_managerUsername;
    private javax.swing.JTextField jTextField_managernameCreate;
    private javax.swing.JTextField jTextField_managernameUsername;
    private javax.swing.JTextField jTextField_restaurantName;
    private javax.swing.JTextField jTextField_updateUsername;
    private javax.swing.JComboBox<String> restaurantList;
    // End of variables declaration//GEN-END:variables

    
    private void showRstaurantTable(){
        ArrayList<String> name = new ArrayList() ;
        ArrayList<Restaurant> restaurantList1 = system.getRestaurantDirectory().getRestaurantList();
        for(int i=0;i<restaurantList1.size();i++){
            try{
                name.add(restaurantList1.get(i).getManager().getEmployee().getName());
                 
            }catch(NullPointerException e){
                name.add(null);
            }
        }
        model = new DefaultTableModel();
        jTable1Restaurants.setModel(model);
        model.addColumn("Restaurant");
        model.addColumn("Manager");
        for(int i=0;i<restaurantList1.size();i++){
            model.addRow(new Object[]{
                restaurantList1.get(i).getName(),
                name.get(i)
            });
        }
    }
    
    private void showRestaurantManagerList(){
        ArrayList<UserAccount> userAccountList = system.getUserAccountDirectory().getUserAccountList();
        for(int i=0;i<userAccountList.size();i++){
            if(userAccountList.get(i).getRole().toString().equals("Business.Role.AdminRole")){
                jComboBox1RestaurantManagerList.addItem(userAccountList.get(i).getEmployee().getName());
            }
        }
    }
    
    private void showRestaurants() {
        ArrayList<Restaurant> restaurantList1 = system.getRestaurantDirectory().getRestaurantList();
        
        for(int i=0;i<restaurantList1.size();i++){
            restaurantList.addItem(restaurantList1.get(i).getName());
        }
        
        
    }
}
