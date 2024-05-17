package LibraryManagementProject.views;

import LibraryManagementProject.controllers.LibrarianController;
import LibraryManagementProject.controllers.MainController;
import LibraryManagementProject.models.Librarian;
import LibraryManagementProject.models.Session;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author emmas, bridj
 */
public class LibrarianAddStudentView extends javax.swing.JFrame {
    private LibrarianController librarianController;
    private MainController mainController;
    private ResourceBundle bundle;
    private ResourceBundle bundleFR;

    public LibrarianAddStudentView(MainController mainController) {
        this.mainController = mainController;
        initComponents();
        bundle = ResourceBundle.getBundle("LibrarianAddStudentView");
        bundleFR = ResourceBundle.getBundle("LibrarianAddStudentView_fr_FR", Locale.FRANCE);
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
        mainPanel = new javax.swing.JPanel();
        addStudentTitleLabel = new javax.swing.JLabel();
        studentInfoPanel = new javax.swing.JPanel();
        addStudentLabel = new javax.swing.JLabel();
        studentNameLabel = new javax.swing.JLabel();
        studentContactNumberLabel = new javax.swing.JLabel();
        studentIDField = new javax.swing.JTextField();
        studentNameField = new javax.swing.JTextField();
        contactNumberField = new javax.swing.JTextField();
        saveStudentButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        EnglishButton = new javax.swing.JRadioButton();
        frenchButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(202, 233, 255));

        mainPanel.setBackground(new java.awt.Color(194, 228, 255));
        mainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        addStudentTitleLabel.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        addStudentTitleLabel.setForeground(new java.awt.Color(27, 73, 101));
        addStudentTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addStudentTitleLabel.setText("Add Student");
        addStudentTitleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        studentInfoPanel.setBackground(new java.awt.Color(214, 237, 255));
        studentInfoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        addStudentLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        addStudentLabel.setForeground(new java.awt.Color(27, 73, 101));
        addStudentLabel.setText("Student ID");

        studentNameLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        studentNameLabel.setForeground(new java.awt.Color(27, 73, 101));
        studentNameLabel.setText("Name");

        studentContactNumberLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        studentContactNumberLabel.setForeground(new java.awt.Color(27, 73, 101));
        studentContactNumberLabel.setText("Contact Number");

        studentIDField.setBackground(new java.awt.Color(235, 246, 255));
        studentIDField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        studentIDField.setForeground(new java.awt.Color(27, 73, 101));
        studentIDField.setCaretColor(new java.awt.Color(202, 233, 255));

        studentNameField.setBackground(new java.awt.Color(235, 246, 255));
        studentNameField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        studentNameField.setForeground(new java.awt.Color(27, 73, 101));
        studentNameField.setCaretColor(new java.awt.Color(202, 233, 255));

        contactNumberField.setBackground(new java.awt.Color(235, 246, 255));
        contactNumberField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        contactNumberField.setForeground(new java.awt.Color(27, 73, 101));
        contactNumberField.setCaretColor(new java.awt.Color(202, 233, 255));

        javax.swing.GroupLayout studentInfoPanelLayout = new javax.swing.GroupLayout(studentInfoPanel);
        studentInfoPanel.setLayout(studentInfoPanelLayout);
        studentInfoPanelLayout.setHorizontalGroup(
            studentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentInfoPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(studentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentInfoPanelLayout.createSequentialGroup()
                        .addComponent(addStudentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(studentInfoPanelLayout.createSequentialGroup()
                        .addGroup(studentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(studentContactNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(studentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contactNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
        );

        studentInfoPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {contactNumberField, studentIDField, studentNameField});

        studentInfoPanelLayout.setVerticalGroup(
            studentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentInfoPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(studentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentInfoPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(addStudentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(studentInfoPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(studentIDField)))
                .addGap(18, 18, 18)
                .addGroup(studentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentInfoPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(studentNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(studentInfoPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(studentNameField)))
                .addGap(18, 18, 18)
                .addGroup(studentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentInfoPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(studentContactNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(studentInfoPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(contactNumberField)))
                .addGap(19, 19, 19))
        );

        saveStudentButton.setBackground(new java.awt.Color(95, 168, 211));
        saveStudentButton.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        saveStudentButton.setForeground(new java.awt.Color(27, 73, 101));
        saveStudentButton.setText("Save");
        saveStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveStudentButtonActionPerformed(evt);
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

        buttonGroup1.add(EnglishButton);
        EnglishButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        EnglishButton.setSelected(true);
        EnglishButton.setText("English");
        EnglishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnglishButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(frenchButton);
        frenchButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        frenchButton.setText("French");
        frenchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frenchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(addStudentTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(EnglishButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(frenchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(140, 140, 140)
                                .addComponent(saveStudentButton)))
                        .addGap(0, 30, Short.MAX_VALUE))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(addStudentTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(EnglishButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(frenchButton)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveStudentButton)
                        .addGap(28, 28, 28)))
                .addComponent(backButton)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Event handling for when the librarian saves student information.
     * @param evt 
     */
    private void saveStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveStudentButtonActionPerformed
        int librarianId = Session.getCurrentLibrarianId(); // gets the current librarian id
        
        try {
            int studentId = Integer.parseInt(studentIDField.getText().trim());
            String studentName = studentNameField.getText().trim();
            String contactNumber = contactNumberField.getText().trim();
            
            // Input handling : if fields are empty such as student name and contact number.
            if (studentName.isEmpty() || contactNumber.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please input all fields.", "INPUT Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            // If the librarian has saved student creds then student can sign up and log in.
            if (librarianController.addStudent(studentId, studentName, contactNumber, librarianId)) {
                JOptionPane.showMessageDialog(this, "Student added successfully!");
                LibrarianView librarianView = new LibrarianView(mainController); // LibrarianView pops up.
                librarianView.setVisible(true);
                this.dispose();
            } else { // If saved failed, then the student ID is already there in thes system.
                JOptionPane.showMessageDialog(this, "Student ID already exists in the system.", "DB Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveStudentButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        LibrarianView librarianView = new LibrarianView(mainController);
        librarianView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void frenchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frenchButtonActionPerformed

        addStudentTitleLabel.setText(bundleFR.getString("Title"));
        addStudentLabel.setText(bundleFR.getString("StuId"));
        studentNameLabel.setText(bundleFR.getString("Name"));
        studentContactNumberLabel.setText(bundleFR.getString("ContactNum"));
        saveStudentButton.setText(bundleFR.getString("Save"));
        backButton.setText(bundleFR.getString("Back"));
    }//GEN-LAST:event_frenchButtonActionPerformed

    private void EnglishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnglishButtonActionPerformed
        addStudentTitleLabel.setText(bundle.getString("Title"));
        addStudentLabel.setText(bundle.getString("StuId"));
        studentNameLabel.setText(bundle.getString("Name"));
        studentContactNumberLabel.setText(bundle.getString("ContactNum"));
        saveStudentButton.setText(bundle.getString("Save"));
        backButton.setText(bundle.getString("Back"));
    }//GEN-LAST:event_EnglishButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LibrarianAddStudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarianAddStudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarianAddStudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarianAddStudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton EnglishButton;
    private javax.swing.JLabel addStudentLabel;
    private javax.swing.JLabel addStudentTitleLabel;
    private javax.swing.JButton backButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField contactNumberField;
    private javax.swing.JRadioButton frenchButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton saveStudentButton;
    private javax.swing.JLabel studentContactNumberLabel;
    private javax.swing.JTextField studentIDField;
    private javax.swing.JPanel studentInfoPanel;
    private javax.swing.JTextField studentNameField;
    private javax.swing.JLabel studentNameLabel;
    // End of variables declaration//GEN-END:variables
}
