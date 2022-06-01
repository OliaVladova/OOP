package Polymorphism.WildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    String livingRegion;

    public Mammal(String animalName, String animalType, double animalWeight,String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;

    }

    public String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public String toString(){
        DecimalFormat formatted = new DecimalFormat("##.##");
        return String.format("%s[%s, %s, %s, %d]", getAnimalType(), getAnimalName(),
                formatted.format(getAnimalWeight()), getLivingRegion(), getFoodEaten());
    }

}
