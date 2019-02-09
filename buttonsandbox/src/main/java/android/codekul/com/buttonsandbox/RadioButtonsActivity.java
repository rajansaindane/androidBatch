package android.codekul.com.buttonsandbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class RadioButtonsActivity extends AppCompatActivity {

   private RadioButton radioMale,radioFemale,radioOthers;
   private TextView  textView;
   Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_buttons);

        radioMale=findViewById(R.id.radioMen);
        radioFemale=findViewById(R.id.radioFemale);
        radioOthers=findViewById(R.id.radioOther);
        textView=findViewById(R.id.textView);
        button=findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioMale.isChecked())
                {
                    textView.setText(radioMale.getText());
                }
                else if(radioFemale.isChecked())
                {
                    textView.setText(radioFemale.getText());

                }
                else
                {
                    textView.setText(radioOthers.getText());

                }
            }
        });


    }
}
