/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Order.Order;
import Business.Order.OrderItem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.RestaurantAdminRole.AdminWorkAreaJPanel;

/**
 *
 * @author snehalchavan
 */
public class PlaceOrder extends javax.swing.JPanel {

    /**
     * Creates new form PlaceOrder
     */
    Restaurant restaurant;
    private DefaultTableModel model;
    EcoSystem system;
    UserAccount user;
    JPanel userProcessContainer;
    Order neworder;
    
    public PlaceOrder(JPanel userProcessContainer,Restaurant restaurant,EcoSystem system,UserAccount user,Order newOrder) {
        initComponents();
        this.restaurant = restaurant;
        this.system = system;
        this.user = user;
        this.userProcessContainer = userProcessContainer;
        this.neworder = newOrder;
        showMenu();
        createAddToCartTable();
    }

    
    private void showMenu() {
        
        HashMap<String, String> menu = restaurant.getMenu();
        model = new DefaultTableModel();
        jTableMenu.setModel(model);
        model.addColumn("Food Name");
        model.addColumn("Price");
        for (Map.Entry<String, String> e : menu.entrySet()){
            model.addRow(new Object[]{
                e.getKey(),
                e.getValue()
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMenu = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton_placeOrder = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton_back = new javax.swing.JButton();
        jButton_AddCart = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAddtocart = new javax.swing.JTable();

        jTableMenu.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableMenu);

        jLabel1.setText("Restaurant Menu");

        jButton_placeOrder.setText("Place Order");
        jButton_placeOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_placeOrderActionPerformed(evt);
            }
        });

        jLabel2.setText("Quantity of Items");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton_back.setText("Back");
        jButton_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_backActionPerformed(evt);
            }
        });

        jButton_AddCart.setText("Add to Cart");
        jButton_AddCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddCartActionPerformed(evt);
            }
        });

        jTableAddtocart.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableAddtocart);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jButton_AddCart)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_placeOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_back))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_AddCart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_placeOrder)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_back))
                .addGap(426, 426, 426))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_placeOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_placeOrderActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTableAddtocart.getModel();
        Customer customer = system.getCustomerDirectory().getCustomer(user.getEmployee().getName());
        
        
//            Vector menuItems = model.getDataVector().elementAt(jTableAddtocart.getSelectedRow());
            //Order createOrder = system.getCustomerDirectory().getCustomer(user.getEmployee().getName()).createOrder();
            
            neworder.setOrderstatus("Placed");
//            neworder.setQuantity(Integer.parseInt((String) menuItems.get(3)));
            neworder.setIsDeliveryManAssigned(false);
            neworder.setRestaurant(restaurant);
            neworder.setCustomer(system.getCustomerDirectory().getCustomer(user.getEmployee().getName()));
            restaurant.setRestaurantOrder(neworder);
            customer.setCustomerOrder(neworder);
            customer.setOrder(neworder);
            JOptionPane.showMessageDialog(null, "Order placed successfully.");
            System.out.println("order count"+restaurant.getRestaurantOrder().size());
        
        
    }//GEN-LAST:event_jButton_placeOrderActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_backActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerAreaJPanel customerarea = (CustomerAreaJPanel) component;
//        adminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton_backActionPerformed

    private void jButton_AddCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddCartActionPerformed
        // TODO add your handling code here:
//        Vector menuItems = model.getDataVector().elementAt(jTableMenu.getSelectedRow());
        int selectedRow = jTableMenu.getSelectedRow();
        DefaultTableModel model1 = (DefaultTableModel) jTableMenu.getModel();
        String name = model1.getValueAt(selectedRow, 0).toString();
        String price =model1.getValueAt(selectedRow, 1).toString();
        OrderItem item = new OrderItem();
        item.setMenuItem(name);
        item.setMenuPrice(price);
        item.setQuantity(Integer.parseInt(jTextField1.getText()));
        neworder.getOrderItems().add(item);
        System.out.println("table...."+jTableAddtocart.getModel().getRowCount());
        DefaultTableModel model = (DefaultTableModel) jTableAddtocart.getModel();
        if(jTableAddtocart.getModel().getRowCount() == 0){            
            model.addRow(new Object[]{
                name,
                price,
                jTextField1.getText(),
                "Placed"
            });
        }else{
            jTableAddtocart.getModel();
            model.addRow(new Object[]{
            name,
            price,
            jTextField1.getText(),
            "Placed"
        });
        }
        
        jTextField1.setText("");
    }//GEN-LAST:event_jButton_AddCartActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AddCart;
    private javax.swing.JButton jButton_back;
    private javax.swing.JButton jButton_placeOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAddtocart;
    private javax.swing.JTable jTableMenu;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void createAddToCartTable() {
        model = new DefaultTableModel();

            jTableAddtocart.setModel(model);
            model.addColumn("Food Name");
            model.addColumn("Price");
            model.addColumn("Quantity");
            model.addColumn("Order Status");
    }
}