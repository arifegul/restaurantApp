
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AddMenu extends javax.swing.JInternalFrame {

    
    public AddMenu() {
        
       
        initComponents();
        
    }
  Connection con;
    PreparedStatement pst;
    
    
    String path = null;
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        txtStarter = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtStarterPrice = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnDeselectS = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtMainPrice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtMain = new javax.swing.JTextField();
        btnDeselectM = new javax.swing.JButton();
        btnAddMain = new javax.swing.JButton();
        btnDeleteMain = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtDessert = new javax.swing.JTextField();
        txtDessertPrice = new javax.swing.JTextField();
        btnAddDessert = new javax.swing.JButton();
        btnDeleteDessert = new javax.swing.JButton();
        btnDeselectDes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtDrink = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDrinkPrice = new javax.swing.JTextField();
        btnAddDrink = new javax.swing.JButton();
        btnDeleteDrink = new javax.swing.JButton();
        btnDeselectDr = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStarters = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMains = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDesserts = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDrinks = new javax.swing.JTable();

        panel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Starter");

        jLabel9.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Starter Price");

        btnAdd.setBackground(new java.awt.Color(0, 153, 153));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setText("Add Starter");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 102, 102));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setText("Delete Starter");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnDeselectS.setBackground(new java.awt.Color(153, 204, 255));
        btnDeselectS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeselectS.setText("Deselect");
        btnDeselectS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeselectSActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 102));
        jLabel16.setText("Main Course Price");

        jLabel10.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Main Course");

        btnDeselectM.setBackground(new java.awt.Color(153, 204, 255));
        btnDeselectM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeselectM.setText("Deselect");
        btnDeselectM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeselectMActionPerformed(evt);
            }
        });

        btnAddMain.setBackground(new java.awt.Color(0, 153, 153));
        btnAddMain.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddMain.setText("Add Main");
        btnAddMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMainActionPerformed(evt);
            }
        });

        btnDeleteMain.setBackground(new java.awt.Color(255, 102, 102));
        btnDeleteMain.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeleteMain.setText("Delete Order");
        btnDeleteMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteMainActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Dessert");

        jLabel17.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 102));
        jLabel17.setText("Dessert Price");

        btnAddDessert.setBackground(new java.awt.Color(0, 153, 153));
        btnAddDessert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddDessert.setText("Add Dessert");
        btnAddDessert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDessertActionPerformed(evt);
            }
        });

        btnDeleteDessert.setBackground(new java.awt.Color(255, 102, 102));
        btnDeleteDessert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeleteDessert.setText("Delete Dessert");
        btnDeleteDessert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDessertActionPerformed(evt);
            }
        });

        btnDeselectDes.setBackground(new java.awt.Color(153, 204, 255));
        btnDeselectDes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeselectDes.setText("Deselect");
        btnDeselectDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeselectDesActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Drink");

        txtDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDrinkActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Drink Price");

        btnAddDrink.setBackground(new java.awt.Color(0, 153, 153));
        btnAddDrink.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddDrink.setText("Add Drink");
        btnAddDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDrinkActionPerformed(evt);
            }
        });

        btnDeleteDrink.setBackground(new java.awt.Color(255, 102, 102));
        btnDeleteDrink.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeleteDrink.setText("Delete Drink");
        btnDeleteDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDrinkActionPerformed(evt);
            }
        });

        btnDeselectDr.setBackground(new java.awt.Color(153, 204, 255));
        btnDeselectDr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeselectDr.setText("Deselect");
        btnDeselectDr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeselectDrActionPerformed(evt);
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
        jScrollPane4.setViewportView(tblDrinks);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(btnAddMain, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDeleteMain, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDessert, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDessertPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMainPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMain, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(60, 60, 60)
                                    .addComponent(txtDrinkPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDrink, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtStarterPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(btnAddDessert, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDeleteDessert, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(btnAddDrink, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDeleteDrink, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtStarter, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(btnDeselectS, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnDeselectM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeselectDes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnDeselectDr, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtStarter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(txtStarterPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAdd)
                                    .addComponent(btnDelete))
                                .addGap(50, 50, 50)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMainPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addGap(32, 32, 32)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnDeleteMain)
                                    .addComponent(btnAddMain))
                                .addGap(40, 40, 40)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDessert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDessertPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))
                                .addGap(30, 30, 30)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAddDessert)
                                    .addComponent(btnDeleteDessert))
                                .addGap(54, 54, 54)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDrink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtDrinkPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAddDrink)
                                    .addComponent(btnDeleteDrink)))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnBack))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnDeselectS)
                        .addGap(123, 123, 123)
                        .addComponent(btnDeselectM)
                        .addGap(129, 129, 129)
                        .addComponent(btnDeselectDes)
                        .addGap(141, 141, 141)
                        .addComponent(btnDeselectDr)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
    
      DefaultTableModel Startermodel;
      Startermodel =  (DefaultTableModel) tblStarters.getModel();
            String Starter = txtStarter.getText();
            String StarterPrice = txtStarterPrice.getText();
            
        
        try{
           
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/restaurant","root","");
            pst = con.prepareStatement("insert into starter_table(Starter,StarterPrice) values(?,?)");
            pst.setString(1, Starter);
            pst.setString(2, StarterPrice);
           
            pst.executeUpdate();
      
            
        }
       catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }  
    
          try{
     
        Startermodel.insertRow(Startermodel.getRowCount(), new Object[]{txtStarter.getText(), txtStarterPrice.getText()});
        txtStarter.setText(null);
        txtStarterPrice.setText(null);
       
       }
       catch(NumberFormatException c){
            //catched the error if a number isn't entered in the price text field
            JOptionPane.showMessageDialog(null, "You must enter all textfield.");
            txtStarter.setText(null);
            txtStarterPrice.setText(null);
            btnAdd.setEnabled(false);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

         String sql= "delete from starter_table";
       try {
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost/restaurant","root","");
          Statement stmt = con.createStatement();
          stmt.executeUpdate(sql);
           System.out.println("Record deleted successfully");
           
       } 
            
            catch (ClassNotFoundException | SQLException ex) {
           Logger.getLogger(AddMenu.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnDeselectSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeselectSActionPerformed

        txtStarter.setText(null);
        txtStarterPrice.setText(null);
    }//GEN-LAST:event_btnDeselectSActionPerformed

    private void btnDeselectMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeselectMActionPerformed

        txtMain.setText(null);
        txtMainPrice.setText(null);
    }//GEN-LAST:event_btnDeselectMActionPerformed

    private void btnAddMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMainActionPerformed
        DefaultTableModel Mainmodel;
        Mainmodel =  (DefaultTableModel) tblMains.getModel();  
        String Main = txtMain.getText();
        String MainPrice = txtMainPrice.getText();
        
        try{
           
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/restaurant","root","");
            pst = con.prepareStatement("insert into mains_table(Main,MainPrice) values(?,?)");
            pst.setString(1, Main);
            pst.setString(2, MainPrice);
           
            pst.executeUpdate();
            
            
        }
       catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
         try{
       
        Mainmodel.insertRow(Mainmodel.getRowCount(), new Object[]{txtMain.getText(), txtMainPrice.getText()});     
        txtMain.setText(null);
        txtMainPrice.setText(null);
       
        }
        catch(Exception c){
            JOptionPane.showMessageDialog(null, "You must enter all textfield");
            txtMain.setText(null);
            txtMainPrice.setText(null);
            btnAddMain.setEnabled(false);
        }
        
    }//GEN-LAST:event_btnAddMainActionPerformed

    private void btnDeleteMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMainActionPerformed
    String sql= "delete from mains_table";
       try {
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost/restaurant","root","");
          Statement stmt = con.createStatement();
          stmt.executeUpdate(sql);
           
       } 
            
            catch (ClassNotFoundException | SQLException ex) {
           Logger.getLogger(AddMenu.class.getName()).log(Level.SEVERE, null, ex);
       }
 
    }//GEN-LAST:event_btnDeleteMainActionPerformed

    private void btnAddDessertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDessertActionPerformed
         DefaultTableModel Dessertmodel;
        Dessertmodel =  (DefaultTableModel) tblDesserts.getModel(); 
        String Dessert = txtDessert.getText();
            String DessertPrice = txtDessertPrice.getText();
        
        try{
           
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/restaurant","root","");
            pst = con.prepareStatement("insert into dessert_table(Dessert,DessertPrice) values(?,?)");
            pst.setString(1, Dessert);
            pst.setString(2, DessertPrice);
           
            pst.executeUpdate();
            
          
            
        }
       catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
          try{
            
            Dessertmodel.insertRow(Dessertmodel.getRowCount(), new Object[]{txtDessert.getText(), txtDessertPrice.getText()});
           
            txtDessert.setText(null);
            txtDessertPrice.setText(null);
            
        }
        catch(Exception c){
            JOptionPane.showMessageDialog(null, "You can only enter numbers into the price textfield");
            txtDessert.setText(null);
            txtDessertPrice.setText(null);
            btnAddDessert.setEnabled(false);
        }
        
    }//GEN-LAST:event_btnAddDessertActionPerformed

    private void btnDeleteDessertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDessertActionPerformed

 String sql= "delete from dessert_table";
       try {
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost/restaurant","root","");
          Statement stmt = con.createStatement();
          stmt.executeUpdate(sql);
           
       } 
            
            catch (ClassNotFoundException | SQLException ex) {
           Logger.getLogger(AddMenu.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_btnDeleteDessertActionPerformed

    private void btnDeselectDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeselectDesActionPerformed

        txtDessert.setText(null);
        txtDessertPrice.setText(null);
    }//GEN-LAST:event_btnDeselectDesActionPerformed

    private void txtDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDrinkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDrinkActionPerformed

    private void btnAddDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDrinkActionPerformed
       
          DefaultTableModel Drinkmodel;
        Drinkmodel =  (DefaultTableModel) tblDrinks.getModel(); 
        
        String Drink = txtDrink.getText();
            String DrinkPrice = txtDrinkPrice.getText();
        
        try{
           
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/restaurant","root","");
            pst = con.prepareStatement("insert into drink_table(Drink,DrinkPrice) values(?,?)");
            pst.setString(1, Drink);
            pst.setString(2, DrinkPrice);
           
            pst.executeUpdate();
            
           
        }
       catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        try{
        
        Drinkmodel.insertRow(Drinkmodel.getRowCount(), new Object[]{txtDrink.getText(), txtDrinkPrice.getText()});
      
        txtDrink.setText(null);
        txtDrinkPrice.setText(null);
        
        }
        catch(Exception c){
            JOptionPane.showMessageDialog(null, "You can only enter numbers into the price textfield");
            txtDrink.setText(null);
            txtDrinkPrice.setText(null);
            btnAddDrink.setEnabled(false);
        }
        
    }//GEN-LAST:event_btnAddDrinkActionPerformed

    private void btnDeleteDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDrinkActionPerformed
         String sql= "delete from drink_table";
       try {
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost/restaurant","root","");
          Statement stmt = con.createStatement();
          stmt.executeUpdate(sql);
           
       } 
            
            catch (ClassNotFoundException | SQLException ex) {
           Logger.getLogger(AddMenu.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_btnDeleteDrinkActionPerformed

    private void btnDeselectDrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeselectDrActionPerformed

        txtDrink.setText(null);
        txtDrinkPrice.setText(null);
    }//GEN-LAST:event_btnDeselectDrActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        homePage h = new homePage();
        h.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void tblStartersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStartersMouseClicked
    
    }//GEN-LAST:event_tblStartersMouseClicked

    private void tblMainsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMainsMouseClicked

    
    }//GEN-LAST:event_tblMainsMouseClicked

    private void tblDessertsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDessertsMouseClicked
        
    }//GEN-LAST:event_tblDessertsMouseClicked

    private void tblDrinksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDrinksMouseClicked

   
    }//GEN-LAST:event_tblDrinksMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddDessert;
    private javax.swing.JButton btnAddDrink;
    private javax.swing.JButton btnAddMain;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteDessert;
    private javax.swing.JButton btnDeleteDrink;
    private javax.swing.JButton btnDeleteMain;
    private javax.swing.JButton btnDeselectDes;
    private javax.swing.JButton btnDeselectDr;
    private javax.swing.JButton btnDeselectM;
    private javax.swing.JButton btnDeselectS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private java.awt.Panel panel1;
    private javax.swing.JTable tblDesserts;
    private javax.swing.JTable tblDrinks;
    private javax.swing.JTable tblMains;
    private javax.swing.JTable tblStarters;
    private javax.swing.JTextField txtDessert;
    private javax.swing.JTextField txtDessertPrice;
    private javax.swing.JTextField txtDrink;
    private javax.swing.JTextField txtDrinkPrice;
    private javax.swing.JTextField txtMain;
    private javax.swing.JTextField txtMainPrice;
    private javax.swing.JTextField txtStarter;
    private javax.swing.JTextField txtStarterPrice;
    // End of variables declaration//GEN-END:variables
}