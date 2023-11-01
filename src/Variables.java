public class Variables {
    public static void main(String[] args) {
        //psvm = allowing class to be runnable
        System.out.println("Hello World");
        Variables myCode = new Variables ();
    }
public String dinerName = "Rise and Dine";
    //string = text box
    public double price = 4.99;
    public int partySize; //not set equal to a value

    public Variables (){
        //like go method
        System.out.println("Hej hej varld");
        partySize=4; //set variables equal to value
    }//end of Variables ()
    //variables as parameter in method
    public void order(int number){
        //method-wide variable >> doesn't exist/isn't declared outside of method
        String flavour = "blueberry";

    }
}//end of class

/*variables need "=" sign and have parameters ; variables are like red, green, and blue
for loop
for (int row = 0...) => row is established as an integer

variable types:
int -- whole numbers, neg, pos, no decimals
double -- decimals
boolean -- true / false
 *///notes on variables