import com.mysql.jdbc.Connection;import com.mysql.jdbc.PreparedStatement;import com.mysql.jdbc.Statement;import java.awt.HeadlessException;
import java.sql.DriverManager;import java.sql.ResultSet;import java.sql.SQLException;import java.util.ArrayList;
import java.util.logging.Level;import java.util.logging.Logger;import javax.swing.JOptionPane;import javax.swing.table.DefaultTableModel;

public class sales2 extends javax.swing.JFrame {
String JDBC_Driver="com.mysql.jdbc.Driver";String dburl ="jdbc:mysql://localhost:3306/food?zeroDateTimeBehavior=convertToNull";
Connection connects=null;PreparedStatement stnt=null;Statement stnt1=null;ResultSet rs=null;

public sales2() throws SQLException { initComponents(); show_sales();}

public ArrayList<User4> userList() throws SQLException{ ArrayList<User4> userList=new ArrayList<>();
try{Class.forName("com.mysql.jdbc.Driver");connects=(Connection) DriverManager.getConnection(dburl, "root", "");
stnt1=(Statement) connects.createStatement();rs=stnt1.executeQuery("SELECT * FROM sales");User4 user;
while (rs.next()){user= new User4(rs.getString("name"),rs.getInt("quantity"),rs.getInt("cost"),
rs.getInt("total"),rs.getDate("date"),rs.getString("month"),rs.getTime("time"),rs.getInt("year"),rs.getString("attendant"));
userList.add(user);}} catch (ClassNotFoundException | SQLException e) {JOptionPane.showMessageDialog(null, e);
rs.close();stnt.close();connects.close();}return userList;}

public void show_sales() throws SQLException{ArrayList<User4> list = userList();
DefaultTableModel model= (DefaultTableModel) jTable1.getModel();Object [] row = new Object [9];
for (int i=0; i<list.size();i++){row[0]=list.get(i).getname();row[1]=list.get(i).getquantity();            
row[2]=list.get(i).getcost();row[3]=list.get(i).gettotal();row[4]=list.get(i).getdate();
row[5]=list.get(i).getmonth();row[6]=list.get(i).gettime();row[7]=list.get(i).getyear();
row[8]=list.get(i).getattendant();model.addRow(row);}  }

public void clear(){DefaultTableModel model= (DefaultTableModel) jTable1.getModel();model.setRowCount(0);}
 
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FOOD PRODUCTION APPLICATION");
        setLocation(new java.awt.Point(100, 100));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DAILY SALE:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 18))); // NOI18N

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Date:");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("CLEAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jButton1)
                .addGap(53, 53, 53)
                .addComponent(jButton3)
                .addGap(51, 51, 51)
                .addComponent(jButton2)
                .addContainerGap(189, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Quantity", "Cost", "Total", "Date", "Month", "Time", "Year", "Attendant"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(null);

        jMenu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu1.setText("Menu");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu2.setText("Item");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu3.setText("Daily Sales");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu4.setText("Purchases");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu5.setText("Monthly Profit");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu6.setText("Yearly Profit");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        jMenu7.setText("Attendant");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
    menu frame =new menu(); frame.setVisible(true);this.setVisible(false);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
    try {items frame =new items();frame.setVisible(true);this.setVisible(false);} 
    catch (SQLException ex) {Logger.getLogger(profitm.class.getName()).log(Level.SEVERE, null, ex);}
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
    try {sales2 frame =new sales2();frame.setVisible(true);this.setVisible(false);} 
    catch (SQLException ex) {Logger.getLogger(sales2.class.getName()).log(Level.SEVERE, null, ex);}
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
    try {purchases frame =new purchases();frame.setVisible(true);this.setVisible(false);} 
    catch (SQLException ex) {Logger.getLogger(profitm.class.getName()).log(Level.SEVERE, null, ex);}
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
    try {profitm frame =new profitm();frame.setVisible(true);this.setVisible(false);} 
    catch (SQLException ex) {Logger.getLogger(profitm.class.getName()).log(Level.SEVERE, null, ex);}
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
    try {profity frame =new profity();frame.setVisible(true);this.setVisible(false);} 
    catch (SQLException ex) {Logger.getLogger(profitm.class.getName()).log(Level.SEVERE, null, ex);}
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
    try {attendant2 frame = new attendant2();frame.setVisible(true);this.setVisible(false);} 
    catch (SQLException ex) { Logger.getLogger(sales2.class.getName()).log(Level.SEVERE, null, ex);}
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();int row = jTable1.getSelectedRow();
    try{ String name=null, date=null, month=null, year=null, time=null;
    name=model.getValueAt(row, 0).toString();    date=model.getValueAt(row, 4).toString();
    month=model.getValueAt(row, 5).toString();    year=model.getValueAt(row, 7).toString();
    time=model.getValueAt(row, 6).toString();    try{Class.forName("com.mysql.jdbc.Driver");}
    catch (ClassNotFoundException ex) {Logger.getLogger(purchases.class.getName()).log(Level.SEVERE, null, ex);}
    connects=(Connection) DriverManager.getConnection(dburl, "root", "");    
    stnt=(PreparedStatement) connects.prepareStatement("DELETE FROM sales WHERE name='"+name+"' AND date='"+date+"'"
            + " AND month='"+month+"'AND year='"+year+"'AND time='"+time+"'");
    stnt.executeUpdate();model.removeRow(row);    rs.close();stnt.close();connects.close();}
    catch (SQLException | HeadlessException e){JOptionPane.showMessageDialog(null, e.getMessage());
    try {rs.close();stnt1.close();stnt.close();connects.close();} 
    catch (SQLException ex) {Logger.getLogger(purchases.class.getName()).log(Level.SEVERE, null, ex);}}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    clear(); String date=jTextField1.getText();
    try{Class.forName("com.mysql.jdbc.Driver");connects = (Connection) DriverManager.getConnection(dburl, "root", "");
    stnt1=(Statement) connects.createStatement();rs=stnt1.executeQuery("SELECT * FROM sales WHERE date='"+date+"'");
    while (rs.next()){ArrayList<User4> list=new ArrayList<>();User4 user;
    user= new User4(rs.getString("name"),rs.getInt("quantity"),rs.getInt("cost"),rs.getInt("total"),
    rs.getDate("date"),rs.getString("month"),rs.getTime("time"),rs.getInt("year"),rs.getString("attendant"));
    list.add(user);DefaultTableModel model= (DefaultTableModel) jTable1.getModel();           
    Object [] row = new Object [9];
    for (int i=0; i<list.size();i++){ row[0]=list.get(i).getname();row[1]=list.get(i).getquantity();            
    row[2]=list.get(i).getcost();row[3]=list.get(i).gettotal();row[4]=list.get(i).getdate();
    row[5]=list.get(i).getmonth(); row[6]=list.get(i).gettime();row[7]=list.get(i).getyear();
    row[8]=list.get(i).getattendant();model.addRow(row);}}} 
    catch (ClassNotFoundException | SQLException | HeadlessException e){
    JOptionPane.showMessageDialog(null, e.getMessage());
    try {connects.close();}catch (SQLException ex) {
    Logger.getLogger(sales2.class.getName()).log(Level.SEVERE, null, ex);}}  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    try {jTextField1.setText("");DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);show_sales();} 
    catch (SQLException ex) {Logger.getLogger(sales2.class.getName()).log(Level.SEVERE, null, ex);}
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {java.awt.EventQueue.invokeLater(new Runnable() {
    @Override public void run() {try {new sales2().setVisible(true);} 
    catch (SQLException ex) {Logger.getLogger(sales2.class.getName()).log(Level.SEVERE, null, ex);}}});}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
