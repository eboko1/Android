package ua.at.fvi.svetofor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.EditText;
import android.widget.TextView;


  public class MainActivity extends AppCompatActivity {
    private RelativeLayout mRelativeLayout;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRelativeLayout=(RelativeLayout)findViewById(R.id.relativeLayout);
        mInfoTextView=(TextView)findViewById(R.id.textView);
    }
    public void onRedButtonClick (View view){
        mInfoTextView.setText(R.string.red);
        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.redColor));
    }
    public void onYellowButtonClick (View view){
        mInfoTextView.setText(R.string.yellow);
        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.yellowColor));
    }

    public void onGreenButtonClick (View view){
        mInfoTextView.setText(R.string.green);
        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.greenColor));
    }
      public void onBlueButtonClick (View view){
          mInfoTextView.setText(R.string.blue);
          mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.blueColor));
      }

      public void onPinkButtonClick (View view){
          mInfoTextView.setText(R.string.pink);
          mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.pinkColor));
      }
  }


