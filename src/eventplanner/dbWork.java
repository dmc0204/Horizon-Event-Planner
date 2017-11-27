/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventplanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.util.ArrayList;

/**
 *
 * @author Donovan Cummins
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

    public static int getJID(int listIndex) {// getting an id from the array at a specific index. -DC

        return jobID.get(listIndex);

    }

    public static void setJID(int jID) { //building the array of job IDs. -DC

        jobID.add(jID);

    }
    
    public static void clearJID() { //reset the arraylist if need be. -DC

        jobID.clear();

    }

    public static int getvid() {// getting the vendor id for the table references. -DC

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
    
    public static void dbWorkDeleteStaff(String dbLogin, String dbPassword, int sID) throws ClassNotFoundException, SQLException {

        Class.forName("org.gjt.mm.mysql.Driver"); //setting up the mysql driver for jdbc objects to use. -DC
        String dbLocation = "jdbc:mysql://localhost:3306/horizon"; //setting up the dbLocation. -DC
        Connection dbConnection = DriverManager.getConnection(dbLocation, dbLogin, dbPassword); //creating a connection to the database. -DC
        Boolean testConnection = dbConnection.isValid(10); //testing the connection. -DC

        if (testConnection = true) {

            Statement deleteEventSQL = dbConnection.createStatement(); //object to deliver the SQL query or statement. -DC
            String deleteStaff = "Delete from staff where sID = " + sID;//the SQL statement that uses the passed eID value as the key to deleting the record the user wants to delete. -DC
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

                dbWork.clearEID(); //resetting the elements in the event ID list. -DC

                while (staffList.next()) { //My stub to see what is in the resultset, and populate the listmodel. -DC

                    /* Stubs
                int eNameLength = eventList.getString("eName").length();//counting the length of the Event Name. -DC
                int eLocationLength = eventList.getString("eLocation").length();//count the length of the Event Location. -DC
                int eDatetimeLength = eventList.getString ("eDatetime").length();//count the length of the Events Datetime. -DC
                System.out.println(eNameLength + "     " + eLocationLength + "     " + eDatetimeLength);// printing out length data. -DC
                System.out.println(eventList.getInt("eID") + "    |    " + eventList.getString("eName"));  //testing option B output. eID and eName only. -DC
                     */
                    
                    dbWork.setSID(staffList.getInt("sID")); //my staff ID array so i know which id is referenced by which index in the list box. -DC

                    resultsReturnList.addElement(staffList.getString("sFname") + "        " + staffList.getString("sLname") + "        " + staffList.getString("sPhone") + "        " + staffList.getString("sDatetime") + "        " + staffList.getString("sStatus")); //adding the elements of interest for the viewEvent UI. -DC
                }
                dbConnection.close();//closing the connection. -DC
                return resultsReturnList;      //returning the contructed results list from the resultset. -DC

            }

            System.out.println("No Events Added.");

            return null;
        }
    }
    
    public static DefaultListModel<Object> dbWorkSelectEvent(String dbLogin, String dbPassword, String dbSelect) throws ClassNotFoundException, SQLException {//add method for database insert queries. -DC

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
                Statement createEventSQL = dbConnection.createStatement(); //Not positive what is going on here. I am adding an object to another object? -DC
                ResultSet eventList = createEventSQL.executeQuery(dbSelect);

                dbWork.clearEID(); //resetting the elements in the event ID list. -DC

                while (eventList.next()) { //My stub to see what is in the resultset, and populate the listmodel. -DC

                    /* Stubs
                int eNameLength = eventList.getString("eName").length();//counting the length of the Event Name. -DC
                int eLocationLength = eventList.getString("eLocation").length();//count the length of the Event Location. -DC
                int eDatetimeLength = eventList.getString ("eDatetime").length();//count the length of the Events Datetime. -DC
                System.out.println(eNameLength + "     " + eLocationLength + "     " + eDatetimeLength);// printing out length data. -DC
                System.out.println(eventList.getInt("eID") + "    |    " + eventList.getString("eName"));  //testing option B output. eID and eName only. -DC
                     */
                    dbWork.setEID(eventList.getInt("eID"));

                    resultsReturnList.addElement(eventList.getString("eName") + "        " + eventList.getString("eLocation") + "        " + eventList.getString("eDatetime")); //adding the elements of interest for the viewEvent UI. -DC
                }
                dbConnection.close();//closing the connection. -DC
                return resultsReturnList;      //returning the contructed results list from the resultset. -DC

            }

            System.out.println("No Events Added.");

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

        System.out.println("Event failed to add.");

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

        System.out.println("Event added.");

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

}
