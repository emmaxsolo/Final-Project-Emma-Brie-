package LibraryManagementProject.views;

import LibraryManagementProject.DatabaseInitializer;
import LibraryManagementProject.LanguageChangeListener;
import LibraryManagementProject.ResourceManager;
import LibraryManagementProject.controllers.MainController;
import java.util.Locale;
import java.util.ResourceBundle;

public class EntryView extends javax.swing.JFrame {

    private MainController mainController;
    private ResourceBundle bundle;
    private ResourceBundle bundleFR;

    public EntryView(MainController mainController) {
        this.mainController = mainController;
        initComponents();

        bundle = ResourceBundle.getBundle("EntryView");
        bundleFR = ResourceBundle.getBundle("EntryView_fr_FR", Locale.FRANCE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        subtitleLabel = new javax.swing.JLabel();
        btnLibrarian = new javax.swing.JButton();
        btnStudent = new javax.swing.JButton();
        frenchButton = new javax.swing.JRadioButton();
        englishButton = new javax.swing.JRadioButton();
        titleLabel = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Entry");
        setBackground(java.awt.SystemColor.window);
        setForeground(new java.awt.Color(179, 200, 207));
        setName("entryFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));

        jPanel1.setBackground(new java.awt.Color(202, 233, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("windowBorder")));
        jPanel1.setName("entryPanel"); // NOI18N

        imageLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/entrylibrary.png"))); // NOI18N

        subtitleLabel.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        subtitleLabel.setForeground(new java.awt.Color(255, 122, 178));
        subtitleLabel.setText("I AM A ...");
        subtitleLabel.setMaximumSize(new java.awt.Dimension(155, 39));

        btnLibrarian.setBackground(new java.awt.Color(95, 168, 211));
        btnLibrarian.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnLibrarian.setForeground(new java.awt.Color(27, 73, 101));
        btnLibrarian.setText("Librarian");
        btnLibrarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibrarianActionPerformed(evt);
            }
        });

        btnStudent.setBackground(new java.awt.Color(95, 168, 211));
        btnStudent.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnStudent.setForeground(new java.awt.Color(27, 73, 101));
        btnStudent.setText("Student");
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });

        frenchButton.setBackground(new java.awt.Color(202, 233, 255));
        buttonGroup1.add(frenchButton);
        frenchButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        frenchButton.setForeground(new java.awt.Color(27, 73, 101));
        frenchButton.setText("French");
        frenchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frenchButtonActionPerformed(evt);
            }
        });

        englishButton.setBackground(new java.awt.Color(202, 233, 255));
        buttonGroup1.add(englishButton);
        englishButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        englishButton.setForeground(new java.awt.Color(27, 73, 101));
        englishButton.setSelected(true);
        englishButton.setText("English");
        englishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                englishButtonActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(27, 73, 101));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("LIBRARY MANAGEMENT SYSTEM");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLibrarian, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addComponent(btnStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(englishButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(frenchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imageLabel)))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(subtitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnLibrarian, btnStudent});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subtitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLibrarian, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(englishButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(frenchButton)
                        .addGap(17, 17, 17)))
                .addGap(19, 19, 19))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnLibrarian, btnStudent});

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLibrarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibrarianActionPerformed
        LibrarianLoginView librarianLoginView = new LibrarianLoginView(mainController);
        librarianLoginView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLibrarianActionPerformed

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed
        StudentLoginView studentLoginView = new StudentLoginView(mainController);
        studentLoginView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnStudentActionPerformed

    private void frenchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frenchButtonActionPerformed
        titleLabel.setText(bundleFR.getString("Title"));
        subtitleLabel.setText(bundleFR.getString("Iam"));
        btnLibrarian.setText(bundleFR.getString("Librarian"));
        btnStudent.setText(bundleFR.getString("Student"));

    }//GEN-LAST:event_frenchButtonActionPerformed

    private void englishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_englishButtonActionPerformed
        titleLabel.setText(bundle.getString("Title"));
        subtitleLabel.setText(bundle.getString("Iam"));
        btnLibrarian.setText(bundle.getString("Librarian"));
        btnStudent.setText(bundle.getString("Student"));

    }//GEN-LAST:event_englishButtonActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        DatabaseInitializer.getInstance();
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
            java.util.logging.Logger.getLogger(EntryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainController mainController = MainController.getInstance();
                new EntryView(mainController).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLibrarian;
    private javax.swing.JButton btnStudent;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton englishButton;
    private javax.swing.JRadioButton frenchButton;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel subtitleLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

}
