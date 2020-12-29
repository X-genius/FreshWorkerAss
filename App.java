//import all files of java
import java.io.*;
import java.util.*;
import java.lang.String;

//first to download a jar file
//And move to reference in java projects 
//and import it and use it
import org.json.simple.JSONObject;

//Create a class for doing CRD operation
public class App {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
    //Create function which doing all operations like Create, Read, Delete 
    public void insertValue() throws IOException
    {
        //taking input using Scanner
        Scanner scn = new Scanner(System.in);

        //Given Some entries of std management System
        System.out.println("Enter The Name of Student : ");
        String stdName = scn.next();

        System.out.println("Enter The Age of Student : ");
        int ageOfStd = scn.nextInt();

        System.out.println("Enter The Class of Student : ");
        int classOfStd = scn.nextInt();

        System.out.println("Enter The Subject of Student : ");
        String subStd = scn.next();

        //Create JSONObject
        JSONObject obj = new JSONObject();

        //Basically doing CREATE operation
        obj.put("Student_Name" , stdName);
        obj.put("Student_Age" , ageOfStd);
        obj.put("Student_Class" , classOfStd);
        obj.put("Student_Subject" , subStd);

        //Read and Store on CRD.txt
        PrintWriter pWriter = new PrintWriter(new BufferedWriter(new FileWriter("CRD.txt",true)));
        pWriter.print(obj);
        System.out.println("Successfully Add Details");

        //Then Close means over the data
        pWriter.close();
    }
    
    public static void main(String args[]) throws IOException
    {
        //Create App obj and fetching data
       App obj = new App();
       obj.insertValue();
    }
}
