package chaitanya.im.projectzero;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import chaitanya.im.projectzero.Utils.MakeSnackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt = (TextView) findViewById(R.id.smiley);
        Typeface font = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
        txt.setTypeface(font);
    }

    public void buttonClicked(View view) {
        Button b = (Button) view;
        String buttonText = "This button will launch my " + b.getText().toString() + " app";
        View coordinatorLayout = findViewById(R.id.coordinatorLayout1);
        MakeSnackbar.show(this, buttonText, coordinatorLayout);
    }
}
