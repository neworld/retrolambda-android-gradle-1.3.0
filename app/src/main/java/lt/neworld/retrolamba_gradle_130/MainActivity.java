package lt.neworld.retrolamba_gradle_130;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        runOnUiThread(() -> ((TextView) findViewById(R.id.text)).setText("Lambda is working"));
    }
}
