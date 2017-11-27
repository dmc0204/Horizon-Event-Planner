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
    
    -DC
    
    */
    static ArrayList<Integer> eventID = new ArrayList(); //Integer array of unknown size. -DC
    static int eID = -1; //piece of the array. -DC
    
    public static int geteid(){ //getting the distinct event ID to be used in the management of event dependencies. -DC
        
        return eID;
        
    }
    
    public static void seteid(int e){ //setting the distinct event ID to be used in the mananagement of event dependencies. -DC
        
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
    
    public static void eventPopulator() throws ClassNotFoundException, SQLException{
        
        Class.forName("org.gjt.mm.mysql.Driver"); //setting up the mysql driver for jdbc objects to use. -DC
        String dbLocation = "jdbc:mysql://localhost:3306/horizon"; //setting up the dbLocation. -DC
        Connection dbConnection = DriverManager.getConnection(dbLocation, "root", "harsh19"); //creating a connection to the database. -DC

        Boolean testConnection = dbConnection.isValid(10);

        if (testConnection = true) {
            System.out.println("Connected to Database."); //stub to tell me if the connection failed or the query. -DC
        }

        if (testConnection = true) {        
            
            
            
            Statement createEventSQL = dbConnection.createStatement(); //Not positive what is going on here. I am adding an object to another object? -DC
            
            int i = 0; //this is hopfully going to populate the database with many entries. -DC
            for(i = 0; i < 1001; i++){
                
                String dbInsert = "Insert into horizonevent(eName, eLocation, eDatetime, eSize) values (" + i + "," + i + "," + i + "," + i + ")";
                
                createEventSQL.executeUpdate(dbInsert);
            }
            
            dbConnection.close(); //closing connection to the database. -DC

           

        }

        System.out.println("Event failed to add.");

        
        
    }

}
