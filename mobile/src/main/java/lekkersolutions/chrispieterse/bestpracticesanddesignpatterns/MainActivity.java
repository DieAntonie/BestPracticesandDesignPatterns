package lekkersolutions.chrispieterse.bestpracticesanddesignpatterns;

import android.support.v7.app.AppCompatActivity;
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
        Filling filling = filling_factory.getFilling("CHE");
        Log.d(DEBUG_TAG, filling.name() + " : " + filling.calories());

        AbstractFactory bread_factory = FactoryGenerator.getFactory("BRE");
        Bread bread = bread_factory .getBread("ROL");
        Log.d(DEBUG_TAG, bread.name() + " : " + bread.calories());

        textView.setText(new StringBuilder()
                            .append(bread.name())
                            .toString());
    }
}
