import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class Employee extends javax.swing.JInternalFrame {

    public Employee() {
       
      initComponents();
    }
    
    Connection con;
    PreparedStatement pst;
    
    
    String path = null;
   
    @SuppressWarnings("unchecked")
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPPSN = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtWage = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployees = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnAddR = new javax.swing.JButton();
        txtEmployeeID = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("First Name");

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("T.C");

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Last Name");

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Wage");

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Position");

        tblEmployees.setBackground(new java.awt.Color(204, 204, 255));
        tblEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmployeeID", "First Name", "Last Name", "T.C", "Weekly Wage", "Position"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmployees.getTableHeader().setReorderingAllowed(false);
        tblEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmployees);

        btnBack.setBackground(new java.awt.Color(153, 153, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("Back to Home");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAddR.setBackground(new java.awt.Color(0, 153, 153));
        btnAddR.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddR.setText("Add");
        btnAddR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRActionPerformed(evt);
            }
        });

        txtEmployeeID.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtEmployeeID.setForeground(new java.awt.Color(0, 102, 102));
        txtEmployeeID.setText("Employee Information");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddR, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtWage, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(txtPPSN, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(txtEmployeeID)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtEmployeeID)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtPPSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddR)
                    .addComponent(btnBack))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed

    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void tblEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeesMouseClicked
    
    }//GEN-LAST:event_tblEmployeesMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        homePage h = new homePage();
        h.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRActionPerformed

        DefaultTableModel model;   
        model = (DefaultTableModel) tblEmployees.getModel();
        
            String EmployeeID = txtEmployeeID.getText();
            String First_Name = txtFirstName.getText();
            String Last_Name = txtLastName.getText();
            String TC = txtPPSN.getText();
            String Wages = txtWage.getText();
            String Position = txtPosition.getText();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/restaurant","root","");
            pst = con.prepareStatement("insert into employee_table(EmployeeID,First_Name,Last_Name,TC,Wages,Position) values(?,?,?,?,?,?)");
            pst.setString(1, EmployeeID);
            pst.setString(2, First_Name);
            pst.setString(3, Last_Name);
            pst.setString(4, TC);
            pst.setString(5, Wages);
            pst.setString(6, Position);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registation Created");
            
        } 
        
        catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        try{
             model.insertRow(model.getRowCount(), new Object[]{ txtEmployeeID.getText(),txtFirstName.getText(), txtLastName.getText(), txtPPSN.getText(), txtWage.getText(), txtPosition.getText()});
          txtEmployeeID.setText(null);
             txtFirstName.setText(null);
          txtLastName.setText(null);
           txtPPSN.setText(null);
          txtWage.setText(null);
           txtPosition.setText(null);
        
        } catch(NumberFormatException c){
            //catched the error if a number isn't entered in the price text field
            JOptionPane.showMessageDialog(null, "You must enter all textfield");
           
         txtEmployeeID.setText(null);
            txtFirstName.setText(null);
          txtLastName.setText(null);
           txtPPSN.setText(null);
          txtWage.setText(null);
           txtPosition.setText(null);
            btnAddR.setEnabled(false);
        }

    }//GEN-LAST:event_btnAddRActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddR;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblEmployees;
    private javax.swing.JLabel txtEmployeeID;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPPSN;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtWage;
    // End of variables declaration//GEN-END:variables

}
