package com.causeway.api.PlannedJobsDB;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class systemout {


    public static void main(String arr[]) throws FileNotFoundException
    {

        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Calendar calobj = Calendar.getInstance();
        System.out.println(df.format(calobj.getTime()));

        // Creating a File object that represents the disk file.
        PrintStream o = new PrintStream(new File("C:\\Users\\Komal.Chowdhary\\Desktop\\A.txt"));

        // Store current System.out before assigning a new value
        PrintStream console = System.out;

        // Assign o to output stream
        System.setOut(o);
        System.out.println("This will be written to the text file");


        PrintWriter pw = new PrintWriter("C:\\Users\\Komal.Chowdhary\\Desktop\\A.txt");
        pw.close();



    }

}
