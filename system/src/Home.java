
public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents(); // a method that netBeans swing designer creates to initialise components
    }

    @SuppressWarnings("unchecked") // allows programmers to disable compilation warnings for a certain part of a program
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        homeTitle = new javax.swing.JLabel();
        homeBackground = new javax.swing.JLabel();
        librarian = new javax.swing.JButton();
        student = new javax.swing.JButton();
        homeHeaderLeft = new javax.swing.JLabel();
        homeHeaderRight = new javax.swing.JLabel();
        admin = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        assistantLibrarian = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LIBRARY MANAGEMENT SYSTEM");

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        homeTitle.setBackground(new java.awt.Color(255, 255, 255));
        homeTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        homeTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeTitle.setText("LIBRARY MANAGEMENT SYSTEM");
        homeTitle.setOpaque(true);

        homeBackground.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.jpg"))); // NOI18N

        librarian.setBackground(new java.awt.Color(255, 255, 153));
        librarian.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        librarian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/librarian.png"))); // NOI18N
        librarian.setText("Librarian");
        librarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                librarianActionPerformed(evt);
            }
        });

        student.setBackground(new java.awt.Color(255, 255, 153));
        student.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        student.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/student.png"))); // NOI18N
        student.setText("Student");
        student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentActionPerformed(evt);
            }
        });

        homeHeaderLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/headerLeft.png"))); // NOI18N

        homeHeaderRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/headerLeft.png"))); // NOI18N

        admin.setBackground(new java.awt.Color(255, 255, 153));
        admin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin.png"))); // NOI18N
        admin.setText("Admin");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });

        registrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/registrar.png"))); // NOI18N
        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        assistantLibrarian.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        assistantLibrarian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/assistantLibrarian.png"))); // NOI18N
        assistantLibrarian.setText("Assistant Librarian");
        assistantLibrarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assistantLibrarianActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(homeHeaderLeft)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(homeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 974, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(homeHeaderRight)
                .addContainerGap())
            .addComponent(homeBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registrar)
                .addGap(99, 99, 99)
                .addComponent(librarian)
                .addGap(92, 92, 92)
                .addComponent(assistantLibrarian)
                .addGap(99, 99, 99)
                .addComponent(student)
                .addGap(69, 69, 69))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeHeaderLeft)
                    .addComponent(homeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeHeaderRight))
                .addGap(45, 45, 45)
                .addComponent(homeBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 521, Short.MAX_VALUE)
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(librarian, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assistantLibrarian, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        adminLogin form = new adminLogin();
        form.setVisible(true); // makes the frame appear on the screen
        form.pack(); // a method sizes the frame so that all its contents are at or above their preferred sizes
        form.setLocationRelativeTo(null); // sets the location of the window relative to the specified component
    }//GEN-LAST:event_adminActionPerformed
      
    private void librarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_librarianActionPerformed
        librarianLogin form = new librarianLogin();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
    }//GEN-LAST:event_librarianActionPerformed

    private void studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentActionPerformed
        studentLogin form = new studentLogin();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
    }//GEN-LAST:event_studentActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        registrarLogin form = new registrarLogin();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
    }//GEN-LAST:event_registrarActionPerformed

    private void assistantLibrarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assistantLibrarianActionPerformed
        assistantLibrarianLogin form = new assistantLibrarianLogin();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
    }//GEN-LAST:event_assistantLibrarianActionPerformed


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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin;
    private javax.swing.JButton assistantLibrarian;
    private javax.swing.JLabel homeBackground;
    private javax.swing.JLabel homeHeaderLeft;
    private javax.swing.JLabel homeHeaderRight;
    private javax.swing.JLabel homeTitle;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton librarian;
    private javax.swing.JButton registrar;
    private javax.swing.JButton student;
    // End of variables declaration//GEN-END:variables
}
