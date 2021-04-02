/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Order.Order;
import Business.Restaurant.Restaurant;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class CustomerAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;

    private UserAccount userAccount;
    private DefaultTableModel model;
    EcoSystem system; 
    Order createOrder; 
    private DefaultTableModel model1;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public CustomerAreaJPanel(JPanel userProcessContainer, UserAccount account,EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = account;
//        createOrder = system.getCustomerDirectory().getCustomer(account.getEmployee().getName()).createOrder();
        valueLabel.setText(account.getEmployee().getName());
        populateRequestTable();
        populateRestaurant();
    }
    
    public void populateRequestTable(){
      
        Customer customer = system.getCustomerDirectory().getCustomer(userAccount.getEmployee().getName());
        model = new DefaultTableModel();
        workRequestJTable.setModel(model);
        model.addColumn("Order ID");
        model.addColumn("Restaurant");
        model.addColumn("Delivery Man");
        model.addColumn("Order status");
        model.addColumn("Comment");
        ArrayList<Order> order = customer.getOrder();
        for(int i=0;i<order.size();i++){
            model.addRow(new Object[]{
                order.get(i).getOrderID(),
                order.get(i).getRestaurant().getName(),
                order.get(i).getDeliveryMan(),
                order.get(i).getOrderstatus(),
                order.get(i).getComment()
            });
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
        workRequestJTable = new javax.swing.JTable();
        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableShowRestaurants = new javax.swing.JTable();
        jButton_placeOrder = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        refreshTestJButton.setBackground(new java.awt.Color(0, 0, 0));
        refreshTestJButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Customer");

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N

        jTableShowRestaurants.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableShowRestaurants);

        jButton_placeOrder.setBackground(new java.awt.Color(0, 0, 0));
        jButton_placeOrder.setForeground(new java.awt.Color(255, 255, 255));
        jButton_placeOrder.setText("Go to Menu");
        jButton_placeOrder.setBorderPainted(false);
        jButton_placeOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_placeOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 425, Short.MAX_VALUE)
                                .addComponent(refreshTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(jButton_placeOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(refreshTestJButton)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_placeOrder)
                .addGap(0, 10, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();
        
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void jButton_placeOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_placeOrderActionPerformed
        // TODO add your handling code here:
        Vector elementAt = model1.getDataVector().elementAt(jTableShowRestaurants.getSelectedRow());
        String name = (String) elementAt.get(0);
        Restaurant restaurant = null;
        ArrayList<Restaurant> restaurantList = system.getRestaurantDirectory().getRestaurantList();
        for(int i=0;i<restaurantList.size();i++){
            if(restaurantList.get(i).getName().equals(name)){
                restaurant = restaurantList.get(i);
                System.out.println("rest name...."+restaurant.getName());
            }
        }
        if(elementAt.size() == 0){
            JOptionPane.showMessageDialog(null, "Select restaurant in table");
        }else{
            createOrder = system.getCustomerDirectory().getCustomer(userAccount.getEmployee().getName()).createOrder();
            PlaceOrder order = new PlaceOrder(userProcessContainer,restaurant,system,userAccount,createOrder);
        userProcessContainer.add("managePlacedOrdersJPanel",order);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        
    }//GEN-LAST:event_jButton_placeOrderActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton_placeOrder;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableShowRestaurants;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

    private void populateRestaurant() {
        ArrayList<Restaurant> restaurantList = system.getRestaurantDirectory().getRestaurantList();
        model1 = new DefaultTableModel();
        jTableShowRestaurants.setModel(model1);
        model1.addColumn("Name");
        for(int i=0;i<restaurantList.size();i++){
            model1.addRow(new Object[]{
                restaurantList.get(i).getName()
            });
        }
    }
}
