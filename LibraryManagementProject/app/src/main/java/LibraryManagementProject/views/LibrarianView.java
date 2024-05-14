package LibraryManagementProject.views;

import LibraryManagementProject.controllers.MainController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author emmas
 */
public class LibrarianView extends javax.swing.JFrame {
    private MainController mainController;

    
    public LibrarianView(MainController mainController) {
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
        enterReturnLabel = new javax.swing.JLabel();
        enterRequestBookTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        booksBorrowedTextArea = new javax.swing.JTextArea();
        allowButton = new javax.swing.JButton();
        denyButton = new javax.swing.JButton();
        booksRequestLabel = new javax.swing.JLabel();
        enterRequetsBookLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        booksReturnedTextArea = new javax.swing.JTextArea();
        titleLable = new javax.swing.JLabel();
        catalogButton = new javax.swing.JButton();
        booksRequestLabel2 = new javax.swing.JLabel();
        issuedBookButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        enterReturnBookTextField = new javax.swing.JTextField();
        returnButton = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        enterReturnLabel1 = new javax.swing.JLabel();
        enterRequestBookTextField2 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        bookRequestsTextArea = new javax.swing.JTextArea();
        allowButton2 = new javax.swing.JButton();
        denyButton2 = new javax.swing.JButton();
        booksRequestLabel3 = new javax.swing.JLabel();
        enterRequetsBookLabel2 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        bookReturnTextArea = new javax.swing.JTextArea();
        librarianTitleLabel = new javax.swing.JLabel();
        booksRequestLabel4 = new javax.swing.JLabel();
        enterReturnBookTextField1 = new javax.swing.JTextField();
        returnButton1 = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sidePanel = new javax.swing.JPanel();
        logOutButton = new javax.swing.JButton();
        dateTime = new javax.swing.JLabel();
        sideActionPanel = new javax.swing.JPanel();
        addBookButton = new javax.swing.JButton();
        viewCatalogButton = new javax.swing.JButton();
        addStudentButton = new javax.swing.JButton();
        issuedBooksButton = new javax.swing.JButton();

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

        enterReturnLabel.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        enterReturnLabel.setForeground(new java.awt.Color(27, 73, 101));
        enterReturnLabel.setText("Enter return number:");

        booksBorrowedTextArea.setColumns(20);
        booksBorrowedTextArea.setRows(5);
        jScrollPane1.setViewportView(booksBorrowedTextArea);

        allowButton.setBackground(new java.awt.Color(95, 168, 211));
        allowButton.setFont(new java.awt.Font("Modern No. 20", 0, 24)); // NOI18N
        allowButton.setForeground(new java.awt.Color(27, 73, 101));
        allowButton.setText("Allow");

        denyButton.setBackground(new java.awt.Color(95, 168, 211));
        denyButton.setFont(new java.awt.Font("Modern No. 20", 0, 24)); // NOI18N
        denyButton.setForeground(new java.awt.Color(27, 73, 101));
        denyButton.setText("Deny");

        booksRequestLabel.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        booksRequestLabel.setForeground(new java.awt.Color(27, 73, 101));
        booksRequestLabel.setText("BOOK REQUEST");

        enterRequetsBookLabel.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        enterRequetsBookLabel.setForeground(new java.awt.Color(27, 73, 101));
        enterRequetsBookLabel.setText("Enter request number:");

        booksReturnedTextArea.setColumns(20);
        booksReturnedTextArea.setRows(5);
        jScrollPane3.setViewportView(booksReturnedTextArea);

        titleLable.setFont(new java.awt.Font("Modern No. 20", 1, 36)); // NOI18N
        titleLable.setForeground(new java.awt.Color(27, 73, 101));
        titleLable.setText("Library summary");

        catalogButton.setBackground(new java.awt.Color(95, 168, 211));
        catalogButton.setFont(new java.awt.Font("Modern No. 20", 0, 24)); // NOI18N
        catalogButton.setForeground(new java.awt.Color(27, 73, 101));
        catalogButton.setText("Catalog");

        booksRequestLabel2.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        booksRequestLabel2.setForeground(new java.awt.Color(27, 73, 101));
        booksRequestLabel2.setText("BOOK RETURNS");

        issuedBookButton.setBackground(new java.awt.Color(95, 168, 211));
        issuedBookButton.setFont(new java.awt.Font("Modern No. 20", 0, 24)); // NOI18N
        issuedBookButton.setForeground(new java.awt.Color(27, 73, 101));
        issuedBookButton.setText("Issued Books");

        addButton.setBackground(new java.awt.Color(95, 168, 211));
        addButton.setFont(new java.awt.Font("Modern No. 20", 0, 24)); // NOI18N
        addButton.setForeground(new java.awt.Color(27, 73, 101));
        addButton.setText("Add a book");

        returnButton.setBackground(new java.awt.Color(95, 168, 211));
        returnButton.setFont(new java.awt.Font("Modern No. 20", 0, 24)); // NOI18N
        returnButton.setForeground(new java.awt.Color(27, 73, 101));
        returnButton.setText("Return");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(202, 233, 255));
        setName("librarianView"); // NOI18N
        setSize(new java.awt.Dimension(1000, 600));

        mainPanel.setBackground(new java.awt.Color(202, 233, 255));
        mainPanel.setForeground(new java.awt.Color(202, 233, 255));

        enterReturnLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        enterReturnLabel1.setForeground(new java.awt.Color(27, 73, 101));
        enterReturnLabel1.setText("Enter return number:");

        enterRequestBookTextField2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        bookRequestsTextArea.setColumns(20);
        bookRequestsTextArea.setRows(5);
        jScrollPane5.setViewportView(bookRequestsTextArea);

        allowButton2.setBackground(new java.awt.Color(95, 168, 211));
        allowButton2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        allowButton2.setForeground(new java.awt.Color(27, 73, 101));
        allowButton2.setText("Allow");

        denyButton2.setBackground(new java.awt.Color(95, 168, 211));
        denyButton2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        denyButton2.setForeground(new java.awt.Color(27, 73, 101));
        denyButton2.setText("Deny");

        booksRequestLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        booksRequestLabel3.setForeground(new java.awt.Color(27, 73, 101));
        booksRequestLabel3.setText("BOOK REQUEST");

        enterRequetsBookLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        enterRequetsBookLabel2.setForeground(new java.awt.Color(27, 73, 101));
        enterRequetsBookLabel2.setText("Enter request number:");

        bookReturnTextArea.setColumns(20);
        bookReturnTextArea.setRows(5);
        jScrollPane6.setViewportView(bookReturnTextArea);

        librarianTitleLabel.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        librarianTitleLabel.setForeground(new java.awt.Color(27, 73, 101));
        librarianTitleLabel.setText("Librarian");

        booksRequestLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        booksRequestLabel4.setForeground(new java.awt.Color(27, 73, 101));
        booksRequestLabel4.setText("BOOK RETURNS");

        enterReturnBookTextField1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        returnButton1.setBackground(new java.awt.Color(95, 168, 211));
        returnButton1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        returnButton1.setForeground(new java.awt.Color(27, 73, 101));
        returnButton1.setText("Return");

        backBtn.setBackground(new java.awt.Color(95, 168, 211));
        backBtn.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        backBtn.setForeground(new java.awt.Color(27, 73, 101));
        backBtn.setText("Back");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/illustrations/libraryDesign5.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backBtn))
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(enterRequetsBookLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(enterRequestBookTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(allowButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(denyButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(booksRequestLabel4)))
                                .addGap(28, 28, 28)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(enterReturnLabel1)
                                    .addComponent(enterReturnBookTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(returnButton1)))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(booksRequestLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addComponent(librarianTitleLabel)
                                .addGap(13, 13, 13)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(librarianTitleLabel)
                .addGap(83, 83, 83)
                .addComponent(enterReturnLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterReturnBookTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(returnButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(booksRequestLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(booksRequestLabel3)
                .addGap(28, 28, 28)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(enterRequetsBookLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enterRequestBookTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(allowButton2)
                            .addComponent(denyButton2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        sidePanel.setBackground(new java.awt.Color(189, 224, 254));
        sidePanel.setInheritsPopupMenu(true);
        sidePanel.setPreferredSize(new java.awt.Dimension(200, 0));

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
        dateTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateTime.setText("jLabel1");
        dateTime.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(27, 73, 101)));
        dateTime.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        sideActionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Actions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14), new java.awt.Color(27, 73, 101))); // NOI18N
        sideActionPanel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        sideActionPanel.setOpaque(false);

        addBookButton.setBackground(new java.awt.Color(95, 168, 211));
        addBookButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        addBookButton.setForeground(new java.awt.Color(27, 73, 101));
        addBookButton.setText("Add a book");
        addBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookButtonActionPerformed(evt);
            }
        });

        viewCatalogButton.setBackground(new java.awt.Color(95, 168, 211));
        viewCatalogButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        viewCatalogButton.setForeground(new java.awt.Color(27, 73, 101));
        viewCatalogButton.setText("View Catalog");

        addStudentButton.setBackground(new java.awt.Color(95, 168, 211));
        addStudentButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        addStudentButton.setForeground(new java.awt.Color(27, 73, 101));
        addStudentButton.setText("Add A Student");
        addStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentButtonActionPerformed(evt);
            }
        });

        issuedBooksButton.setBackground(new java.awt.Color(95, 168, 211));
        issuedBooksButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        issuedBooksButton.setForeground(new java.awt.Color(27, 73, 101));
        issuedBooksButton.setText("Issued Books");

        javax.swing.GroupLayout sideActionPanelLayout = new javax.swing.GroupLayout(sideActionPanel);
        sideActionPanel.setLayout(sideActionPanelLayout);
        sideActionPanelLayout.setHorizontalGroup(
            sideActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideActionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sideActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sideActionPanelLayout.createSequentialGroup()
                        .addGroup(sideActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addStudentButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(issuedBooksButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addBookButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addComponent(viewCatalogButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        sideActionPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addBookButton, addStudentButton, issuedBooksButton});

        sideActionPanelLayout.setVerticalGroup(
            sideActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideActionPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(addStudentButton)
                .addGap(18, 18, 18)
                .addComponent(addBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(issuedBooksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewCatalogButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sideActionPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addBookButton, addStudentButton, issuedBooksButton, viewCatalogButton});

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sideActionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(sidePanelLayout.createSequentialGroup()
                                .addComponent(dateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(logOutButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateTime)
                .addGap(134, 134, 134)
                .addComponent(sideActionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(logOutButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentButtonActionPerformed
        AddAStudentView addAStudentView = new AddAStudentView(mainController);
        addAStudentView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addStudentButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        mainController.getLibrarianController().logOut();
        EntryView entryView = new EntryView(mainController);
        entryView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void addBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookButtonActionPerformed
        AddBookView addBookView = new AddBookView(mainController);
        addBookView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addBookButtonActionPerformed

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
                MainController mainController = new MainController();
                new LibrarianView(mainController).setVisible(true);
            }
       });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBookButton;
    private javax.swing.JButton addButton;
    private javax.swing.JButton addStudentButton;
    private javax.swing.JButton allowButton;
    private javax.swing.JButton allowButton1;
    private javax.swing.JButton allowButton2;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel bookCatalogLabel;
    private javax.swing.JTextArea bookCatalogTextArea;
    private javax.swing.JTextArea bookRequestsTextArea;
    private javax.swing.JTextArea bookReturnTextArea;
    private javax.swing.JTextArea booksBorrowedTextArea;
    private javax.swing.JTextArea booksBorrowedTextArea1;
    private javax.swing.JLabel booksRequestLabel;
    private javax.swing.JLabel booksRequestLabel1;
    private javax.swing.JLabel booksRequestLabel2;
    private javax.swing.JLabel booksRequestLabel3;
    private javax.swing.JLabel booksRequestLabel4;
    private javax.swing.JTextArea booksReturnedTextArea;
    private javax.swing.JButton catalogButton;
    private javax.swing.JLabel dateTime;
    private javax.swing.JButton denyButton;
    private javax.swing.JButton denyButton1;
    private javax.swing.JButton denyButton2;
    private javax.swing.JTextField enterRequestBookTextField;
    private javax.swing.JTextField enterRequestBookTextField1;
    private javax.swing.JTextField enterRequestBookTextField2;
    private javax.swing.JLabel enterRequetsBookLabel;
    private javax.swing.JLabel enterRequetsBookLabel1;
    private javax.swing.JLabel enterRequetsBookLabel2;
    private javax.swing.JTextField enterReturnBookTextField;
    private javax.swing.JTextField enterReturnBookTextField1;
    private javax.swing.JLabel enterReturnLabel;
    private javax.swing.JLabel enterReturnLabel1;
    private javax.swing.JButton issuedBookButton;
    private javax.swing.JButton issuedBooksButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel librarianTitleLabel;
    private javax.swing.JButton logOutButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton returnButton;
    private javax.swing.JButton returnButton1;
    private javax.swing.JPanel sideActionPanel;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JLabel titleLable;
    private javax.swing.JButton viewCatalogButton;
    // End of variables declaration//GEN-END:variables
}
