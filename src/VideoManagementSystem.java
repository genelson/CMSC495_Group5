/*
REVISION TABLE:

--------------------------------------------------------------------------------
DATE                NAME                    CHANGE DESCRIPTION
--------------------------------------------------------------------------------
2/16/15             Larry Barker            File created.
2/17/15             Larry Barker            GUI Created
2/18/15             Larry Barker            Added User Add/Remove
2/19/15             Larry Barker            Added Inventory Add/Remove
2/21/15             Larry Barker            Added Customer Search function
2/22/15             Larry Barker            Added Video Search by Title function
2/25/15             Larry Barker            Improving Customer Search
2/23/15             Georgia Nelson          Adding initial support for check out
2/24/15             Georgia Nelson          Removing late fees references
*/

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
        updateRentalTransactionsTable();
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
        queryCustomerLastNameLabel = new javax.swing.JLabel();
        queryCustomerFirstNameText = new javax.swing.JTextField();
        queryCustomerSearchButton = new javax.swing.JButton();
        queryCustomerPhoneNumberText = new javax.swing.JTextField();
        queryCustomerEditButton = new javax.swing.JButton();
        queryCustomerTablePane = new javax.swing.JScrollPane();
        queryCustomerTableList = new javax.swing.JTable();
        queryCustomerPhoneLabel = new javax.swing.JLabel();
        queryCustomerStreetLabel = new javax.swing.JLabel();
        queryCustomerStreetAddressText = new javax.swing.JTextField();
        queryCustomerCityLabel = new javax.swing.JLabel();
        queryCustomerCityText = new javax.swing.JTextField();
        queryCustomerStateLabel = new javax.swing.JLabel();
        queryCustomerStateText = new javax.swing.JTextField();
        queryCustomerZipLabel = new javax.swing.JLabel();
        queryCustomerZipText = new javax.swing.JTextField();
        queryCustomerIDLabel = new javax.swing.JLabel();
        queryCustomerIDText = new javax.swing.JTextField();
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
        queryMovieTablePane = new javax.swing.JScrollPane();
        queryMovieTableList = new javax.swing.JTable();
        queryMovieNumberText = new javax.swing.JTextField();
        queryMovieNumber = new javax.swing.JLabel();
        mainTransactionsTab = new javax.swing.JPanel();
        transactionsSubTab = new javax.swing.JTabbedPane();
        transactionsCheckOutTab = new javax.swing.JPanel();
        transactionsCheckOutCustomerIDLabel = new javax.swing.JLabel();
        transactionsCheckOutCustomerIDText = new javax.swing.JTextField();
        transactionsCheckOutButton = new javax.swing.JButton();
        transactionsCheckOutScrollBar = new javax.swing.JScrollBar();
        transactionsCheckOutSearchButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        labelCheckOutNamePrompt = new javax.swing.JLabel();
        labelCheckOutName = new javax.swing.JLabel();
        labelVideosAvailabletoRent = new javax.swing.JLabel();
        queryCustomerTablePane1 = new javax.swing.JScrollPane();
        transactionsCheckOutCustomerList = new javax.swing.JTable();
        labelCheckOutIDPrompt = new javax.swing.JLabel();
        labelCheckOutID = new javax.swing.JLabel();
        transactionsCheckInTab = new javax.swing.JPanel();
        transactionsCheckInButton = new javax.swing.JButton();
        jScrollBar2 = new javax.swing.JScrollBar();
        queryCustomerTablePane2 = new javax.swing.JScrollPane();
        transactionsCheckInList = new javax.swing.JTable();

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

        addCustomerPhoneNumberText.setToolTipText("2231235412");

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
                                .addGroup(customerAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(customerAddLayout.createSequentialGroup()
                                        .addComponent(addCustomerCityLabel)
                                        .addGap(102, 102, 102)
                                        .addComponent(addCustomerStateLabel))
                                    .addGroup(customerAddLayout.createSequentialGroup()
                                        .addComponent(addCustomerCityText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addCustomerStateText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(84, 84, 84)
                                .addGroup(customerAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addCustomerZipLabel)
                                    .addComponent(addCustomerZipText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 207, Short.MAX_VALUE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
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
                .addContainerGap(451, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 388, Short.MAX_VALUE)
                .addComponent(removeCustomerDeleteButton)
                .addContainerGap())
        );

        customerSubTabs.addTab("Remove Customer", customerDelete);

        queryCustomerFirstNameLabel.setText("First");

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

        queryCustomerEditButton.setText("Save Changes");
        queryCustomerEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryCustomerEditButtonActionPerformed(evt);
            }
        });

        queryCustomerTableList.setAutoCreateRowSorter(true);
        queryCustomerTableList.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID", "Name"
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
        queryCustomerTableList.getTableHeader().setReorderingAllowed(false);
        queryCustomerTablePane.setViewportView(queryCustomerTableList);
        if (queryCustomerTableList.getColumnModel().getColumnCount() > 0) {
            queryCustomerTableList.getColumnModel().getColumn(0).setMinWidth(10);
            queryCustomerTableList.getColumnModel().getColumn(0).setPreferredWidth(30);
            queryCustomerTableList.getColumnModel().getColumn(0).setMaxWidth(40);
            queryCustomerTableList.getColumnModel().getColumn(1).setResizable(false);
        }

        queryCustomerPhoneLabel.setText("Phone");

        queryCustomerStreetLabel.setText("Street");

        queryCustomerStreetAddressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryCustomerStreetAddressTextActionPerformed(evt);
            }
        });

        queryCustomerCityLabel.setText("City");

        queryCustomerCityText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryCustomerCityTextActionPerformed(evt);
            }
        });

        queryCustomerStateLabel.setText("State");

        queryCustomerZipLabel.setText("Zip Code");

        queryCustomerIDLabel.setText("ID");

        queryCustomerIDText.setEditable(false);

        javax.swing.GroupLayout customerQueryLayout = new javax.swing.GroupLayout(customerQuery);
        customerQuery.setLayout(customerQueryLayout);
        customerQueryLayout.setHorizontalGroup(
            customerQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerQueryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customerQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customerQueryLayout.createSequentialGroup()
                        .addComponent(queryCustomerIDLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(queryCustomerIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(customerQueryLayout.createSequentialGroup()
                        .addGroup(customerQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(queryCustomerFirstNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(queryCustomerPhoneLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(queryCustomerLastNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(customerQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(queryCustomerFirstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(queryCustomerLastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(queryCustomerPhoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4)
                .addGroup(customerQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(queryCustomerStateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(queryCustomerCityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(queryCustomerStreetLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(customerQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customerQueryLayout.createSequentialGroup()
                        .addComponent(queryCustomerStateText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(customerQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(customerQueryLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(queryCustomerEditButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(queryCustomerSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(customerQueryLayout.createSequentialGroup()
                                .addComponent(queryCustomerZipLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(queryCustomerZipText, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(customerQueryLayout.createSequentialGroup()
                        .addComponent(queryCustomerCityText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(customerQueryLayout.createSequentialGroup()
                        .addComponent(queryCustomerStreetAddressText)
                        .addContainerGap())))
            .addGroup(customerQueryLayout.createSequentialGroup()
                .addComponent(queryCustomerTablePane, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        customerQueryLayout.setVerticalGroup(
            customerQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerQueryLayout.createSequentialGroup()
                .addComponent(queryCustomerTablePane, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(customerQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customerQueryLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(customerQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(queryCustomerEditButton)
                            .addComponent(queryCustomerSearchButton)))
                    .addGroup(customerQueryLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(customerQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(queryCustomerFirstNameLabel)
                            .addComponent(queryCustomerFirstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(queryCustomerStreetLabel)
                            .addComponent(queryCustomerStreetAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(customerQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(queryCustomerLastNameLabel)
                            .addComponent(queryCustomerLastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(queryCustomerCityLabel)
                            .addComponent(queryCustomerCityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(customerQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(queryCustomerStateLabel)
                            .addComponent(queryCustomerStateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(queryCustomerZipLabel)
                            .addComponent(queryCustomerZipText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(queryCustomerPhoneLabel)
                            .addComponent(queryCustomerPhoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(customerQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(queryCustomerIDLabel)
                            .addComponent(queryCustomerIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
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
                .addContainerGap(451, Short.MAX_VALUE)
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
                .addContainerGap(451, Short.MAX_VALUE)
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

        queryMovieTitleText.setText("Enter Movie Title/Select From List");
        queryMovieTitleText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                queryMovieTitleTextMouseClicked(evt);
            }
        });

        queryMovieGenreLabel.setText("Genre");

        queryMovieRatingLabel.setText("Rating");

        queryMovieLengthLabel.setText("Length");

        queryMovieYearLabel.setText("Year");

        queryMovieDirectorText.setText(" ");

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
        queryMovieTablePane.setViewportView(queryMovieTableList);
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
            .addGroup(movieQueryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(movieQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(movieQueryLayout.createSequentialGroup()
                        .addGroup(movieQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(movieQueryLayout.createSequentialGroup()
                                .addComponent(queryMovieLengthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(queryMovieLengthText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(movieQueryLayout.createSequentialGroup()
                                .addComponent(queryMovieNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(queryMovieNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4)
                        .addGroup(movieQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(movieQueryLayout.createSequentialGroup()
                                .addComponent(queryMovieYearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(queryMovieYearText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(queryMovieDirectorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(queryMovieDirectorText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 36, Short.MAX_VALUE))
                            .addGroup(movieQueryLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(queryMovieSaveChangesButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(queryMovieSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(movieQueryLayout.createSequentialGroup()
                        .addGroup(movieQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(movieQueryLayout.createSequentialGroup()
                                .addComponent(queryMovieTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(queryMovieTitleText, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(movieQueryLayout.createSequentialGroup()
                                .addComponent(queryMovieIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(queryMovieIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(queryMovieGenreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(queryMovieGenreText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(queryMovieRatingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(queryMovieRatingText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(queryMovieTablePane)
        );
        movieQueryLayout.setVerticalGroup(
            movieQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movieQueryLayout.createSequentialGroup()
                .addComponent(queryMovieTablePane, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addGap(18, 18, 18)
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, movieQueryLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(movieQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(queryMovieNumber)
                            .addComponent(queryMovieNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

        transactionsCheckOutButton.setText("Check Out");
        transactionsCheckOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionsCheckOutButtonActionPerformed(evt);
            }
        });

        transactionsCheckOutSearchButton.setText("Search");
        transactionsCheckOutSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionsCheckOutSearchButtonActionPerformed(evt);
            }
        });

        labelCheckOutNamePrompt.setText("Customer Name:");

        labelCheckOutName.setText("[Search Required]");

        labelVideosAvailabletoRent.setText("Videos Available to Rent:");

        transactionsCheckOutCustomerList.setAutoCreateRowSorter(true);
        transactionsCheckOutCustomerList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
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
        transactionsCheckOutCustomerList.getTableHeader().setReorderingAllowed(false);
        queryCustomerTablePane1.setViewportView(transactionsCheckOutCustomerList);
        if (transactionsCheckOutCustomerList.getColumnModel().getColumnCount() > 0) {
            transactionsCheckOutCustomerList.getColumnModel().getColumn(0).setMinWidth(10);
            transactionsCheckOutCustomerList.getColumnModel().getColumn(0).setPreferredWidth(30);
            transactionsCheckOutCustomerList.getColumnModel().getColumn(0).setMaxWidth(40);
            transactionsCheckOutCustomerList.getColumnModel().getColumn(1).setResizable(false);
        }

        labelCheckOutIDPrompt.setText("ID:");

        labelCheckOutID.setText("[Search Required]");

        javax.swing.GroupLayout transactionsCheckOutTabLayout = new javax.swing.GroupLayout(transactionsCheckOutTab);
        transactionsCheckOutTab.setLayout(transactionsCheckOutTabLayout);
        transactionsCheckOutTabLayout.setHorizontalGroup(
            transactionsCheckOutTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionsCheckOutTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(transactionsCheckOutTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transactionsCheckOutTabLayout.createSequentialGroup()
                        .addGroup(transactionsCheckOutTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(transactionsCheckOutTabLayout.createSequentialGroup()
                                .addGroup(transactionsCheckOutTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(transactionsCheckOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(transactionsCheckOutTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(transactionsCheckOutTabLayout.createSequentialGroup()
                                            .addComponent(labelCheckOutNamePrompt)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(labelCheckOutName, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(labelCheckOutIDPrompt)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(labelCheckOutID, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(labelVideosAvailabletoRent)
                                        .addComponent(queryCustomerTablePane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transactionsCheckOutScrollBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(transactionsCheckOutTabLayout.createSequentialGroup()
                        .addComponent(transactionsCheckOutCustomerIDLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transactionsCheckOutCustomerIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transactionsCheckOutSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addGroup(transactionsCheckOutTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(transactionsCheckOutTabLayout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addComponent(transactionsCheckOutScrollBar, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(transactionsCheckOutTabLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(transactionsCheckOutTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCheckOutNamePrompt)
                            .addComponent(labelCheckOutName)
                            .addComponent(labelCheckOutIDPrompt)
                            .addComponent(labelCheckOutID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelVideosAvailabletoRent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(queryCustomerTablePane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(transactionsCheckOutButton)
                        .addContainerGap())))
        );

        transactionsSubTab.addTab("Check Out", transactionsCheckOutTab);

        transactionsCheckInButton.setText("Check In");
        transactionsCheckInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionsCheckInButtonActionPerformed(evt);
            }
        });

        transactionsCheckInList.setAutoCreateRowSorter(true);
        transactionsCheckInList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "CustomerID", "Customer Name", "Movie Title", "Date Out"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        transactionsCheckInList.getTableHeader().setReorderingAllowed(false);
        queryCustomerTablePane2.setViewportView(transactionsCheckInList);
        if (transactionsCheckInList.getColumnModel().getColumnCount() > 0) {
            transactionsCheckInList.getColumnModel().getColumn(0).setMinWidth(10);
            transactionsCheckInList.getColumnModel().getColumn(0).setPreferredWidth(30);
            transactionsCheckInList.getColumnModel().getColumn(0).setMaxWidth(40);
            transactionsCheckInList.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout transactionsCheckInTabLayout = new javax.swing.GroupLayout(transactionsCheckInTab);
        transactionsCheckInTab.setLayout(transactionsCheckInTabLayout);
        transactionsCheckInTabLayout.setHorizontalGroup(
            transactionsCheckInTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionsCheckInTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(transactionsCheckInTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(transactionsCheckInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(queryCustomerTablePane2, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        transactionsCheckInTabLayout.setVerticalGroup(
            transactionsCheckInTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionsCheckInTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(transactionsCheckInTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(transactionsCheckInTabLayout.createSequentialGroup()
                        .addComponent(queryCustomerTablePane2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transactionsCheckInButton)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        transactionsSubTab.addTab("Check In", transactionsCheckInTab);

        javax.swing.GroupLayout mainTransactionsTabLayout = new javax.swing.GroupLayout(mainTransactionsTab);
        mainTransactionsTab.setLayout(mainTransactionsTabLayout);
        mainTransactionsTabLayout.setHorizontalGroup(
            mainTransactionsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(transactionsSubTab, javax.swing.GroupLayout.PREFERRED_SIZE, 556, Short.MAX_VALUE)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainTabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        
        else if ( ! addCustomerPhoneNumberText.getText().matches("^[0-9]{10}")) {
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
        // TODO Errors on selected a empty row
        int selectedRowIndex = queryCustomerTableList.getSelectedRow();
        if(selectedRowIndex < 0)
        {
            errorBox("No selection was made! Cannot edit.", "Video Search Error");
            return;
        }
        //int selectedColumnIndex = queryMovieTableList.getSelectedColumn();
        
        String selectedString = (String) queryCustomerTableList.getModel().getValueAt(selectedRowIndex,0);
        //System.out.println(selectedString);
        ArrayList<Customer> queryTheCustomer = m_databaseManager.searchCustomers(true, Integer.parseInt(selectedString), null, null, null);
        queryCustomerTableList.getSelectionModel().clearSelection();
        for(Customer customer : queryTheCustomer)
        {
            queryCustomerZipText.setText(customer.m_zipCode);
            queryCustomerStateText.setText(customer.m_state);
            queryCustomerCityText.setText(customer.m_city);
            queryCustomerStreetAddressText.setText(customer.m_streetAddress);
            queryCustomerPhoneNumberText.setText(customer.m_phoneNumber);
            queryCustomerFirstNameText.setText(customer.m_firstName);
            queryCustomerLastNameText.setText(customer.m_lastName);
            queryCustomerIDText.setText(String.valueOf(customer.m_id));
            
        }
        
    }//GEN-LAST:event_queryCustomerSearchButtonActionPerformed

    private void queryCustomerEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryCustomerEditButtonActionPerformed
        //TODO
        if ( queryCustomerIDText.getText().length() == 0){
            errorBox("No selection was made! Cannot edit.", "Video Search Error");
            return;
        }
            String Lastname = queryCustomerLastNameText.getText();
            String Firstname = queryCustomerFirstNameText.getText();
            String Phone = queryCustomerPhoneNumberText.getText();
            String Street = queryCustomerStreetAddressText.getText();
            String City = queryCustomerCityText.getText();
            String State = queryCustomerStateText.getText();
            String Zip = queryCustomerZipText.getText();
            String ID = queryCustomerIDText.getText(); 
            int customerID =Integer.parseInt(ID);
            //System.out.println(customerID);
        // Customer ID to make changes
      
        
        if (queryCustomerLastNameText.getText().length()==0 || queryCustomerLastNameText.getText().matches("^[ ]+") ) {
            errorBox("Please Enter Last Name", "Edit Customer Error");
        }
        
        else if (queryCustomerFirstNameText.getText().length()==0 || queryCustomerFirstNameText.getText().matches("^[ ]+")) {
            errorBox("Please Enter First Name", "Edit Customer Error");
        }
        
        else if ( ! queryCustomerPhoneNumberText.getText().matches("^[0-9]{10}")) {
            errorBox("Please Enter Phone Number, Remove Hypens, or verify number is 10 digits", "Edit Customer Error");
        }
        
        else if (queryCustomerStreetAddressText.getText().length()==0 || queryCustomerStreetAddressText.getText().matches("^[ ]+")) {
            errorBox("Please Enter Street", "Edit Customer Error");
        }
        
        else if (queryCustomerCityText.getText().length()==0 || queryCustomerCityText.getText().matches("^[ ]+")) {
            errorBox("Please Enter City", "Edit Customer Error");
        }
        
        else if (queryCustomerStateText.getText().length()==0 || queryCustomerStateText.getText().length()>2) {
            errorBox("Please Enter State, or make sure your using 2 letter abbreviation", "Edit Customer Error");
        }
        
        else if ( ! queryCustomerZipText.getText().matches("^[0-9]{5}")) {
            errorBox("Please Enter Zip Code, or verify zipcode is 5 digits", "Edit Customer Error");
        }
        else {
            // Lets edit the movie....RAWR
            editCustomer(customerID,
                Lastname,
                Firstname,
                Street,
                City,
                State,
                Zip,
                Phone);
            
            //Should be good yes? Rebuild the Lists!! Clean the shiz!!!
            queryCustomerZipText.setText("");
            queryCustomerStateText.setText("");
            queryCustomerCityText.setText("");
            queryCustomerStreetAddressText.setText("");
            queryCustomerPhoneNumberText.setText("");
            queryCustomerFirstNameText.setText("");
            queryCustomerLastNameText.setText("");
            queryCustomerIDText.setText("");
            updateDropDowns();
        }                
    }//GEN-LAST:event_queryCustomerEditButtonActionPerformed

    private void queryMovieSaveChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryMovieSaveChangesButtonActionPerformed
        // TODO                
        if ( queryMovieNumberText.getText().length() == 0){
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
        int newCount = Integer.parseInt(Count);
        
        
        if (queryMovieDirectorText.getText().length() == 0 || queryMovieDirectorText.getText().matches("^[ ]+")){
            errorBox("Please Enter Movie Director", "Video Add Error");
        }          
        else if (queryMovieLengthText.getText().length() == 0 || queryMovieLengthText.getText().matches("^[ ]+")){
            errorBox("Please Enter Movie Length", "Video Add Error");
        }        
        else if (queryMovieRatingText.getText().length() == 0 || queryMovieRatingText.getText().matches("^[ ]+")){            
        }
        else if (queryMovieTitleText.getText().length() == 0 || queryMovieTitleText.getText().matches("^[ ]+")){
            errorBox("Please Enter Movie Title", "Video Add Error");
        }        
        else if ( ! queryMovieYearText.getText().matches("^[12][0-9]{3}")){
            errorBox("Please Enter the Movies Year, or invalid format (Range of 1000-2999)", "Video Add Error");
        }
        else if (queryMovieGenreText.getText().length() == 0 || queryMovieGenreText.getText().matches("^[ ]+")){
            errorBox("Please Enter Movie Genre", "Video Add Error");
        }
        else if ( ! queryMovieIDText.getText().matches("^[1-9][0-9]?")){
            errorBox("Please Enter amount of Movies. Must be a number not exceeding 99", "Video Add Error");
        }
        else {
            // Lets edit the movie....RAWR
            editVideo(ID,
                    Director,
                    Length,
                    Rating,
                    Title,
                    newCount,
                    Genre,
                    Year);
            
            //Should be good yes? Rebuild the Lists!! Clean the shiz!!!
            queryMovieTableList.getSelectionModel().clearSelection();
            queryMovieDirectorText.setText("");
            queryMovieLengthText.setText("");
            queryMovieRatingText.setText("");
            queryMovieTitleText.setText("");
            queryMovieYearText.setText("");
            queryMovieIDText.setText("");
            queryMovieGenreText.setText("");
            queryMovieNumberText.setText("");
            updateMovieDropDowns();
        }                
    }//GEN-LAST:event_queryMovieSaveChangesButtonActionPerformed

    private void transactionsCheckOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionsCheckOutButtonActionPerformed
                                                 
        // ASSUMPTIONS: 
        //      1. The check out button isn't active unless the searched customer
        //         has a clean account with available space for rental (e.g. not more than 3).
        //      2. A customer has been searched for, but we still check for
        //         validity, because users suck.
        
        // Fetch the customer details from the label and make sure they're
        // still valid.
        String customerIdValue = labelCheckOutID.getText();        
        if(customerIdValue == null || customerIdValue.compareTo("[Search Required]") == 0)
        {
            errorBox("No valid customer is active in this search. Please enter a correct customer ID.", "Check Out Error");
            return;
        }
        
        // Get the selected video ID from the list
        int selectedRowIndex = transactionsCheckOutCustomerList.getSelectedRow();
        if(selectedRowIndex < 0)
        {
            errorBox("No selection was made! Cannot check out.", "Check Out Error");
            return;
        }
        
        String selectedVideoId = (String) transactionsCheckOutCustomerList.getModel().getValueAt(selectedRowIndex, 0);
        
        // Perform the check out function
        DatabaseManager.DbResult result = m_databaseManager.rentVideo(Integer.parseInt(selectedVideoId), Integer.parseInt(customerIdValue));
        if(result != DatabaseManager.DbResult.DB_OK)
        {
            errorBox("There was an error trying to check out the video to this customer.", "Check Out Error");
            return;
        }
        
        // Update the table based on the previous search data
        updateCheckOutScreen();
        
        // Notify of success
        infoBox("The video was successfully rented!", "Check Out");
    }//GEN-LAST:event_transactionsCheckOutButtonActionPerformed

    private void queryMovieSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryMovieSearchButtonActionPerformed
        // TODO Errors on selected a empty row
        int selectedRowIndex = queryMovieTableList.getSelectedRow();
        if(selectedRowIndex < 0)
        {

            int TitleN = queryMovieTitleText.getText().length();
            String Title = queryMovieTitleText.getText();
            String testText = "Enter Movie Title/Select From List";

            if ( TitleN > 0 && ! queryMovieTitleText.getText().contains(testText)) {
                //setMovieQuery(Title);
                
                int lastRow = queryMovieTableList.convertRowIndexToView(queryMovieTableList.getRowCount() -1);
                
                for (int i=0; i <= lastRow; i++){
                    
                    String theValue = (String)queryMovieTableList.getModel().getValueAt(i, 1);
                    //System.out.println(theValue);
                    if ( theValue.toLowerCase().contains(Title.toLowerCase())){
                        //System.out.println(theValue);
                        //queryMovieTableList.setRowSelectionInterval(i, i);
                        setMovieQuery(0, theValue);
                        queryMovieTableList.clearSelection();
                        return;
                        
                    }
                    else {
                        //infoBox("No matches, please try again","Video Search Information");
                        queryMovieTableList.clearSelection();
                        //return;
                    }
                }
            }
            
            else {
                errorBox("No selection was made! Cannot edit. Please selecte from the list"
                        + " or type in a title and search again", "Video Search Error");
            }

        }
        
        else {
            String selectedString = (String) queryMovieTableList.getModel().getValueAt(selectedRowIndex,0);
            setMovieQuery(Integer.parseInt(selectedString), null);
            queryMovieTableList.clearSelection();
            
         
        }
    }//GEN-LAST:event_queryMovieSearchButtonActionPerformed

    public void setMovieQuery(int ID, String title)
    {
       
        ArrayList<Video> queryTheVideo = m_databaseManager.searchVideos(true, ID , title, null, null, null, null, null);
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
    }
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

    private void queryCustomerStreetAddressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryCustomerStreetAddressTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_queryCustomerStreetAddressTextActionPerformed

    private void queryCustomerCityTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryCustomerCityTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_queryCustomerCityTextActionPerformed

    private void transactionsCheckOutSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionsCheckOutSearchButtonActionPerformed
       
        // Update the available rentals list
        updateCheckOutScreen();
            
        // Notify search and populate success
        infoBox("Customer successfully located. Select an available video in the list and then press Check Out.", "Check Out");
    }//GEN-LAST:event_transactionsCheckOutSearchButtonActionPerformed

    private void transactionsCheckInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionsCheckInButtonActionPerformed
        int selectedRowIndex = transactionsCheckInList.getSelectedRow();
        if(selectedRowIndex < 0)
        {
            errorBox("No selection was made! Cannot check in.", "Check In Error");
            return;
        }
        
        String selectedRentalId = (String) transactionsCheckInList.getModel().getValueAt(selectedRowIndex, 0);
        DatabaseManager.DbResult result = m_databaseManager.returnVideo(Integer.parseInt(selectedRentalId));
        if(result != DatabaseManager.DbResult.DB_OK)
        {
            errorBox("Unable to return selected video.", "Check In Error");
            return;
        }
        
        // Notify of success
        infoBox("Successful return of the video has been completed.", "Check In");
    }//GEN-LAST:event_transactionsCheckInButtonActionPerformed

    private void queryMovieTitleTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_queryMovieTitleTextMouseClicked
        // TODO 
        String testText = "Enter Movie Title/Select From List";
        if ( queryMovieTitleText.getText().contains(testText)){
            queryMovieTitleText.setText("");
        }
        
    }//GEN-LAST:event_queryMovieTitleTextMouseClicked
    
    public void updateDropDowns() {
        removeCustomerDropDownList.removeAllItems();
        clearCustomerTable();
        ArrayList<Customer> queryCustomerTest = m_databaseManager.searchCustomers(false, 0, null, null, null);
        for(Customer customer : queryCustomerTest) {
            //System.out.println("        Customer: [" + customer.m_id + "] " + customer.m_firstName + " " + customer.m_lastName + " (" + customer.m_phoneNumber + ")");
            removeCustomerDropDownList.addItem(customer.m_firstName + " " + customer.m_lastName + ":" + customer.m_id);
            
            String customerId = String.valueOf(customer.m_id);
            String customerName = customer.m_firstName + " " + customer.m_lastName;
            DefaultTableModel model = (DefaultTableModel) queryCustomerTableList.getModel();
            model.addRow(new Object[]{customerId, customerName});
        }
    }
    
    public void updateMovieDropDowns() {
        removeMovieComboBox.removeAllItems();
        clearTable();
        ArrayList<Video> queryVideoTest = m_databaseManager.searchVideos(false, 0, null, null, null, null, null, null);
        for(Video video : queryVideoTest)
        {
            //System.out.println("        Video: [" + video.m_id + "] " + video.m_title + " (" + video.m_year + ")");
            removeMovieComboBox.addItem(video.m_title + ":" + video.m_id);
            
            String videoId = String.valueOf(video.m_id);
            String videoTitle = video.m_title;
            DefaultTableModel model = (DefaultTableModel) queryMovieTableList.getModel();
            model.addRow(new Object[]{videoId, videoTitle});
        } 
    }    
    
    public void updateCheckOutScreen() {
        // Clear previous results and reset buttons
        clearCheckOutTable();
        transactionsCheckOutButton.setEnabled(false);
        
        // Get the ID for the search
        String customerIDText = transactionsCheckOutCustomerIDText.getText();
        if(customerIDText == null || customerIDText.length() < 1 || customerIDText.compareTo("0") == 0)
        {
            errorBox("No suitable ID was provided for this customer. Please try again.", "Check Out Error");
            labelCheckOutName.setText("[Search Required]");
            labelCheckOutID.setText("[Search Required]");
            return;
        }
        
        // Perform the query
        ArrayList<Customer> queryTheCustomer = m_databaseManager.searchCustomers(true, Integer.parseInt(customerIDText), null, null, null);
        
        if(queryTheCustomer.size() == 0)
        {
            errorBox("No customers were found with that ID. Please try again.", "Check Out Error");
            transactionsCheckOutCustomerIDText.setText("");
            labelCheckOutName.setText("[Search Required]");
            labelCheckOutID.setText("[Search Required]");
            return;
        }
        
        // It is a fair assumption that only 1 will be returned since we're 
        // querying by ID.
        for(Customer customer : queryTheCustomer)
        {
            // Make sure this customer doesn't have maximum rentals allowed.
            ArrayList<Rental> customerRentals = m_databaseManager.getRentalTransactions(0, customer.m_id);
            if(customerRentals.size() >= MAX_ALLOWED_RENTALS)
            {
                errorBox("This customer already has 3 or more rentals checked out at this time and cannot rent any more.", "Check Out Error");
                transactionsCheckOutCustomerIDText.setText("");
                labelCheckOutName.setText("[Search Required]");
                labelCheckOutID.setText("[Search Required]");
                return;
            }
            
            // Everything is good, so go ahead and update the screen with
            // this customer's name and populate the list with available 
            // inventory.
            labelCheckOutName.setText(customer.m_firstName + " " + customer.m_lastName);
            labelCheckOutID.setText(String.valueOf(customer.m_id));
        }
        
        // Now search for videos that still have inventory available. We do
        // this by searching for the movies first, then another search in
        // the rental transactions for the checked out count to see if we have
        // any available at the moment. Only fill the list with those that have
        // available inventory.
        ArrayList<Video> availableVideos = m_databaseManager.searchVideos(false, 0, null, null, null, null, null, null);
        
        // Make sure we have videos to rent
        if(availableVideos.isEmpty())
        {
            errorBox("No videos are available to rent at this time.", "Check Out Error");
            return;
        }
        
        // Populate the list with the results
        transactionsCheckOutButton.setEnabled(true);
        for(Video video : availableVideos)
        {
            int totalInventoryCount = video.m_totalNumberOfMovies;
            
            ArrayList<Rental> rentedVideos = m_databaseManager.getRentalTransactions(video.m_id, 0);
            int rentedCount = rentedVideos.size();
            int availableCount = totalInventoryCount - rentedCount;
            
            if(availableCount > 0)
            {            
                String videoId = String.valueOf(video.m_id);
                String videoTitle = video.m_title;
                DefaultTableModel model = (DefaultTableModel) transactionsCheckOutCustomerList.getModel();
                model.addRow(new Object[]{videoId, videoTitle});
            }
        }
    }
    
    public void updateRentalTransactionsTable() {
        clearRentalTransactionsTable();    
        transactionsCheckInButton.setEnabled(false);
        
        DefaultTableModel model = (DefaultTableModel) transactionsCheckInList.getModel();
        
        // Fetch all rental transactions and put them into the table
        ArrayList<Rental> rentals = m_databaseManager.getRentalTransactions(0, 0);
        for(Rental rental : rentals)
        {
            String rentalId = String.valueOf(rental.m_id);
            String customerId = String.valueOf(rental.m_customerId);
            String videoId = String.valueOf(rental.m_movieId);
            String dateOut = rental.m_dateOut.toString();
            String customerName = "";
            String videoName = "";
            
            // Get the customer name and movie name
            ArrayList<Customer> customerData = m_databaseManager.searchCustomers(true, rental.m_customerId, null, null, null);
            for(Customer customer : customerData)
            {
                customerName = customer.m_firstName + " " + customer.m_lastName;
            }
            
            ArrayList<Video> videoData = m_databaseManager.searchVideos(true, rental.m_movieId, null, null, null, null, null, null);
            for(Video video : videoData)
            {
                videoName = video.m_title;
            }
            
            model.addRow(new Object[]{rentalId, String.valueOf(customerId), customerName, videoName, dateOut});
        }
        
        if(!rentals.isEmpty())
        {
            transactionsCheckInButton.setEnabled(true);
        }
    }
   
    public void clearTable(){
        DefaultTableModel model = (DefaultTableModel) queryMovieTableList.getModel();
        model.setRowCount(0);
        queryMovieTableList.revalidate();
    }
    
    public void clearCustomerTable(){
        DefaultTableModel model = (DefaultTableModel) queryCustomerTableList.getModel();
        model.setRowCount(0);
        queryCustomerTableList.revalidate();
    }
    
    public void clearCheckOutTable(){
        DefaultTableModel model = (DefaultTableModel) transactionsCheckOutCustomerList.getModel();
        model.setRowCount(0);
        transactionsCheckOutCustomerList.revalidate();
    }
    
    public void clearRentalTransactionsTable() {
        DefaultTableModel model = (DefaultTableModel) transactionsCheckInList.getModel();
        model.setRowCount(0);
        transactionsCheckInList.revalidate();
    }
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
        // Create a new DatabaseManager to give us access to the
        // MySQL Back-End subsystem
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
            //System.out.println("    Customer Edit Error: This customer doesn't exist or has rentals out.");
            errorBox("Look into VideoManagementSystem.removeCustomers()", "Some type of remove user failsauce");
        }
        else
        {
            //System.out.println("    Customer successfully removed.");
            infoBox( "'" + customerName + "' deleted sucessfully!", "Sucessfull");
        }
    }
    
       public static void editCustomer(int customerID,
            String Last,
            String First,
            String Street,
            String City,
            String State,
            String Zip,
            String Phone)
    {
        //  
        Customer originalCustomer = null;
        ArrayList<Customer> videoEdit = m_databaseManager.searchCustomers(true, customerID, null, null, null);
      
        for(Customer customer : videoEdit)
            {
                originalCustomer = new Customer(customer);
                //System.out.println(originalCustomer.m_streetAddress);

                
            }
        
        originalCustomer.m_lastName = Last;
        originalCustomer.m_firstName = First;
        originalCustomer.m_streetAddress = Street;
        originalCustomer.m_city = City;
        originalCustomer.m_state = State;
        originalCustomer.m_zipCode = Zip;
        originalCustomer.m_phoneNumber = Phone;
        
        DatabaseManager.DbResult resultCustomerEdit = m_databaseManager.updateCustomer(originalCustomer);
        if(resultCustomerEdit != DatabaseManager.DbResult.DB_OK)
        {
            //System.out.println("    Video Edit Error: This video already exists! Change some of the data!");
            errorBox("There was an issue editing the customer look at editCustomer()","Customer Edit Error");
        }
        else
        {
            infoBox("The Customer" + "'" + First + " " + Last + "' was edited successfully!", "Customer Edit Information");
        
        }
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
    
    public static void editVideo(int movieID,
            String theDirector,
            String theLength,
            String theRating,
            String theTitle,
            int theCount,
            String theType,
            String theYear)
    {
        //  
        Video originalVideo = null;
        System.out.println(movieID);
        ArrayList<Video> videoEdit = m_databaseManager.searchVideos(true, movieID, null, null, null, null, null, null);
        
        for(Video video : videoEdit)
            {
                originalVideo = new Video(video);
                System.out.println("        [" + video.m_id + "] " + video.m_title + " (" + video.m_year + ")");
                //System.out.println("        [" + video.m_id + "] " + video.m_title + " (" + video.m_year + ")");
            }
        
        originalVideo.m_director = theDirector;
        originalVideo.m_length = theLength;
        originalVideo.m_rating = theRating;
        originalVideo.m_title = theTitle;
        originalVideo.m_totalNumberOfMovies = theCount;
        originalVideo.m_type = theType;
        originalVideo.m_year = theYear;
        
        DatabaseManager.DbResult resultVideoEdit = m_databaseManager.updateVideo(originalVideo);
        
        if(resultVideoEdit != DatabaseManager.DbResult.DB_OK)
        {
            //System.out.println("    Video Edit Error: This video already exists! Change some of the data!");
            errorBox("There was an issue editing the video look at editVideo()","Video Edit Error");
        }
        else
        {
            infoBox("The Movie" + "'" + theTitle + "' was edited successfully!", "Video Edit Information");
        
        }
    }
    
    ///////////////////////////////////////////////////////////////////
    // END GUI FUNCTIONS
    //
    //
    //
    //
    ///////////////////////////////////////////////////////////////////
    
    // Private variable for maximum # of videos allowed out at any time by
    // a single customer
    private final int MAX_ALLOWED_RENTALS = 3;
    
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
    private javax.swing.JScrollBar jScrollBar2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelCheckOutID;
    private javax.swing.JLabel labelCheckOutIDPrompt;
    private javax.swing.JLabel labelCheckOutName;
    private javax.swing.JLabel labelCheckOutNamePrompt;
    private javax.swing.JLabel labelVideosAvailabletoRent;
    private javax.swing.JPanel mainCustomerTab;
    private javax.swing.JPanel mainInventoryTab;
    private javax.swing.JTabbedPane mainTabPanel;
    private javax.swing.JPanel mainTransactionsTab;
    private javax.swing.JPanel movieAdd;
    private javax.swing.JPanel movieQuery;
    private javax.swing.JPanel movieRemove;
    private javax.swing.JLabel queryCustomerCityLabel;
    private javax.swing.JTextField queryCustomerCityText;
    private javax.swing.JButton queryCustomerEditButton;
    private javax.swing.JLabel queryCustomerFirstNameLabel;
    private javax.swing.JTextField queryCustomerFirstNameText;
    private javax.swing.JLabel queryCustomerIDLabel;
    private javax.swing.JTextField queryCustomerIDText;
    private javax.swing.JLabel queryCustomerLastNameLabel;
    private javax.swing.JTextField queryCustomerLastNameText;
    private javax.swing.JLabel queryCustomerPhoneLabel;
    private javax.swing.JTextField queryCustomerPhoneNumberText;
    private javax.swing.JButton queryCustomerSearchButton;
    private javax.swing.JLabel queryCustomerStateLabel;
    private javax.swing.JTextField queryCustomerStateText;
    private javax.swing.JTextField queryCustomerStreetAddressText;
    private javax.swing.JLabel queryCustomerStreetLabel;
    private javax.swing.JTable queryCustomerTableList;
    private javax.swing.JScrollPane queryCustomerTablePane;
    private javax.swing.JScrollPane queryCustomerTablePane1;
    private javax.swing.JScrollPane queryCustomerTablePane2;
    private javax.swing.JLabel queryCustomerZipLabel;
    private javax.swing.JTextField queryCustomerZipText;
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
    private javax.swing.JTable queryMovieTableList;
    private javax.swing.JScrollPane queryMovieTablePane;
    private javax.swing.JLabel queryMovieTitleLabel;
    private javax.swing.JTextField queryMovieTitleText;
    private javax.swing.JLabel queryMovieYearLabel;
    private javax.swing.JTextField queryMovieYearText;
    private javax.swing.JButton removeCustomerDeleteButton;
    private javax.swing.JComboBox removeCustomerDropDownList;
    private javax.swing.JButton removeMovieButton;
    private javax.swing.JComboBox removeMovieComboBox;
    private javax.swing.JButton transactionsCheckInButton;
    private javax.swing.JTable transactionsCheckInList;
    private javax.swing.JPanel transactionsCheckInTab;
    private javax.swing.JButton transactionsCheckOutButton;
    private javax.swing.JLabel transactionsCheckOutCustomerIDLabel;
    private javax.swing.JTextField transactionsCheckOutCustomerIDText;
    private javax.swing.JTable transactionsCheckOutCustomerList;
    private javax.swing.JScrollBar transactionsCheckOutScrollBar;
    private javax.swing.JButton transactionsCheckOutSearchButton;
    private javax.swing.JPanel transactionsCheckOutTab;
    private javax.swing.JTabbedPane transactionsSubTab;
    // End of variables declaration//GEN-END:variables
}
