//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        //object aan te maken voor methode aanspreken vanuit appelpierecp
//        var recipe = new ApplePieRecipe();            uit de les
//        Ingredient recipe = new ApplePieRecipe();     mijn probeersel

//
//        dus al dat geheugen wat je hebt opgeslagen in die class wil je opslaan onder de naam
//        applepeirecipe. maakt van al dat geheugen nu een naam erop.
//        dus de class     naam       is nieuw     van die class
         ApplePieRecipe applePieRecipe= new ApplePieRecipe();

//         verwijst eerst naar waar de info te vinden de class en dan welke methode ik wil uitvoeren
//         in de class staat dus wat printingredient inhoudt ik verwijs ernaar en daar staat dan
//         de methode print boter uit etc.
        applePieRecipe.printIngredients();
        applePieRecipe.printOutStepsOfRecipe();

    }
}