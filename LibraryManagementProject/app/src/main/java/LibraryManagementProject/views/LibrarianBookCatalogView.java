package LibraryManagementProject.views;

import LibraryManagementProject.controllers.LibrarianController;
import LibraryManagementProject.controllers.MainController;
import LibraryManagementProject.factory.Book;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emmas,bridj
 */
public class LibrarianBookCatalogView extends javax.swing.JFrame {
    private MainController mainController;
    private ResourceBundle bundle;
    private ResourceBundle bundleFR;

    /**
     * Creates new form CatalogViewLibrarian
     */
    public LibrarianBookCatalogView(MainController mainController) {
        this.mainController = mainController;
        initComponents();
        displayBooks();
        
        bundle = ResourceBundle.getBundle("LibrarianCatalogView");
        bundleFR = ResourceBundle.getBundle("LibrarianCatalogView_fr_FR", Locale.FRANCE);
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
        catalogLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        librarianBookCatalogTable = new javax.swing.JTable();
        englishButton = new javax.swing.JRadioButton();
        frenchButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(194, 228, 255));
        jPanel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jPanel1AncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        catalogLabel.setBackground(new java.awt.Color(27, 73, 101));
        catalogLabel.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        catalogLabel.setForeground(new java.awt.Color(27, 73, 101));
        catalogLabel.setText("Book Catalog");

        backButton.setBackground(new java.awt.Color(95, 168, 211));
        backButton.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        backButton.setForeground(new java.awt.Color(27, 73, 101));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        librarianBookCatalogTable.setBackground(new java.awt.Color(214, 237, 255));
        librarianBookCatalogTable.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        librarianBookCatalogTable.setForeground(new java.awt.Color(27, 73, 101));
        librarianBookCatalogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "SN", "Title", "Author", "Publisher", "Price", "Quantity", "Issued", "Date Added", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        librarianBookCatalogTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(librarianBookCatalogTable);
        if (librarianBookCatalogTable.getColumnModel().getColumnCount() > 0) {
            librarianBookCatalogTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            librarianBookCatalogTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            librarianBookCatalogTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            librarianBookCatalogTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            librarianBookCatalogTable.getColumnModel().getColumn(4).setPreferredWidth(100);
            librarianBookCatalogTable.getColumnModel().getColumn(5).setPreferredWidth(100);
            librarianBookCatalogTable.getColumnModel().getColumn(6).setPreferredWidth(100);
            librarianBookCatalogTable.getColumnModel().getColumn(7).setPreferredWidth(100);
            librarianBookCatalogTable.getColumnModel().getColumn(8).setPreferredWidth(100);
        }

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

        buttonGroup1.add(frenchButton);
        frenchButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        frenchButton.setForeground(new java.awt.Color(27, 73, 101));
        frenchButton.setText("French");
        frenchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frenchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(67, 67, 67))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(catalogLabel)
                            .addGap(217, 217, 217)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(frenchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(englishButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(123, 123, 123)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(catalogLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(englishButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(frenchButton)
                        .addGap(18, 18, 18))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel1AncestorMoved

    }//GEN-LAST:event_jPanel1AncestorMoved

    /**
     * The back button brings the user back to the librarian view
     * @param evt 
     */
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        LibrarianView librarianView = new LibrarianView(mainController);
        librarianView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     * The english button translates the text elements to english.
     * @param evt 
     */
    private void englishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_englishButtonActionPerformed
        catalogLabel.setText(bundle.getString("Title"));
        backButton.setText(bundle.getString("Back"));
    }//GEN-LAST:event_englishButtonActionPerformed

    /**
     * The french button translates the text elements to french.
     * @param evt 
     */
    private void frenchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frenchButtonActionPerformed
       catalogLabel.setText(bundleFR.getString("Title"));
        backButton.setText(bundleFR.getString("Back"));
    }//GEN-LAST:event_frenchButtonActionPerformed
  
    /**
     * The method displays the librarian book catalog of the book information using the table model
     * using the librarianBookCatalog.
     */
    private void displayBooks() {
       DefaultTableModel tableModel = (DefaultTableModel) librarianBookCatalogTable.getModel();
        tableModel.setRowCount(0);

        Map<String, Book> bookCatalogLibraian= mainController.getBookCatalogLibrarian();
        for (Book book : bookCatalogLibraian.values()) {
            tableModel.addRow(new Object[]{
                book.getSN(),
                book.getTitle(),
                book.getAuthor(),
                book.getPublisher(),
                book.getPrice(),
                book.getQte(), 
                book.getQteIssued(),
                book.getAddedDate(),
                book.getType()
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
            java.util.logging.Logger.getLogger(LibrarianBookCatalogView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarianBookCatalogView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarianBookCatalogView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarianBookCatalogView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainController mainController = new MainController();
                new LibrarianBookCatalogView(mainController).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel catalogLabel;
    private javax.swing.JRadioButton englishButton;
    private javax.swing.JRadioButton frenchButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable librarianBookCatalogTable;
    // End of variables declaration//GEN-END:variables
}
