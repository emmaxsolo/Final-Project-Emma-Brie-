package LibraryManagementProject.views;

import LibraryManagementProject.controllers.LibrarianController;
import LibraryManagementProject.controllers.MainController;
import LibraryManagementProject.factory.Book;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emmas
 */
public class AddBookView extends javax.swing.JFrame {
    private MainController mainController;

    /**
     * Creates new form OrderNewBooksView
     */
    public AddBookView(MainController mainController) {
        this.mainController = mainController;
        initComponents();
        displayBookCatalog();
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
        labelTitle = new javax.swing.JLabel();
        addBookButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        addBookInputPanel = new javax.swing.JPanel();
        snLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        authorLabel = new javax.swing.JLabel();
        publisherLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        qteLabel = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        snTextField = new javax.swing.JTextField();
        titleTextField = new javax.swing.JTextField();
        authorTextField = new javax.swing.JTextField();
        publisherTextField = new javax.swing.JTextField();
        priceTextField = new javax.swing.JTextField();
        qteTextField = new javax.swing.JTextField();
        typeTextField = new javax.swing.JTextField();
        clearFieldsButton = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        addedBooksTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(194, 228, 255));

        mainPanel.setBackground(new java.awt.Color(194, 228, 255));

        labelTitle.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(27, 73, 101));
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("Add Book");
        labelTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        addBookButton.setBackground(new java.awt.Color(95, 168, 211));
        addBookButton.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        addBookButton.setForeground(new java.awt.Color(27, 73, 101));
        addBookButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/addBook2.png"))); // NOI18N
        addBookButton.setText("Add Book");
        addBookButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        addBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(95, 168, 211));
        backButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(27, 73, 101));
        backButton.setText("Back");
        backButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        addBookInputPanel.setBackground(new java.awt.Color(214, 237, 255));
        addBookInputPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        snLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        snLabel.setForeground(new java.awt.Color(27, 73, 101));
        snLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        snLabel.setText("SN:");
        snLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        titleLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(27, 73, 101));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titleLabel.setText("Title:");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        authorLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        authorLabel.setForeground(new java.awt.Color(27, 73, 101));
        authorLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        authorLabel.setText("Author:");
        authorLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        publisherLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        publisherLabel.setForeground(new java.awt.Color(27, 73, 101));
        publisherLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        publisherLabel.setText("Publisher:");
        publisherLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        priceLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(27, 73, 101));
        priceLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        priceLabel.setText("Price:");
        priceLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        qteLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        qteLabel.setForeground(new java.awt.Color(27, 73, 101));
        qteLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        qteLabel.setText("Quantity:");
        qteLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        typeLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        typeLabel.setForeground(new java.awt.Color(27, 73, 101));
        typeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        typeLabel.setText("Type:");
        typeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        snTextField.setBackground(new java.awt.Color(214, 237, 255));
        snTextField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        snTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        titleTextField.setBackground(new java.awt.Color(214, 237, 255));
        titleTextField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        titleTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        titleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleTextFieldActionPerformed(evt);
            }
        });

        authorTextField.setBackground(new java.awt.Color(214, 237, 255));
        authorTextField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        authorTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        publisherTextField.setBackground(new java.awt.Color(214, 237, 255));
        publisherTextField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        publisherTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        priceTextField.setBackground(new java.awt.Color(214, 237, 255));
        priceTextField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        priceTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        qteTextField.setBackground(new java.awt.Color(214, 237, 255));
        qteTextField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        qteTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        typeTextField.setBackground(new java.awt.Color(214, 237, 255));
        typeTextField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        typeTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout addBookInputPanelLayout = new javax.swing.GroupLayout(addBookInputPanel);
        addBookInputPanel.setLayout(addBookInputPanelLayout);
        addBookInputPanelLayout.setHorizontalGroup(
            addBookInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBookInputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addBookInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addBookInputPanelLayout.createSequentialGroup()
                        .addGroup(addBookInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addGroup(addBookInputPanelLayout.createSequentialGroup()
                                .addComponent(typeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(31, 31, 31)))
                        .addGap(23, 23, 23)
                        .addGroup(addBookInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addBookInputPanelLayout.createSequentialGroup()
                        .addGroup(addBookInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addBookInputPanelLayout.createSequentialGroup()
                                .addComponent(snLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(36, 36, 36))
                            .addGroup(addBookInputPanelLayout.createSequentialGroup()
                                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(25, 25, 25))
                            .addComponent(authorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addBookInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(authorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(snTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(addBookInputPanelLayout.createSequentialGroup()
                        .addGroup(addBookInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(publisherLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(addBookInputPanelLayout.createSequentialGroup()
                                .addComponent(priceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(34, 34, 34)))
                        .addGap(18, 18, 18)
                        .addGroup(addBookInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(publisherTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        addBookInputPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {authorTextField, priceTextField, publisherTextField, qteTextField, snTextField, titleTextField, typeTextField});

        addBookInputPanelLayout.setVerticalGroup(
            addBookInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBookInputPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(addBookInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addBookInputPanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(snTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addBookInputPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(snLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                .addGap(6, 6, 6)
                .addGroup(addBookInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addBookInputPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                    .addGroup(addBookInputPanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(addBookInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addBookInputPanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(authorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addBookInputPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(authorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                .addGap(6, 6, 6)
                .addGroup(addBookInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addBookInputPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(publisherLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                    .addGroup(addBookInputPanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(publisherTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(addBookInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addBookInputPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(priceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                    .addGroup(addBookInputPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(addBookInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addBookInputPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(qteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addBookInputPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(qteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)))
                .addGap(8, 8, 8)
                .addGroup(addBookInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(typeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addContainerGap())
        );

        addBookInputPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {authorTextField, priceTextField, publisherTextField, qteTextField, snTextField, titleTextField, typeTextField});

        clearFieldsButton.setBackground(new java.awt.Color(95, 168, 211));
        clearFieldsButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        clearFieldsButton.setForeground(new java.awt.Color(27, 73, 101));
        clearFieldsButton.setText("Clear");

        addedBooksTable.setBackground(new java.awt.Color(214, 237, 255));
        addedBooksTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addedBooksTable.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        addedBooksTable.setForeground(new java.awt.Color(27, 73, 101));
        addedBooksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SN", "Title", "Author", "Publisher", "Price", "Quantity", "Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        addedBooksTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        addedBooksTable.setColumnSelectionAllowed(true);
        addedBooksTable.setGridColor(new java.awt.Color(27, 73, 101));
        addedBooksTable.setShowGrid(false);
        scrollPane.setViewportView(addedBooksTable);
        addedBooksTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        addedBooksTable.getAccessibleContext().setAccessibleParent(mainPanel);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBookInputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(addBookButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(clearFieldsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(47, 47, 47)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(addBookInputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(clearFieldsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addBookButton)))
                    .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookButtonActionPerformed
        String sn = snTextField.getText().trim();
        String title = titleTextField.getText().trim();
        String author = authorTextField.getText().trim();
        String publisher = publisherTextField.getText().trim();
        double price = Double.parseDouble(priceTextField.getText().trim());
        int quantity = Integer.parseInt(qteTextField.getText().trim());
        char type;
        
        String typeStr = typeTextField.getText().trim();
        if(typeStr.length() != 1 || !"EHP".contains(typeStr)) {
            JOptionPane.showMessageDialog(this, "Invalid book type. Must be 'E for E-Book', 'H for Hard-Cover', or 'P for Paperback!'.");
            return;
        }
        type = typeStr.charAt(0);
        if(sn.isEmpty() || title.isEmpty() || author.isEmpty() || publisher.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required.");
            return;
        }

        boolean success = mainController.addBookToCatalog(sn, title, author, publisher, price, quantity, type);
        if(success) {
            JOptionPane.showMessageDialog(this, "Book added successfully.");
            displayBookCatalog();
            clearFields();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add book.");
        }

    }//GEN-LAST:event_addBookButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        LibrarianView librarianView = new LibrarianView(mainController);
        librarianView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void titleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleTextFieldActionPerformed

    }//GEN-LAST:event_titleTextFieldActionPerformed

    private void clearFields() {
        snTextField.setText("");
        titleTextField.setText("");
        authorTextField.setText("");
        publisherTextField.setText("");
        priceTextField.setText("");
        qteTextField.setText("");
        typeTextField.setText("");
    }
    
    private void displayBookCatalog() {
        DefaultTableModel tableModel = (DefaultTableModel) addedBooksTable.getModel();
        tableModel.setRowCount(0); 

        Map<String, Book> bookCatalog = mainController.getBookCatalog();
        for (Book book : bookCatalog.values()) {
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
            java.util.logging.Logger.getLogger(AddBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainController mainController = new MainController();
                LibrarianController librarianController = new LibrarianController();
                new AddBookView(mainController).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBookButton;
    private javax.swing.JPanel addBookInputPanel;
    private javax.swing.JTable addedBooksTable;
    private javax.swing.JLabel authorLabel;
    private javax.swing.JTextField authorTextField;
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearFieldsButton;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JLabel publisherLabel;
    private javax.swing.JTextField publisherTextField;
    private javax.swing.JLabel qteLabel;
    private javax.swing.JTextField qteTextField;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JLabel snLabel;
    private javax.swing.JTextField snTextField;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField titleTextField;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JTextField typeTextField;
    // End of variables declaration//GEN-END:variables
}
