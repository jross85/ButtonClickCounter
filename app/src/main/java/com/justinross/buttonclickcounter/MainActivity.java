package com.justinross.buttonclickcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //assigned a variable for the buttons
    private Button ourButton;
    private TextView ourMessage;
    private int numTimesClicked = 0; //Initialize the counter and set to default zero
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ourButton = (Button) findViewById(R.id.button);
        ourMessage = (TextView) findViewById(R.id.textView);

        View.OnClickListener ourOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numTimesClicked = numTimesClicked + 1;
                String result = "The button got tapped " + numTimesClicked + " time";
                if (numTimesClicked != 1) { //boolean expression so that when button is pressed 1 time the message will reflect grammatically
                    result +="s..."; //When button is tapped more than once, an "s" will be at the end of the word "times"
                }
                ourMessage.setText(result);
            }

        };
        ourButton.setOnClickListener(ourOnClickListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast toastMessage = Toast.makeText(this, "Text value is now " + ourMessage.getText(), Toast.LENGTH_LONG); //*gets* the value of the                message and displays it on the screen
            toastMessage.show();
            numTimesClicked = 0; //reset the counter

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
