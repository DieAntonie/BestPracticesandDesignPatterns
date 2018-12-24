package lekkersolutions.chrispieterse.bestpracticesanddesignpatterns;

public interface Bread {
    String name();
    String calories();
}

class Baguette implements Bread {
    @Override
    public String name() {
        return "Baguette";
    }

    @Override
    public String calories() {
        return "65 kcal";
    }
}

class Roll implements Bread {
    @Override
    public String name() {
        return "Roll";
    }

    @Override
    public String calories() {
        return "75 kcal";
    }
}

class Brioche implements Bread {
    @Override
    public String name() {
        return "Brioche";
    }

    @Override
    public String calories() {
        return "85 kcal";
    }
}

/**
 * Filling Classes.
 */
interface Filling {
    String name();
    String calories();
}

class Cheese implements Filling {
    @Override
    public String name() {
        return "Cheese";
    }

    @Override
    public String calories() {
        return "165 kcal";
    }
}

class Tomato implements Filling {
    @Override
    public String name() {
        return "Tomato";
    }

    @Override
    public String calories() {
        return "60 kcal";
    }
}

class Lettuce implements Filling {
    @Override
    public String name() {
        return "Lettuce";
    }

    @Override
    public String calories() {
        return "15 kcal";
    }
}

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
    public static AbstractFactory getFactory(String factory_type) {
        switch (factory_type) {
            case "BRE": return new BreadFactory();
            case "FIL": return new FillingFactory();
            default: return null;
        }
    }
}