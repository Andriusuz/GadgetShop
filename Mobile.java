import java.util.ArrayList;
/**
 * The class Mobile is the subclass of the class "Gadget"
 * The class itself has one atribut: credit(int)
 * @author (Andrius Uzkuraitis)
 * @version (10/01/2022)
 */
public class Mobile extends Gadget
{
    // instance variables
    private int Credit;

    /**
     * Constructor for objects of class "Mobile"
     * @theModel - Model of the gadget(String e.g. "Sony")
     * @thePrice - Price of the gadget(double e.g. 986.32£)
     * @theWeight -Weight of the gadget(int e.g. 86g)
     * @theSize - Size of the gadget(String e.g. "71mm x 137mm x 9mm")
     * @theCredit - Credit of the mobile(int 89) 
     */
    public Mobile(String theModel, double thePrice, int theWeight, String theSize , int theCredit)
    {
        //initialise instance variables
        super(theModel, thePrice, theWeight, theSize);
        Credit=theCredit;
    }

    /**
     * Accessor method returning the credit remaning of mobile
     * @return the credit of mobile
     */
    public int getCredit()
    {
        return Credit;
    }

    public int getCreditRemaning()
    {
        return Credit;
    }

    /**
     * a method increasing the mobile credit
     * if the value greater then 0 it will be added to the remaning credit 
     * if the value is 0 or negative message will be displayed.
     */
    public void addCredit(int Amount)
    {
        if(Amount>0){
            Credit=Credit + Amount;
            System.out.println("Credis are added!"+"\nRemaning credits: "+ Credit+"Min" );

        }
        else{
            System.out.println("Use a positive amount:");
        }
    }

    /**
     * a method for creating a phone number and selecting duration of call, by providing the number of minutes.
     * If the phone number is in the right length and format and if there is enough credits according to the minutes duration selected
     * than the display message appears with the phone number and duration of the call
     * otherwise the message is displayed prompting the user to put correct details
     * a user needs to enter 11 digit phone number and the right amount of minits acording to the credit
     * left
     */
    public void makeACall(int Duration ,String PhoneNumber)
    {
        boolean validity1=false ;
        boolean validity2=false ; 

        String msg1="";
        String msg2="";

        if (Duration> Credit){
            msg1 = "Not enough credit, add more credit or reduce duration.";
            validity1=false;
        }
        else if (Duration<= Credit){
            validity1=true;
        }

        if(!PhoneNumber.matches("\\d+")){
            msg2= "The format of your phone number is wrong, try again";
            validity2=false;
        }

        else if (!(PhoneNumber.length()==11)){
            msg2= "Phone number is too short should be 11 numbers";
            validity2= false;
        }

        else{
            validity2=true;
        }
        System.out.println(msg1);
        System.out.println(msg2);

        if(validity1==true && validity2==true)
        {
            Credit=Credit-Duration;
            System.out.println("Your call was successful! "+"\nPhoneNumber: "+ PhoneNumber +"\nDuration: "+ Duration +"Min"
            +"\nRemaning credits: "+ Credit+"Min");
        }

    }

    /**
     * a method displaying mobile details;
     * calls on the display method in superclass Gadget
     * a display method outputs the model, price, weight, size, credit
     * @returns monile model, price, weight, size, credit
     */
    public void display()
    {
        super.display();
        System.out.println("Credit: " + Credit +"Min");

    }
}
