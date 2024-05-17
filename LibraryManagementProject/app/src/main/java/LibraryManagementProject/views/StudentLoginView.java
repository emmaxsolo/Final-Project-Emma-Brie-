package LibraryManagementProject.views;

import LibraryManagementProject.controllers.MainController;
import LibraryManagementProject.controllers.StudentController;
import LibraryManagementProject.views.StudentView;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author 1982228, emmas
 */
public class StudentLoginView extends javax.swing.JFrame {

    private MainController mainController;
    private StudentController studentController;
    private ResourceBundle bundle;
    private ResourceBundle bundleFR;

    /**
     * Creates new form StudentLoginView
     */
    public StudentLoginView(MainController mainController) {
        this.mainController = mainController;
        this.studentController = mainController.getStudentController();
        initComponents();
        bundle = ResourceBundle.getBundle("StudentLogInView");
        bundleFR = ResourceBundle.getBundle("StudentLogInView_fr_FR", Locale.FRANCE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelStudentUsername = new javax.swing.JLabel();
        labelStudentPassword = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        labelSignUp = new javax.swing.JLabel();
        englishBtn = new javax.swing.JRadioButton();
        frenchBtn = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Log In");

        jPanel1.setBackground(new java.awt.Color(194, 228, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelTitle.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(27, 73, 101));
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("Student Login");
        labelTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel2.setBackground(new java.awt.Color(214, 237, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        labelStudentUsername.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelStudentUsername.setForeground(new java.awt.Color(27, 73, 101));
        labelStudentUsername.setText("Username:");

        labelStudentPassword.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelStudentPassword.setForeground(new java.awt.Color(27, 73, 101));
        labelStudentPassword.setText("Password:");

        usernameField.setBackground(new java.awt.Color(235, 246, 255));
        usernameField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        usernameField.setForeground(new java.awt.Color(27, 73, 101));
        usernameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        passwordField.setBackground(new java.awt.Color(235, 246, 255));
        passwordField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(27, 73, 101));
        passwordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        passwordField.setCaretColor(new java.awt.Color(214, 237, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelStudentUsername)
                    .addComponent(labelStudentPassword))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {passwordField, usernameField});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelStudentUsername)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelStudentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {passwordField, usernameField});

        btnLogin.setBackground(new java.awt.Color(95, 168, 211));
        btnLogin.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(27, 73, 101));
        btnLogin.setText("Login");
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(95, 168, 211));
        backButton.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        backButton.setForeground(new java.awt.Color(27, 73, 101));
        backButton.setText("Back");
        backButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        labelSignUp.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelSignUp.setForeground(new java.awt.Color(27, 73, 101));
        labelSignUp.setText("No Account? Sign Up Here!");
        labelSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSignUpMouseClicked(evt);
            }
        });

        buttonGroup1.add(englishBtn);
        englishBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        englishBtn.setForeground(new java.awt.Color(27, 73, 101));
        englishBtn.setSelected(true);
        englishBtn.setText("English");
        englishBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                englishBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(frenchBtn);
        frenchBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        frenchBtn.setForeground(new java.awt.Color(27, 73, 101));
        frenchBtn.setText("French");
        frenchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frenchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLogin)
                        .addGap(123, 123, 123)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(englishBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(frenchBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(38, 38, 38))))
            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanel1Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(labelTitle)
                .addGap(163, 163, 163))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addGap(253, 253, 253)
                .addComponent(labelSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(backButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(englishBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(frenchBtn))
                            .addComponent(btnLogin))
                        .addGap(43, 43, 43)
                        .addComponent(labelSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/**
     * Confirms the request to login and see if it is successful or not
     *
     * @param evt
     */
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String username = usernameField.getText().trim();
        String password = new String(passwordField.getPassword()).trim();

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username and password cannot be empty.", "Login Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!studentController.logInStudent(username, password)) {
            JOptionPane.showMessageDialog(this, "Invalid username or password.", "Login Failed", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Login Successful!", "Login Success", JOptionPane.INFORMATION_MESSAGE);
            StudentView studentView = new StudentView(mainController);
            studentView.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnLoginActionPerformed
    /**
     * This button brings the user back to the entry view.
     *
     * @param evt
     */
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        EntryView entryView = new EntryView(mainController);
        entryView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed
    /**
     * This method allows the user to sign up and be redirected to the
     * signUpView.
     *
     * @param evt
     */
    private void labelSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSignUpMouseClicked
        StudentSignUpView studentSignUpView = new StudentSignUpView(mainController);
        studentSignUpView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_labelSignUpMouseClicked
    /**
     * This method changes the texts of elements to english.
     *
     * @param evt
     */
    private void englishBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_englishBtnActionPerformed
        labelTitle.setText(bundle.getString("studentLoginTitle"));
        labelStudentUsername.setText(bundle.getString("usernameLabel"));
        labelStudentPassword.setText(bundle.getString("passwordLabel"));
        btnLogin.setText(bundle.getString("loginButton"));
        backButton.setText(bundle.getString("backButton"));
        labelSignUp.setText(bundle.getString("signUpPrompt"));
        englishBtn.setText(bundle.getString("englishBtn"));
        frenchBtn.setText(bundle.getString("frenchBtn"));
    }//GEN-LAST:event_englishBtnActionPerformed
    /**
     * This method changes the texts of elements to french.
     *
     * @param evt
     */
    private void frenchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frenchBtnActionPerformed
        labelTitle.setText(bundleFR.getString("studentLoginTitle"));
        labelStudentUsername.setText(bundleFR.getString("usernameLabel"));
        labelStudentPassword.setText(bundleFR.getString("passwordLabel"));
        btnLogin.setText(bundleFR.getString("loginButton"));
        backButton.setText(bundleFR.getString("backButton"));
        labelSignUp.setText(bundleFR.getString("signUpPrompt"));
        englishBtn.setText(bundleFR.getString("englishBtn"));
        frenchBtn.setText(bundleFR.getString("frenchBtn"));
    }//GEN-LAST:event_frenchBtnActionPerformed

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
            java.util.logging.Logger.getLogger(StudentLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainController mainController = new MainController();
                new StudentLoginView(mainController).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton btnLogin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton englishBtn;
    private javax.swing.JRadioButton frenchBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelSignUp;
    private javax.swing.JLabel labelStudentPassword;
    private javax.swing.JLabel labelStudentUsername;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
