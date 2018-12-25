package lekkersolutions.chrispieterse.bestpracticesanddesignpatterns;

/**
 * Filling Classes.
 */
public abstract class Filling implements Ingredient {

    @Override
    public abstract String name();

    @Override
    public abstract int calories();
}

class Cheese extends Filling {
    @Override
    public String name() {
        return "Cheese";
    }

    @Override
    public int calories() {
        return 165;
    }
}

class Tomato extends Filling {
    @Override
    public String name() {
        return "Tomato";
    }

    @Override
    public int calories() {
        return 60;
    }
}

class Lettuce extends Filling {
    @Override
    public String name() {
        return "Lettuce";
    }

    @Override
    public int calories() {
        return 15;
    }
}
