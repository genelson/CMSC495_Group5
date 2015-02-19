
import java.util.ArrayList;

/*
 * VideoManagementSystem
 * The main hub for the GUI and front-end implementation of the whole system.
 * The GUI will provide functionality to the end-user so as to access the
 * database back-end and manage rentals, customers, and inventory.
 */

public class VideoManagementSystem 
{   
    private static DatabaseManager m_databaseManager = null;
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
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
            java.util.logging.Logger.getLogger(VideoManagementSystemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VideoManagementSystemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VideoManagementSystemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VideoManagementSystemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VideoManagementSystemGUI().setVisible(true);
            }
        });
        // Create a new DatabaseManager to give us access to the
        // MySQL Back-End subsystem
        m_databaseManager =
                new DatabaseManager("jdbc:mysql://db152b.pair.com/travin_cmsc495",
                "travin_14",
                "Aw3s0m3!",
                "travin_cmsc495",
                3306);
        
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
            VideoManagementSystemGUI.errorBox("Look into VideoManagementSystem.addCustomers()", "Some type of add user failsauce");
            
        } 
        
        else {
            VideoManagementSystemGUI.infoBox(firstName + " " + lastName + " Added sucessfully!", "Sucessfull");
        }
              
    }
    
    public static void removeCustomers(String customerName, String customerID) {
        // Method still broken needs work.
        Customer originalCustomer = null;
        // Need this statement corrected. Not sure how to insert ID number.
        DatabaseManager.DbResult resultCustomerRemove = m_databaseManager.removeCustomer(originalCustomer.m_id);
        if(resultCustomerRemove != DatabaseManager.DbResult.DB_OK)
        {
            //System.out.println("    Customer Edit Error: This customer doesn't exist or has rentals out/latefees.");
            VideoManagementSystemGUI.errorBox("Look into VideoManagementSystem.removeCustomers()", "Some type of remove user failsauce");
        }
        else
        {
            //System.out.println("    Customer successfully removed.");
            VideoManagementSystemGUI.infoBox( customerName + " Removed sucessfully!", "Sucessfull");
        }
    }
    
    public static void queryCustomers(String lastName, String firstName, int ID) {
        // I need this function to return a array list in the Format of "Name, ID" that I can have 
        // in the VideoManagementSystemGUI.java...
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
        DatabaseManager.DbResult resultVideoAddOk = m_databaseManager.addVideo(title, type, rating, length, year, director, 5);
        
        if(resultVideoAddOk != DatabaseManager.DbResult.DB_OK)
        {
            //System.out.println("    Video Add Error: Video already exists.");
            VideoManagementSystemGUI.errorBox("Look into VideoManagementSystem.addVideo()", "Some type of add video failsauce");
            
            // Get this video, store it as the original for now (we've likely run this
            // hard-coded test already and don't want to purge the database to test
            // the edits below)
            
        }
        else
        {
            //System.out.println("    Video successfully added:");
            VideoManagementSystemGUI.infoBox( title + " added sucessfully!", "Sucessfull");
        
        }
    }
    
    public static void removeVideo(String videoName, int videoID)
    {
        Video originalVideo = null;
        
        // Same issue need a way to pass a movie ID in the database statement below. I should be able to parse
        // that info from the queryVideo function
        DatabaseManager.DbResult resultVideoRemove = m_databaseManager.removeVideo(originalVideo.m_id);
        
        if(resultVideoRemove != DatabaseManager.DbResult.DB_OK)
        {
            //System.out.println("    Video Edit Error: This video doesn't exist or has rentals out.");
            VideoManagementSystemGUI.errorBox("Look into VideoManagementSystem.removeVideo()", "Some type of remove video failsauce");
        }
        else
        {
            //System.out.println("    Video successfully removed.");
            VideoManagementSystemGUI.infoBox( videoName + " removed sucessfully!", "Sucessfull");
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
}
