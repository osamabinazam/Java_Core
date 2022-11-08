/*
   - Considering one printer which is shared between two or more people 
   = People are differentiated by Threads
*/

class Printer {
    public void printDoc (int copies, String docName){
        for(int i=1; i<=copies; i++){
            System.out.println("Printed  "+ docName +" " + i + " times." );
        }
    }
}

public class PrinterExample {
    public static void main(String [] args){

    }

}
class user1 implements Runnable {
    public void run (){

    }
}
class user2 implements Runnable{
    public void run (){
        
    }
}