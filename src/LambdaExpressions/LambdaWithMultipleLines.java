

//Functional Interface
interface MyInterface {

    //Abstract Method
    public int printSum (int num1, int num2);

    
}
public class LambdaWithMultipleLines implements MyInterface{

    public static void main (String [] args){
        new Thread (() -> {
            System.out.println ("Hello From Thread 1 (Implemented Lambda)");
            System.out.println("This is Line 1: ");
            System.out.println("Calling PrintBio Function ");
            LambdaWithMultipleLines.printBio();
            
        }).start();

        MyInterface ref;
        int n1 = 3;
        int n2 = 4;
        System.out.println("Sum is : " );
        


    }
    public static void printBio(){
        System.out.println("Name : Osama Bin Azam\nGender : Male\nAge : 21 years");

    }
    @Override
    public int printSum(int num1, int num2) {
        // TODO Auto-generated method stub
        return 0;
    }   

}