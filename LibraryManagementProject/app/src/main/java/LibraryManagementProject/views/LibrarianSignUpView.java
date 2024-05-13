package LibraryManagementProject.views;

import LibraryManagementProject.controllers.LibrarianController;
import javax.swing.JOptionPane;

/**
 *
 * @author bridj
 */
public class LibrarianSignUpView extends javax.swing.JFrame {

    private LibrarianController librarianController;

    public LibrarianSignUpView(LibrarianController controller) {
        this.librarianController = controller;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelLibrarianUsername = new javax.swing.JLabel();
        labelLibrarianPassword = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        btnSignup = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Librarian Sign Up");
        setBackground(new java.awt.Color(202, 233, 255));
        setName("librarianSignupFrame"); // NOI18N
        setSize(new java.awt.Dimension(500, 500));

        jPanel1.setBackground(new java.awt.Color(194, 228, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setInheritsPopupMenu(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 430));

        labelTitle.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(27, 73, 101));
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("Librarian Sign Up");
        labelTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel2.setBackground(new java.awt.Color(214, 237, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        labelLibrarianUsername.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelLibrarianUsername.setForeground(new java.awt.Color(27, 73, 101));
        labelLibrarianUsername.setText("Username:");

        labelLibrarianPassword.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelLibrarianPassword.setForeground(new java.awt.Color(27, 73, 101));
        labelLibrarianPassword.setText("Password:");

        usernameField.setBackground(new java.awt.Color(214, 237, 255));
        usernameField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        usernameField.setForeground(new java.awt.Color(27, 73, 101));

        passwordField.setBackground(new java.awt.Color(214, 237, 255));
        passwordField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(27, 73, 101));
        passwordField.setCaretColor(new java.awt.Color(214, 237, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLibrarianUsername)
                    .addComponent(labelLibrarianPassword))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {labelLibrarianPassword, labelLibrarianUsername});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {passwordField, usernameField});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLibrarianUsername)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLibrarianPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {labelLibrarianPassword, labelLibrarianUsername});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {passwordField, usernameField});

        btnSignup.setBackground(new java.awt.Color(95, 168, 211));
        btnSignup.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnSignup.setForeground(new java.awt.Color(27, 73, 101));
        btnSignup.setText("Sign Up");
        btnSignup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(95, 168, 211));
        backButton.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        backButton.setForeground(new java.awt.Color(27, 73, 101));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnSignup)
                    .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(461, 461, 461))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSignup)
                .addGap(18, 18, 18)
                .addComponent(backButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelTitle.getAccessibleContext().setAccessibleName("labelTitle");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        String username = usernameField.getText().trim();
        String password = new String(passwordField.getPassword()).trim();

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username and password cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            boolean result = librarianController.registerLibrarian(username, password);
            if (result) {
                JOptionPane.showMessageDialog(this, "Librarian registered successfully!");
                LibrarianLoginView librarianLoginView = new LibrarianLoginView(librarianController);
                librarianLoginView.setVisible(true);
                this.dispose();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Failed to register librarian: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSignupActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        LibrarianLoginView librarianLoginView = new LibrarianLoginView(librarianController);
        librarianLoginView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(LibrarianSignUpView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarianSignUpView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarianSignUpView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarianSignUpView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new LibrarianSignUpView(librarianController).setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton btnSignup;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelLibrarianPassword;
    private javax.swing.JLabel labelLibrarianUsername;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
