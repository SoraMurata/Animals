package pac.zoo;

import java.util.ArrayList;
import java.util.Iterator;
import pac.zoo.animal.AbstractAnimal;

public class TamaZoo {
    ArrayList<AbstractAnimal> cage = new ArrayList<AbstractAnimal>();

    public void addAnimal(AbstractAnimal animal) {
        cage.add(animal);
    }
    public void meal() {
        Iterator<AbstractAnimal> iterator = cage.iterator();
        while(iterator.hasNext()) {
            AbstractAnimal animal = iterator.next();
            animal.eat();
        }
    }
}