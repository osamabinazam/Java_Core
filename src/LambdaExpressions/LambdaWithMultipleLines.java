

public class LambdaWithMultipleLines{

    public static void main (String [] args){
        new Thread (() -> {
            System.out.println ("Hello From Thread 1 (Implemented Lambda)");
            System.out.println("This is Line 1: ");
            System.out.println("Calling PrintBio Function ");
            LambdaWithMultipleLines.printBio();
            
        }).start();
    }
    public static void printBio(){
        System.out.println("Name : Osama Bin Azam\nGender : Male\nAge : 21 years");

    }   

}