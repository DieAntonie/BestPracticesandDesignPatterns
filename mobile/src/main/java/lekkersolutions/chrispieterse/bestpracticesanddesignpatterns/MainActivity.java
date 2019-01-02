package lekkersolutions.chrispieterse.bestpracticesanddesignpatterns;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String DEBUG_TAG = "tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.text_view);

        AbstractFactory filling_factory = FactoryGenerator.getFactory("FIL");
        assert filling_factory != null;
        Filling filling = filling_factory.getFilling("CHE");
        Log.d(DEBUG_TAG, filling.name() + " : " + filling.calories());

        AbstractFactory bread_factory = FactoryGenerator.getFactory("BRE");
        assert bread_factory != null;
        Bread bread = bread_factory .getBread("ROL");
        Log.d(DEBUG_TAG, bread.name() + " : " + bread.calories());

        // Build a customized sandwich
        SandwichBuilder builder = new SandwichBuilder();
        Sandwich custom = new Sandwich();
        // Simulate user selections
        custom = builder.build(custom, new Roll());
        custom = builder.build(custom, new Cheese());
        Log.d(DEBUG_TAG, "CUSTOMIZED");
        custom.getSandwich();
        custom.getCalories();

        // Build a ready made sandwich
        Sandwich offTheShelf = SandwichBuilder.readyMade();
        Log.d(DEBUG_TAG, "READY MADE");
        offTheShelf.getSandwich();
        offTheShelf.getCalories();

        textView.setText(new StringBuilder()
                            .append(bread.name())
                            .toString());
    }
}
