package th.ac.su.ict.chamavee.homework2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvOutput = findViewById(R.id.tvOutput);


    }
    public void  btnGrayClick(View View) {
        tvOutput.setBackgroundColor(Color.parseColor("#EBE1DD"));
        {
            tvOutput.setText("235-225-221");
        }
    }
    public void  btnPinkClick(View View) {
        tvOutput.setBackgroundColor(Color.parseColor("#ECCBCA"));
        {
            tvOutput.setText("236-203-202");
        }
    }
    public void  btnBlue1Click(View View) {
        tvOutput.setBackgroundColor(Color.parseColor("#74839C"));
        {
            tvOutput.setText("116-131-156");
        }
    }
    public void  btnBlue2Click(View View) {
        tvOutput.setBackgroundColor(Color.parseColor("#99A9BF"));
        {
            tvOutput.setText("153-169-191");
        }
    }
    public void  btnFah1Click(View View) {
        tvOutput.setBackgroundColor(Color.parseColor("#C2CCD5"));
        {
            tvOutput.setText("195-204-216");
        }
    }
    public void  btnFah2Click(View View) {
        tvOutput.setBackgroundColor(Color.parseColor("#DDE2E5"));
        {
            tvOutput.setText("221-226-269");
        }
    }

}
