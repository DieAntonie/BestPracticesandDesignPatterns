package lekkersolutions.chrispieterse.bestpracticesanddesignpatterns;

public abstract class Bread implements Ingredient {

    @Override
    public abstract String name();

    @Override
    public abstract int calories();
}

class Baguette extends Bread {
    @Override
    public String name() {
        return "Baguette";
    }

    @Override
    public int calories() {
        return 75;
    }
}

class Roll extends Bread {
    @Override
    public String name() {
        return "Roll";
    }

    @Override
    public int calories() {
        return 112;
    }
}

class Brioche extends Bread {
    @Override
    public String name() {
        return "Brioche";
    }

    @Override
    public int calories() {
        return 250;
    }
}

