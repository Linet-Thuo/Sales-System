import com.mysql.jdbc.Connection;import com.mysql.jdbc.PreparedStatement;import com.mysql.jdbc.Statement;import java.awt.HeadlessException;
import java.sql.DriverManager;import java.sql.ResultSet;import java.sql.SQLException;import java.util.ArrayList;
import java.util.logging.Level;import java.util.logging.Logger;import javax.swing.JOptionPane;import javax.swing.table.DefaultTableModel;

public class profity extends javax.swing.JFrame {
String JDBC_Driver="com.mysql.jdbc.Driver";String dburl ="jdbc:mysql://localhost:3306/food?zeroDateTimeBehavior=convertToNull";
Connection connects=null;PreparedStatement  stnt=null;Statement stnt1=null, stnt2=null;ResultSet rs=null, rs1=null;

public profity() throws SQLException { initComponents(); show_user(); }
public ArrayList<User2> userList() throws SQLException{ ArrayList<User2> userList=new ArrayList<>();
try{Class.forName("com.mysql.jdbc.Driver");connects=(Connection) DriverManager.getConnection(dburl, "root", "");
stnt1=(Statement) connects.createStatement();rs=stnt1.executeQuery("SELECT * FROM profity");User2 user;
while (rs.next()){ user= new User2(rs.getInt("year"),rs.getInt("profit"),rs.getInt("loss"),rs.getInt("yeargain"),rs.getInt("yearloss"));
userList.add(user);}} catch (ClassNotFoundException | SQLException e) {JOptionPane.showMessageDialog(null, e);}return userList;}

public void show_user() throws SQLException{ArrayList<User2> list = userList();
DefaultTableModel model= (DefaultTableModel) jTable1.getModel();Object [] row = new Object [5];
for (int i=0; i<list.size();i++){row[0]=list.get(i).getyear();row[1]=list.get(i).getprofit();
row[2]=list.get(i).getloss();row[3]=list.get(i).getyeargain();row[4]=list.get(i).getyearloss();model.addRow(row);}}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
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
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "YEARLY PROFIT:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("YEAR:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("PROFIT:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("0");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("LOSS:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("0");

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
        jButton5.setText("DELETE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("SEARCH");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("YEARLY GAIN:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("0");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("YEARLY LOSS:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addGap(54, 54, 54)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(45, 45, 45)
                                .addComponent(jButton4)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jButton2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(jButton5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel9))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jButton6)))
                                .addGap(82, 82, 82))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Year", "Profit", "Loss", "Yearly Gain", "Yearly Loss"
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try{String year1=jTextField1.getText(); try{Class.forName("com.mysql.jdbc.Driver");} 
    catch (ClassNotFoundException ex) {Logger.getLogger(profity.class.getName()).log(Level.SEVERE, null, ex);}
    connects=(Connection) DriverManager.getConnection(dburl, "root", "");stnt1=(Statement) connects.createStatement();
    rs=stnt1.executeQuery("SELECT SUM(profit) as profita FROM profitm WHERE year='"+year1+"'");
    if(rs.next()){int profita=rs.getInt("profita");String ab=rs.getString("profita");
    if(profita>0){jLabel3.setText(ab);}else{jLabel3.setText("0");}}
    else{JOptionPane.showMessageDialog(null, "Not Found!");}stnt2=(Statement) connects.createStatement();
    rs1=stnt1.executeQuery("SELECT SUM(loss) as lossb FROM profitm WHERE year='"+year1+"'");
    if(rs1.next()){int lossb=rs1.getInt("lossb");String ab=rs1.getString("lossb");
    if(lossb>0){jLabel5.setText(ab);}else{jLabel5.setText("0");}}
    else{JOptionPane.showMessageDialog(null, "Not Found!");}
    int a=0, b=0, c=0, d=0;a=Integer.parseInt(jLabel3.getText());b=Integer.parseInt(jLabel5.getText());
    if (a>b){c=a-b;String ans;ans=String.valueOf(c);jLabel7.setText(ans);jLabel9.setText("0");}
    else{d=b-a;String ans;ans=String.valueOf(d);jLabel7.setText(ans);jLabel9.setText("0");}
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();model.setRowCount(0);show_user();
    rs.close();rs1.close();stnt1.close();stnt2.close();connects.close();} 
    catch (SQLException ex) { try {Logger.getLogger(profity.class.getName()).log(Level.SEVERE, null, ex);
    JOptionPane.showMessageDialog(null, "Not Found!");rs.close();rs1.close();stnt1.close();stnt2.close();connects.close();} 
    catch (SQLException ex1) {Logger.getLogger(profity.class.getName()).log(Level.SEVERE, null, ex1);}}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    jTextField1.setText("");jLabel3.setText("0");jLabel5.setText("0");jLabel7.setText("0");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    try{String year3=jTextField1.getText();String profit3=jLabel3.getText();
    String loss3=jLabel5.getText(); String yeargain3=jLabel7.getText();String yearloss3=jLabel9.getText();
    try{Class.forName("com.mysql.jdbc.Driver");} 
    catch (ClassNotFoundException ex) {Logger.getLogger(profity.class.getName()).log(Level.SEVERE, null, ex);}
    connects=(Connection) DriverManager.getConnection(dburl, "root", "");stnt1=(Statement) connects.createStatement();
    rs=stnt1.executeQuery("SELECT * FROM profity WHERE year='"+year3+"'");
    if(rs.next()){JOptionPane.showMessageDialog(null, "Cannot add. The entry already exists.");}
    else{stnt=(PreparedStatement) connects.prepareStatement("INSERT INTO profity(year, profit, loss, yeargain, yearloss) "
            + "VALUES('"+year3+"', '"+profit3+"', '"+loss3+"', '"+yeargain3+"', '"+yearloss3+"')");
    if (jTextField1.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Year.");}
    else{stnt.executeUpdate();DefaultTableModel model = (DefaultTableModel) jTable1.getModel();model.setRowCount(0);show_user();}}
    rs.close();    stnt1.close();stnt.close(); connects.close();} 
    catch (SQLException | HeadlessException e) {JOptionPane.showMessageDialog(null, e.getMessage());
    try {rs.close(); stnt1.close();stnt.close(); connects.close();} 
    catch (SQLException ex) {Logger.getLogger(profity.class.getName()).log(Level.SEVERE, null, ex);}}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    try{String year4=jTextField1.getText();String profit4=jLabel3.getText();
    String loss4=jLabel5.getText();String yeargain4=jLabel7.getText();String yearloss4=jLabel9.getText();
    try{Class.forName("com.mysql.jdbc.Driver");} 
    catch (ClassNotFoundException ex) {Logger.getLogger(profity.class.getName()).log(Level.SEVERE, null, ex);}
    connects=(Connection) DriverManager.getConnection(dburl, "root", "");stnt1=(Statement) connects.createStatement();
    rs=stnt1.executeQuery("SELECT * FROM profity WHERE year='"+year4+"'");
    if(rs.next()){stnt=(PreparedStatement) connects.prepareStatement("UPDATE profity SET profit='"+profit4+"', loss='"+loss4+"', yeargain='"+yeargain4+"', yearloss='"+yearloss4+"' WHERE year='"+year4+"'");
    if (jTextField1.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Year.");}
    else{stnt.executeUpdate();DefaultTableModel model = (DefaultTableModel) jTable1.getModel();model.setRowCount(0);show_user();}}
    else{JOptionPane.showMessageDialog(null, "Cannot add. The Entry Does Not Exists.");}
    rs.close(); stnt1.close();stnt.close(); connects.close();} 
    catch (SQLException | HeadlessException e) {JOptionPane.showMessageDialog(null, e.getMessage());
    try {rs.close(); stnt1.close();stnt.close(); connects.close();} 
    catch (SQLException ex) {Logger.getLogger(profity.class.getName()).log(Level.SEVERE, null, ex);}}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    try{String year5=jTextField1.getText();try{Class.forName("com.mysql.jdbc.Driver");}    
    catch (ClassNotFoundException ex) {Logger.getLogger(profity.class.getName()).log(Level.SEVERE, null, ex);}
    connects=(Connection) DriverManager.getConnection(dburl, "root", "");stnt1=(Statement) connects.createStatement();
    rs=stnt1.executeQuery("SELECT * FROM profity WHERE year='"+year5+"'");
    if(rs.next()){stnt=(PreparedStatement) connects.prepareStatement("DELETE FROM profity WHERE year='"+year5+"'");
    if (jTextField1.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Year.");}
    else{stnt.executeUpdate();DefaultTableModel model = (DefaultTableModel) jTable1.getModel();model.setRowCount(0);show_user();
    rs.close(); stnt1.close();  stnt.close();connects.close();}}
    else{JOptionPane.showMessageDialog(null, "Cannot add. The Entry Does Not Exists.");}}
    catch (SQLException | HeadlessException e){JOptionPane.showMessageDialog(null, e.getMessage());
    try {rs.close(); stnt1.close(); stnt.close();connects.close();} 
    catch (SQLException ex) {Logger.getLogger(profity.class.getName()).log(Level.SEVERE, null, ex);}}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    try{String year6=jTextField1.getText();try{Class.forName("com.mysql.jdbc.Driver");} 
    catch (ClassNotFoundException ex) {Logger.getLogger(profity.class.getName()).log(Level.SEVERE, null, ex);}
    connects=(Connection) DriverManager.getConnection(dburl, "root", "");stnt1=(Statement) connects.createStatement();
    rs=stnt1.executeQuery("SELECT * FROM profity WHERE year='"+year6+"'");
    if (jTextField1.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Year.");}
    else{if(rs.next()){String profit6=rs.getString("profit");
    String loss6=rs.getString("loss");String yeargain6=rs.getString("yeargain");String yearloss6=rs.getString("yearloss");
    JOptionPane.showMessageDialog(null, "Year:"+year6+". Profit:"+profit6+". Loss:"+loss6+". Yearly Gain:"+yeargain6+". Yearly Loss:"+yearloss6+".");}
    else{JOptionPane.showMessageDialog(null, "Not Found!");}}
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); model.setRowCount(0);show_user();
    rs.close();stnt1.close();connects.close();} 
    catch (SQLException ex) { try {Logger.getLogger(profity.class.getName()).log(Level.SEVERE, null, ex);
    JOptionPane.showMessageDialog(null, "Not Found!");rs.close();stnt1.close();connects.close();} 
    catch (SQLException ex1) {Logger.getLogger(profity.class.getName()).log(Level.SEVERE, null, ex1);}}
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
    menu frame =new menu();frame.setVisible(true);this.setVisible(false);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
    try {items frame =new items();frame.setVisible(true);this.setVisible(false);} 
    catch (SQLException ex) {Logger.getLogger(profitm.class.getName()).log(Level.SEVERE, null, ex);}
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
    try {sales2 frame =new sales2();frame.setVisible(true);this.setVisible(false);} 
    catch (SQLException ex) {Logger.getLogger(profity.class.getName()).log(Level.SEVERE, null, ex);}
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
    catch (SQLException ex) {Logger.getLogger(profity.class.getName()).log(Level.SEVERE, null, ex);}
    }//GEN-LAST:event_jMenu7MouseClicked
     public static void main(String args[]) {java.awt.EventQueue.invokeLater(() -> {
     try {new profity().setVisible(true);} catch (SQLException ex) {Logger.getLogger(profity.class.getName()).log(Level.SEVERE, null, ex);}});}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
