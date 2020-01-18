import com.mysql.jdbc.Connection;import com.mysql.jdbc.PreparedStatement;import com.mysql.jdbc.Statement;import java.awt.HeadlessException;
import java.sql.DriverManager;import java.sql.ResultSet;import java.sql.SQLException;import java.util.ArrayList;
import java.util.logging.Level;import java.util.logging.Logger;import javax.swing.JOptionPane;import javax.swing.table.DefaultTableModel;

public class profitm extends javax.swing.JFrame {
String JDBC_Driver="com.mysql.jdbc.Driver";String dburl ="jdbc:mysql://localhost:3306/food?zeroDateTimeBehavior=convertToNull";
Connection connects=null;PreparedStatement stnt=null;Statement stnt1=null, stnt2=null;ResultSet rs=null, rs1=null;

public profitm() throws SQLException {initComponents();show_user();}

public ArrayList<User1> userList() throws SQLException{ ArrayList<User1> userList=new ArrayList<>();
try{ Class.forName("com.mysql.jdbc.Driver");connects=(Connection) DriverManager.getConnection(dburl, "root", "");
stnt1=(Statement) connects.createStatement();rs=stnt1.executeQuery("SELECT * FROM profitm");User1 user;
while (rs.next()){user= new User1(rs.getString("month"), rs.getInt("year"), rs.getInt("sales"), rs.getInt("purchases"), rs.getInt("profit"), rs.getInt("loss"));
userList.add(user);}}catch (ClassNotFoundException | SQLException e) { 
JOptionPane.showMessageDialog(null, e);}rs.close();stnt1.close();connects.close();return userList;}
    
public void show_user() throws SQLException{ ArrayList<User1> list = userList();
DefaultTableModel model= (DefaultTableModel) jTable1.getModel();Object [] row = new Object [6];
for (int i=0; i<list.size();i++){row[0]=list.get(i).getmonth();row[1]=list.get(i).getyear();
row[2]=list.get(i).getsales();row[3]=list.get(i).getpurchases();row[4]=list.get(i).getprofit();row[5]=list.get(i).getloss();model.addRow(row);}}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
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
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PROFIT AND LOSS:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("MONTH:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("YEAR:");

        jComboBox1.setMaximumRowCount(15);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NONE", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER" }));

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
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("SALES:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("PURCHASE:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("PROFIT:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("LOSS:");

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("ADD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("UPDATE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("SEARCH");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("DELETE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("NONE");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("NONE");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("NONE");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("NONE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jButton1)
                        .addGap(55, 55, 55)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton4)
                            .addGap(91, 91, 91)
                            .addComponent(jButton5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Month", "Year", "Sales", "Purchases", "Profit", "Loss"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

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
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
    menu frame =new menu();frame.setVisible(true);this.setVisible(false);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
    try {items frame =new items();frame.setVisible(true);this.setVisible(false);} 
    catch (SQLException ex) {Logger.getLogger(profitm.class.getName()).log(Level.SEVERE, null, ex);}
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
    try {sales2 frame =new sales2();frame.setVisible(true);this.setVisible(false);} 
    catch (SQLException ex) {Logger.getLogger(profitm.class.getName()).log(Level.SEVERE, null, ex);}
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try{String month1=jComboBox1.getSelectedItem().toString();String year1=jTextField1.getText();
    try{Class.forName("com.mysql.jdbc.Driver");} 
    catch (ClassNotFoundException ex) {Logger.getLogger(profitm.class.getName()).log(Level.SEVERE, null, ex);}
    connects=(Connection) DriverManager.getConnection(dburl, "root", "");stnt1=(Statement) connects.createStatement();
    rs=stnt1.executeQuery("SELECT SUM(total) as monthtotal FROM sales WHERE month='"+month1+"' AND year='"+year1+"'");
    if(rs.next()){int monthtotal=rs.getInt("monthtotal");String ab=rs.getString("monthtotal");
    if(monthtotal>0){jLabel8.setText(ab);}else{jLabel8.setText("0");}}
    else{JOptionPane.showMessageDialog(null, "Not Found!");}stnt2=(Statement) connects.createStatement();
    rs1=stnt2.executeQuery("SELECT SUM(cost) as costb FROM purchases WHERE month='"+month1+"' AND year='"+year1+"'");
    if(rs1.next()){int costb=rs1.getInt("costb");String ab=rs1.getString("costb");
    if(costb>0){jLabel9.setText(ab);}else{jLabel9.setText("0");}}
    else{JOptionPane.showMessageDialog(null, "Not Found!");}
    int a = 0, b = 0, c=0, d=0, e=0, f=0;a=Integer.parseInt(jLabel8.getText());b=Integer.parseInt(jLabel9.getText());
    if (a>b){e=a-b;String ans;ans = String.valueOf(e);jLabel11.setText(ans);jLabel12.setText("0");}
    else{f=b-a;String ans=String.valueOf(f);jLabel11.setText("0");jLabel12.setText(ans);}
    rs.close();rs1.close();stnt1.close();stnt2.close();connects.close();} 
    catch (SQLException ex) {try {Logger.getLogger(profitm.class.getName()).log(Level.SEVERE, null, ex);
    rs.close();rs1.close();stnt1.close();stnt2.close();connects.close();JOptionPane.showMessageDialog(null, "Not Found!");} 
    catch (SQLException ex1) {Logger.getLogger(profitm.class.getName()).log(Level.SEVERE, null, ex1);}}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    jTextField1.setText("");jComboBox1.setSelectedItem("NONE");jLabel8.setText("0");jLabel9.setText("0");jLabel11.setText("0");jLabel12.setText("0");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    try{String month3=jComboBox1.getSelectedItem().toString();String year3=jTextField1.getText();String sales3=jLabel8.getText();
    String purchases3=jLabel9.getText();String profit3=jLabel11.getText();String loss3=jLabel12.getText();
    try{Class.forName("com.mysql.jdbc.Driver");} 
    catch (ClassNotFoundException ex) {Logger.getLogger(profitm.class.getName()).log(Level.SEVERE, null, ex);}
    connects=(Connection) DriverManager.getConnection(dburl, "root", "");stnt1=(Statement) connects.createStatement();
    rs=stnt1.executeQuery("SELECT * FROM profitm WHERE month='"+month3+"' AND year='"+year3+"'");
    if(rs.next()){JOptionPane.showMessageDialog(null, "Cannot add. The entry already exists.");}
    else{stnt=(PreparedStatement) connects.prepareStatement("INSERT INTO profitm(month, year, sales, purchases, profit, loss) "
            + "VALUES('"+month3+"', '"+year3+"', '"+sales3+"', '"+purchases3+"', '"+profit3+"', '"+loss3+"')");
    if(jTextField1.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Year!");}
    else if(jComboBox1.getSelectedItem()=="NONE"){JOptionPane.showMessageDialog(null, "Please select Month");}
    else{stnt.executeUpdate();DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);show_user();}rs.close();stnt1.close(); stnt.close();connects.close();}} 
    catch (SQLException | HeadlessException e){JOptionPane.showMessageDialog(null, e.getMessage());
    try {rs.close();stnt1.close(); stnt.close();connects.close();} 
    catch (SQLException ex) {Logger.getLogger(profitm.class.getName()).log(Level.SEVERE, null, ex);}}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    try{String month4=jComboBox1.getSelectedItem().toString();String year4=jTextField1.getText();String sales4=jLabel8.getText();
    String purchases4=jLabel9.getText();String profit4=jLabel11.getText();String loss4=jLabel12.getText();
    try{Class.forName("com.mysql.jdbc.Driver");} 
    catch (ClassNotFoundException ex) {Logger.getLogger(profitm.class.getName()).log(Level.SEVERE, null, ex);}
    connects=(Connection) DriverManager.getConnection(dburl, "root", "");stnt1=(Statement) connects.createStatement();
    rs=stnt1.executeQuery("SELECT * FROM profitm WHERE month='"+month4+"' AND year='"+year4+"'");
    if(rs.next()){stnt=(PreparedStatement) connects.prepareStatement("UPDATE profitm SET sales='"+sales4+"', purchases='"+purchases4+"', profit='"+profit4+"', loss='"+loss4+"' WHERE month='"+month4+"' AND year='"+year4+"'");
    stnt.executeUpdate();DefaultTableModel model = (DefaultTableModel) jTable1.getModel();model.setRowCount(0);show_user();}
    else{JOptionPane.showMessageDialog(null, "Cannot Update. The Entry Does Not Exist.");}rs.close(); stnt1.close();  stnt.close();connects.close();} 
    catch (SQLException ex) {try {Logger.getLogger(profitm.class.getName()).log(Level.SEVERE, null, ex);
    rs.close(); stnt1.close();stnt.close();connects.close();} 
    catch (SQLException ex1) {Logger.getLogger(profitm.class.getName()).log(Level.SEVERE, null, ex1);}}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    try{String month5=jComboBox1.getSelectedItem().toString();String year5=jTextField1.getText();
    try{Class.forName("com.mysql.jdbc.Driver");} 
    catch (ClassNotFoundException ex) {Logger.getLogger(profitm.class.getName()).log(Level.SEVERE, null, ex);}
    connects=(Connection) DriverManager.getConnection(dburl, "root", "");stnt1=(Statement) connects.createStatement();
    rs=stnt1.executeQuery("SELECT * FROM profitm WHERE month='"+month5+"' AND year='"+year5+"'");
    if (jTextField1.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Year!");}
    else if (jComboBox1.getSelectedItem()=="NONE"){JOptionPane.showMessageDialog(null, "Please select Month!");}
    else{if(rs.next()){String sales =rs.getString("sales");String purchases =rs.getString("purchases");String profit =rs.getString("profit");String loss =rs.getString("loss");
    JOptionPane.showMessageDialog(null, "Month: "+month5+". Year: "+year5+". Sales: "+sales+". Purchases: "+purchases+". Profit: "+profit+". Loss: "+loss+".");}
    else{JOptionPane.showMessageDialog(null, "Not Found!");}DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);show_user();}rs.close();stnt1.close();connects.close();} 
    catch (SQLException | HeadlessException e){JOptionPane.showMessageDialog(null, e.getMessage());
    try {rs.close(); stnt1.close();connects.close();} 
    catch (SQLException ex) {Logger.getLogger(profitm.class.getName()).log(Level.SEVERE, null, ex);}}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    try{String month6=jComboBox1.getSelectedItem().toString();String year6=jTextField1.getText();
    try{Class.forName("com.mysql.jdbc.Driver");} 
    catch (ClassNotFoundException ex) {Logger.getLogger(profitm.class.getName()).log(Level.SEVERE, null, ex);}
    connects=(Connection) DriverManager.getConnection(dburl, "root", "");stnt1=(Statement) connects.createStatement();
    rs=stnt1.executeQuery("SELECT * FROM profitm WHERE month='"+month6+"' AND year='"+year6+"'");
    if(rs.next()){stnt=(PreparedStatement) connects.prepareStatement("DELETE FROM profitm WHERE month='"+month6+"' AND year='"+year6+"'");
    if (jTextField1.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Year!");}
    else if (jComboBox1.getSelectedItem()=="NONE"){JOptionPane.showMessageDialog(null, "Please select Month!");}
    else{stnt.executeUpdate();DefaultTableModel model = (DefaultTableModel) jTable1.getModel();model.setRowCount(0);show_user();}}
    else{JOptionPane.showMessageDialog(null, "Cannot Delete. The Entry Does not Exist!");}rs.close();stnt1.close();stnt.close();connects.close();}
    catch (SQLException | HeadlessException e){JOptionPane.showMessageDialog(null, e.getMessage());
    try {rs.close();stnt1.close(); stnt.close();connects.close();} 
    catch (SQLException ex) {Logger.getLogger(profitm.class.getName()).log(Level.SEVERE, null, ex);}}
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
    try {attendant2 frame = new attendant2();frame.setVisible(true);this.setVisible(false);} 
    catch (SQLException ex) {Logger.getLogger(profitm.class.getName()).log(Level.SEVERE, null, ex);}
    }//GEN-LAST:event_jMenu7MouseClicked

    public static void main(String args[]) {java.awt.EventQueue.invokeLater(() -> {
    try {new profitm().setVisible(true);} catch (SQLException ex) {Logger.getLogger(profitm.class.getName()).log(Level.SEVERE, null, ex);}});}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
