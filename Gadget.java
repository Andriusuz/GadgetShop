/**
 *The class Gadget a superclass creating an object  gadget, which 4 attributes can be passed to the subclass 
 *Mobile or Mp3
 *Author (Andrius Uzkuraitis)
 *Version (03/01/2022)
 */
public class Gadget
{

    private String Model;
    private double Price;
    private int Weight;
    private String Size;

    /**
     * Constructor for objects of class "Gadget"
     * @theModel - Model of the gadget(String e.g. "Sony")
     * @thePrice - Price of the gadget(double e.g. 986.32£)
     * @theWeight - Weight of the gadget(int e.g. 86g)
     * @theSize - Size of the gadget(String e.g. "71mm x 137mm x 9mm")
     */
    public Gadget(String theModel, double thePrice, int theWeight, String theSize) 
    {
        Model = theModel;
        Price = thePrice;
        Weight = theWeight;
        Size = theSize;

    }

    /**
     * Accessor method returning the model of the gadget 
     * @return model of the gadget
     */
    public String getModel()
    {
        return Model;
    }

    /**
     * Accessor method returning the price of the gadget
     * @return price of the gadget
     */
    public double getPrice()
    {
        return Price;
    }

    /**
     * Accessor method returning the weight of the gadget
     * @return weight of the gadget
     */
    public int getWeight()
    {
        return Weight;
    }

    /**
     * Accessor method returning the size of the gadget
     * @return size of the gadget
     */
    public String getSize()
    {
        return Size;
    }

    /**
     * a display method outputs the model, price, weight, size 
     * @returns gadget model, price, weight, size
     */
    public void display()
    {
        System.out.println("Model: "+ Model +"\nPrise: "+""+ Price +"£" 
            + " \nWeight: "+""+ Weight +"g"+"\nSize: "+ Size);

    }
}
