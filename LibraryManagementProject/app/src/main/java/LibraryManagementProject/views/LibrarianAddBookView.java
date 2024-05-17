package LibraryManagementProject.views;

import LibraryManagementProject.controllers.LibrarianController;
import LibraryManagementProject.controllers.MainController;
import LibraryManagementProject.factory.Book;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * @author emmas,bridj
 */
public class LibrarianAddBookView extends javax.swing.JFrame {
    private MainController mainController;
    private ResourceBundle bundle;
    private ResourceBundle bundleFR;


    public LibrarianAddBookView(MainController mainController) {
        this.mainController = mainController;
        initComponents();
        displayBookCatalog();
        bundle = ResourceBundle.getBundle("LibrarianAddBookView");
        bundleFR = ResourceBundle.getBundle("LibrarianAddBookView_fr_FR", Locale.FRANCE);

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
        addBookTitleLabel = new javax.swing.JLabel();
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
        englishButton = new javax.swing.JRadioButton();
        frenchButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(194, 228, 255));

        mainPanel.setBackground(new java.awt.Color(194, 228, 255));

        addBookTitleLabel.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        addBookTitleLabel.setForeground(new java.awt.Color(27, 73, 101));
        addBookTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBookTitleLabel.setText("Add Book");
        addBookTitleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

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
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bookHome.png"))); // NOI18N
        backButton.setText("Back");
        backButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
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

        snTextField.setBackground(new java.awt.Color(235, 246, 255));
        snTextField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        snTextField.setForeground(new java.awt.Color(27, 73, 101));
        snTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        snTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snTextFieldActionPerformed(evt);
            }
        });

        titleTextField.setBackground(new java.awt.Color(235, 246, 255));
        titleTextField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        titleTextField.setForeground(new java.awt.Color(27, 73, 101));
        titleTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        titleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleTextFieldActionPerformed(evt);
            }
        });

        authorTextField.setBackground(new java.awt.Color(235, 246, 255));
        authorTextField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        authorTextField.setForeground(new java.awt.Color(27, 73, 101));
        authorTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        publisherTextField.setBackground(new java.awt.Color(235, 246, 255));
        publisherTextField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        publisherTextField.setForeground(new java.awt.Color(27, 73, 101));
        publisherTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        priceTextField.setBackground(new java.awt.Color(235, 246, 255));
        priceTextField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        priceTextField.setForeground(new java.awt.Color(27, 73, 101));
        priceTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        qteTextField.setBackground(new java.awt.Color(235, 246, 255));
        qteTextField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        qteTextField.setForeground(new java.awt.Color(27, 73, 101));
        qteTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        typeTextField.setBackground(new java.awt.Color(235, 246, 255));
        typeTextField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        typeTextField.setForeground(new java.awt.Color(27, 73, 101));
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
                            .addComponent(qteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(6, 6, 6)
                .addGroup(addBookInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addBookInputPanelLayout.createSequentialGroup()
                        .addComponent(snLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addBookInputPanelLayout.createSequentialGroup()
                        .addComponent(snTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleTextField)))
                .addGap(6, 6, 6)
                .addGroup(addBookInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addBookInputPanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(authorTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                    .addComponent(authorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(addBookInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(publisherLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addBookInputPanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(publisherTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)))
                .addGap(6, 6, 6)
                .addGroup(addBookInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addBookInputPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(priceTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)))
                .addGap(9, 9, 9)
                .addGroup(addBookInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addBookInputPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(qteTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                    .addComponent(qteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(addBookInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(typeTextField)
                    .addComponent(typeLabel))
                .addGap(8, 8, 8))
        );

        addBookInputPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {authorLabel, priceLabel, publisherLabel, qteLabel, snLabel, titleLabel, typeLabel});

        clearFieldsButton.setBackground(new java.awt.Color(95, 168, 211));
        clearFieldsButton.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        clearFieldsButton.setForeground(new java.awt.Color(27, 73, 101));
        clearFieldsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/clearField.png"))); // NOI18N
        clearFieldsButton.setText("Clear");
        clearFieldsButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        clearFieldsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearFieldsButtonActionPerformed(evt);
            }
        });

        addedBooksTable.setBackground(new java.awt.Color(214, 237, 255));
        addedBooksTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addedBooksTable.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        addedBooksTable.setForeground(new java.awt.Color(27, 73, 101));
        addedBooksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SN", "Title", "Author", "Publisher", "Price", "Quantity", "Date Added", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        addedBooksTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        addedBooksTable.setColumnSelectionAllowed(true);
        addedBooksTable.setGridColor(new java.awt.Color(27, 73, 101));
        addedBooksTable.setRowHeight(25);
        addedBooksTable.setShowGrid(true);
        scrollPane.setViewportView(addedBooksTable);
        addedBooksTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (addedBooksTable.getColumnModel().getColumnCount() > 0) {
            addedBooksTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            addedBooksTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            addedBooksTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            addedBooksTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            addedBooksTable.getColumnModel().getColumn(4).setPreferredWidth(100);
            addedBooksTable.getColumnModel().getColumn(5).setPreferredWidth(100);
            addedBooksTable.getColumnModel().getColumn(7).setPreferredWidth(100);
        }
        addedBooksTable.getAccessibleContext().setAccessibleParent(mainPanel);

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

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addBookInputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addBookButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clearFieldsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(englishButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(175, 175, 175)))
                .addGap(18, 18, 18)
                .addComponent(scrollPane)
                .addGap(31, 31, 31))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(398, 398, 398)
                .addComponent(addBookTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(454, 454, 454))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(frenchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(addBookTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(addBookInputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(addBookButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearFieldsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(englishButton)))
                    .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(frenchButton)
                .addGap(10, 10, 10))
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
    /**
     * Event handling for addBOo
     * @param evt 
     */
    private void addBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookButtonActionPerformed
        String sn = snTextField.getText().trim();
        String title = titleTextField.getText().trim();
        String author = authorTextField.getText().trim();
        String publisher = publisherTextField.getText().trim();
        double price = Double.parseDouble(priceTextField.getText().trim());
        int quantity = Integer.parseInt(qteTextField.getText().trim());
        char type;
        
        // Input handling: User needs to type char value  E, H, or P for book type which will be converted into string.
        String typeStr = typeTextField.getText().trim();
        if (typeStr.length() != 1 || !"EHP".contains(typeStr)) {
            JOptionPane.showMessageDialog(this, "Please write E for Ebook, H for HardCover, P for PaperBook");
            return;
        }
        
        // Input handling: User needs to type all fields required.
        type = typeStr.charAt(0);
        if (sn.isEmpty() || title.isEmpty() || author.isEmpty() || publisher.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required.");
            return;
        }

        mainController.addBookToCatalog(sn, title, author, publisher, price, quantity, type);
        JOptionPane.showMessageDialog(this, "Book added successfully.");
        displayBookCatalog();
        clearFields();

    }//GEN-LAST:event_addBookButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        LibrarianView librarianView = new LibrarianView(mainController);
        librarianView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void titleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleTextFieldActionPerformed

    }//GEN-LAST:event_titleTextFieldActionPerformed

    private void clearFieldsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearFieldsButtonActionPerformed
        snTextField.setText("");
        titleTextField.setText("");
        authorTextField.setText("");
        publisherTextField.setText("");
        priceTextField.setText("");
        qteTextField.setText("");
        typeTextField.setText("");
    }//GEN-LAST:event_clearFieldsButtonActionPerformed

    private void snTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snTextFieldActionPerformed

    // I8N
    private void englishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_englishButtonActionPerformed
        addBookTitleLabel.setText(bundle.getString("AddBook"));
        titleLabel.setText(bundle.getString("Title"));
        authorLabel.setText(bundle.getString("Author"));
        publisherLabel.setText(bundle.getString("Publisher"));
        priceLabel.setText(bundle.getString("Price"));
        qteLabel.setText(bundle.getString("Quantity"));
        typeLabel.setText(bundle.getString("Type"));
        addBookButton.setText(bundle.getString("AddBook"));
        clearFieldsButton.setText(bundle.getString("Clear"));
        backButton.setText(bundle.getString("Back"));
    }//GEN-LAST:event_englishButtonActionPerformed

    private void frenchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frenchButtonActionPerformed
         addBookTitleLabel.setText(bundleFR.getString("AddBook"));
        titleLabel.setText(bundleFR.getString("Title"));
        authorLabel.setText(bundleFR.getString("Author"));
        publisherLabel.setText(bundleFR.getString("Publisher"));
        priceLabel.setText(bundleFR.getString("Price"));
        qteLabel.setText(bundleFR.getString("Quantity"));
        typeLabel.setText(bundleFR.getString("Type"));
        addBookButton.setText(bundleFR.getString("AddBook"));
        clearFieldsButton.setText(bundleFR.getString("Clear"));
        backButton.setText(bundleFR.getString("Back"));
    }//GEN-LAST:event_frenchButtonActionPerformed

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

        Map<String, Book> bookCatalog = mainController.getBookCatalogLibrarian();
        for (Book book : bookCatalog.values()) {
            tableModel.addRow(new Object[]{
                book.getSN(),
                book.getTitle(),
                book.getAuthor(),
                book.getPublisher(),
                book.getPrice(),
                book.getQte(),
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
            java.util.logging.Logger.getLogger(LibrarianAddBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarianAddBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarianAddBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarianAddBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainController mainController = new MainController();
                LibrarianController librarianController = new LibrarianController();
                new LibrarianAddBookView(mainController).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBookButton;
    private javax.swing.JPanel addBookInputPanel;
    private javax.swing.JLabel addBookTitleLabel;
    private javax.swing.JTable addedBooksTable;
    private javax.swing.JLabel authorLabel;
    private javax.swing.JTextField authorTextField;
    private javax.swing.JButton backButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clearFieldsButton;
    private javax.swing.JRadioButton englishButton;
    private javax.swing.JRadioButton frenchButton;
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
