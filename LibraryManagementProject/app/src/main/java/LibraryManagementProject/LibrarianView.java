/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LibraryManagementProject;

/**
 *
 * @author emmas
 */
public class LibrarianView extends javax.swing.JFrame {

    /**
     * Creates new form LibrarianView
     */
    public LibrarianView() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        booksBorrowedTextArea1 = new javax.swing.JTextArea();
        enterRequetsBookLabel1 = new javax.swing.JLabel();
        enterRequestBookTextField1 = new javax.swing.JTextField();
        booksRequestLabel1 = new javax.swing.JLabel();
        allowButton1 = new javax.swing.JButton();
        denyButton1 = new javax.swing.JButton();
        bookCatalogLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        bookCatalogTextArea = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        booksBorrowedTextArea = new javax.swing.JTextArea();
        enterRequetsBookLabel = new javax.swing.JLabel();
        enterRequestBookTextField = new javax.swing.JTextField();
        booksRequestLabel = new javax.swing.JLabel();
        allowButton = new javax.swing.JButton();
        denyButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        booksReturnedTextArea = new javax.swing.JTextArea();
        enterReturnLabel = new javax.swing.JLabel();
        enterReturnBookTextField = new javax.swing.JTextField();
        booksRequestLabel2 = new javax.swing.JLabel();
        returnButton = new javax.swing.JButton();
        bookCatalogLabel1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        bookCatalogTextArea1 = new javax.swing.JTextArea();
        addButton = new javax.swing.JButton();

        booksBorrowedTextArea1.setColumns(20);
        booksBorrowedTextArea1.setRows(5);
        jScrollPane2.setViewportView(booksBorrowedTextArea1);

        enterRequetsBookLabel1.setText("Enter request number:");

        booksRequestLabel1.setText("BOOK request");

        allowButton1.setText("Allow");

        denyButton1.setText("Deny");

        bookCatalogLabel.setText("BOOK CATALOG");

        bookCatalogTextArea.setColumns(20);
        bookCatalogTextArea.setRows(5);
        jScrollPane4.setViewportView(bookCatalogTextArea);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        booksBorrowedTextArea.setColumns(20);
        booksBorrowedTextArea.setRows(5);
        jScrollPane1.setViewportView(booksBorrowedTextArea);

        enterRequetsBookLabel.setText("Enter request number:");

        enterRequestBookTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterRequestBookTextFieldActionPerformed(evt);
            }
        });

        booksRequestLabel.setText("BOOK request");

        allowButton.setText("Allow");

        denyButton.setText("Deny");

        booksReturnedTextArea.setColumns(20);
        booksReturnedTextArea.setRows(5);
        jScrollPane3.setViewportView(booksReturnedTextArea);

        enterReturnLabel.setText("Enter return number:");

        enterReturnBookTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterReturnBookTextFieldActionPerformed(evt);
            }
        });

        booksRequestLabel2.setText("BOOK returns");

        returnButton.setText("Return");

        bookCatalogLabel1.setText("BOOK CATALOG");

        bookCatalogTextArea1.setColumns(20);
        bookCatalogTextArea1.setRows(5);
        jScrollPane5.setViewportView(bookCatalogTextArea1);

        addButton.setText("Add a book");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(booksRequestLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(63, 63, 63)
                                    .addComponent(booksRequestLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(24, 24, 24)
                                            .addComponent(enterReturnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(26, 26, 26)
                                            .addComponent(returnButton)
                                            .addGap(32, 32, 32))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(31, 31, 31)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(addButton)
                                                .addComponent(enterReturnBookTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(enterRequestBookTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(enterRequetsBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(allowButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(denyButton))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(bookCatalogLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(booksRequestLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterRequetsBookLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enterRequestBookTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(allowButton)
                            .addComponent(denyButton)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(booksRequestLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterReturnLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enterReturnBookTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(returnButton))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookCatalogLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(addButton)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterRequestBookTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterRequestBookTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterRequestBookTextFieldActionPerformed

    private void enterReturnBookTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterReturnBookTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterReturnBookTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(LibrarianView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarianView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarianView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarianView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibrarianView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton allowButton;
    private javax.swing.JButton allowButton1;
    private javax.swing.JLabel bookCatalogLabel;
    private javax.swing.JLabel bookCatalogLabel1;
    private javax.swing.JTextArea bookCatalogTextArea;
    private javax.swing.JTextArea bookCatalogTextArea1;
    private javax.swing.JTextArea booksBorrowedTextArea;
    private javax.swing.JTextArea booksBorrowedTextArea1;
    private javax.swing.JLabel booksRequestLabel;
    private javax.swing.JLabel booksRequestLabel1;
    private javax.swing.JLabel booksRequestLabel2;
    private javax.swing.JTextArea booksReturnedTextArea;
    private javax.swing.JButton denyButton;
    private javax.swing.JButton denyButton1;
    private javax.swing.JTextField enterRequestBookTextField;
    private javax.swing.JTextField enterRequestBookTextField1;
    private javax.swing.JLabel enterRequetsBookLabel;
    private javax.swing.JLabel enterRequetsBookLabel1;
    private javax.swing.JTextField enterReturnBookTextField;
    private javax.swing.JLabel enterReturnLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton returnButton;
    // End of variables declaration//GEN-END:variables
}
