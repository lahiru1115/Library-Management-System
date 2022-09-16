
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class adminForm extends javax.swing.JFrame {

    Connection con = null;
    Statement st = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public adminForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lib_password = new javax.swing.JTextField();
        lib_username = new javax.swing.JTextField();
        lib_lname = new javax.swing.JTextField();
        lib_fname = new javax.swing.JTextField();
        lib_id = new javax.swing.JTextField();
        lib_add = new javax.swing.JButton();
        lib_view = new javax.swing.JButton();
        lib_delete = new javax.swing.JButton();
        lib_update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lib_table = new javax.swing.JTable();
        lib_search = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        assLib_password = new javax.swing.JTextField();
        assLib_username = new javax.swing.JTextField();
        assLib_lname = new javax.swing.JTextField();
        assLib_fname = new javax.swing.JTextField();
        assLib_id = new javax.swing.JTextField();
        assLib_add = new javax.swing.JButton();
        assLib_view = new javax.swing.JButton();
        assLib_delete = new javax.swing.JButton();
        assLib_update = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        assLib_table = new javax.swing.JTable();
        assLib_search = new javax.swing.JButton();

        jMenu3.setText("jMenu3");

        setTitle("Admin");

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin");
        jLabel1.setToolTipText("");
        jLabel1.setOpaque(true);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/headerLeft.png"))); // NOI18N

        logout.setBackground(new java.awt.Color(255, 255, 204));
        logout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        logout.setText("Logout");
        logout.setBorder(null);
        logout.setBorderPainted(false);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Librarian", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 150, 200))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Id");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("First Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Last Name");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Username");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Password");

        lib_password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lib_username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lib_lname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lib_fname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lib_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lib_add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lib_add.setText("Add");
        lib_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lib_addActionPerformed(evt);
            }
        });

        lib_view.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lib_view.setText("View");
        lib_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lib_viewActionPerformed(evt);
            }
        });

        lib_delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lib_delete.setText("Delete");
        lib_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lib_deleteActionPerformed(evt);
            }
        });

        lib_update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lib_update.setText("Update");
        lib_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lib_updateActionPerformed(evt);
            }
        });

        lib_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "First Name", "Last Name", "Username", "Password"
            }
        ));
        jScrollPane1.setViewportView(lib_table);

        lib_search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lib_search.setText("Search");
        lib_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lib_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lib_fname)
                    .addComponent(lib_lname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lib_username, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lib_password, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lib_id, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lib_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lib_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lib_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lib_view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lib_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lib_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lib_add))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lib_fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(lib_view))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lib_lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(lib_search))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lib_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(lib_update))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lib_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(lib_delete)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Assistant Librarian", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 150, 200))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Id");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("First Name");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Last Name");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Username");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Password");

        assLib_password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        assLib_username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        assLib_lname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        assLib_fname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        assLib_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        assLib_add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        assLib_add.setText("Add");
        assLib_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assLib_addActionPerformed(evt);
            }
        });

        assLib_view.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        assLib_view.setText("View");
        assLib_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assLib_viewActionPerformed(evt);
            }
        });

        assLib_delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        assLib_delete.setText("Delete");
        assLib_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assLib_deleteActionPerformed(evt);
            }
        });

        assLib_update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        assLib_update.setText("Update");
        assLib_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assLib_updateActionPerformed(evt);
            }
        });

        assLib_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "First Name", "Last Name", "Username", "Password"
            }
        ));
        jScrollPane2.setViewportView(assLib_table);

        assLib_search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        assLib_search.setText("Search");
        assLib_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assLib_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(assLib_fname)
                    .addComponent(assLib_lname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assLib_username, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assLib_password, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assLib_id, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assLib_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(assLib_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(assLib_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(assLib_view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(assLib_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(assLib_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(assLib_add))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(assLib_fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(assLib_view))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(assLib_lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(assLib_search))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(assLib_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(assLib_update))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(assLib_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(assLib_delete)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1076, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // librarian delete
    private void lib_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lib_deleteActionPerformed
        String sql = "DELETE FROM librarian WHERE id=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, lib_id.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Delete Successfull");
        } catch (SQLException ex) {
            Logger.getLogger(adminForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lib_deleteActionPerformed

    // librarian add
    private void lib_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lib_addActionPerformed
        try {
            String id = lib_id.getText();
            String firstname = lib_fname.getText();
            String lasttname = lib_lname.getText();
            String uname = lib_username.getText();
            String pword = lib_password.getText();

            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rad_library", "root", "");
            pst = con.prepareStatement("INSERT INTO librarian (id,fname,lname,username,password) values (?,?,?,?,?)");

            pst.setString(1, id);
            pst.setString(2, firstname);
            pst.setString(3, lasttname);
            pst.setString(4, uname);
            pst.setString(5, pword);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registration Success");

            lib_id.setText("");
            lib_fname.setText("");
            lib_lname.setText("");
            lib_username.setText("");
            lib_password.setText("");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(adminForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(adminForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lib_addActionPerformed

    // librarian view
    private void lib_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lib_viewActionPerformed
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rad_library", "root", "");
            pst = con.prepareStatement("SELECT * FROM librarian");
            rs = pst.executeQuery();
            lib_table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_lib_viewActionPerformed

    // librarian update
    private void lib_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lib_updateActionPerformed
        try {
            String value1 = lib_id.getText();
            String value2 = lib_fname.getText();
            String value3 = lib_lname.getText();
            String value4 = lib_username.getText();
            String value5 = lib_password.getText();
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rad_library", "root", "");
            pst = con.prepareStatement("UPDATE librarian SET fname='" + value2 + "',lname='" + value3 + "',username='" + value4 + "',password='" + value5 + "' WHERE id='" + value1 + "'");
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_lib_updateActionPerformed

    // librarian search
    private void lib_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lib_searchActionPerformed
        try {
            con = (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rad_library", "root", "");
            pst = con.prepareStatement("SELECT * FROM librarian where id=?");
            pst.setString(1, lib_id.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("id");
                lib_id.setText(add1);
                String add2 = rs.getString("fname");
                lib_fname.setText(add2);
                String add3 = rs.getString("lname");
                lib_lname.setText(add3);
                String add4 = rs.getString("username");
                lib_username.setText(add4);
                String add5 = rs.getString("password");
                lib_password.setText(add5);
                rs.close();
                pst.close();
            } else {
                JOptionPane.showMessageDialog(null, "User is not available");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                pst.close();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_lib_searchActionPerformed

    // admin logout
    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        dispose();
    }//GEN-LAST:event_logoutActionPerformed

    // assistant_librarian add
    private void assLib_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assLib_addActionPerformed
        try {
            String id = assLib_id.getText();
            String firstname = assLib_fname.getText();
            String lasttname = assLib_lname.getText();
            String uname = assLib_username.getText();
            String pword = assLib_password.getText();

            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rad_library", "root", "");
            pst = con.prepareStatement("INSERT INTO assistant_librarian (id,fname,lname,username,password) values (?,?,?,?,?)");

            pst.setString(1, id);
            pst.setString(2, firstname);
            pst.setString(3, lasttname);
            pst.setString(4, uname);
            pst.setString(5, pword);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registration Success");

            assLib_id.setText("");
            assLib_fname.setText("");
            assLib_lname.setText("");
            assLib_username.setText("");
            assLib_password.setText("");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(adminForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(adminForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_assLib_addActionPerformed

    // assistant_librarian view
    private void assLib_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assLib_viewActionPerformed
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rad_library", "root", "");
            pst = con.prepareStatement("SELECT * FROM assistant_librarian");
            rs = pst.executeQuery();
            assLib_table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_assLib_viewActionPerformed

    // assistant_librarian delete
    private void assLib_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assLib_deleteActionPerformed
        String sql = "DELETE FROM assistant_librarian WHERE id=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, assLib_id.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Delete Successfull");
        } catch (SQLException ex) {
            Logger.getLogger(adminForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_assLib_deleteActionPerformed

    // assistant_librarian update
    private void assLib_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assLib_updateActionPerformed
        try {
            String value1 = assLib_id.getText();
            String value2 = assLib_fname.getText();
            String value3 = assLib_lname.getText();
            String value4 = assLib_username.getText();
            String value5 = assLib_password.getText();
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rad_library", "root", "");
            pst = con.prepareStatement("UPDATE assistant_librarian SET fname='" + value2 + "',lname='" + value3 + "',username='" + value4 + "',password='" + value5 + "' WHERE id='" + value1 + "'");
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_assLib_updateActionPerformed

    // assistant_librarian search
    private void assLib_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assLib_searchActionPerformed
        try {
            con = (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rad_library", "root", "");
            pst = con.prepareStatement("SELECT * FROM assistant_librarian where id=?");
            pst.setString(1, assLib_id.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("id");
                assLib_id.setText(add1);
                String add2 = rs.getString("fname");
                assLib_fname.setText(add2);
                String add3 = rs.getString("lname");
                assLib_lname.setText(add3);
                String add4 = rs.getString("username");
                assLib_username.setText(add4);
                String add5 = rs.getString("password");
                assLib_password.setText(add5);
                rs.close();
                pst.close();
            } else {
                JOptionPane.showMessageDialog(null, "User is not available");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                pst.close();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_assLib_searchActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assLib_add;
    private javax.swing.JButton assLib_delete;
    private javax.swing.JTextField assLib_fname;
    private javax.swing.JTextField assLib_id;
    private javax.swing.JTextField assLib_lname;
    private javax.swing.JTextField assLib_password;
    private javax.swing.JButton assLib_search;
    private javax.swing.JTable assLib_table;
    private javax.swing.JButton assLib_update;
    private javax.swing.JTextField assLib_username;
    private javax.swing.JButton assLib_view;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton lib_add;
    private javax.swing.JButton lib_delete;
    private javax.swing.JTextField lib_fname;
    private javax.swing.JTextField lib_id;
    private javax.swing.JTextField lib_lname;
    private javax.swing.JTextField lib_password;
    private javax.swing.JButton lib_search;
    private javax.swing.JTable lib_table;
    private javax.swing.JButton lib_update;
    private javax.swing.JTextField lib_username;
    private javax.swing.JButton lib_view;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
}
