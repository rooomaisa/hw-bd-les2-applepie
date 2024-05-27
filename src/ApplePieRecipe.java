

public class ApplePieRecipe {

    //    mis ik hier dan de connectie met ingrdient class?
    // waarom maak ik ze hier ?

    //voor elk ingredient een object.
    // je maakt dus een nieuw object met de vastgelegde gegevens in ingredient. ga je hier invullen
    Ingredient butter = new Ingredient( 200,"gram","ongezouten roomboter");
    Ingredient whiteSugar = new Ingredient(200,"gram","witte bastard suiker");

//    Ingredient appel = new Ingredient( 1.5, "appel", "kilo");
    //methode. onderdeel van recept zijn de stappen. die print je uit door de mthode hieronder, die stappen spreek je dan weer aan
//    bij de methode print out steps. maar hoe maak ik die connectie dan? waarom pakt tie naam met butter wel en naam met die step niet?

    public void stepPreheatOven() {
        System.out.println(" Verwarm de oven van te voren op 170 gradem Celsius (boven en onderwarmte)");
    }
    public void stepPrepareEggs() {
        System.out.println(" klop het ei en verdeel deze in twee delen, De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart. ");
    }


    //methode die je aanspreekt vanuit main om te printen // printingredients is de naam van de methode en eronder zeg ik wat je moet doen
    public void printIngredients() {
        System.out.println("ingredients");
        System.out.println(butter.getDescription());
        System.out.println(whiteSugar.getDescription());
    }

   public void printOutStepsOfRecipe() {
     System.out.println("steps");
     stepPreheatOven();
     stepPrepareEggs();
  }
}
