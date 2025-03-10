package LibraryManagementProject.views;

import LibraryManagementProject.controllers.MainController;
import LibraryManagementProject.factory.Book;
import LibraryManagementProject.factory.BookFactory;
import LibraryManagementProject.models.Session;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bridj
 */
public class StudentBorrowBookView extends javax.swing.JFrame {

    private MainController mainController;
    private ResourceBundle bundle;
    private ResourceBundle bundleFR;

    /**
     * Constructor for studentBorrowBookView.
     *
     * @param mainController
     */
    public StudentBorrowBookView(MainController mainController) {
        this.mainController = mainController;
        initComponents();
        displayAvailableBooks();
        bundle = ResourceBundle.getBundle("StudentBorrowBookView");
        bundleFR = ResourceBundle.getBundle("StudentBorrowBookView_fr_FR", Locale.FRANCE);
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
        borrowBookTitleLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        borrowBookPanel = new javax.swing.JPanel();
        bookQuantityTextField = new javax.swing.JTextField();
        borrowBookButton = new javax.swing.JButton();
        bookQuantityLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        availableBooksTable = new javax.swing.JTable();
        englishBtn = new javax.swing.JRadioButton();
        frenchBtn = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(202, 233, 255));
        setSize(new java.awt.Dimension(622, 675));

        mainPanel.setBackground(new java.awt.Color(194, 228, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        borrowBookTitleLabel.setBackground(new java.awt.Color(27, 73, 101));
        borrowBookTitleLabel.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        borrowBookTitleLabel.setForeground(new java.awt.Color(27, 73, 101));
        borrowBookTitleLabel.setText("Borrow Book");

        backButton.setBackground(new java.awt.Color(95, 168, 211));
        backButton.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        backButton.setForeground(new java.awt.Color(27, 73, 101));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        borrowBookPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Borrow Books", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Century Gothic", 1, 18), new java.awt.Color(21, 57, 81))); // NOI18N
        borrowBookPanel.setOpaque(false);

        bookQuantityTextField.setBackground(new java.awt.Color(235, 246, 255));
        bookQuantityTextField.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bookQuantityTextField.setForeground(new java.awt.Color(27, 73, 101));
        bookQuantityTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        borrowBookButton.setBackground(new java.awt.Color(95, 168, 211));
        borrowBookButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        borrowBookButton.setForeground(new java.awt.Color(27, 73, 101));
        borrowBookButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/book4.png"))); // NOI18N
        borrowBookButton.setText("Borrow Books");
        borrowBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowBookButtonActionPerformed(evt);
            }
        });

        bookQuantityLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bookQuantityLabel.setForeground(new java.awt.Color(27, 73, 101));
        bookQuantityLabel.setText("Enter book quantity:");

        javax.swing.GroupLayout borrowBookPanelLayout = new javax.swing.GroupLayout(borrowBookPanel);
        borrowBookPanel.setLayout(borrowBookPanelLayout);
        borrowBookPanelLayout.setHorizontalGroup(
            borrowBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borrowBookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(borrowBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(borrowBookButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(borrowBookPanelLayout.createSequentialGroup()
                        .addComponent(bookQuantityLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addComponent(bookQuantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        borrowBookPanelLayout.setVerticalGroup(
            borrowBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borrowBookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(borrowBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookQuantityLabel)
                    .addComponent(bookQuantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(borrowBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        availableBooksTable.setBackground(new java.awt.Color(214, 237, 255));
        availableBooksTable.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        availableBooksTable.setForeground(new java.awt.Color(27, 73, 101));
        availableBooksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SN", "Title", "Author", "Publisher", "Price", "Available Quantity", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        availableBooksTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        availableBooksTable.setRowHeight(25);
        availableBooksTable.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        availableBooksTable.setShowGrid(true);
        jScrollPane1.setViewportView(availableBooksTable);
        if (availableBooksTable.getColumnModel().getColumnCount() > 0) {
            availableBooksTable.getColumnModel().getColumn(0).setPreferredWidth(120);
            availableBooksTable.getColumnModel().getColumn(1).setPreferredWidth(120);
            availableBooksTable.getColumnModel().getColumn(2).setPreferredWidth(120);
            availableBooksTable.getColumnModel().getColumn(3).setPreferredWidth(120);
            availableBooksTable.getColumnModel().getColumn(4).setPreferredWidth(120);
            availableBooksTable.getColumnModel().getColumn(5).setPreferredWidth(120);
            availableBooksTable.getColumnModel().getColumn(6).setPreferredWidth(120);
        }

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

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(borrowBookTitleLabel))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(englishBtn)
                                    .addComponent(frenchBtn))
                                .addGap(178, 178, 178)
                                .addComponent(backButton))
                            .addComponent(borrowBookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(borrowBookTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(borrowBookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(englishBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(frenchBtn)))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * This method brings the student back to the student view.
     *
     * @param evt
     */
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainController mainController = new MainController();
        StudentView studentView = new StudentView(mainController);
        studentView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed
    /**
     * This method allows the user to confirm their request to borrow a book.
     *
     * @param evt
     */
    private void borrowBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowBookButtonActionPerformed
        int selectedRow = availableBooksTable.getSelectedRow();
        String sn = (String) availableBooksTable.getValueAt(selectedRow, 0); // gets the sn of the table
        String quantityText = bookQuantityTextField.getText().trim();
        int quantity = Integer.parseInt(quantityText);

        if (selectedRow == -1) { // checks if student has chosen a book to borrow
            JOptionPane.showMessageDialog(this, "Please select a book to borrow.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            quantity = Integer.parseInt(quantityText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid quantity.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean success = mainController.borrowBook(sn, quantity);
        if (success) {
            JOptionPane.showMessageDialog(this, "Book borrowed successfully.");
            int currentQuantity = (int) availableBooksTable.getValueAt(selectedRow, 5);
            availableBooksTable.setValueAt(currentQuantity - quantity, selectedRow, 5);
            if (currentQuantity - quantity <= 0) {
                ((DefaultTableModel) availableBooksTable.getModel()).removeRow(selectedRow);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Failed to borrow book.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_borrowBookButtonActionPerformed
    /**
     * This method changes the texts of elements to english.
     *
     * @param evt
     */
    private void englishBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_englishBtnActionPerformed
        borrowBookTitleLabel.setText(bundle.getString("borrowBookTitle"));
        bookQuantityLabel.setText(bundle.getString("enterQuantityLabel"));
        borrowBookButton.setText(bundle.getString("borrowBooksButton"));
        backButton.setText(bundle.getString("backButton"));
        englishBtn.setText(bundle.getString("englishBtn"));
        frenchBtn.setText(bundle.getString("frenchBtn"));
    }//GEN-LAST:event_englishBtnActionPerformed
    /**
     * This method changes the texts of elements to french.
     *
     * @param evt
     */
    private void frenchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frenchBtnActionPerformed
        borrowBookTitleLabel.setText(bundleFR.getString("borrowBookTitle"));
        bookQuantityLabel.setText(bundleFR.getString("enterQuantityLabel"));
        borrowBookButton.setText(bundleFR.getString("borrowBooksButton"));
        backButton.setText(bundleFR.getString("backButton"));
        englishBtn.setText(bundleFR.getString("englishBtn"));
        frenchBtn.setText(bundleFR.getString("frenchBtn"));
    }//GEN-LAST:event_frenchBtnActionPerformed
    /**
     * This method displays all the available books
     */
    private void displayAvailableBooks() {
        DefaultTableModel tableModel = (DefaultTableModel) availableBooksTable.getModel();
        tableModel.setRowCount(0);

        Map<String, Book> bookCatalogStudent = mainController.getAvailableBooks();
        for (Book book : bookCatalogStudent.values()) {
            if (book.getQte() > book.getQteIssued()) {
                tableModel.addRow(new Object[]{
                    book.getSN(),
                    book.getTitle(),
                    book.getAuthor(),
                    book.getPublisher(),
                    book.getPrice(),
                    book.getQte() - book.getQteIssued(),
                    book.getType()
                });
            }
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
            java.util.logging.Logger.getLogger(StudentBorrowBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentBorrowBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentBorrowBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentBorrowBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainController mainController = new MainController();
                new StudentBorrowBookView(mainController).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable availableBooksTable;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel bookQuantityLabel;
    private javax.swing.JTextField bookQuantityTextField;
    private javax.swing.JButton borrowBookButton;
    private javax.swing.JPanel borrowBookPanel;
    private javax.swing.JLabel borrowBookTitleLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton englishBtn;
    private javax.swing.JRadioButton frenchBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
