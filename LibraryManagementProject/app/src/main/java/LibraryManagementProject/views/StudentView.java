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
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 1982228, emmas
 */
public class StudentView extends javax.swing.JFrame {
    private ResourceBundle bundle;
    private ResourceBundle bundleFR;
    private MainController mainController;

    public StudentView(MainController mainController) {
        this.mainController = mainController;
        initComponents();
        currentDateTime();
        displayIssuedBooks();
        bundle = ResourceBundle.getBundle("StudentView");
        bundleFR = ResourceBundle.getBundle("StudentView_fr_FR", Locale.FRANCE);
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
        studentTitleLabel = new javax.swing.JLabel();
        returnBooksPanel = new javax.swing.JPanel();
        booksBorrowedLabel = new javax.swing.JLabel();
        returnBookButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        issuedBooksTable = new javax.swing.JTable();
        sidePanel = new javax.swing.JPanel();
        logOutButton = new javax.swing.JButton();
        dateTime = new javax.swing.JLabel();
        sideActionPanel = new javax.swing.JPanel();
        viewCatalogButton = new javax.swing.JButton();
        searchBooksButton = new javax.swing.JButton();
        borrowBookButton = new javax.swing.JButton();
        pictureLabel = new javax.swing.JLabel();
        englishBtn = new javax.swing.JRadioButton();
        frenchBtn = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(194, 228, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 730));

        mainPanel.setBackground(new java.awt.Color(194, 228, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        studentTitleLabel.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        studentTitleLabel.setForeground(new java.awt.Color(27, 73, 101));
        studentTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        studentTitleLabel.setText("Student Dashboard");
        studentTitleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        returnBooksPanel.setBackground(new java.awt.Color(214, 237, 255));
        returnBooksPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        booksBorrowedLabel.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        booksBorrowedLabel.setForeground(new java.awt.Color(27, 73, 101));
        booksBorrowedLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        booksBorrowedLabel.setText("BOOKS BORROWED");
        booksBorrowedLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        booksBorrowedLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        booksBorrowedLabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        returnBookButton.setBackground(new java.awt.Color(95, 168, 211));
        returnBookButton.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        returnBookButton.setForeground(new java.awt.Color(27, 73, 101));
        returnBookButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/returnBook2.png"))); // NOI18N
        returnBookButton.setText("Return Book");
        returnBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBookButtonActionPerformed(evt);
            }
        });

        issuedBooksTable.setBackground(new java.awt.Color(194, 228, 255));
        issuedBooksTable.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        issuedBooksTable.setForeground(new java.awt.Color(27, 73, 101));
        issuedBooksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "SN", "Title", "Quantity", "Issued Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        issuedBooksTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        issuedBooksTable.setGridColor(new java.awt.Color(27, 73, 101));
        issuedBooksTable.setRowHeight(30);
        issuedBooksTable.setShowGrid(true);
        jScrollPane2.setViewportView(issuedBooksTable);
        if (issuedBooksTable.getColumnModel().getColumnCount() > 0) {
            issuedBooksTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            issuedBooksTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            issuedBooksTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            issuedBooksTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            issuedBooksTable.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        javax.swing.GroupLayout returnBooksPanelLayout = new javax.swing.GroupLayout(returnBooksPanel);
        returnBooksPanel.setLayout(returnBooksPanelLayout);
        returnBooksPanelLayout.setHorizontalGroup(
            returnBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnBooksPanelLayout.createSequentialGroup()
                .addGroup(returnBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(returnBooksPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(returnBooksPanelLayout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(booksBorrowedLabel))
                    .addGroup(returnBooksPanelLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(returnBookButton)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        returnBooksPanelLayout.setVerticalGroup(
            returnBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnBooksPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(booksBorrowedLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(returnBookButton)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(studentTitleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(returnBooksPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
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
        borrowBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowBookButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sideActionPanelLayout = new javax.swing.GroupLayout(sideActionPanel);
        sideActionPanel.setLayout(sideActionPanelLayout);
        sideActionPanelLayout.setHorizontalGroup(
            sideActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideActionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sideActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewCatalogButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borrowBookButton)
                    .addComponent(searchBooksButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sideActionPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {borrowBookButton, searchBooksButton, viewCatalogButton});

        sideActionPanelLayout.setVerticalGroup(
            sideActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideActionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewCatalogButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchBooksButton)
                .addGap(12, 12, 12)
                .addComponent(borrowBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sideActionPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {borrowBookButton, searchBooksButton, viewCatalogButton});

        pictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/illustrations/resized-images (3)/libraryDesign7.png"))); // NOI18N

        buttonGroup1.add(englishBtn);
        englishBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        englishBtn.setForeground(new java.awt.Color(27, 73, 101));
        englishBtn.setSelected(true);
        englishBtn.setText("English");
        englishBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                englishBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(frenchBtn);
        frenchBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        frenchBtn.setForeground(new java.awt.Color(27, 73, 101));
        frenchBtn.setText("French");
        frenchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frenchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pictureLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addComponent(dateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(848, 848, 848))
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sideActionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(logOutButton))
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(frenchBtn)
                            .addComponent(englishBtn))))
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
                .addGap(18, 18, 18)
                .addComponent(logOutButton)
                .addGap(18, 18, 18)
                .addComponent(englishBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frenchBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 625, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void returnBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBookButtonActionPerformed
        int selectedRow = issuedBooksTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a book to return.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int issuedBookId = (int) issuedBooksTable.getValueAt(selectedRow, 0);
        boolean success = mainController.returnBook(issuedBookId);
        if (success) {
            JOptionPane.showMessageDialog(this, "Book returned successfully.");
            displayIssuedBooks();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to return book.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_returnBookButtonActionPerformed

    private void borrowBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowBookButtonActionPerformed
        StudentBorrowBookView studentBorrowBookView = new StudentBorrowBookView(mainController);
        studentBorrowBookView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_borrowBookButtonActionPerformed

    private void englishBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_englishBtnActionPerformed
        studentTitleLabel.setText(bundle.getString("studentDashboardTitle"));
        booksBorrowedLabel.setText(bundle.getString("booksBorrowedLabel"));
        viewCatalogButton.setText(bundle.getString("viewCatalogButton"));
        searchBooksButton.setText(bundle.getString("searchBookButton"));
        borrowBookButton.setText(bundle.getString("borrowBookButton"));
        returnBookButton.setText(bundle.getString("returnBookButton"));
        logOutButton.setText(bundle.getString("logoutButton"));
        englishBtn.setText(bundle.getString("englishBtn"));
        frenchBtn.setText(bundle.getString("frenchBtn"));
    }//GEN-LAST:event_englishBtnActionPerformed

    private void frenchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frenchBtnActionPerformed
        studentTitleLabel.setText(bundleFR.getString("studentDashboardTitle"));
        booksBorrowedLabel.setText(bundleFR.getString("booksBorrowedLabel"));
        viewCatalogButton.setText(bundleFR.getString("viewCatalogButton"));
        searchBooksButton.setText(bundleFR.getString("searchBookButton"));
        borrowBookButton.setText(bundleFR.getString("borrowBookButton"));
        returnBookButton.setText(bundleFR.getString("returnBookButton"));
        logOutButton.setText(bundleFR.getString("logoutButton"));
        englishBtn.setText(bundleFR.getString("englishBtn"));
        frenchBtn.setText(bundleFR.getString("frenchBtn"));
    }//GEN-LAST:event_frenchBtnActionPerformed

    public void currentDateTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        dateTime.setText(dtf.format(now));
    }

    private void displayIssuedBooks() {
        DefaultTableModel tableModel = (DefaultTableModel) issuedBooksTable.getModel();
        tableModel.setRowCount(0);

        List<Map<String, Object>> issuedBooks = mainController.getIssuedBooksForStudent();
        for (Map<String, Object> issuedBook : issuedBooks) {
            tableModel.addRow(new Object[]{
                issuedBook.get("id"),
                issuedBook.get("SN"),
                issuedBook.get("title"),
                issuedBook.get("quantity"),
                issuedBook.get("IssueDate")
            });
        }
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
    private javax.swing.JButton borrowBookButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel dateTime;
    private javax.swing.JRadioButton englishBtn;
    private javax.swing.JRadioButton frenchBtn;
    private javax.swing.JTable issuedBooksTable;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logOutButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel pictureLabel;
    private javax.swing.JButton returnBookButton;
    private javax.swing.JPanel returnBooksPanel;
    private javax.swing.JButton searchBooksButton;
    private javax.swing.JPanel sideActionPanel;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JLabel studentTitleLabel;
    private javax.swing.JButton viewCatalogButton;
    // End of variables declaration//GEN-END:variables
}
