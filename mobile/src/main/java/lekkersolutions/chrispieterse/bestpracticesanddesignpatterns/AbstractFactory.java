package lekkersolutions.chrispieterse.bestpracticesanddesignpatterns;

abstract class AbstractFactory {
    abstract Bread getBread(String bread_type);
    abstract Filling getFilling(String filling_type);
}

class BreadFactory extends AbstractFactory {
    @Override
    Bread getBread(String bread_type) {
        switch (bread_type) {
            case "BRI": return new Brioche();
            case "BAG": return new Baguette();
            case "ROL": return new Roll();
            default: return null;
        }
    }

    @Override
    Filling getFilling(String filling_type) {
        return null;
    }
}

class FillingFactory extends AbstractFactory {
    @Override
    Filling getFilling(String filling_type) {
        switch (filling_type) {
            case "CHE": return new Cheese();
            case "TOM": return new Tomato();
            case "LET": return new Lettuce();
            default: return null;
        }
    }

    @Override
    Bread getBread(String bread_type) {
        return null;
    }
}

class FactoryGenerator {
    static AbstractFactory getFactory(String factory_type) {
        switch (factory_type) {
            case "BRE": return new BreadFactory();
            case "FIL": return new FillingFactory();
            default: return null;
        }
    }
}

class SandwichBuilder {
    // Off the shelf sandwich
    public static Sandwich readyMade() {
        Sandwich sandwich = new Sandwich();
        sandwich.addIngredient(new Baguette());
        sandwich.addIngredient(new Lettuce());
        sandwich.addIngredient(new Tomato());
        return sandwich;
    }

    // Customized sandwich
    public static Sandwich build(Sandwich s, Ingredient i) {
        s.addIngredient(i);
        return s;
    }
}