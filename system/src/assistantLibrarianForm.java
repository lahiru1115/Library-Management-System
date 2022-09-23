
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class assistantLibrarianForm extends javax.swing.JFrame {

    Connection con = null;
    Statement st = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public assistantLibrarianForm() {
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
        req_stuId = new javax.swing.JTextField();
        req_bookName = new javax.swing.JTextField();
        req_bookId = new javax.swing.JTextField();
        req_id = new javax.swing.JTextField();
        req_issue = new javax.swing.JButton();
        req_view = new javax.swing.JButton();
        req_cancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        req_table = new javax.swing.JTable();
        req_search = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        req_stuName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        req_date = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        isu_stuId = new javax.swing.JTextField();
        isu_bookName = new javax.swing.JTextField();
        isu_bookId = new javax.swing.JTextField();
        isu_id = new javax.swing.JTextField();
        isu_view = new javax.swing.JButton();
        isu_return = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        isu_table = new javax.swing.JTable();
        isu_search = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        isu_stuName = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        isu_date = new javax.swing.JTextField();

        jMenu3.setText("jMenu3");

        setTitle("Admin");

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Assistant Librarian");
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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pending Requests", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 150, 200))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Request Id");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Book Id");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Book Name");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Student Id");

        req_stuId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        req_bookName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        req_bookId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        req_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        req_issue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        req_issue.setText("Issue");
        req_issue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                req_issueActionPerformed(evt);
            }
        });

        req_view.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        req_view.setText("View");
        req_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                req_viewActionPerformed(evt);
            }
        });

        req_cancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        req_cancel.setText("Cancel");
        req_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                req_cancelActionPerformed(evt);
            }
        });

        req_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Request Id", "Book Id", "Book Name", "Student Id", "Student Name", "Request Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(req_table);

        req_search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        req_search.setText("Search");
        req_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                req_searchActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Student Name");

        req_stuName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Request Date");

        req_date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel14)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(req_bookId)
                        .addComponent(req_bookName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(req_stuId, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(req_id, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(req_stuName)
                    .addComponent(req_date))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(req_cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(req_issue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(req_view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(req_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {req_bookId, req_bookName, req_date, req_id, req_stuId, req_stuName});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(req_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(req_bookId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(req_bookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(req_stuId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(req_view)
                                        .addGap(18, 18, 18)
                                        .addComponent(req_search)
                                        .addGap(18, 18, 18)
                                        .addComponent(req_issue)
                                        .addGap(18, 18, 18)
                                        .addComponent(req_cancel)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(req_stuName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(req_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 34, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Issued Books", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 150, 200))); // NOI18N

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("issue Id");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Book Id");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Book Name");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Student Id");

        isu_stuId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        isu_bookName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        isu_bookId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        isu_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        isu_view.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        isu_view.setText("View");
        isu_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isu_viewActionPerformed(evt);
            }
        });

        isu_return.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        isu_return.setText("Return");
        isu_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isu_returnActionPerformed(evt);
            }
        });

        isu_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Issue Id", "Book Id", "Book Name", "Student Id", "Student Name", "Issued Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(isu_table);

        isu_search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        isu_search.setText("Search");
        isu_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isu_searchActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Student Name");

        isu_stuName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Issued Date");

        isu_date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28)
                    .addComponent(jLabel27)
                    .addComponent(jLabel30))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(isu_bookId, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(isu_bookName)
                    .addComponent(isu_stuId)
                    .addComponent(isu_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isu_stuName)
                    .addComponent(isu_date))
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(isu_return, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(isu_view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(isu_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(isu_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(isu_bookId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel28))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(isu_bookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel29))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(isu_stuId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel30)))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(isu_view)
                                        .addGap(18, 18, 18)
                                        .addComponent(isu_search)
                                        .addGap(18, 18, 18)
                                        .addComponent(isu_return)))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel31)
                                    .addComponent(isu_stuName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel32)
                                    .addComponent(isu_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 34, Short.MAX_VALUE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
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
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
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

    public void issueDelete(){
        String sql = "DELETE FROM request_books WHERE requestID=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, req_id.getText());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(adminForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void issueAdd(){
        try {
            String bookId = req_bookId.getText();
            String studentId = req_stuId.getText();
            java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());

            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rad_library_old", "root", "");
            pst = con.prepareStatement("INSERT INTO issue_books (issueID,bookId,stuId,issueDate) values (?,?,?,?)");

            String issueID = null;
            pst.setString(1, issueID);
            pst.setString(2, bookId);
            pst.setString(3, studentId);
            Timestamp issueDate = date;
            pst.setTimestamp(4, issueDate);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully added");

            req_id.setText("");
            req_bookId.setText("");
            req_bookName.setText("");
            req_stuId.setText("");
            req_stuName.setText("");
            req_date.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(adminForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // request books delete
    private void req_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_req_cancelActionPerformed
        String sql = "DELETE FROM request_books WHERE requestID=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, req_id.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Delete Successfull");
        } catch (SQLException ex) {
            Logger.getLogger(adminForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_req_cancelActionPerformed

    // request books lissue
    private void req_issueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_req_issueActionPerformed
        issueDelete();
        issueAdd();
    }//GEN-LAST:event_req_issueActionPerformed

    // request books view
    private void req_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_req_viewActionPerformed
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rad_library_old", "root", "");
            pst = con.prepareStatement("SELECT requestID, request_books.bookID, books.name, request_books.stuID, student.firstName, requestDate FROM request_books, books, student WHERE request_books.bookID = books.bookID AND request_books.stuID = student.stuId");
            rs = pst.executeQuery();
            req_table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_req_viewActionPerformed

    // request books search
    private void req_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_req_searchActionPerformed
        try {
            con = (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rad_library_old", "root", "");
            pst = con.prepareStatement("SELECT requestID, request_books.bookID, books.name, request_books.stuID, student.firstName, requestDate FROM request_books, books, student WHERE request_books.bookID = books.bookID AND request_books.stuID = student.stuId AND requestID=?");
            pst.setString(1, req_id.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("requestID");
                req_id.setText(add1);
                String add2 = rs.getString("bookID");
                req_bookId.setText(add2);
                String add3 = rs.getString("name");
                req_bookName.setText(add3);
                String add4 = rs.getString("stuID");
                req_stuId.setText(add4);
                String add5 = rs.getString("firstName");
                req_stuName.setText(add5);
                String add6 = rs.getString("requestDate");
                req_date.setText(add6);
                rs.close();
                pst.close();
            } else {
                JOptionPane.showMessageDialog(null, "Data is not available");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                pst.close();
            } catch (SQLException e) {
            }
        }
    }//GEN-LAST:event_req_searchActionPerformed

    // assistant_librarian logout
    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void isu_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isu_viewActionPerformed
        // TODO add your handling code here:
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rad_library_old", "root", "");
            pst = con.prepareStatement("SELECT issueID, issue_books.bookID, books.name, issue_books.stuID, student.firstName, issueDate FROM issue_books, books, student WHERE issue_books.bookID = books.bookID AND issue_books.stuID = student.stuId");
            rs = pst.executeQuery();
            isu_table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_isu_viewActionPerformed

    private void isu_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isu_searchActionPerformed
        // TODO add your handling code here:
        try {
            con = (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rad_library_old", "root", "");
            pst = con.prepareStatement("SELECT issueID, issue_books.bookID, books.name, issue_books.stuID, student.firstName, issueDate FROM issue_books, books, student WHERE issue_books.bookID = books.bookID AND issue_books.stuID = student.stuId AND issueID=?");
            pst.setString(1, isu_id.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("issueID");
                isu_id.setText(add1);
                String add2 = rs.getString("bookID");
                isu_bookId.setText(add2);
                String add3 = rs.getString("name");
                isu_bookName.setText(add3);
                String add4 = rs.getString("stuID");
                isu_stuId.setText(add4);
                String add5 = rs.getString("firstName");
                isu_stuName.setText(add5);
                String add6 = rs.getString("issueDate");
                isu_date.setText(add6);
                rs.close();
                pst.close();
            } else {
                JOptionPane.showMessageDialog(null, "Data is not available");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                pst.close();
            } catch (SQLException e) {
            }
        }
    }//GEN-LAST:event_isu_searchActionPerformed

    private void isu_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isu_returnActionPerformed
        // TODO add your handling code here:
        String sql = "DELETE FROM issue_books WHERE issueID=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, isu_id.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Returned Successfull");
        } catch (SQLException ex) {
            Logger.getLogger(adminForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_isu_returnActionPerformed

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
    private javax.swing.JTextField isu_bookId;
    private javax.swing.JTextField isu_bookName;
    private javax.swing.JTextField isu_date;
    private javax.swing.JTextField isu_id;
    private javax.swing.JButton isu_return;
    private javax.swing.JButton isu_search;
    private javax.swing.JTextField isu_stuId;
    private javax.swing.JTextField isu_stuName;
    private javax.swing.JTable isu_table;
    private javax.swing.JButton isu_view;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton logout;
    private javax.swing.JTextField req_bookId;
    private javax.swing.JTextField req_bookId1;
    private javax.swing.JTextField req_bookId2;
    private javax.swing.JTextField req_bookName;
    private javax.swing.JTextField req_bookName1;
    private javax.swing.JTextField req_bookName2;
    private javax.swing.JButton req_cancel;
    private javax.swing.JButton req_cancel1;
    private javax.swing.JButton req_cancel2;
    private javax.swing.JTextField req_date;
    private javax.swing.JTextField req_date1;
    private javax.swing.JTextField req_date2;
    private javax.swing.JTextField req_id;
    private javax.swing.JTextField req_id1;
    private javax.swing.JTextField req_id2;
    private javax.swing.JButton req_issue;
    private javax.swing.JButton req_issue1;
    private javax.swing.JButton req_issue2;
    private javax.swing.JButton req_search;
    private javax.swing.JButton req_search1;
    private javax.swing.JButton req_search2;
    private javax.swing.JTextField req_stuId;
    private javax.swing.JTextField req_stuId1;
    private javax.swing.JTextField req_stuId2;
    private javax.swing.JTextField req_stuName;
    private javax.swing.JTextField req_stuName1;
    private javax.swing.JTextField req_stuName2;
    private javax.swing.JTable req_table;
    private javax.swing.JTable req_table1;
    private javax.swing.JTable req_table2;
    private javax.swing.JButton req_view;
    private javax.swing.JButton req_view1;
    private javax.swing.JButton req_view2;
    // End of variables declaration//GEN-END:variables
}
