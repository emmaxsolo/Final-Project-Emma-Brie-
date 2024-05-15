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
 * @author 1982228, emmas
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
        studentTitleLabel = new javax.swing.JLabel();
        returnBooksPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        booksBorrowedTextArea = new javax.swing.JTextArea();
        booksBorrowedLabel = new javax.swing.JLabel();
        returnBookField = new javax.swing.JTextField();
        returnBookLabel = new javax.swing.JLabel();
        returnBookButton = new javax.swing.JButton();
        sidePanel = new javax.swing.JPanel();
        logOutButton = new javax.swing.JButton();
        dateTime = new javax.swing.JLabel();
        sideActionPanel = new javax.swing.JPanel();
        viewCatalogButton = new javax.swing.JButton();
        searchBooksButton = new javax.swing.JButton();
        borrowBookButton = new javax.swing.JButton();
        pictureLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(194, 228, 255));
        setPreferredSize(new java.awt.Dimension(1070, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(1070, 600));

        mainPanel.setBackground(new java.awt.Color(194, 228, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        studentTitleLabel.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        studentTitleLabel.setForeground(new java.awt.Color(27, 73, 101));
        studentTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        studentTitleLabel.setText("Student Dashboard");
        studentTitleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        returnBooksPanel.setBackground(new java.awt.Color(214, 237, 255));
        returnBooksPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        booksBorrowedTextArea.setBackground(new java.awt.Color(235, 246, 255));
        booksBorrowedTextArea.setColumns(20);
        booksBorrowedTextArea.setRows(5);
        jScrollPane1.setViewportView(booksBorrowedTextArea);

        booksBorrowedLabel.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        booksBorrowedLabel.setForeground(new java.awt.Color(27, 73, 101));
        booksBorrowedLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        booksBorrowedLabel.setText("BOOKS BORROWED");
        booksBorrowedLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        booksBorrowedLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        booksBorrowedLabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        returnBookField.setBackground(new java.awt.Color(235, 246, 255));
        returnBookField.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        returnBookField.setForeground(new java.awt.Color(27, 73, 101));
        returnBookField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        returnBookField.setCaretColor(new java.awt.Color(202, 233, 255));
        returnBookField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBookFieldActionPerformed(evt);
            }
        });

        returnBookLabel.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        returnBookLabel.setForeground(new java.awt.Color(27, 73, 101));
        returnBookLabel.setText("Enter book number:");

        returnBookButton.setBackground(new java.awt.Color(95, 168, 211));
        returnBookButton.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        returnBookButton.setForeground(new java.awt.Color(27, 73, 101));
        returnBookButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/returnBook2.png"))); // NOI18N
        returnBookButton.setText("Return Book");

        javax.swing.GroupLayout returnBooksPanelLayout = new javax.swing.GroupLayout(returnBooksPanel);
        returnBooksPanel.setLayout(returnBooksPanelLayout);
        returnBooksPanelLayout.setHorizontalGroup(
            returnBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnBooksPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(returnBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(returnBookLabel)
                    .addGroup(returnBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(booksBorrowedLabel)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(returnBookField, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(returnBookButton, javax.swing.GroupLayout.Alignment.CENTER))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        returnBooksPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, returnBookField});

        returnBooksPanelLayout.setVerticalGroup(
            returnBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnBooksPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(booksBorrowedLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(returnBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(returnBookField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(returnBookButton)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(returnBooksPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(studentTitleLabel)
                        .addGap(149, 149, 149))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(studentTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(returnBooksPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidePanel.setBackground(new java.awt.Color(173, 221, 255));
        sidePanel.setPreferredSize(new java.awt.Dimension(270, 600));

        logOutButton.setBackground(new java.awt.Color(95, 168, 211));
        logOutButton.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        logOutButton.setForeground(new java.awt.Color(27, 73, 101));
        logOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bookHome.png"))); // NOI18N
        logOutButton.setText("Log Out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        dateTime.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        dateTime.setForeground(new java.awt.Color(43, 116, 161));
        dateTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateTime.setText("jLabel1");
        dateTime.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(27, 73, 101)));
        dateTime.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        sideActionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Actions", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Century Gothic", 1, 18), new java.awt.Color(27, 73, 101))); // NOI18N
        sideActionPanel.setOpaque(false);

        viewCatalogButton.setBackground(new java.awt.Color(95, 168, 211));
        viewCatalogButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        viewCatalogButton.setForeground(new java.awt.Color(27, 73, 101));
        viewCatalogButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/viewCatalog.png"))); // NOI18N
        viewCatalogButton.setText("View Catalog");
        viewCatalogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCatalogButtonActionPerformed(evt);
            }
        });

        searchBooksButton.setBackground(new java.awt.Color(95, 168, 211));
        searchBooksButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        searchBooksButton.setForeground(new java.awt.Color(27, 73, 101));
        searchBooksButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/searchbook.png"))); // NOI18N
        searchBooksButton.setText("Search Book");
        searchBooksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBooksButtonActionPerformed(evt);
            }
        });

        borrowBookButton.setBackground(new java.awt.Color(95, 168, 211));
        borrowBookButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        borrowBookButton.setForeground(new java.awt.Color(27, 73, 101));
        borrowBookButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/downloadBook2.png"))); // NOI18N
        borrowBookButton.setText("Borrow Book");

        javax.swing.GroupLayout sideActionPanelLayout = new javax.swing.GroupLayout(sideActionPanel);
        sideActionPanel.setLayout(sideActionPanelLayout);
        sideActionPanelLayout.setHorizontalGroup(
            sideActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideActionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sideActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideActionPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(searchBooksButton))
                    .addGroup(sideActionPanelLayout.createSequentialGroup()
                        .addGroup(sideActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewCatalogButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(borrowBookButton))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        sideActionPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {borrowBookButton, searchBooksButton, viewCatalogButton});

        sideActionPanelLayout.setVerticalGroup(
            sideActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideActionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewCatalogButton)
                .addGap(12, 12, 12)
                .addComponent(searchBooksButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(borrowBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sideActionPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {borrowBookButton, searchBooksButton, viewCatalogButton});

        pictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/illustrations/resized-images (3)/libraryDesign7.png"))); // NOI18N

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pictureLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sideActionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(logOutButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(dateTime)
                .addGap(18, 18, 18)
                .addComponent(pictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sideActionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logOutButton)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE))
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
        StudentSearchBookView studentSearchBookView = new StudentSearchBookView(mainController);
        studentSearchBookView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_searchBooksButtonActionPerformed

    private void viewCatalogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCatalogButtonActionPerformed
        StudentBookCatalogView studentCatalogView = new StudentBookCatalogView(mainController);
        studentCatalogView.setVisible(true);
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainController mainController = new MainController();
                new StudentView(mainController).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel booksBorrowedLabel;
    private javax.swing.JTextArea booksBorrowedTextArea;
    private javax.swing.JButton borrowBookButton;
    private javax.swing.JLabel dateTime;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel pictureLabel;
    private javax.swing.JButton returnBookButton;
    private javax.swing.JTextField returnBookField;
    private javax.swing.JLabel returnBookLabel;
    private javax.swing.JPanel returnBooksPanel;
    private javax.swing.JButton searchBooksButton;
    private javax.swing.JPanel sideActionPanel;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JLabel studentTitleLabel;
    private javax.swing.JButton viewCatalogButton;
    // End of variables declaration//GEN-END:variables
}
