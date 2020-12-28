import java.io.*;
import java.util.*;
import java.lang.String;
import org.json.simple.JSONObject;


public class App {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
    public void insertValue() throws IOException
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter The Name of Student : ");
        String stdName = scn.next();

        System.out.println("Enter The Age of Student : ");
        int ageOfStd = scn.nextInt();

        System.out.println("Enter The Class of Student : ");
        int classOfStd = scn.nextInt();

        System.out.println("Enter The Subject of Student : ");
        String subStd = scn.next();

        JSONObject obj = new JSONObject();

        obj.put("Student_Name" , stdName);
        obj.put("Student_Age" , ageOfStd);
        obj.put("Student_Class" , classOfStd);
        obj.put("Student_Subject" , subStd);

        PrintWriter pWriter = new PrintWriter(new BufferedWriter(new FileWriter("CRD.txt",true)));
        pWriter.print(obj);
        System.out.println("Successfully Add Details");
        pWriter.close();
    }
    
    public static void main(String args[]) throws IOException
    {
       App obj = new App();
       obj.insertValue();
    }
}
