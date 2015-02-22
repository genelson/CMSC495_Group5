/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Larry
 */
public class VideoManagementSystem extends javax.swing.JFrame {
    private static DatabaseManager m_databaseManager = null;
  
    

    /**
     * Create a GUI FORM
     * 
     */
   
    public VideoManagementSystem(DatabaseManager databaseManager) {
        m_databaseManager = databaseManager;
        initComponents();
        updateDropDowns();
        updateMovieDropDowns();
        //updateQueryMovieList();
        
        
        //queryMovieTableList.add("Bob", queryMovieTableList.getColumn(Title));
    }

    public static void errorBox(String theMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, theMessage, "ERROR: " + titleBar, JOptionPane.ERROR_MESSAGE);
        
    }
    
    public static void infoBox(String theMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, theMessage, "Informational: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
        
    }
    
  
    /**
     * 
     * 
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainTabPanel = new javax.swing.JTabbedPane();
        mainCustomerTab = new javax.swing.JPanel();
        customerSubTabs = new javax.swing.JTabbedPane();
        customerAdd = new javax.swing.JPanel();
        addCustomerButton = new javax.swing.JButton();
        addCustomerNameLabel = new javax.swing.JLabel();
        addCustomerLastNameText = new javax.swing.JTextField();
        addCustomerLastNameLabel = new javax.swing.JLabel();
        addCustomerFirstNameLabel = new javax.swing.JLabel();
        addCustomerFirstNameText = new javax.swing.JTextField();
        addCustomerPhoneLabel = new javax.swing.JLabel();
        addCustomerPhoneNumberText = new javax.swing.JTextField();
        addCustomerAddressLabel = new javax.swing.JLabel();
        addCustomerStreet = new javax.swing.JLabel();
        addCustomerStreetAddressText = new javax.swing.JTextField();
        addCustomerCityLabel = new javax.swing.JLabel();
        addCustomerCityText = new javax.swing.JTextField();
        addCustomerStateLabel = new javax.swing.JLabel();
        addCustomerStateText = new javax.swing.JTextField();
        addCustomerZipLabel = new javax.swing.JLabel();
        addCustomerZipText = new javax.swing.JTextField();
        customerDelete = new javax.swing.JPanel();
        removeCustomerDeleteButton = new javax.swing.JButton();
        removeCustomerDropDownList = new javax.swing.JComboBox();
        customerQuery = new javax.swing.JPanel();
        queryCustomerLastNameText = new javax.swing.JTextField();
        queryCustomerFirstNameLabel = new javax.swing.JLabel();
        queryCustomerPhoneLabel = new javax.swing.JLabel();
        queryCustomerLastNameLabel = new javax.swing.JLabel();
        queryCustomerFirstNameText = new javax.swing.JTextField();
        queryCustomerSearchButton = new javax.swing.JButton();
        queryCustomerPhoneNumberText = new javax.swing.JTextField();
        queryCustomerNameAddLabel = new javax.swing.JLabel();
        queryCustomerListPane = new javax.swing.JScrollPane();
        queryCustomerList = new javax.swing.JList();
        queryCustomerEditButton = new javax.swing.JButton();
        mainInventoryTab = new javax.swing.JPanel();
        inventorySubTabs = new javax.swing.JTabbedPane();
        movieAdd = new javax.swing.JPanel();
        addMovieButton = new javax.swing.JButton();
        addMovieTotalNumberOfMoviesLabel = new javax.swing.JLabel();
        addMovieTitleText = new javax.swing.JTextField();
        addMovieTitleLabel = new javax.swing.JLabel();
        addMovieTypeText = new javax.swing.JTextField();
        addMovieTypeLabel = new javax.swing.JLabel();
        addMovieRatingLabel = new javax.swing.JLabel();
        addMovieLengthText = new javax.swing.JTextField();
        addMovieLengthLabel = new javax.swing.JLabel();
        addMovieYearText = new javax.swing.JTextField();
        addMovieYearLabel = new javax.swing.JLabel();
        addMovieDirectorrText = new javax.swing.JTextField();
        addMovieDirectorLabel = new javax.swing.JLabel();
        addMovieTotalNumberOfMoviesText = new javax.swing.JTextField();
        addMovieRatingText = new javax.swing.JTextField();
        movieRemove = new javax.swing.JPanel();
        removeMovieButton = new javax.swing.JButton();
        removeMovieComboBox = new javax.swing.JComboBox();
        movieQuery = new javax.swing.JPanel();
        queryMovieIDText = new javax.swing.JTextField();
        queryMovieIDLabel = new javax.swing.JLabel();
        queryMovieTitleLabel = new javax.swing.JLabel();
        queryMovieTitleText = new javax.swing.JTextField();
        queryMovieGenreLabel = new javax.swing.JLabel();
        queryMovieRatingText = new javax.swing.JTextField();
        queryMovieRatingLabel = new javax.swing.JLabel();
        queryMovieLengthLabel = new javax.swing.JLabel();
        queryMovieLengthText = new javax.swing.JTextField();
        queryMovieYearText = new javax.swing.JTextField();
        queryMovieYearLabel = new javax.swing.JLabel();
        queryMovieDirectorText = new javax.swing.JTextField();
        queryMovieDirectorLabel = new javax.swing.JLabel();
        queryMovieSearchButton = new javax.swing.JButton();
        queryMovieSaveChangesButton = new javax.swing.JButton();
        queryMovieGenreText = new javax.swing.JTextField();
        queryMovieTable = new javax.swing.JScrollPane();
        queryMovieTableList = new javax.swing.JTable();
        queryMovieNumberText = new javax.swing.JTextField();
        queryMovieNumber = new javax.swing.JLabel();
        mainTransactionsTab = new javax.swing.JPanel();
        transactionsSubTab = new javax.swing.JTabbedPane();
        transactionsCheckOutTab = new javax.swing.JPanel();
        transactionsCheckOutCustomerIDLabel = new javax.swing.JLabel();
        transactionsCheckOutCustomerIDText = new javax.swing.JTextField();
        transactionsCheckOutCustomerListPane = new javax.swing.JScrollPane();
        transactionsCheckOutCustomerList = new javax.swing.JList();
        transactionsCheckOutButton = new javax.swing.JButton();
        transactionsCheckOutLateFeeButton = new javax.swing.JButton();
        transactionsCheckOutScrollBar = new javax.swing.JScrollBar();
        transactionsCheckOutSearchButton = new javax.swing.JButton();
        transactionsCheckInTab = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        transactionsCheckInButton = new javax.swing.JButton();
        transactionsCheckInLateFeeButton = new javax.swing.JButton();
        jScrollBar2 = new javax.swing.JScrollBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Video Rental Program Group 5");

        mainTabPanel.setBorder(new javax.swing.border.MatteBorder(null));
        mainTabPanel.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        addCustomerButton.setText("Add");
        addCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerButtonActionPerformed(evt);
            }
        });

        addCustomerNameLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addCustomerNameLabel.setText("Customer Name");

        addCustomerLastNameLabel.setText("Last");

        addCustomerFirstNameLabel.setText("First");

        addCustomerFirstNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerFirstNameTextActionPerformed(evt);
            }
        });

        addCustomerPhoneLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addCustomerPhoneLabel.setText("Phone Number");

        addCustomerPhoneNumberText.setToolTipText("1-222-222-2222");

        addCustomerAddressLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addCustomerAddressLabel.setText("Customer Address");

        addCustomerStreet.setText("Street Address");

        addCustomerStreetAddressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerStreetAddressTextActionPerformed(evt);
            }
        });

        addCustomerCityLabel.setText("City");

        addCustomerCityText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerCityTextActionPerformed(evt);
            }
        });

        addCustomerStateLabel.setText("State");

        addCustomerZipLabel.setText("Zip Code");

        javax.swing.GroupLayout customerAddLayout = new javax.swing.GroupLayout(customerAdd);
        customerAdd.setLayout(customerAddLayout);
        customerAddLayout.setHorizontalGroup(
            customerAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customerAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerAddLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(customerAddLayout.createSequentialGroup()
                        .addGroup(customerAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(customerAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(customerAddLayout.createSequentialGroup()
                                    .addComponent(addCustomerLastNameLabel)
                                    .addGap(95, 95, 95)
                                    .addComponent(addCustomerFirstNameLabel))
                                .addComponent(addCustomerPhoneLabel)
                                .addGroup(customerAddLayout.createSequentialGroup()
                                    .addGroup(customerAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(addCustomerPhoneNumberText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addCustomerNameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addCustomerLastNameText, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(addCustomerFirstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(addCustomerAddressLabel)
                                .addComponent(addCustomerStreet)
                                .addComponent(addCustomerStreetAddressText))
                            .addGroup(customerAddLayout.createSequentialGroup()
                                .addComponent(addCustomerCityLabel)
                                .addGap(102, 102, 102)
                                .addComponent(addCustomerStateLabel)
                                .addGap(92, 92, 92)
                                .addComponent(addCustomerZipLabel))
                            .addGroup(customerAddLayout.createSequentialGroup()
                                .addComponent(addCustomerCityText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addCustomerStateText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(addCustomerZipText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 179, Short.MAX_VALUE)))
                .addContainerGap())
        );
        customerAddLayout.setVerticalGroup(
            customerAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerAddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addCustomerNameLabel)
                .addGap(5, 5, 5)
                .addGroup(customerAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCustomerLastNameLabel)
                    .addComponent(addCustomerFirstNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(customerAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCustomerLastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCustomerFirstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addCustomerPhoneLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addCustomerPhoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addCustomerAddressLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addCustomerStreet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addCustomerStreetAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(customerAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCustomerCityLabel)
                    .addComponent(addCustomerStateLabel)
                    .addComponent(addCustomerZipLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(customerAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCustomerCityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCustomerStateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCustomerZipText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addComponent(addCustomerButton)
                .addContainerGap())
        );

        customerSubTabs.addTab("New Customer", customerAdd);

        removeCustomerDeleteButton.setText("Delete");
        removeCustomerDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCustomerDeleteButtonActionPerformed(evt);
            }
        });

        removeCustomerDropDownList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCustomerDropDownListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout customerDeleteLayout = new javax.swing.GroupLayout(customerDelete);
        customerDelete.setLayout(customerDeleteLayout);
        customerDeleteLayout.setHorizontalGroup(
            customerDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerDeleteLayout.createSequentialGroup()
                .addContainerGap(453, Short.MAX_VALUE)
                .addComponent(removeCustomerDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(customerDeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(removeCustomerDropDownList, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        customerDeleteLayout.setVerticalGroup(
            customerDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerDeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(removeCustomerDropDownList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 380, Short.MAX_VALUE)
                .addComponent(removeCustomerDeleteButton)
                .addContainerGap())
        );

        customerSubTabs.addTab("Remove Customer", customerDelete);

        queryCustomerFirstNameLabel.setText("First");

        queryCustomerPhoneLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        queryCustomerPhoneLabel.setText("Phone Number");

        queryCustomerLastNameLabel.setText("Last");

        queryCustomerFirstNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryCustomerFirstNameTextActionPerformed(evt);
            }
        });

        queryCustomerSearchButton.setText("Search");
        queryCustomerSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryCustomerSearchButtonActionPerformed(evt);
            }
        });

        queryCustomerPhoneNumberText.setToolTipText("1-222-222-2222");

        queryCustomerNameAddLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        queryCustomerNameAddLabel.setText("Customer Name");

        queryCustomerListPane.setViewportView(queryCustomerList);

        queryCustomerEditButton.setText("Edit");
        queryCustomerEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryCustomerEditButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout customerQueryLayout = new javax.swing.GroupLayout(customerQuery);
        customerQuery.setLayout(customerQueryLayout);
        customerQueryLayout.setHorizontalGroup(
            customerQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerQueryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customerQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerQueryLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(queryCustomerEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(queryCustomerSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(customerQueryLayout.createSequentialGroup()
                        .addGroup(customerQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(queryCustomerNameAddLabel)
                            .addComponent(queryCustomerLastNameLabel)
                            .addComponent(queryCustomerLastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(queryCustomerFirstNameLabel)
                            .addComponent(queryCustomerFirstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(queryCustomerPhoneLabel)
                            .addComponent(queryCustomerPhoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(queryCustomerListPane, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        customerQueryLayout.setVerticalGroup(
            customerQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerQueryLayout.createSequentialGroup()
                .addGroup(customerQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customerQueryLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(queryCustomerNameAddLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(queryCustomerLastNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(queryCustomerLastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(queryCustomerFirstNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(queryCustomerFirstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(queryCustomerPhoneLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(queryCustomerPhoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(queryCustomerListPane, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                .addGroup(customerQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(queryCustomerSearchButton)
                    .addComponent(queryCustomerEditButton))
                .addContainerGap())
        );

        customerSubTabs.addTab("Search Customer", customerQuery);

        javax.swing.GroupLayout mainCustomerTabLayout = new javax.swing.GroupLayout(mainCustomerTab);
        mainCustomerTab.setLayout(mainCustomerTabLayout);
        mainCustomerTabLayout.setHorizontalGroup(
            mainCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerSubTabs, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        mainCustomerTabLayout.setVerticalGroup(
            mainCustomerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerSubTabs, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        mainTabPanel.addTab("Customers", mainCustomerTab);

        addMovieButton.setText("Add");
        addMovieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMovieButtonActionPerformed(evt);
            }
        });

        addMovieTotalNumberOfMoviesLabel.setText("Amount");

        addMovieTitleText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMovieTitleTextActionPerformed(evt);
            }
        });

        addMovieTitleLabel.setText("Title");

        addMovieTypeLabel.setText("Genre");

        addMovieRatingLabel.setText("Rating");

        addMovieLengthLabel.setText("Length");

        addMovieYearLabel.setText("Year");

        addMovieDirectorLabel.setText("Director");

        addMovieRatingText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMovieRatingTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout movieAddLayout = new javax.swing.GroupLayout(movieAdd);
        movieAdd.setLayout(movieAddLayout);
        movieAddLayout.setHorizontalGroup(
            movieAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, movieAddLayout.createSequentialGroup()
                .addContainerGap(453, Short.MAX_VALUE)
                .addComponent(addMovieButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addGroup(movieAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(movieAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(movieAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(addMovieDirectorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(addMovieYearLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addMovieLengthLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addMovieRatingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addMovieTypeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addMovieTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(addMovieTotalNumberOfMoviesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(movieAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addMovieTypeText)
                    .addComponent(addMovieLengthText)
                    .addComponent(addMovieYearText)
                    .addComponent(addMovieDirectorrText)
                    .addComponent(addMovieRatingText)
                    .addComponent(addMovieTotalNumberOfMoviesText)
                    .addComponent(addMovieTitleText))
                .addGap(374, 374, 374))
        );
        movieAddLayout.setVerticalGroup(
            movieAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, movieAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(movieAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMovieTitleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addMovieTitleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(movieAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMovieTypeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addMovieTypeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(movieAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMovieRatingText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addMovieRatingLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(movieAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMovieLengthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addMovieLengthLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(movieAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMovieYearText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addMovieYearLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(movieAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMovieDirectorrText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addMovieDirectorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(movieAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMovieTotalNumberOfMoviesText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addMovieTotalNumberOfMoviesLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                .addComponent(addMovieButton)
                .addContainerGap())
        );

        inventorySubTabs.addTab("Add Movie", movieAdd);

        removeMovieButton.setText("Delete");
        removeMovieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMovieButtonActionPerformed(evt);
            }
        });

        removeMovieComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMovieComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout movieRemoveLayout = new javax.swing.GroupLayout(movieRemove);
        movieRemove.setLayout(movieRemoveLayout);
        movieRemoveLayout.setHorizontalGroup(
            movieRemoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, movieRemoveLayout.createSequentialGroup()
                .addContainerGap(453, Short.MAX_VALUE)
                .addComponent(removeMovieButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(movieRemoveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(removeMovieComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        movieRemoveLayout.setVerticalGroup(
            movieRemoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movieRemoveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(removeMovieComboBox)
                .addGap(388, 388, 388)
                .addComponent(removeMovieButton)
                .addContainerGap())
        );

        inventorySubTabs.addTab("Remove Movie", movieRemove);

        queryMovieIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryMovieIDTextActionPerformed(evt);
            }
        });

        queryMovieIDLabel.setText("Amount");

        queryMovieTitleLabel.setText("Title");

        queryMovieGenreLabel.setText("Genre");

        queryMovieRatingLabel.setText("Rating");

        queryMovieLengthLabel.setText("Length");

        queryMovieYearLabel.setText("Year");

        queryMovieDirectorLabel.setText("Director");

        queryMovieSearchButton.setText("Search");
        queryMovieSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryMovieSearchButtonActionPerformed(evt);
            }
        });

        queryMovieSaveChangesButton.setText("Save Changes");
        queryMovieSaveChangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryMovieSaveChangesButtonActionPerformed(evt);
            }
        });

        queryMovieGenreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryMovieGenreTextActionPerformed(evt);
            }
        });

        queryMovieTableList.setAutoCreateRowSorter(true);
        queryMovieTableList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Title"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        queryMovieTableList.getTableHeader().setReorderingAllowed(false);
        queryMovieTable.setViewportView(queryMovieTableList);
        if (queryMovieTableList.getColumnModel().getColumnCount() > 0) {
            queryMovieTableList.getColumnModel().getColumn(0).setMinWidth(10);
            queryMovieTableList.getColumnModel().getColumn(0).setPreferredWidth(30);
            queryMovieTableList.getColumnModel().getColumn(0).setMaxWidth(40);
            queryMovieTableList.getColumnModel().getColumn(1).setResizable(false);
        }

        queryMovieNumberText.setEditable(false);

        queryMovieNumber.setText("ID");

        javax.swing.GroupLayout movieQueryLayout = new javax.swing.GroupLayout(movieQuery);
        movieQuery.setLayout(movieQueryLayout);
        movieQueryLayout.setHorizontalGroup(
            movieQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(queryMovieTable)
            .addGroup(movieQueryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(movieQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(movieQueryLayout.createSequentialGroup()
                        .addComponent(queryMovieTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(queryMovieTitleText)
                        .addGap(18, 18, 18))
                    .addGroup(movieQueryLayout.createSequentialGroup()
                        .addGroup(movieQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(movieQueryLayout.createSequentialGroup()
                                .addGroup(movieQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(movieQueryLayout.createSequentialGroup()
                                        .addComponent(queryMovieLengthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(queryMovieLengthText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(movieQueryLayout.createSequentialGroup()
                                        .addComponent(queryMovieNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(queryMovieNumber)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(movieQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, movieQueryLayout.createSequentialGroup()
                                        .addComponent(queryMovieSaveChangesButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(queryMovieSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(movieQueryLayout.createSequentialGroup()
                                        .addComponent(queryMovieYearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(queryMovieYearText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(queryMovieDirectorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(queryMovieDirectorText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(movieQueryLayout.createSequentialGroup()
                                .addComponent(queryMovieIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(queryMovieIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(queryMovieGenreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(queryMovieGenreText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(queryMovieRatingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(queryMovieRatingText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        movieQueryLayout.setVerticalGroup(
            movieQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movieQueryLayout.createSequentialGroup()
                .addComponent(queryMovieTable, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(movieQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(queryMovieTitleLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(queryMovieTitleText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(movieQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(queryMovieLengthLabel)
                    .addComponent(queryMovieLengthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(queryMovieYearLabel)
                    .addComponent(queryMovieYearText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(queryMovieDirectorLabel)
                    .addComponent(queryMovieDirectorText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(movieQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(queryMovieIDLabel)
                    .addComponent(queryMovieIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(queryMovieGenreLabel)
                    .addComponent(queryMovieGenreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(queryMovieRatingLabel)
                    .addComponent(queryMovieRatingText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(movieQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(movieQueryLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(movieQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(queryMovieSearchButton)
                            .addComponent(queryMovieSaveChangesButton)))
                    .addGroup(movieQueryLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(movieQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(queryMovieNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(queryMovieNumber))))
                .addContainerGap())
        );

        inventorySubTabs.addTab("Search Movie", movieQuery);

        javax.swing.GroupLayout mainInventoryTabLayout = new javax.swing.GroupLayout(mainInventoryTab);
        mainInventoryTab.setLayout(mainInventoryTabLayout);
        mainInventoryTabLayout.setHorizontalGroup(
            mainInventoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inventorySubTabs)
        );
        mainInventoryTabLayout.setVerticalGroup(
            mainInventoryTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainInventoryTabLayout.createSequentialGroup()
                .addComponent(inventorySubTabs, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainTabPanel.addTab("Inventory", mainInventoryTab);

        transactionsCheckOutCustomerIDLabel.setText("Customer ID");

        transactionsCheckOutCustomerList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "List 1", "List 2", "List 3" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        transactionsCheckOutCustomerListPane.setViewportView(transactionsCheckOutCustomerList);

        transactionsCheckOutButton.setText("Check Out");
        transactionsCheckOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionsCheckOutButtonActionPerformed(evt);
            }
        });

        transactionsCheckOutLateFeeButton.setText("Late Fee");
        transactionsCheckOutLateFeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionsCheckOutLateFeeButtonActionPerformed(evt);
            }
        });

        transactionsCheckOutSearchButton.setText("Search");

        javax.swing.GroupLayout transactionsCheckOutTabLayout = new javax.swing.GroupLayout(transactionsCheckOutTab);
        transactionsCheckOutTab.setLayout(transactionsCheckOutTabLayout);
        transactionsCheckOutTabLayout.setHorizontalGroup(
            transactionsCheckOutTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionsCheckOutTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(transactionsCheckOutTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transactionsCheckOutTabLayout.createSequentialGroup()
                        .addComponent(transactionsCheckOutCustomerListPane)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transactionsCheckOutScrollBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(transactionsCheckOutTabLayout.createSequentialGroup()
                        .addComponent(transactionsCheckOutCustomerIDLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transactionsCheckOutCustomerIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transactionsCheckOutSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 269, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transactionsCheckOutTabLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(transactionsCheckOutLateFeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transactionsCheckOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        transactionsCheckOutTabLayout.setVerticalGroup(
            transactionsCheckOutTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionsCheckOutTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(transactionsCheckOutTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transactionsCheckOutCustomerIDLabel)
                    .addComponent(transactionsCheckOutCustomerIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transactionsCheckOutSearchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(transactionsCheckOutTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(transactionsCheckOutScrollBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transactionsCheckOutCustomerListPane, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(transactionsCheckOutTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transactionsCheckOutButton)
                    .addComponent(transactionsCheckOutLateFeeButton))
                .addContainerGap())
        );

        transactionsSubTab.addTab("Check Out", transactionsCheckOutTab);

        jList3.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "List 1", "List 2", "List 3" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList3);

        transactionsCheckInButton.setText("Check In");
        transactionsCheckInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionsCheckInButtonActionPerformed(evt);
            }
        });

        transactionsCheckInLateFeeButton.setText("Late Fee");
        transactionsCheckInLateFeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionsCheckInLateFeeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout transactionsCheckInTabLayout = new javax.swing.GroupLayout(transactionsCheckInTab);
        transactionsCheckInTab.setLayout(transactionsCheckInTabLayout);
        transactionsCheckInTabLayout.setHorizontalGroup(
            transactionsCheckInTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionsCheckInTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(transactionsCheckInTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transactionsCheckInTabLayout.createSequentialGroup()
                        .addGap(0, 347, Short.MAX_VALUE)
                        .addComponent(transactionsCheckInLateFeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transactionsCheckInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(transactionsCheckInTabLayout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        transactionsCheckInTabLayout.setVerticalGroup(
            transactionsCheckInTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionsCheckInTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(transactionsCheckInTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                    .addComponent(jScrollBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(transactionsCheckInTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transactionsCheckInButton)
                    .addComponent(transactionsCheckInLateFeeButton))
                .addContainerGap())
        );

        transactionsSubTab.addTab("Check In", transactionsCheckInTab);

        javax.swing.GroupLayout mainTransactionsTabLayout = new javax.swing.GroupLayout(mainTransactionsTab);
        mainTransactionsTab.setLayout(mainTransactionsTabLayout);
        mainTransactionsTabLayout.setHorizontalGroup(
            mainTransactionsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(transactionsSubTab)
        );
        mainTransactionsTabLayout.setVerticalGroup(
            mainTransactionsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(transactionsSubTab)
        );

        mainTabPanel.addTab("Transactions", mainTransactionsTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTabPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainTabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCustomerFirstNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerFirstNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addCustomerFirstNameTextActionPerformed

    private void removeCustomerDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCustomerDeleteButtonActionPerformed
        // TODO More logic yo:
        String selectedItem = (String)removeCustomerDropDownList.getSelectedItem();
        String[] splitingHairs = selectedItem.split(":");
        
        //System.out.println(splitingHairs[1]);
      
        if (JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the Customer '" + splitingHairs[0] + "'?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            
            //WAX THE CUSTOMER....RAWR
            removeCustomers(splitingHairs[0], Integer.parseInt(splitingHairs[1]));
            
            // ----- Lets clean up our mess and Rebuild our List
            updateDropDowns();
        } 
        
        else {
            // LETS GET THE HELL OUTA HERE!!!
        }
    }//GEN-LAST:event_removeCustomerDeleteButtonActionPerformed

    private void addCustomerStreetAddressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerStreetAddressTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addCustomerStreetAddressTextActionPerformed

    private void addCustomerCityTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerCityTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addCustomerCityTextActionPerformed

    private void queryCustomerFirstNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryCustomerFirstNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_queryCustomerFirstNameTextActionPerformed

    private void addMovieTitleTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMovieTitleTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addMovieTitleTextActionPerformed

    private void queryMovieIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryMovieIDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_queryMovieIDTextActionPerformed

    private void transactionsCheckInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionsCheckInButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transactionsCheckInButtonActionPerformed

    private void addCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerButtonActionPerformed
        // Testing error popup
        //errorBox("But it could be worse", "This error sucks ass");
        //runTests();
        String Lastname = addCustomerLastNameText.getText();
        String Firstname = addCustomerFirstNameText.getText();
        String Phone = addCustomerPhoneNumberText.getText();
        String Street = addCustomerStreetAddressText.getText();
        String City = addCustomerCityText.getText();
        String State = addCustomerStateText.getText();
        String Zip = addCustomerZipText.getText();
        
        if (addCustomerLastNameText.getText().length()==0 || addCustomerLastNameText.getText().matches("^[ ]+") ) {
            errorBox("Please Enter Last Name", "Add Customer Error");
        }
        
        else if (addCustomerFirstNameText.getText().length()==0 || addCustomerFirstNameText.getText().matches("^[ ]+")) {
            errorBox("Please Enter First Name", "Add Customer Error");
        }
        
        else if (addCustomerPhoneNumberText.getText().length()==0 || addCustomerPhoneNumberText.getText().length() != 10 || addCustomerPhoneNumberText.getText().matches("^[ ]+")) {
            errorBox("Please Enter Phone Number, Remove Hypens, or verify number is 10 digits", "Add Customer Error");
        }
        
        else if (addCustomerStreetAddressText.getText().length()==0 || addCustomerStreetAddressText.getText().matches("^[ ]+")) {
            errorBox("Please Enter Street", "Add Customer Error");
        }
        
        else if (addCustomerCityText.getText().length()==0 || addCustomerCityText.getText().matches("^[ ]+")) {
            errorBox("Please Enter City", "Add Customer Error");
        }
        
        else if (addCustomerStateText.getText().length()==0 || addCustomerStateText.getText().length()>2) {
            errorBox("Please Enter State, or make sure your using 2 letter abbreviation", "Add Customer Error");
        }
        
        else if ( ! addCustomerZipText.getText().matches("^[0-9]{5}")) {
            errorBox("Please Enter Zip Code, or verify zipcode is 5 digits", "Add Customer Error");
        }
                        
        else {
        addCustomers(Firstname,
                Lastname,
                Street,
                City,
                State,
                Zip,
                Phone);
        
        addCustomerZipText.setText("");
        addCustomerStateText.setText("");
        addCustomerCityText.setText("");
        addCustomerStreetAddressText.setText("");
        addCustomerPhoneNumberText.setText("");
        addCustomerFirstNameText.setText("");
        addCustomerLastNameText.setText("");
        
        // Refresh our list
        updateDropDowns();
        }
    }//GEN-LAST:event_addCustomerButtonActionPerformed

    private void queryCustomerSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryCustomerSearchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_queryCustomerSearchButtonActionPerformed

    private void queryCustomerEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryCustomerEditButtonActionPerformed
       
    }//GEN-LAST:event_queryCustomerEditButtonActionPerformed

    private void queryMovieSaveChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryMovieSaveChangesButtonActionPerformed
        // TODO 
        int totalCount = queryMovieDirectorText.getText().length() + queryMovieLengthText.getText().length() + queryMovieRatingText.getText().length() 
                + queryMovieTitleText.getText().length() + queryMovieYearText.getText().length() + queryMovieIDText.getText().length() 
                + queryMovieGenreText.getText().length() + queryMovieNumberText.getText().length();
                
        if ( totalCount == 0){
            errorBox("No selection was made! Cannot edit.", "Video Search Error");
            return;
        }
        
        
        String Director = queryMovieDirectorText.getText();
        String Length = queryMovieLengthText.getText();
        String Rating = queryMovieRatingText.getText();
        String Title = queryMovieTitleText.getText();
        String Year = queryMovieYearText.getText();
        String Count = queryMovieIDText.getText();
        String Genre = queryMovieGenreText.getText();
        String IDtmp = queryMovieNumberText.getText();
        // Movie ID to make changes
        int ID = Integer.parseInt(IDtmp);
        
        //int totalCount = Director.length() + Length.length() + Rating.length() + Title.length() + Year.length() + Count.length() + Genre.length() + IDtmp.length();
        
        System.out.println(totalCount);
        
    }//GEN-LAST:event_queryMovieSaveChangesButtonActionPerformed

    private void transactionsCheckOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionsCheckOutButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transactionsCheckOutButtonActionPerformed

    private void transactionsCheckOutLateFeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionsCheckOutLateFeeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transactionsCheckOutLateFeeButtonActionPerformed

    private void transactionsCheckInLateFeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionsCheckInLateFeeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transactionsCheckInLateFeeButtonActionPerformed

    private void queryMovieSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryMovieSearchButtonActionPerformed
        // TODO
        int selectedRowIndex = queryMovieTableList.getSelectedRow();
        if(selectedRowIndex < 0)
        {
            errorBox("No selection was made! Cannot edit.", "Video Search Error");
            return;
        }
        //int selectedColumnIndex = queryMovieTableList.getSelectedColumn();
        
        String selectedString = (String) queryMovieTableList.getModel().getValueAt(selectedRowIndex,0);
        //System.out.println(selectedString);
        ArrayList<Video> queryTheVideo = m_databaseManager.searchVideos(true, Integer.parseInt(selectedString), null, null, null, null, null, null);
        
        for(Video video : queryTheVideo)
        {
            //System.out.println("        Video: [" + video.m_id + "] " + video.m_title + " (" + video.m_year + ")");
            queryMovieDirectorText.setText(video.m_director);
            queryMovieLengthText.setText(video.m_length);
            queryMovieRatingText.setText(video.m_rating);
            queryMovieTitleText.setText(video.m_title);
            queryMovieYearText.setText(video.m_year);
            queryMovieIDText.setText(String.valueOf(video.m_totalNumberOfMovies));
            queryMovieGenreText.setText(video.m_type);
            queryMovieNumberText.setText(String.valueOf(video.m_id));
        }
    }//GEN-LAST:event_queryMovieSearchButtonActionPerformed

    private void removeMovieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeMovieButtonActionPerformed
        // TODO More logic yo:
        String selectedItem = (String)removeMovieComboBox.getSelectedItem();
        String[] splitingHairs = selectedItem.split(":");
        
        //System.out.println(splitingHairs[1]);
      
        if (JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the Movie '" + splitingHairs[0] + "'?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            
            //WAX THE Movie....RAWR
            removeVideo(splitingHairs[0], Integer.parseInt(splitingHairs[1]));
            
            // ----- Lets clean up our mess and Rebuild our List
            updateMovieDropDowns();
        } 
        
        else {
            // LETS GET THE HELL OUTA HERE!!!
        }
    }//GEN-LAST:event_removeMovieButtonActionPerformed

    private void addMovieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMovieButtonActionPerformed
        // TODO
        String Title = addMovieTitleText.getText();
        String Type = addMovieTypeText.getText();
        String Rating = addMovieRatingText.getText();
        String Length = addMovieLengthText.getText();
        String Year = addMovieYearText.getText();
        String Director = addMovieDirectorrText.getText();
        String TotalNumberOfMovies = addMovieTotalNumberOfMoviesText.getText();
        
        if (addMovieTitleText.getText().length()==0 || addMovieTitleText.getText().matches("^[ ]+") ) {
            errorBox("Please Enter Movie Title", "Video Add Error");
        }
        
        else if (addMovieTypeText.getText().length()==0 || addMovieTypeText.getText().matches("^[ ]+")) {
            errorBox("Please Enter Movie Genre", "Video Add Error");
        }
        
        else if (addMovieRatingText.getText().length()==0 || addMovieRatingText.getText().matches("^[ ]+")) {
            errorBox("Please Enter a Movie Rating", "Video Add Error");
        }
        
        else if (addMovieLengthText.getText().length()==0 || addMovieLengthText.getText().matches("^[ ]+")) {
            errorBox("Please Enter Movie Length", "Video Add Error");
        }
        
        else if ( ! addMovieYearText.getText().matches("^[12][0-9]{3}")) {
            errorBox("Please Enter the Movies Year, or invalid format (Range of 1000-2999)", "Video Add Error");
        }
        
        else if (addMovieDirectorrText.getText().length()==0 || addMovieDirectorrText.getText().matches("^[ ]+")) {
            errorBox("Please Enter Movie Director", "Video Add Error");
        }
        
        else if ( ! addMovieTotalNumberOfMoviesText.getText().matches("^[1-9][0-9]?")) {
            errorBox("Please Enter amount of Movies. Must be a number not exceeding 99", "Video Add Error");
        }
                        
        else {
            int movieCount = Integer.parseInt(TotalNumberOfMovies);
            //errorBox("NOTWORKING", "Empty Field");
        addVideo(Title,
                Type,
                Rating,
                Length,
                Year,
                Director,
                movieCount);
        
        addMovieTitleText.setText("");
        addMovieTypeText.setText("");
        addMovieRatingText.setText("");
        addMovieLengthText.setText("");
        addMovieYearText.setText("");
        addMovieDirectorrText.setText("");
        addMovieTotalNumberOfMoviesText.setText("");
        
        // Refresh our list
        updateMovieDropDowns();            
        }
    }//GEN-LAST:event_addMovieButtonActionPerformed

    private void removeCustomerDropDownListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCustomerDropDownListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeCustomerDropDownListActionPerformed

    private void addMovieRatingTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMovieRatingTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addMovieRatingTextActionPerformed

    private void removeMovieComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeMovieComboBoxActionPerformed
        //
    }//GEN-LAST:event_removeMovieComboBoxActionPerformed

    private void queryMovieGenreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryMovieGenreTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_queryMovieGenreTextActionPerformed
    
    public void updateDropDowns() {
        removeCustomerDropDownList.removeAllItems();
        ArrayList<Customer> queryCustomerTest = m_databaseManager.searchCustomers(false, 0, null, null, null);
        for(Customer customer : queryCustomerTest) {
            //System.out.println("        Customer: [" + customer.m_id + "] " + customer.m_firstName + " " + customer.m_lastName + " (" + customer.m_phoneNumber + ")");
            removeCustomerDropDownList.addItem(customer.m_firstName + " " + customer.m_lastName + ":" + customer.m_id);
        }
    }
    
    public void updateMovieDropDowns() {
        removeMovieComboBox.removeAllItems();
        clearTable();
        ArrayList<Video> queryVideoTest = m_databaseManager.searchVideos(false, 0, null, null, null, null, null, null);
        int i=0;
        for(Video video : queryVideoTest)
        {
            //System.out.println("        Video: [" + video.m_id + "] " + video.m_title + " (" + video.m_year + ")");
            removeMovieComboBox.addItem(video.m_title + ":" + video.m_id);
            
            queryMovieTableList.getModel().setValueAt(String.valueOf(video.m_id), i, 0);
            queryMovieTableList.getModel().setValueAt(video.m_title, i, 1);
            i++;
        } 
    }
    
   
    public void clearTable(){
        for (int i = 0; i < queryMovieTableList.getRowCount(); i++){
            for(int j = 0; j < queryMovieTableList.getColumnCount(); j++) {
                queryMovieTableList.setValueAt("", i, j);
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
         m_databaseManager =
                new DatabaseManager("jdbc:mysql://db152b.pair.com/travin_cmsc495",
                "travin_14",
                "Aw3s0m3!",
                "travin_cmsc495",
                3306);

        //System.out.println(queryCustomerTest.toArray());
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
            java.util.logging.Logger.getLogger(VideoManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VideoManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VideoManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VideoManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VideoManagementSystem(m_databaseManager).setVisible(true);
            }
        });
        // Create a new DatabaseManager to give us access to the
        // MySQL Back-End subsystem
       
        
        // Run some simple tests. This should be removed in the final
        // application/submission and is only meant to be run during
        // development.
        //runTests(); //TODO - remove before final submission
    }
    
    ///////////////////////////////////////////////////////////////////
    // START GUI FUNCTIONS
    //
    // Functions for the GUI to be able to access.
    // These are for the button actions and
    // for the lists/drop down menus
    //
    //
    ///////////////////////////////////////////////////////////////////
    
    public static void addCustomers(String firstName,
            String lastName,
            String streetAddress,
            String theCity,
            String theState,
            String theZipcode,
            String phoneNumber)
    {
        
        //Function for the add customer button. This should add a customer from the filled out fields
        
        DatabaseManager.DbResult resultCustomerAddOk = m_databaseManager.addCustomer(firstName, lastName, streetAddress, theCity, theState, theZipcode, phoneNumber);
        
        if(resultCustomerAddOk != DatabaseManager.DbResult.DB_OK)
        {
            // A error
            errorBox("Look into VideoManagementSystem.addCustomers()", "Some type of add user failsauce");
            
        } 
        
        else {
            infoBox("'" + firstName + " " + lastName + "'" + " Added sucessfully!", "Sucessfull");
        }
              
    }
    
    public static void removeCustomers(String customerName, int customerID) {
       
        DatabaseManager.DbResult resultCustomerRemove = m_databaseManager.removeCustomer(customerID);
        if(resultCustomerRemove != DatabaseManager.DbResult.DB_OK)
        {
            //System.out.println("    Customer Edit Error: This customer doesn't exist or has rentals out/latefees.");
            errorBox("Look into VideoManagementSystem.removeCustomers()", "Some type of remove user failsauce");
        }
        else
        {
            //System.out.println("    Customer successfully removed.");
            infoBox( "'" + customerName + "' deleted sucessfully!", "Sucessfull");
        }
    }
    
    public static void queryCustomers(String lastName, String firstName, int ID) {
        // I need this function to return a array list in the Format of "Name, ID" that I can have 
        // in the VideoManagementSystem.java...
        // that way I can put the arraylist in the dropdown in the GUI, then when you click "remove"
        // It should grab the ID from the drop down and pass it to the removeCustomers function
        ArrayList<Customer> queryCustomerTest = m_databaseManager.searchCustomers(false, ID, lastName, firstName, null);      
   
    }
    
    public static void addVideo(String title,
            String type,
            String rating,
            String length,
            String year,
            String director,
            int totalNumberOfMovies)
    {
        DatabaseManager.DbResult resultVideoAddOk = m_databaseManager.addVideo(title, type, rating, length, year, director, totalNumberOfMovies);
        
        if(resultVideoAddOk != DatabaseManager.DbResult.DB_OK)
        {
            //System.out.println("    Video Add Error: Video already exists.");
            errorBox("Look into VideoManagementSystem.addVideo()", "Some type of add video failsauce");
            
            // Get this video, store it as the original for now (we've likely run this
            // hard-coded test already and don't want to purge the database to test
            // the edits below)
            
        }
        else
        {
            //System.out.println("    Video successfully added:");
            infoBox( "'" + title + "' added sucessfully!", "Sucessfull");
        
        }
    }
    
    public static void removeVideo(String videoName, int videoID)
    {
        
        DatabaseManager.DbResult resultVideoRemove = m_databaseManager.removeVideo(videoID);
        
        if(resultVideoRemove != DatabaseManager.DbResult.DB_OK)
        {
            //System.out.println("    Video Edit Error: This video doesn't exist or has rentals out.");
            errorBox("Look into VideoManagementSystem.removeVideo()", "Some type of remove video failsauce");
        }
        else
        {
            //System.out.println("    Video successfully removed.");
            infoBox( videoName + " removed sucessfully!", "Sucessfull");
        }
    }
    
    public static void queryVideo(){
        // Need to get this queryVideo working. 
        ArrayList<Video> queryVideoAddVerify = m_databaseManager.searchVideos(true, 0, "Charlie and the Chocolate Factory", null, null, null, "2013", null);
    }
    
    ///////////////////////////////////////////////////////////////////
    // END GUI FUNCTIONS
    //
    //
    //
    //
    ///////////////////////////////////////////////////////////////////
    
    
    ///////////////////////////////////////////////////////////////////
    // Start Tests function built by Georgia
    //
    //
    //
    //
    ///////////////////////////////////////////////////////////////////
    public static void runTests()
    {        
        //----------------------------------------------------------------------
        // TEST - VIDEO SEARCH
        //----------------------------------------------------------------------
        System.out.println("TEST 1: Video search");
        ArrayList<Video> queryVideoTest = m_databaseManager.searchVideos(false, 0, "Sil", null, null, null, null, null);
        
        System.out.println("    VIDEO RESULTS:");
        for(Video video : queryVideoTest)
        {
            System.out.println("        Video: [" + video.m_id + "] " + video.m_title + " (" + video.m_year + ")");
        }
        System.out.println("    END RESULTS");
        System.out.println("");
        
        //----------------------------------------------------------------------
        // TEST - CUSTOMER SEARCH
        //----------------------------------------------------------------------
        System.out.println("TEST 2: Customer search");
        // This searches ALL customers
        ArrayList<Customer> queryCustomerTest = m_databaseManager.searchCustomers(false, 0, null, null, null);
        
        System.out.println("    CUSTOMER RESULTS:");
        for(Customer customer : queryCustomerTest)
        {
            System.out.println("        Customer: [" + customer.m_id + "] " + customer.m_firstName + " " + customer.m_lastName + " (" + customer.m_phoneNumber + ")");
        }
        System.out.println("    END RESULTS");
        System.out.println("");
        
        //----------------------------------------------------------------------
        // TEST - ADD VIDEO OF SAME TITLE/YEAR AS ANOTHER
        //----------------------------------------------------------------------
        System.out.println("TEST 3: Test if a video error is given when trying to add existing one");
        DatabaseManager.DbResult resultVideoAddErr = m_databaseManager.addVideo("Argo", "", "", "", "2012", "", 10);
        if(resultVideoAddErr == DatabaseManager.DbResult.DB_ERR_RECORD_EXISTS)
        {
            System.out.println("    Video Add Error: Already exists!");
        }
        System.out.println("");
        
        //----------------------------------------------------------------------
        // TEST - ADD VIDEO WE KNOW DOESNT EXIST
        //----------------------------------------------------------------------
        System.out.println("TEST 4: Add a video correctly");
        
        // Cache this video, we'll need it in the edit test later
        Video originalVideo = null;
        
        DatabaseManager.DbResult resultVideoAddOk = m_databaseManager.addVideo("Charlie and the Chocolate Factory", "", "", "", "2013", "", 5);
        if(resultVideoAddOk != DatabaseManager.DbResult.DB_OK)
        {
            System.out.println("    Video Add Error: Video already exists.");
            
            // Get this video, store it as the original for now (we've likely run this
            // hard-coded test already and don't want to purge the database to test
            // the edits below)
            ArrayList<Video> queryVideoAddFetch = m_databaseManager.searchVideos(true, 0, "Charlie and the Chocolate Factory", null, null, null, "2013", null);
            for(Video video : queryVideoAddFetch)
            {
                originalVideo = new Video(video);
                
                System.out.println("        [" + video.m_id + "] " + video.m_title + " (" + video.m_year + ")");
            }
        }
        else
        {
            System.out.println("    Video successfully added:");
            
            // Verify with a quick test (we don't need to do this in the final submission)
            ArrayList<Video> queryVideoAddVerify = m_databaseManager.searchVideos(true, 0, "Charlie and the Chocolate Factory", null, null, null, "2013", null);
            for(Video video : queryVideoAddVerify)
            {
                originalVideo = new Video(video);
                
                System.out.println("        [" + video.m_id + "] " + video.m_title + " (" + video.m_year + ")");
            }
        }
        System.out.println("");
        
        //----------------------------------------------------------------------
        // TEST - ADD CUSTOMER WE KNOW DOESNT EXIST
        //----------------------------------------------------------------------
        System.out.println("TEST 5: Add a customer correctly");
        
        // Cache this customer, we'll need it in the edit test later
        Customer originalCustomer = null;
        
        DatabaseManager.DbResult resultCustomerAddOk = m_databaseManager.addCustomer("Georgia", "Nelson", "123 Lollipop Lane", "Magicland", "TX", "12345", "5123692345");
        if(resultCustomerAddOk != DatabaseManager.DbResult.DB_OK)
        {
            System.out.println("    Customer Add Error: Generic error message. Something bad happened. Compare against error types and give a specific message.");
            
            ArrayList<Customer> queryCustomerSearch = m_databaseManager.searchCustomers(true, 0, "Georgia", "Nelson", "5123692345");
            for(Customer customer : queryCustomerSearch)
            {
                originalCustomer = new Customer(customer);
                System.out.println("        [" + customer.m_id + "] " + customer.m_firstName + " " + customer.m_lastName + " (" + customer.m_phoneNumber + ")");
            }
        }
        else
        {
            System.out.println("    Customer successfully added:");
            
            // Verify with a quick test (we don't need to do this in the final submission)            
            ArrayList<Customer> queryCustomerAddVerify = m_databaseManager.searchCustomers(true, 0, "Georgia", null, null);
            for(Customer customer : queryCustomerAddVerify)
            {
                originalCustomer = new Customer(customer);
                System.out.println("        [" + customer.m_id + "] " + customer.m_firstName + " " + customer.m_lastName + " (" + customer.m_phoneNumber + ")");
            }
        } 
        System.out.println("");
                
        //----------------------------------------------------------------------
        // TEST - ADD CUSTOMER WITH SAME NAME AND PHONE NUMBER
        //----------------------------------------------------------------------
        System.out.println("TEST 6: Test if a customer error is given when trying to add existing one");
        DatabaseManager.DbResult resultCustomerAddErr = m_databaseManager.addCustomer("Georgia", "Nelson", "123 Lollipop Lane", "Magicland", "TX", "12345", "5123692345");
        if(resultVideoAddErr == DatabaseManager.DbResult.DB_ERR_RECORD_EXISTS)
        {
            System.out.println("    Customer Add Error: Already exists!");
        }
        System.out.println("");
        
        //----------------------------------------------------------------------
        // TEST - EDIT VIDEO
        //----------------------------------------------------------------------
        System.out.println("TEST 7: Edit Video");
        originalVideo.m_title = "Chocolat";
        
        DatabaseManager.DbResult resultVideoEdit = m_databaseManager.updateVideo(originalVideo);
        if(resultVideoEdit != DatabaseManager.DbResult.DB_OK)
        {
            System.out.println("    Video Edit Error: This video already exists! Change some of the data!");
        }
        else
        {
            System.out.println("    Video successfully updated:");
            
            // Verify with a quick test (we don't need to do this in the final submission)
            ArrayList<Video> queryVideoEditVerify = m_databaseManager.searchVideos(true, 0, "Chocolat", null, null, null, null, null);
            for(Video video : queryVideoEditVerify)
            {
                System.out.println("        [" + video.m_id + "] " + video.m_title + " (" + video.m_year + ")");
            }
        }
        System.out.println("");
        
        //----------------------------------------------------------------------
        // TEST - EDIT CUSTOMER
        //----------------------------------------------------------------------
        System.out.println("TEST 8: Edit Customer");
        originalCustomer.m_lastName = "Divorced";
        
        DatabaseManager.DbResult resultCustomerEdit = m_databaseManager.updateCustomer(originalCustomer);
        if(resultCustomerEdit != DatabaseManager.DbResult.DB_OK)
        {
            System.out.println("    Customer Edit Error: This customer already exists! Change some of the data!");
        }
        else
        {
            System.out.println("    Customer successfully updated:");
            
            // Verify with a quick test (we don't need to do this in the final submission)
            ArrayList<Customer> queryCustomerEditVerify = m_databaseManager.searchCustomers(true, 0, "Georgia", "Divorced", null);
            for(Customer customer : queryCustomerEditVerify)
            {
                System.out.println("        [" + customer.m_id + "] " + customer.m_firstName + " " + customer.m_lastName + " (" + customer.m_phoneNumber + ")");
            }
        }
        System.out.println("");
        
        //----------------------------------------------------------------------
        // TEST - DELETE VIDEO
        //----------------------------------------------------------------------
        System.out.println("TEST 9: Delete Video");
        
        DatabaseManager.DbResult resultVideoRemove = m_databaseManager.removeVideo(originalVideo.m_id);
        if(resultVideoRemove != DatabaseManager.DbResult.DB_OK)
        {
            System.out.println("    Video Edit Error: This video doesn't exist or has rentals out.");
        }
        else
        {
            System.out.println("    Video successfully removed.");
        }
        System.out.println("");
        
        //----------------------------------------------------------------------
        // TEST - DELETE CUSTOMER
        //----------------------------------------------------------------------
        System.out.println("TEST 10: Delete Customer");
        
        DatabaseManager.DbResult resultCustomerRemove = m_databaseManager.removeCustomer(originalCustomer.m_id);
        if(resultCustomerRemove != DatabaseManager.DbResult.DB_OK)
        {
            System.out.println("    Customer Edit Error: This customer doesn't exist or has rentals out/latefees.");
        }
        else
        {
            System.out.println("    Customer successfully removed.");
        }
        System.out.println("");
    }
    
     ///////////////////////////////////////////////////////////////////
    // End Tests function built by Georgia
    //
    //
    //
    //
    ///////////////////////////////////////////////////////////////////
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addCustomerAddressLabel;
    private javax.swing.JButton addCustomerButton;
    private javax.swing.JLabel addCustomerCityLabel;
    private javax.swing.JTextField addCustomerCityText;
    private javax.swing.JLabel addCustomerFirstNameLabel;
    private javax.swing.JTextField addCustomerFirstNameText;
    private javax.swing.JLabel addCustomerLastNameLabel;
    private javax.swing.JTextField addCustomerLastNameText;
    private javax.swing.JLabel addCustomerNameLabel;
    private javax.swing.JLabel addCustomerPhoneLabel;
    private javax.swing.JTextField addCustomerPhoneNumberText;
    private javax.swing.JLabel addCustomerStateLabel;
    private javax.swing.JTextField addCustomerStateText;
    private javax.swing.JLabel addCustomerStreet;
    private javax.swing.JTextField addCustomerStreetAddressText;
    private javax.swing.JLabel addCustomerZipLabel;
    private javax.swing.JTextField addCustomerZipText;
    private javax.swing.JButton addMovieButton;
    private javax.swing.JLabel addMovieDirectorLabel;
    private javax.swing.JTextField addMovieDirectorrText;
    private javax.swing.JLabel addMovieLengthLabel;
    private javax.swing.JTextField addMovieLengthText;
    private javax.swing.JLabel addMovieRatingLabel;
    private javax.swing.JTextField addMovieRatingText;
    private javax.swing.JLabel addMovieTitleLabel;
    private javax.swing.JTextField addMovieTitleText;
    private javax.swing.JLabel addMovieTotalNumberOfMoviesLabel;
    private javax.swing.JTextField addMovieTotalNumberOfMoviesText;
    private javax.swing.JLabel addMovieTypeLabel;
    private javax.swing.JTextField addMovieTypeText;
    private javax.swing.JLabel addMovieYearLabel;
    private javax.swing.JTextField addMovieYearText;
    private javax.swing.JPanel customerAdd;
    private javax.swing.JPanel customerDelete;
    private javax.swing.JPanel customerQuery;
    private javax.swing.JTabbedPane customerSubTabs;
    private javax.swing.JTabbedPane inventorySubTabs;
    private javax.swing.JList jList3;
    private javax.swing.JScrollBar jScrollBar2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel mainCustomerTab;
    private javax.swing.JPanel mainInventoryTab;
    private javax.swing.JTabbedPane mainTabPanel;
    private javax.swing.JPanel mainTransactionsTab;
    private javax.swing.JPanel movieAdd;
    private javax.swing.JPanel movieQuery;
    private javax.swing.JPanel movieRemove;
    private javax.swing.JButton queryCustomerEditButton;
    private javax.swing.JLabel queryCustomerFirstNameLabel;
    private javax.swing.JTextField queryCustomerFirstNameText;
    private javax.swing.JLabel queryCustomerLastNameLabel;
    private javax.swing.JTextField queryCustomerLastNameText;
    private javax.swing.JList queryCustomerList;
    private javax.swing.JScrollPane queryCustomerListPane;
    private javax.swing.JLabel queryCustomerNameAddLabel;
    private javax.swing.JLabel queryCustomerPhoneLabel;
    private javax.swing.JTextField queryCustomerPhoneNumberText;
    private javax.swing.JButton queryCustomerSearchButton;
    private javax.swing.JLabel queryMovieDirectorLabel;
    private javax.swing.JTextField queryMovieDirectorText;
    private javax.swing.JLabel queryMovieGenreLabel;
    private javax.swing.JTextField queryMovieGenreText;
    private javax.swing.JLabel queryMovieIDLabel;
    private javax.swing.JTextField queryMovieIDText;
    private javax.swing.JLabel queryMovieLengthLabel;
    private javax.swing.JTextField queryMovieLengthText;
    private javax.swing.JLabel queryMovieNumber;
    private javax.swing.JTextField queryMovieNumberText;
    private javax.swing.JLabel queryMovieRatingLabel;
    private javax.swing.JTextField queryMovieRatingText;
    private javax.swing.JButton queryMovieSaveChangesButton;
    private javax.swing.JButton queryMovieSearchButton;
    private javax.swing.JScrollPane queryMovieTable;
    private javax.swing.JTable queryMovieTableList;
    private javax.swing.JLabel queryMovieTitleLabel;
    private javax.swing.JTextField queryMovieTitleText;
    private javax.swing.JLabel queryMovieYearLabel;
    private javax.swing.JTextField queryMovieYearText;
    private javax.swing.JButton removeCustomerDeleteButton;
    private javax.swing.JComboBox removeCustomerDropDownList;
    private javax.swing.JButton removeMovieButton;
    private javax.swing.JComboBox removeMovieComboBox;
    private javax.swing.JButton transactionsCheckInButton;
    private javax.swing.JButton transactionsCheckInLateFeeButton;
    private javax.swing.JPanel transactionsCheckInTab;
    private javax.swing.JButton transactionsCheckOutButton;
    private javax.swing.JLabel transactionsCheckOutCustomerIDLabel;
    private javax.swing.JTextField transactionsCheckOutCustomerIDText;
    private javax.swing.JList transactionsCheckOutCustomerList;
    private javax.swing.JScrollPane transactionsCheckOutCustomerListPane;
    private javax.swing.JButton transactionsCheckOutLateFeeButton;
    private javax.swing.JScrollBar transactionsCheckOutScrollBar;
    private javax.swing.JButton transactionsCheckOutSearchButton;
    private javax.swing.JPanel transactionsCheckOutTab;
    private javax.swing.JTabbedPane transactionsSubTab;
    // End of variables declaration//GEN-END:variables
}
