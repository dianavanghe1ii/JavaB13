package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class StudentInfo {
    /*
        "FirstName", "David"
        "LastName", "Pena"
        "Age", "25"
        "Gender", "M"
        "City", "Chicago"------------

        "FirstName", "Jeremiah"
        "LastName", "Michaelson"
        "Age", "15"
        "Gender", "M"
        "City", "LakeForest"------------
        "FirstName", "Michael"
        "LastName", "White"
        "Age", "35"
        "Gender", "M"
        "City", "Winnetka"------------
        "FirstName", "Sarah"
        "LastName", "Star"
        "Age", "29"
        "Gender", "F"
        "City", "Chicago"
     */
    public static void main(String[] args) {
        HashMap<String, String> student1= new HashMap();
        student1.put("FirstName", "David");
        student1.put("LastName", "Pena");
        student1.put("Age", "25");
        student1.put("Gender", "M");
        student1.put("City", "Chicago");

        HashMap<String, String> student2= new HashMap();
        student2.put("FirstName", "Jeremiah");
        student2.put("LastName", "Michaelson");
        student2.put("Age", "15");
        student2.put("Gender", "M");
        student2.put("City", "LakeForest");

        HashMap<String, String> student3= new HashMap();
        student3.put("FirstName", "Michael");
        student3.put("LastName", "White");
        student3.put("Age", "35");
        student3.put("Gender", "M");
        student3.put("City", "Winnetka");

        HashMap<String, String> student4= new HashMap();
        student4.put("FirstName", "Sarah");
        student4.put("LastName", "Star");
        student4.put("Age", "29");
        student4.put("Gender", "F");
        student4.put("City", "Chicago");
        ArrayList<HashMap<String,String>>listOfStudents=new ArrayList();
        listOfStudents.add(student1);
        listOfStudents.add(student2);
        listOfStudents.add(student3);
        listOfStudents.add(student4);
        System.out.println(listOfStudents);
        nonChiResident(listOfStudents);
        ArrayList<String> studentEmails= emailCreator(listOfStudents);
        System.out.println(studentEmails);
    }
    //create a function that takes an ArrayList as parameter
    //this method shows students' first names and last names if they are older than 15 and not living in Chicago

    public static void nonChiResident(ArrayList<HashMap<String,String>> infoList){
        for (HashMap<String,String> map :infoList){
            //int age= Integer.parseInt(map.get("Age")); and use age instead of--> Integer.parseInt(map.get("Age")
            if (Integer.parseInt(map.get("Age"))>15&& (!map.get("City").equalsIgnoreCase("Chicago"))){
                System.out.println("First name: "+map.get("FirstName")+" Last Name: "+map.get("LastName"));
            }
        }

    }
    //find the youngest man:
    //1.find all men(check gender)
    //2.find smallest age
    // if smallest age belongs to a man
                    //OR
    //create a method that returns a list of emails
    //email should be using firstname.lastname@gmail.com
    public static ArrayList emailCreator(ArrayList<HashMap<String,String>> infoList){
        ArrayList<String> emails= new ArrayList<>();
        for (HashMap<String,String> map :infoList){
            emails.add(map.get("FirstName")+"."+map.get("LastName")+"@gmail.com");


        }
        return emails;

    }
}
