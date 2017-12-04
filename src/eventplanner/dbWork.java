package eventplanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Donovan Cummins - (Team Horizon)
 */
public class dbWork {

    public dbWork() {

    }
    
    /*
    All CAPS = Array, All lowercase = int.
    geteid() = int;
    getEID(i) = array;

    getsid() = int;
    getSID() = array;

    getjid() = int;
    getJID() = array;

    getvid() = int;
    getVID() = array;

    getspid() = int;
    getSPID() = array;

    -DC

     */
    
    static ArrayList<Integer> eventID = new ArrayList(); //Integer array of unknown size for the event primary key. -DC
    static int eID = -1; //piece of the array, or a specific event ID. -DC

    static ArrayList<Integer> staffID = new ArrayList(); //array for staffID. -DC
    static int sID = -1;//a specific staffID. -DC

    static ArrayList<Integer> jobID = new ArrayList(); //array for jobID. -DC
    static int jID = -1;//a specific jobID. -DC

    static ArrayList<Integer> sponsorID = new ArrayList(); //array for sponsorID. -DC
    static int spID = -1;//a specific sponsorID. -DC

    static ArrayList<Integer> vendorID = new ArrayList(); //array for vendorID. -DC
    static int vID = -1;//a specific vendorID. -DC

    private static String dbLogin; //private variables to store the login and password. -DC
    private static String dbPassword;

    public static void setLogin(String x) { //methods for setting and getting the login and password. -DC

        dbLogin = x;

    }

    public static void setPassword(String y) {//setting password. -DC

        dbPassword = y;

    }

    public static String getLogin() { //getting login. -DC

        return dbLogin;
    }

    public static String getPassword() { //getting password. -DC

        return dbPassword;

    }

    public static int getsid() {//getting the staff id for the table references. -DC

        return sID;

    }

    public void setsid(int s) { //setting the staff id. -DC

        sID = s;

    }

    public static int getSID(int listIndex) {//getting an id from the array at a specific index. -DC

        return staffID.get(listIndex);

    }

    public static void setSID(int sID) { //building the array of staff IDs. -DC

        staffID.add(sID);

    }
    
    public static void clearSID() { //reset the arraylist if need be. -DC

        staffID.clear();

    }

    public static int getjid() {//getting the job id for the table references. -DC

        return jID;

    }

    public void setjid(int j) { //setting the job id. -DC

        jID = j;

    }

    public static int getJID(int listIndex) {//getting an id from the array at a specific index. -DC

        return jobID.get(listIndex);

    }

    public static void setJID(int jID) { //building the array of job IDs. -DC

        jobID.add(jID);

    }
    
    public static void clearJID() { //reset the arraylist if need be. -DC

        jobID.clear();

    }

    public static int getvid() {//getting the vendor id for the table references. -DC

        return vID;

    }

    public void setvid(int v) { // setting the vendor id. -DC

        vID = v;

    }

    public static int getVID(int listIndex) {// getting an id from the array at a specific index. -DC

        return vendorID.get(listIndex);

    }

    public static void setVID(int vID) { //building the array of vendor IDs. -DC

        vendorID.add(vID);

    }
    
    public static void clearVID() { //reset the arraylist if need be. -DC

        vendorID.clear();

    }

    public static int getspid() {// getting the sponsor id for the table references. -DC

        return spID;

    }

    public void setspid(int sp) { // setting the sponsor id. -DC

        spID = sp;

    }

    public static int getSPID(int listIndex) {// getting an id from the array at a specific index for sponsors. -DC

        return sponsorID.get(listIndex);

    }

    public static void setSPID(int spID) { //building the array of sponsor IDs. -DC

        sponsorID.add(spID);

    }
    
    public static void clearSPID() { //reset the arraylist if need be. -DC

        sponsorID.clear();

    }

    public static int geteid() { //getting the distinct event ID to be used in the management of event dependencies. -DC

        return eID;

    }

    public static void seteid(int e) { //setting the distinct event ID to be used in the mananagement of event dependencies. -DC

        eID = e;

    }

    public static int getEID(int listIndex) { //get method to get the eventID. -DC

        return eventID.get(listIndex);
    }

    public static void setEID(int eID) { //set method to set the value at the eventID array points to equal the eID. -DC

        eventID.add(eID);
    }

    public static void clearEID() { //reset the arraylist if need be. -DC

        eventID.clear();

    }
    
    public static void printReport() throws ClassNotFoundException, SQLException{
        
        Class.forName("org.gjt.mm.mysql.Driver"); //setting up the mysql driver for jdbc objects to use. -DC
        String dbLocation = "jdbc:mysql://localhost:3306/horizon"; //setting up the dbLocation. -DC
        Connection dbConnection = DriverManager.getConnection(dbLocation, dbLogin, dbPassword); //creating a connection to the database. -DC
        Boolean testConnection = dbConnection.isValid(10); //testing the connection. -DC
        
        if (testConnection = true){ //thinking about printing, far from anything useful yet. -DC
            
            Statement printReportSQL = dbConnection.createStatement();
            String dbSelect = "Select * from horizonevent where eID =" + dbWork.geteid() + "";
            ResultSet printList = printReportSQL.executeQuery(dbSelect);               

                while (printList.next()) { 
                                     
                    //System.out.println(printList.);
                    
                }
                dbConnection.close();//closing the connection. -DC
            
            
        }
        
        
    }
    
    public static void dbWorkDeleteSponsor(String dbLogin, String dbPassword, int spID) throws ClassNotFoundException, SQLException {

        Class.forName("org.gjt.mm.mysql.Driver"); //setting up the mysql driver for jdbc objects to use. -DC
        String dbLocation = "jdbc:mysql://localhost:3306/horizon"; //setting up the dbLocation. -DC
        Connection dbConnection = DriverManager.getConnection(dbLocation, dbLogin, dbPassword); //creating a connection to the database. -DC
        Boolean testConnection = dbConnection.isValid(10); //testing the connection. -DC

        if (testConnection = true) {

            Statement deleteSponsorSQL = dbConnection.createStatement(); //object to deliver the SQL query or statement. -DC
            String deleteSponsor = "Delete from sponsors where spID = " + spID + "";//the SQL statement that uses the passed spID value as the key to deleting the record the user wants to delete. -DC
            System.out.println(deleteSponsor);

            int rowsAffected = deleteSponsorSQL.executeUpdate(deleteSponsor); //passing the number of rows affected by the SQL statement that was passed to the executeUpdate method. -DC
            String rowResults = String.valueOf(rowsAffected); //converting to string to output to the terminal, my version of a stub as I go. -DC
            System.out.println(rowResults + " Rows Affected");

            dbConnection.close();
        }

    }
    
    public static void dbWorkDeleteVendor(String dbLogin, String dbPassword, int vID) throws ClassNotFoundException, SQLException {

        Class.forName("org.gjt.mm.mysql.Driver"); //setting up the mysql driver for jdbc objects to use. -DC
        String dbLocation = "jdbc:mysql://localhost:3306/horizon"; //setting up the dbLocation. -DC
        Connection dbConnection = DriverManager.getConnection(dbLocation, dbLogin, dbPassword); //creating a connection to the database. -DC
        Boolean testConnection = dbConnection.isValid(10); //testing the connection. -DC

        if (testConnection = true) {

            Statement deleteEventSQL = dbConnection.createStatement(); //object to deliver the SQL query or statement. -DC
            String deleteVendor = "Delete from vendors where vID = " + vID + "";//the SQL statement that uses the passed vID value as the key to deleting the record the user wants to delete. -DC
            System.out.println(deleteVendor);

            int rowsAffected = deleteEventSQL.executeUpdate(deleteVendor); //passing the number of rows affected by the SQL statement that was passed to the executeUpdate method. -DC
            String rowResults = String.valueOf(rowsAffected); //converting to string to output to the terminal, my version of a stub as I go. -DC
            System.out.println(rowResults + " Rows Affected");

            dbConnection.close();
        }

    }
    
    public static void dbWorkDeleteJobs(String dbLogin, String dbPassword, int jID) throws ClassNotFoundException, SQLException {

        Class.forName("org.gjt.mm.mysql.Driver"); //setting up the mysql driver for jdbc objects to use. -DC
        String dbLocation = "jdbc:mysql://localhost:3306/horizon"; //setting up the dbLocation. -DC
        Connection dbConnection = DriverManager.getConnection(dbLocation, dbLogin, dbPassword); //creating a connection to the database. -DC
        Boolean testConnection = dbConnection.isValid(10); //testing the connection. -DC

        if (testConnection = true) {

            Statement deleteEventSQL = dbConnection.createStatement(); //object to deliver the SQL query or statement. -DC
            String deleteStaff = "Delete from jobs where jID = " + jID + "";//the SQL statement that uses the passed jID value as the key to deleting the record the user wants to delete. -DC
            System.out.println(deleteStaff);

            int rowsAffected = deleteEventSQL.executeUpdate(deleteStaff); //passing the number of rows affected by the SQL statement that was passed to the executeUpdate method. -DC
            String rowResults = String.valueOf(rowsAffected); //converting to string to output to the terminal, my version of a stub as I go. -DC
            System.out.println(rowResults + " Rows Affected");

            dbConnection.close();
        }

    }
    
    public static void dbWorkDeleteStaff(String dbLogin, String dbPassword, int sID) throws ClassNotFoundException, SQLException {

        Class.forName("org.gjt.mm.mysql.Driver"); //setting up the mysql driver for jdbc objects to use. -DC
        String dbLocation = "jdbc:mysql://localhost:3306/horizon"; //setting up the dbLocation. -DC
        Connection dbConnection = DriverManager.getConnection(dbLocation, dbLogin, dbPassword); //creating a connection to the database. -DC
        Boolean testConnection = dbConnection.isValid(10); //testing the connection. -DC

        if (testConnection = true) {

            Statement deleteEventSQL = dbConnection.createStatement(); //object to deliver the SQL query or statement. -DC
            String deleteStaff = "Delete from staff where sID = " + sID + "";//the SQL statement that uses the passed sID value as the key to deleting the record the user wants to delete. -DC
            System.out.println(deleteStaff);

            int rowsAffected = deleteEventSQL.executeUpdate(deleteStaff); //passing the number of rows affected by the SQL statement that was passed to the executeUpdate method. -DC
            String rowResults = String.valueOf(rowsAffected); //converting to string to output to the terminal, my version of a stub as I go. -DC
            System.out.println(rowResults + " Rows Affected");

            dbConnection.close();
        }

    }

    public static void dbWorkDeleteEvent(String dbLogin, String dbPassword, int eID) throws ClassNotFoundException, SQLException {

        Class.forName("org.gjt.mm.mysql.Driver"); //setting up the mysql driver for jdbc objects to use. -DC
        String dbLocation = "jdbc:mysql://localhost:3306/horizon"; //setting up the dbLocation. -DC
        Connection dbConnection = DriverManager.getConnection(dbLocation, dbLogin, dbPassword); //creating a connection to the database. -DC
        Boolean testConnection = dbConnection.isValid(10); //testing the connection. -DC

        if (testConnection = true) {

            Statement deleteEventSQL = dbConnection.createStatement(); //object to deliver the SQL query or statement. -DC
            String deleteEvent = "Delete from horizonevent where eID = " + eID;//the SQL statement that uses the passed eID value as the key to deleting the record the user wants to delete. -DC
            System.out.println(deleteEvent);

            int rowsAffected = deleteEventSQL.executeUpdate(deleteEvent); //passing the number of rows affected by the SQL statement that was passed to the executeUpdate method. -DC
            String rowResults = String.valueOf(rowsAffected); //converting to string to output to the terminal, my version of a stub as I go. -DC
            System.out.println(rowResults + " Rows Affected");

            dbConnection.close();
        }

    }
    
    public static DefaultListModel<Object> dbWorkSelectJobs(String dbLogin, String dbPassword, String dbSelect) throws ClassNotFoundException, SQLException {//add method for database insert queries. -DC
        {
            Class.forName("org.gjt.mm.mysql.Driver"); //setting up the mysql driver for jdbc objects to use. -DC
            String dbLocation = "jdbc:mysql://localhost:3306/horizon"; //setting up the dbLocation. -DC
            Connection dbConnection = DriverManager.getConnection(dbLocation, dbLogin, dbPassword); //creating a connection to the database. -DC

            Boolean testConnection = dbConnection.isValid(10); //testing the connection. -DC

            DefaultListModel resultsReturnList = new DefaultListModel();

            if (testConnection = true) {
                System.out.println("Connected to Database."); //stub to tell me if the connection failed or the query. -DC
            }

            if (testConnection = true) {
                System.out.println(dbSelect); //stub to test SQL query input being passed to the database. -DC
                Statement createJobsSQL = dbConnection.createStatement(); //Not positive what is going on here. I am adding an object to another object? -DC
                ResultSet jobsList = createJobsSQL.executeQuery(dbSelect);

                dbWork.clearJID(); //resetting the job ID array. -DC

                while (jobsList.next()) { //parallel arrays for storing the primary key for jobs with a specific eID foreign key. -DC
                                       
                    dbWork.setJID(jobsList.getInt("jID")); //my jobs ID array so i know which id is referenced by which index in the list box. -DC

                    resultsReturnList.addElement(
                                    tableBuilder.rowBuilder(2,jobsList.getString("jTitle")) +
                                    tableBuilder.rowBuilder(2,jobsList.getString("jDatetime"))); //adding the elements of interest for the viewJobs UI. -DC
                }
                dbConnection.close();//closing the connection. -DC
                return resultsReturnList;//returning the contructed results list from the resultset. -DC

            }

            System.out.println("doWorkSelectJobs.");

            return null;
        }
    }
    
    public static DefaultListModel<Object> dbWorkSelectSponsors(String dbLogin, String dbPassword, String dbSelect) throws ClassNotFoundException, SQLException {//add method for database insert queries. -DC
        {
            Class.forName("org.gjt.mm.mysql.Driver"); //setting up the mysql driver for jdbc objects to use. -DC
            String dbLocation = "jdbc:mysql://localhost:3306/horizon"; //setting up the dbLocation. -DC
            Connection dbConnection = DriverManager.getConnection(dbLocation, dbLogin, dbPassword); //creating a connection to the database. -DC

            Boolean testConnection = dbConnection.isValid(10); //testing the connection. -DC

            DefaultListModel resultsReturnList = new DefaultListModel();

            if (testConnection = true) {
                System.out.println("Connected to Database."); //stub to tell me if the connection failed or the query. -DC
            }

            if (testConnection = true) {
                System.out.println(dbSelect); //stub to test SQL query input being passed to the database. -DC
                Statement viewSponsorsSQL = dbConnection.createStatement(); //Not positive what is going on here. I am adding an object to another object? -DC
                ResultSet sponsorsList = viewSponsorsSQL.executeQuery(dbSelect);

                dbWork.clearSPID(); //resetting the sponsors ID array. -DC

                while (sponsorsList.next()) { //parallel arrays for storing the primary key for sponsors with a specific eID foreign key. -DC
                                     
                    dbWork.setSPID(sponsorsList.getInt("spID")); //my sponsors ID array so i know which id is referenced by which index in the list box. -DC

                    resultsReturnList.addElement(
                                    tableBuilder.rowBuilder(5,sponsorsList.getString("spName")) +
                                    tableBuilder.rowBuilder(5,sponsorsList.getString("spFname")) + 
                                    tableBuilder.rowBuilder(5,sponsorsList.getString("spLname"))+
                                    tableBuilder.rowBuilder(5,sponsorsList.getString("spPhone")) + "$" +
                                    tableBuilder.rowBuilder(5,sponsorsList.getString("spPledge"))); //adding the elements of interest for the viewSponsors UI. -DC
                }
                dbConnection.close();//closing the connection. -DC
                return resultsReturnList;      //returning the contructed results list from the resultset. -DC

            }

            System.out.println("dbWorkSelectSponsors.");

            return null;
        }
    }
    
    public static DefaultListModel<Object> dbWorkSelectStaff(String dbLogin, String dbPassword, String dbSelect) throws ClassNotFoundException, SQLException {//add method for database insert queries. -DC
        {
            Class.forName("org.gjt.mm.mysql.Driver"); //setting up the mysql driver for jdbc objects to use. -DC
            String dbLocation = "jdbc:mysql://localhost:3306/horizon"; //setting up the dbLocation. -DC
            Connection dbConnection = DriverManager.getConnection(dbLocation, dbLogin, dbPassword); //creating a connection to the database. -DC

            Boolean testConnection = dbConnection.isValid(10); //testing the connection. -DC

            DefaultListModel resultsReturnList = new DefaultListModel();

            if (testConnection = true) {
                System.out.println("Connected to Database."); //stub to tell me if the connection failed or the query. -DC
            }
            if (testConnection = true) {
                System.out.println(dbSelect); //stub to test SQL query input being passed to the database. -DC
                Statement createStaffSQL = dbConnection.createStatement(); //Not positive what is going on here. I am adding an object to another object? -DC
                ResultSet staffList = createStaffSQL.executeQuery(dbSelect);

                dbWork.clearSID(); //resetting the staff ID array. -DC

                while (staffList.next()) { //parallel arrays for storing the primary key for staff with a specific eID foreign key. -DC
                                     
                    dbWork.setSID(staffList.getInt("sID")); //my staff ID array so i know which id is referenced by which index in the list box. -DC

                    resultsReturnList.addElement(
                                    tableBuilder.rowBuilder(5,staffList.getString("sFname")) + 
                                    tableBuilder.rowBuilder(5, staffList.getString("sLname")) +
                                    tableBuilder.rowBuilder(5,staffList.getString("sPhone")) +
                                    tableBuilder.rowBuilder(5,staffList.getString("sDatetime")) + 
                                    tableBuilder.rowBuilder(5,staffList.getString("sStatus"))); //adding the elements of interest for the viewEvent UI. -DC
                }
                dbConnection.close();//closing the connection. -DC
                return resultsReturnList;      //returning the contructed results list from the resultset. -DC

            }

            System.out.println("dbWorkSelectStaff.");

            return null;
        }
    }

    public static DefaultListModel<Object> dbWorkSelectVendor(String dbLogin, String dbPassword, String dbSelect) throws ClassNotFoundException, SQLException {//add method for database insert queries. -DC
        {
            Class.forName("org.gjt.mm.mysql.Driver"); //setting up the mysql driver for jdbc objects to use. -DC
            String dbLocation = "jdbc:mysql://localhost:3306/horizon"; //setting up the dbLocation. -DC
            Connection dbConnection = DriverManager.getConnection(dbLocation, dbLogin, dbPassword); //creating a connection to the database. -DC

            Boolean testConnection = dbConnection.isValid(10); //testing the connection. -DC

            DefaultListModel resultsReturnList = new DefaultListModel();

            if (testConnection = true) {
                System.out.println("Connected to Database."); //stub to tell me if the connection failed or the query. -DC
            }
            if (testConnection = true) {
                System.out.println(dbSelect); //stub to test SQL query input being passed to the database. -DC
                Statement viewVendorSQL = dbConnection.createStatement(); //Not positive what is going on here. I am adding an object to another object? -DC
                ResultSet vendorList = viewVendorSQL.executeQuery(dbSelect);

                dbWork.clearVID(); //resetting the vendors ID array. -DC
                //resultsReturnList.addElement(tableBuilder.rowBuilder(5, "Vendor:") + tableBuilder.rowBuilder(5, "First:") + tableBuilder.rowBuilder(5, "Last:") + tableBuilder.rowBuilder(5, "Medium:") + tableBuilder.rowBuilder(5, "Status:"));
                

                while (vendorList.next()) { //parallel arrays for storing the primary key for vendors with a specific eID foreign key. -DC
                                     
                    dbWork.setVID(vendorList.getInt("vID")); //my vendors ID array so i know which id is referenced by which index in the list box. -DC

                    resultsReturnList.addElement(
                            tableBuilder.rowBuilder(5, vendorList.getString("vName")) + 
                            tableBuilder.rowBuilder(5, vendorList.getString("vFname")) + 
                            tableBuilder.rowBuilder(5, vendorList.getString("vLname")) + 
                            tableBuilder.rowBuilder(5, vendorList.getString("vMedium")) + 
                            tableBuilder.rowBuilder(5, vendorList.getString("vStatus"))); //adding the elements of interest for the viewVendor UI. -DC
                }
                dbConnection.close();//closing the connection. -DC
                return resultsReturnList;//returning the contructed results list from the resultset. -DC

            }

            System.out.println("dbWorkSelectVendor.");

            return null;
        }
    }
    
    public static DefaultListModel dbWorkSelectEvent(String dbLogin, String dbPassword, String dbSelect) throws ClassNotFoundException, SQLException {//add method for database insert queries. -DC
        {
            Class.forName("org.gjt.mm.mysql.Driver"); //setting up the mysql driver for jdbc objects to use. -DC
            String dbLocation = "jdbc:mysql://localhost:3306/horizon"; //setting up the dbLocation. -DC
            Connection dbConnection = DriverManager.getConnection(dbLocation, dbLogin, dbPassword); //creating a connection to the database. -DC

            Boolean testConnection = dbConnection.isValid(10); //testing the connection. -DC

            DefaultListModel resultsReturnList = new DefaultListModel();
            //DefaultTableModel resultsReturnListTable = new DefaultTableModel();
            
            if (testConnection = true) {
                System.out.println("Connected to Database."); //stub to tell me if the connection failed or the query. -DC
            }
            if (testConnection = true) {
                System.out.println(dbSelect); //stub to test SQL query input being passed to the database. -DC
                Statement createEventSQL = dbConnection.createStatement(); //Not positive what is going on here. I am adding an object to another object? -DC
                ResultSet eventList = createEventSQL.executeQuery(dbSelect);

                dbWork.clearEID(); //resetting resetting the event ID array. -DC
                
                //resultsReturnList.addElement(tableBuilder.rowBuilder(3, "Name:") + tableBuilder.rowBuilder(3, "Location:") + tableBuilder.rowBuilder(3, "Date:"));

                while (eventList.next()) { //parallel arrays for storing the primary key for the events and the list box. -DC
                    
                    dbWork.setEID(eventList.getInt("eID"));//adding the primary key at the same index as it is populated in the listbox. -DC

                    /*
                    Object[] objects = new Object[3];
                    for(int i=0;i<3;i++){
                        
                        objects[i] = eventList.getObject(i);
                        
                    }
                    
                    resultsReturnListTable.addRow(objects);
                    */
                    
                    String eName = tableBuilder.rowBuilder(3, eventList.getString("eName")); //feeding into string variables so they can be fed into a factory class for formating. -DC
                    String eLocation = tableBuilder.rowBuilder(3, eventList.getString("eLocation"));
                    String eDatetime = tableBuilder.rowBuilder(3, eventList.getString("eDatetime"));
                    
                    resultsReturnList.addElement(eName + eLocation + eDatetime);
                    
                   /* resultsReturnList.addElement(
                                    eventList.getString("eName") + "        " + 
                                    eventList.getString("eLocation") + "        " + 
                                    eventList.getString("eDatetime")); //adding the elements of interest for the viewEvent UI. -DC
                    */
                   
                }
                dbConnection.close();//closing the connection. -DC
                return resultsReturnList;//returning the contructed results list from the resultset. -DC

            }

            System.out.println("dbWorkSelectEvent.");

            return null;
        }
    }

    public static boolean dbWorkLogin(String dbLogin, String dbPassword) throws ClassNotFoundException, SQLException {

        Class.forName("org.gjt.mm.mysql.Driver"); //setting up the mysql driver for jdbc objects to use. -DC
        String dbLocation = "jdbc:mysql://localhost:3306/horizon"; //setting up the dbLocation. -DC
        Connection dbConnection = DriverManager.getConnection(dbLocation, dbLogin, dbPassword); //creating a connection to the database. -DC

        Boolean testConnection = dbConnection.isValid(10);

        if (testConnection = true) { //Checking the database connection. -DC

            dbWork.setLogin(dbLogin); //if it connected, storing the login information for use by other units. -DC
            dbWork.setPassword(dbPassword);
            dbConnection.close();
            
            return true;

        }

        return false;
    }

    public static boolean dbWorkAdd(String dbLogin, String dbPassword, String dbInsert) throws ClassNotFoundException, SQLException { //add method for database insert queries. -DC

        Class.forName("org.gjt.mm.mysql.Driver"); //setting up the mysql driver for jdbc objects to use. -DC
        String dbLocation = "jdbc:mysql://localhost:3306/horizon"; //setting up the dbLocation. -DC
        Connection dbConnection = DriverManager.getConnection(dbLocation, dbLogin, dbPassword); //creating a connection to the database. -DC

        Boolean testConnection = dbConnection.isValid(10);

        if (testConnection = true) {
            System.out.println("Connected to Database."); //stub to tell me if the connection failed or the query. -DC
        }
        
        if (testConnection = true) {
            System.out.println(dbInsert); //stub to test SQL query input being passed to the database. -DC
            Statement createEventSQL = dbConnection.createStatement(); //Not positive what is going on here. I am adding an object to another object? -DC
            createEventSQL.executeUpdate(dbInsert);

            dbConnection.close(); //closing connection to the database. -DC

            return true;

        }

        System.out.println("dbWorkAdd.");

        return false;
    }

    public static void eventPopulator() throws ClassNotFoundException, SQLException {

        Class.forName("org.gjt.mm.mysql.Driver"); //setting up the mysql driver for jdbc objects to use. -DC
        String dbLocation = "jdbc:mysql://localhost:3306/horizon"; //setting up the dbLocation. -DC
        Connection dbConnection = DriverManager.getConnection(dbLocation, dbWork.getLogin(), dbWork.getPassword()); //creating a connection to the database. -DC

        Boolean testConnection = dbConnection.isValid(10);

        if (testConnection = true) {
            System.out.println("Connected to Database."); //stub to tell me if the connection failed or the query. -DC
        }

        if (testConnection = true) {

            Statement createEventSQL = dbConnection.createStatement(); //Not positive what is going on here. I am adding an object to another object? -DC

            int i = 0; //this is hopfully going to populate the database with many entries. -DC
            for (i = 0; i < 1001; i++) {

                String dbInsert = "Insert into horizonevent(eName, eLocation, eDatetime, eSize) values (" + i + "," + i + "," + i + "," + i + ")";

                createEventSQL.executeUpdate(dbInsert);
            }

            dbConnection.close(); //closing connection to the database. -DC

        }

        System.out.println("Event added.");//test git. -dc

    }
    
    public static void staffPopulator() throws ClassNotFoundException, SQLException {

        Class.forName("org.gjt.mm.mysql.Driver"); //setting up the mysql driver for jdbc objects to use. -DC
        String dbLocation = "jdbc:mysql://localhost:3306/horizon"; //setting up the dbLocation. -DC
        Connection dbConnection = DriverManager.getConnection(dbLocation, dbWork.getLogin(), dbWork.getPassword()); //creating a connection to the database. -DC

        Boolean testConnection = dbConnection.isValid(10);

        if (testConnection = true) {
            System.out.println("Connected to Database."); //stub to tell me if the connection failed or the query. -DC
        }

        if (testConnection = true) {

            Statement createEventSQL = dbConnection.createStatement(); //Not positive what is going on here. I am adding an object to another object? -DC

            int i = 0; //this is hopfully going to populate the database with many entries. -DC
            for (i = 0; i < 11; i++) {

                String dbInsert = "Insert into staff(sFname, sLname, sPhone, sDatetime, sStatus, eID) values (" + i + "," + i + "," + i + "," + i + "," + i + "," + dbWork.geteid() + ")";

                createEventSQL.executeUpdate(dbInsert);
            }

            dbConnection.close(); //closing connection to the database. -DC

        }

        System.out.println("Staff added.");

    }
    
    public static void jobsPopulator() throws ClassNotFoundException, SQLException {

        Class.forName("org.gjt.mm.mysql.Driver"); //setting up the mysql driver for jdbc objects to use. -DC
        String dbLocation = "jdbc:mysql://localhost:3306/horizon"; //setting up the dbLocation. -DC
        Connection dbConnection = DriverManager.getConnection(dbLocation, dbWork.getLogin(), dbWork.getPassword()); //creating a connection to the database. -DC

        Boolean testConnection = dbConnection.isValid(10);

        if (testConnection = true) {
            System.out.println("Connected to Database."); //stub to tell me if the connection failed or the query. -DC
        }

        if (testConnection = true) {

            Statement createEventSQL = dbConnection.createStatement(); //Not positive what is going on here. I am adding an object to another object? -DC

            int i = 0; //this is hopfully going to populate the database with many entries. -DC
            for (i = 0; i < 11; i++) {

                String dbInsert = "Insert into jobs(jTitle, jDatetime, eID) values (" + i + "," + i + dbWork.geteid() + ")";

                createEventSQL.executeUpdate(dbInsert);
            }

            dbConnection.close(); //closing connection to the database. -DC

        }

        System.out.println("Jobs added.");

    }
    

}
