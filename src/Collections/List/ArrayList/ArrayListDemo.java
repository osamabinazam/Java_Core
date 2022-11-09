package Collections.List.ArrayList;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        
        //Creating an instance of ArrayList Class
        ArrayList bio = new ArrayList();
        System.out.println("\nThe size of ArrayList is : " + bio.size()+"\n");
        //Adding Elemets to the array list
        bio.add("Osama Bin Azam");
        bio.add("Muhammad Azam");
        bio.add(19);
        bio.add("Male");
        bio.add("O+");

        System.out.println("\nNow the size of ArrayList is : " + bio.size());
        //Printing The Values of
         displayBio(bio);
         
        //Updating Blood Group
        System.out.println("\nChanging the blood Group using set():");
        bio.set(4, "O-");
        displayBio(bio);

        System.out.println("\nGetting Element's index Using the Object (Male): " + bio.indexOf("Male") );
        System.out.println("Getting Element's index of last Occurence of element using the object (O-):" + bio.lastIndexOf("O-"));
        System.out.println("Adding Another Elemenet Name as: Passion" );
        bio.add("Coding");
        System.out.println("\nNow the size of ArrayList is : " + bio.size());
        System.out.println("Removing two elements from the list ");
        bio.remove(2);
        bio.remove(3);
        System.out.println("\nNow the Size of list become : " + bio.size());

        System.out.println("Now Reverting the changes but first Removing all elements from the list using clear(): ");
        bio.clear();

        System.out.println("\nNow the Size of list become : " + bio.size());
        bio.add("Osama Bin Azam");
        bio.add("Muhammad Azam");
        bio.add(19);
        bio.add("Male");
        bio.add("O+");

        displayBio(bio);




    }

    //Implement own display method as per my Requirement
    public static void displayBio(ArrayList bio) {
        System.out.println("Name is : " + bio.get(0));
        System.out.println("S/o is : " + bio.get(1));
        System.out.println("Age  is : " + bio.get(2));
        System.out.println("Gender is : " + bio.get(3));
        System.out.println("Blood group is : " + bio.get(4));
    }


}
