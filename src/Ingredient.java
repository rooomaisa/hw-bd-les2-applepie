public class Ingredient {


    double amount;
    String name;
    String unit;

    //constuctor
//    public Ingredient( double amount, string name) {
//        this.amount = amount;
//        this.name = name;
//    }

    //constructor
    public Ingredient(double amount, String unit, String name) {
        this.amount = amount;
        this.name = name;
        this.unit = unit;
    }

    public String getDescription() {
        return amount + " " + unit + " " + name;
    }

    //    //punt 6 zet voor deze variabelen getter en setter
//    public double getAmount(){ return amount; }
//    public void setAmount (double amount) {this.amount= amount;}
}

