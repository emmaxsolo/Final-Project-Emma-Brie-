/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LibraryManagementProject.views;

import LibraryManagementProject.controllers.MainController;
import LibraryManagementProject.models.*;
import LibraryManagementProject.controllers.StudentController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import LibraryManagementProject.factory.Book;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emmas
 */
public class StudentView extends javax.swing.JFrame {
    private MainController mainController;

    public StudentView(MainController mainController) {
        this.mainController = mainController;
        initComponents();
        currentDateTime();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        booksBorrowedTextArea = new javax.swing.JTextArea();
        booksBorrowedLabel = new javax.swing.JLabel();
        returnBookButton = new javax.swing.JButton();
        returnBookField = new javax.swing.JTextField();
        returnBookLabel = new javax.swing.JLabel();
        studentTitleLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sidePanel = new javax.swing.JPanel();
        logOutButton = new javax.swing.JButton();
        dateTime = new javax.swing.JLabel();
        sideActionPanel1 = new javax.swing.JPanel();
        viewCatalogButton = new javax.swing.JButton();
        searchBooksButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(194, 228, 255));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setSize(new java.awt.Dimension(1000, 600));

        mainPanel.setBackground(new java.awt.Color(194, 228, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(700, 600));

        booksBorrowedTextArea.setColumns(20);
        booksBorrowedTextArea.setRows(5);
        jScrollPane1.setViewportView(booksBorrowedTextArea);

        booksBorrowedLabel.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        booksBorrowedLabel.setForeground(new java.awt.Color(27, 73, 101));
        booksBorrowedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        booksBorrowedLabel.setText("BOOKS BORROWED");
        booksBorrowedLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        returnBookButton.setBackground(new java.awt.Color(95, 168, 211));
        returnBookButton.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        returnBookButton.setForeground(new java.awt.Color(27, 73, 101));
        returnBookButton.setText("Return Book");

        returnBookField.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        returnBookField.setForeground(new java.awt.Color(27, 73, 101));
        returnBookField.setCaretColor(new java.awt.Color(202, 233, 255));
        returnBookField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBookFieldActionPerformed(evt);
            }
        });

        returnBookLabel.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        returnBookLabel.setForeground(new java.awt.Color(27, 73, 101));
        returnBookLabel.setText("Enter book number:");

        studentTitleLabel.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        studentTitleLabel.setForeground(new java.awt.Color(27, 73, 101));
        studentTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studentTitleLabel.setText("Student");
        studentTitleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/illustrations/libraryDesign4.png"))); // NOI18N

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(studentTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addGap(310, 310, 310))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(booksBorrowedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(239, 239, 239))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(returnBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addComponent(returnBookLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(returnBookField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(20, 20, 20))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(studentTitleLabel)
                .addGap(4, 4, 4)
                .addComponent(booksBorrowedLabel)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(returnBookField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(returnBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(returnBookButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        sidePanel.setBackground(new java.awt.Color(189, 224, 254));
        sidePanel.setPreferredSize(new java.awt.Dimension(100, 600));

        logOutButton.setBackground(new java.awt.Color(95, 168, 211));
        logOutButton.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        logOutButton.setForeground(new java.awt.Color(27, 73, 101));
        logOutButton.setText("Log Out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        dateTime.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        dateTime.setForeground(new java.awt.Color(43, 116, 161));
        dateTime.setText("jLabel1");
        dateTime.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(27, 73, 101)));

        sideActionPanel1.setOpaque(false);

        viewCatalogButton.setBackground(new java.awt.Color(95, 168, 211));
        viewCatalogButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        viewCatalogButton.setForeground(new java.awt.Color(27, 73, 101));
        viewCatalogButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/viewCatalogIcon.png"))); // NOI18N
        viewCatalogButton.setText("View Catalog");
        viewCatalogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCatalogButtonActionPerformed(evt);
            }
        });

        searchBooksButton.setBackground(new java.awt.Color(95, 168, 211));
        searchBooksButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        searchBooksButton.setForeground(new java.awt.Color(27, 73, 101));
        searchBooksButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/searchBookIcon16.png"))); // NOI18N
        searchBooksButton.setText("Search Books");
        searchBooksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBooksButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sideActionPanel1Layout = new javax.swing.GroupLayout(sideActionPanel1);
        sideActionPanel1.setLayout(sideActionPanel1Layout);
        sideActionPanel1Layout.setHorizontalGroup(
            sideActionPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideActionPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sideActionPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewCatalogButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchBooksButton, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        sideActionPanel1Layout.setVerticalGroup(
            sideActionPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideActionPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewCatalogButton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(searchBooksButton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(sideActionPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(logOutButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(dateTime)
                .addGap(103, 103, 103)
                .addComponent(sideActionPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(logOutButton)
                .addGap(213, 213, 213))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void returnBookFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBookFieldActionPerformed

    }//GEN-LAST:event_returnBookFieldActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        mainController.getStudentController().logout();
        EntryView entryView = new EntryView(mainController);
        entryView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void searchBooksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBooksButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBooksButtonActionPerformed

    private void viewCatalogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCatalogButtonActionPerformed
        CatalogViewStudent catalogViewStudent = new CatalogViewStudent(mainController);
        catalogViewStudent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_viewCatalogButtonActionPerformed

    public void currentDateTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        dateTime.setText(dtf.format(now));
    }

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
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new StudentView().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel booksBorrowedLabel;
    private javax.swing.JTextArea booksBorrowedTextArea;
    private javax.swing.JLabel dateTime;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton returnBookButton;
    private javax.swing.JTextField returnBookField;
    private javax.swing.JLabel returnBookLabel;
    private javax.swing.JButton searchBooksButton;
    private javax.swing.JPanel sideActionPanel1;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JLabel studentTitleLabel;
    private javax.swing.JButton viewCatalogButton;
    // End of variables declaration//GEN-END:variables
}
