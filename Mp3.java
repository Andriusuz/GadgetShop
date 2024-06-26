import java.util.ArrayList;
/**
 * The class Mp3 is the subclass of the class "Gadget"
 * The class itself has two atributs: Memory(int) , UsedMemory(int)
 * @author (Andrius Uzkuraitis)
 * @version (09/01/2022)
 */
public class Mp3 extends Gadget
{
    // instance variables
    private int Memory;
    private int UsedMemory;

    /**
     * Constructor for objects of class "Mp3"
     * @theModel - Model of the gadget(String e.g. "Sony")
     * @thePrice - Price of the gadget(double e.g. 986.32£)
     * @theWeight -Weight of the gadget(int e.g. 86g)
     * @theSize - Size of the gadget(String e.g. "71mm x 137mm x 9mm")
     * @theMemory - Memory of the Mp3(int 86)
     */
    public Mp3(String theModel, double thePrice, int theWeight, String theSize, int theMemory)
    {
        //initialise instance variables
        super(theModel, thePrice, theWeight, theSize);
        Memory=theMemory;
    }

    /**
     * Accessor method returning the remaning memory of mp3
     * @return the memory of mp3
     */
    public int getMemoryRemaning()
    {
        return Memory;
    }

    /**
     * Accessor method returning the used memory of mp3
     * @return the usedmemory of mp3
     */
    public int getUsedMemory()
    {
        return UsedMemory;
    }

    /**
     * a method which takes a parameter representing the amount of memory that the music will take up and
     * if there is sufficient available memory on the mp3 player, decreases the available memory accordingly
     * also takes a parameter representing the amount of memory that the music took up and increases used memory of the MP3
     * otherwise the message is displayed prompting the user to put correct amount
     */
    public void DownloadMusic(int MusicFile)
    {
        if(MusicFile <= Memory){
            Memory=Memory-MusicFile;
            UsedMemory=UsedMemory+MusicFile;
            System.out.println("Music Downloaded: "+"Used Memory:"+ UsedMemory+"Mb"+"\nMemory remaning: "+ Memory+"Mb");

        }
        else{
            System.out.println("Not enough memory, choose smaler file :");
        }
    }

    /**
     * a method which takes a parameter representing the amount of memory that the music took up
     * decrease the mp3 player used memory and increases the available memory of the mp3 player accordingly
     * otherwise the message is displayed prompting the user to put correct amount  
     */
    public void DeleteMusic(int amount)
    {
        if(amount <= UsedMemory){
            UsedMemory=UsedMemory-amount;
            Memory=Memory+amount;
            System.out.println("Music deletet: "+"Used Memory:"+ UsedMemory+"Mb"+"\nMemory remaning: "+ Memory+"Mb");

        }
        else{
            System.out.println("Error!!! check the available Used Memory.");
        }
    }
    
    /**
     * a method displaying mp3 details;
     * calls on the display method in superclass Gadget
     * a display method outputs the model, price, weight, size, memory
     * @returns gadget mp3, price, weight, size, memory
     */
    public void display()
    {
        super.display();
        System.out.println("Memory: " + Memory +"Mb"+"\nUsed Memory:"+ UsedMemory+"Mb");

    }

}
