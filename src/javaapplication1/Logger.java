package javaapplication1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Omar AbuRish
 */
public class Logger {
    File fileLog;
    File folder ;
    
    
    public Logger(String filePath) {
        try {
            
            /*folder = new File("OpticsData");
            
            if(!folder.exists()) {
                folder.mkdir();
            }
            */
            fileLog = new File( filePath);
            if (!fileLog.exists())  {
                System.out.println("File exists");
                fileLog.createNewFile();
            }
                    
            
        } catch (Exception e ){
            e.printStackTrace();
        }
        
    }
    public void writeToFile(Object serObj) {
        
        try {
            
            
            FileOutputStream fileOut = new FileOutputStream(fileLog, false);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
            
        } catch (Exception ex) {
            
        }
    }
    
    public ArrayList<Patient> readPatients() {
        try {
            
            FileInputStream fileIn = new FileInputStream(fileLog);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            ArrayList<Patient> patients = (ArrayList<Patient>)objectIn.readObject();
            objectIn.close();
            
            return patients;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
