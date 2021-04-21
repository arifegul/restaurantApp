import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class Order extends javax.swing.JInternalFrame {

   public double runningCost;
    public double rowCost;
    //Declaring a new instance of classes
    Starter s = new Starter();
    Main m = new Main();
    Dessert ds = new Dessert();
    Drink dr = new Drink();
    TotalPrice p = new TotalPrice();
    Person_Order o = new Person_Order();
 
    DefaultTableModel model;
    DefaultTableModel Startermodel;
    DefaultTableModel Mainmodel;
    DefaultTableModel Dessertmodel;
    DefaultTableModel Drinkmodel;
     
    
    public Order() {
        initComponents();
       
    }

        Connection con;
    PreparedStatement pst;
    
    
    String path = null;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStarters = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDesserts = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMains = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblDrinks = new javax.swing.JTable();
        txtStarterValue = new javax.swing.JTextField();
        txtMainValue = new javax.swing.JTextField();
        txtStarterPrice = new javax.swing.JTextField();
        txtMainPrice = new javax.swing.JTextField();
        txtDessertValue = new javax.swing.JTextField();
        txtDessertPrice = new javax.swing.JTextField();
        txtDrinkValue = new javax.swing.JTextField();
        txtDrinkPrice = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        txtTable = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        txtCost = new javax.swing.JTextField();
        txtRowCost = new javax.swing.JTextField();
        txtFinish = new javax.swing.JButton();
        label1 = new java.awt.Label();
        txtFinish1 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btns = new javax.swing.JButton();
        btnm = new javax.swing.JButton();
        btndr = new javax.swing.JButton();
        btnd = new javax.swing.JButton();
        btnCancel1 = new javax.swing.JButton();

        panel1.setBackground(new java.awt.Color(255, 255, 204));
        panel1.setPreferredSize(new java.awt.Dimension(1300, 663));

        tblStarters.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Starters", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStarters.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStartersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStarters);

        tblDesserts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Desserts", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDesserts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDessertsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblDesserts);

        tblMains.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Main Courses", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMains.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMainsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblMains);

        tblDrinks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drinks", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDrinks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDrinksMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblDrinks);

        txtStarterValue.setEditable(false);
        txtStarterValue.setText("-");
        txtStarterValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStarterValueActionPerformed(evt);
            }
        });

        txtMainValue.setEditable(false);
        txtMainValue.setText("-");
        txtMainValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMainValueActionPerformed(evt);
            }
        });

        txtStarterPrice.setEditable(false);
        txtStarterPrice.setText("0.0");

        txtMainPrice.setEditable(false);
        txtMainPrice.setText("0.0");

        txtDessertValue.setEditable(false);
        txtDessertValue.setText("-");

        txtDessertPrice.setEditable(false);
        txtDessertPrice.setText("0.0");

        txtDrinkValue.setEditable(false);
        txtDrinkValue.setText("-");
        txtDrinkValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDrinkValueActionPerformed(evt);
            }
        });

        txtDrinkPrice.setEditable(false);
        txtDrinkPrice.setText("0.0");

        btnAdd.setBackground(new java.awt.Color(255, 204, 204));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAdd.setText("Add Order");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTableActionPerformed(evt);
            }
        });

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Starters", "Main Course", "Desserts", "Drinks", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrder.getTableHeader().setReorderingAllowed(false);
        tblOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrderMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblOrder);

        txtCost.setEditable(false);
        txtCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostActionPerformed(evt);
            }
        });

        txtFinish.setText("Finish Order");
        txtFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFinishActionPerformed(evt);
            }
        });

        label1.setText("label1");

        txtFinish1.setBackground(new java.awt.Color(0, 153, 153));
        txtFinish1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtFinish1.setText("Finish Order");
        txtFinish1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFinish1ActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(153, 153, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("Back to Home");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Table Number");

        btns.setBackground(new java.awt.Color(153, 204, 255));
        btns.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btns.setText("Show Startes");
        btns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsActionPerformed(evt);
            }
        });

        btnm.setBackground(new java.awt.Color(153, 204, 255));
        btnm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnm.setText("Show Mains");
        btnm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmActionPerformed(evt);
            }
        });

        btndr.setBackground(new java.awt.Color(153, 204, 255));
        btndr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btndr.setText("Show Drinks");
        btndr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndrActionPerformed(evt);
            }
        });

        btnd.setBackground(new java.awt.Color(153, 204, 255));
        btnd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnd.setText("Show Desserts");
        btnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndActionPerformed(evt);
            }
        });

        btnCancel1.setBackground(new java.awt.Color(255, 51, 51));
        btnCancel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancel1.setText("Cancel ");
        btnCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDrinkValue, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDrinkPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnAdd)
                .addGap(18, 18, 18)
                .addComponent(btnCancel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMainValue, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStarterValue, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(btnd, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStarterPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMainPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btns, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtDessertValue, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDessertPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(btndr, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(btnm, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtRowCost, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFinish1)
                            .addComponent(btnBack))
                        .addGap(68, 68, 68))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(274, 274, 274)
                                .addComponent(txtTable, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(216, 216, 216)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnm, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                    .addComponent(btns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtTable, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btndr, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                .addComponent(btnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtRowCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtStarterPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtStarterValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(15, 15, 15)
                                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtMainValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMainPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFinish1)
                                        .addGap(21, 21, 21)))
                                .addComponent(btnBack))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))))
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDessertValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDessertPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDrinkValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDrinkPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnCancel1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblStartersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStartersMouseClicked
        //adds selected table row to textfields
        int row = tblStarters.getSelectedRow();

        String selected = tblStarters.getValueAt(row, 0).toString();
        DefaultTableModel model= (DefaultTableModel)tblStarters.getModel();
        try{
            if(selected !=null ){
                txtStarterValue.setText(String.valueOf(model.getValueAt(tblStarters.getSelectedRow(), 0)));
                txtStarterPrice.setText(String.valueOf(model.getValueAt(tblStarters.getSelectedRow(), 1)));
            }
        } catch(NullPointerException database){
            JOptionPane.showMessageDialog(null, "Deleted");
        }
    }//GEN-LAST:event_tblStartersMouseClicked

    private void tblDessertsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDessertsMouseClicked
        //adds selected table row to textfields
        int row = tblDesserts.getSelectedRow();

        String selected = tblDesserts.getValueAt(row, 0).toString();
        DefaultTableModel model= (DefaultTableModel)tblDesserts.getModel();
        try{
            if(selected !=null ){
                txtDessertValue.setText(String.valueOf(model.getValueAt(tblDesserts.getSelectedRow(), 0)));
                txtDessertPrice.setText(String.valueOf(model.getValueAt(tblDesserts.getSelectedRow(), 1)));

            }
        } catch(NullPointerException database){
            JOptionPane.showMessageDialog(null, "Deleted");
        }
    }//GEN-LAST:event_tblDessertsMouseClicked

    private void tblMainsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMainsMouseClicked
        //adds selected table row to textfields
        int row = tblMains.getSelectedRow();

        String selected = tblMains.getValueAt(row, 0).toString();
        DefaultTableModel model= (DefaultTableModel)tblMains.getModel();
        try{
            if(selected !=null ){
                txtMainValue.setText(String.valueOf(model.getValueAt(tblMains.getSelectedRow(), 0)));
                txtMainPrice.setText(String.valueOf(model.getValueAt(tblMains.getSelectedRow(), 1)));
            }
        } catch(NullPointerException database){
            JOptionPane.showMessageDialog(null, "Deleted");
        }
    }//GEN-LAST:event_tblMainsMouseClicked

    private void tblDrinksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDrinksMouseClicked
        //adds selected table row to textfields
        int row = tblDrinks.getSelectedRow();

        String selected = tblDrinks.getValueAt(row, 0).toString();
        DefaultTableModel model= (DefaultTableModel)tblDrinks.getModel();
        try{
            if(selected !=null ){
                txtDrinkValue.setText(String.valueOf(model.getValueAt(tblDrinks.getSelectedRow(), 0)));
                txtDrinkPrice.setText(String.valueOf(model.getValueAt(tblDrinks.getSelectedRow(), 1)));
            }
        } catch(NullPointerException database){
            JOptionPane.showMessageDialog(null, "Deleted");
        }
    }//GEN-LAST:event_tblDrinksMouseClicked

    private void txtMainValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMainValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMainValueActionPerformed

    private void txtDrinkValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDrinkValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDrinkValueActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        //This is used to add up all the the costs and get a total
        String starter = txtStarterPrice.getText();
        runningCost += Double.parseDouble(starter);
        rowCost += Double.parseDouble(starter);
        txtCost.setText(String.valueOf(runningCost));
        txtRowCost.setText(String.valueOf(rowCost));

        String main = txtMainPrice.getText();
        runningCost += Double.parseDouble(main);
        rowCost += Double.parseDouble(main);
        txtCost.setText(String.valueOf(runningCost));
        txtRowCost.setText(String.valueOf(rowCost));

        String d = txtDessertPrice.getText();
        runningCost += Double.parseDouble(d);
        rowCost += Double.parseDouble(d);
        txtCost.setText(String.valueOf(runningCost));
        txtRowCost.setText(String.valueOf(rowCost));

        String drink = txtDrinkPrice.getText();
        runningCost += Double.parseDouble(drink);
        rowCost += Double.parseDouble(drink);
        txtCost.setText(String.valueOf(runningCost));
        txtRowCost.setText(String.valueOf(rowCost));

        
        String rowCost1 = Double.toString(rowCost);
       Object xx = null;
        //
        o.setOrderId((String) xx);
        o.setStarter(txtStarterValue.getText());
        o.setMain(txtMainValue.getText());
        o.setDessert(txtDessertValue.getText());
        o.setDrink(txtDrinkValue.getText());

        o.setPrice(rowCost1);
        

        //This creates the table to which the food orders and their price are placed.
        model.insertRow(model.getRowCount(), new Object[]{xx, txtStarterValue.getText(), txtMainValue.getText(), txtDessertValue.getText(), txtDrinkValue.getText(), rowCost1});
        txtStarterValue.setText("-");
        txtMainValue.setText("-");
        txtDessertValue.setText("-");
        txtDrinkValue.setText("-");
        txtRowCost.setText("-");
        txtStarterPrice.setText("0.0");
        txtMainPrice.setText("0.0");
        txtDessertPrice.setText("0.0");
        txtDrinkPrice.setText("0.0");
        rowCost = 0;
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTableActionPerformed
        // TODO add your handling code here:
        txtTable.setVisible(true);
    }//GEN-LAST:event_txtTableActionPerformed

    private void tblOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrderMouseClicked
    
    }//GEN-LAST:event_tblOrderMouseClicked

    private void txtStarterValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStarterValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStarterValueActionPerformed

    private void txtCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostActionPerformed

    private void txtFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFinishActionPerformed

    }//GEN-LAST:event_txtFinishActionPerformed

    private void txtFinish1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFinish1ActionPerformed
   
        
        DefaultTableModel model;   
        model = (DefaultTableModel) tblOrder.getModel();
            
            String OrderID = txtTable.getText();
            String Starter = txtStarterValue.getText();
            String main = txtMainValue.getText();
            String Dessert = txtDessertValue.getText();
            String Drink = txtDrinkValue.getText();
            String Price= txtCost.getText();
            
        try{
            Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost/restaurant","root","");
      PreparedStatement pst = con.prepareStatement("insert into order_table(OrderID,Starter,main,Dessert,Drink,Price) values(?,?,?,?,?,?)");
            pst.setString(1, OrderID);
            pst.setString(2, Starter);
            pst.setString(3, main);
            pst.setString(4, Dessert);
            pst.setString(5, Drink);
            pst.setString(6, Price);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Order Created");
            
        } 
        
        catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        try{
          model.insertRow(model.getRowCount(), new Object[]{txtTable.getText(),txtStarterValue.getText(),txtMainValue.getText(),txtDessertValue.getText(),txtDrinkValue.getText(),txtCost.getText()});
          txtTable.setText(null);
             txtStarterValue.setText(null);
          txtMainValue.setText(null);
           txtDessertValue.setText(null);
          txtDrinkValue.setText(null);
          txtCost.setText(null);
      
        } catch(NumberFormatException c){
            //catched the error if a number isn't entered in the price text field
            JOptionPane.showMessageDialog(null, "You can only enter numbers into the price textfield");
           
         txtTable.setText(null);
          txtStarterValue.setText(null);
          txtMainValue.setText(null);
           txtDessertValue.setText(null);
          txtDrinkValue.setText(null);
          txtCost.setText(null);
            txtFinish1.setEnabled(false);
        }
   
      
    }//GEN-LAST:event_txtFinish1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        homePage h = new homePage();
        h.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmActionPerformed
        // TODO add your handling code here:
        
        String Main = null ;
          String MainPrice = null;
          
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/restaurant","root","");
             Statement st = (Statement) con.createStatement();
             
            try ( ResultSet rs = st.executeQuery("Select * from mains_table")) {

            int colcount = rs.getMetaData().getColumnCount();

            DefaultTableModel tm = new DefaultTableModel(); 

            for(int i = 1;i<=colcount;i++)

                tm.addColumn(rs.getMetaData().getColumnName(i));
            
           while(rs.next())

                {

                    Object[] row = new Object[colcount];

                    for(int i=1;i<=colcount;i++)

                        row[i-1] = rs.getObject(i);

                    tm.addRow(row);

                }
                
                tblMains.setModel(tm);
                
            }
            con.close();
         
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        
        
        
    }//GEN-LAST:event_btnmActionPerformed

    private void btnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsActionPerformed
      
          String Starter = null ;
          String StarterPrice = null;
          
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/restaurant","root","");
             Statement st = (Statement) con.createStatement();
             
            try ( ResultSet rs = st.executeQuery("Select * from starter_table")) {
                int colcount = rs.getMetaData().getColumnCount();
                 DefaultTableModel tm = new DefaultTableModel(); 

                    for(int i = 1;i<=colcount;i++)
                     tm.addColumn(rs.getMetaData().getColumnName(i));
                    
                    while(rs.next())
                {
                    Object[] row = new Object[colcount];
                    
                    for(int i=1;i<=colcount;i++)
                        row[i-1] = rs.getObject(i);
                    tm.addRow(row);

                }
                
                tblStarters.setModel(tm);
                
            }
            con.close();
         
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        
        
        
        
    }//GEN-LAST:event_btnsActionPerformed

    private void btndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndActionPerformed
        // TODO add your handling code here:
        
        
           
        String Dessert = null ;
          String DessertPrice = null;
          
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/restaurant","root","");
             Statement st = (Statement) con.createStatement();
             
            try ( ResultSet rs = st.executeQuery("Select * from dessert_table")) {

            int colcount = rs.getMetaData().getColumnCount();

            DefaultTableModel tm = new DefaultTableModel(); 

            for(int i = 1;i<=colcount;i++)

                tm.addColumn(rs.getMetaData().getColumnName(i));
            
           while(rs.next())

                {

                    Object[] row = new Object[colcount];

                    for(int i=1;i<=colcount;i++)

                        row[i-1] = rs.getObject(i);

                    tm.addRow(row);

                }
                
                tblDesserts.setModel(tm);
                
            }
            con.close();
         
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
            
           
    }//GEN-LAST:event_btndActionPerformed

    private void btndrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndrActionPerformed
        // TODO add your handling code here:
        
        
           
        String Drink = null ;
       String DrinkPrice = null;
          
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/restaurant","root","");
             Statement st = (Statement) con.createStatement();
             
            try ( ResultSet rs = st.executeQuery("Select * from drink_table")) {

            int colcount = rs.getMetaData().getColumnCount();

            DefaultTableModel tm = new DefaultTableModel(); 

            for(int i = 1;i<=colcount;i++)

                tm.addColumn(rs.getMetaData().getColumnName(i));
            
           while(rs.next())

                {

                    Object[] row = new Object[colcount];

                    for(int i=1;i<=colcount;i++)

                        row[i-1] = rs.getObject(i);

                    tm.addRow(row);

                }
                
                tblDrinks.setModel(tm);
                
            }
            con.close();
         
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
            
           
    }//GEN-LAST:event_btndrActionPerformed

    private void btnCancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancel1ActionPerformed
        // TODO add your handling code here:
        
       
        //This is used to add up all the the costs and get a total
        String starter = txtStarterPrice.getText();
        runningCost -= Double.parseDouble(starter);
        rowCost -= Double.parseDouble(starter);
        txtCost.setText(String.valueOf(runningCost));
        txtRowCost.setText(String.valueOf(rowCost));

        String main = txtMainPrice.getText();
        runningCost -= Double.parseDouble(main);
        rowCost -= Double.parseDouble(main);
        txtCost.setText(String.valueOf(runningCost));
        txtRowCost.setText(String.valueOf(rowCost));

        String d = txtDessertPrice.getText();
        runningCost -= Double.parseDouble(d);
        rowCost -= Double.parseDouble(d);
        txtCost.setText(String.valueOf(runningCost));
        txtRowCost.setText(String.valueOf(rowCost));

        String drink = txtDrinkPrice.getText();
        runningCost -= Double.parseDouble(drink);
        rowCost -= Double.parseDouble(drink);
        txtCost.setText(String.valueOf(runningCost));
        txtRowCost.setText(String.valueOf(rowCost));

        
        String rowCost1 = Double.toString(rowCost);
       Object xx = null;
        //
        o.setOrderId((String) xx);
        o.setStarter(txtStarterValue.getText());
        o.setMain(txtMainValue.getText());
        o.setDessert(txtDessertValue.getText());
        o.setDrink(txtDrinkValue.getText());

        o.setPrice(rowCost1);
        

        //This creates the table to which the food orders and their price are placed.
        model.insertRow(model.getRowCount(), new Object[]{xx, txtStarterValue.getText(), txtMainValue.getText(), txtDessertValue.getText(), txtDrinkValue.getText(), rowCost1});
        txtStarterValue.setText("-");
        txtMainValue.setText("-");
        txtDessertValue.setText("-");
        txtDrinkValue.setText("-");
        txtRowCost.setText("-");
        txtStarterPrice.setText("0.0");
        txtMainPrice.setText("0.0");
        txtDessertPrice.setText("0.0");
        txtDrinkPrice.setText("0.0");
        rowCost = 0; 
        
    }//GEN-LAST:event_btnCancel1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel1;
    private javax.swing.JButton btnd;
    private javax.swing.JButton btndr;
    private javax.swing.JButton btnm;
    private javax.swing.JButton btns;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private java.awt.Label label1;
    private java.awt.Panel panel1;
    private javax.swing.JTable tblDesserts;
    private javax.swing.JTable tblDrinks;
    private javax.swing.JTable tblMains;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTable tblStarters;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtDessertPrice;
    private javax.swing.JTextField txtDessertValue;
    private javax.swing.JTextField txtDrinkPrice;
    private javax.swing.JTextField txtDrinkValue;
    private javax.swing.JButton txtFinish;
    private javax.swing.JButton txtFinish1;
    private javax.swing.JTextField txtMainPrice;
    private javax.swing.JTextField txtMainValue;
    private javax.swing.JTextField txtRowCost;
    private javax.swing.JTextField txtStarterPrice;
    private javax.swing.JTextField txtStarterValue;
    private javax.swing.JTextField txtTable;
    // End of variables declaration//GEN-END:variables

   
}
