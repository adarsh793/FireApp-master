package codeitstudio.fireapp.com.fireapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button myButton;
    private EditText myEditText;
    private TextView mytextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //How many Inches in a meters ad vice-versa?
        //1m = 39.3701 Inches.
        mytextView = (TextView) findViewById(R.id.txtView);
        myButton = (Button) findViewById(R.id.btn);//declared the button
        myEditText = (EditText) findViewById(R.id.entertext);//declared the editText.
        //event handler || action listener. setting the action to the button.

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(myEditText.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Please Enter Something!",Toast.LENGTH_SHORT).show();
                }else

                    {
                    double meter_value = Double.parseDouble(myEditText.getText().toString());
                    double inches_value_result = meter_value * 39.3701;
                    mytextView.setText(String.format("%2f",inches_value_result)+"Inches");
                }
            }
        });




    }
}
