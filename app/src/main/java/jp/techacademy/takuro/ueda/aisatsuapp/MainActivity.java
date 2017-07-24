package jp.techacademy.takuro.ueda.aisatsuapp;

import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView mTextView;
    EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        mTextView = (TextView) findViewById(R.id.textView);
        mEditText = (EditText) findViewById(R.id.editText);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button1) {
            mTextView.setText(mEditText.getText().toString());
        } else if (v.getId() == R.id.button2) {
            showTimePickerDialog();
        }
    }

    private void showTimePickerDialog() {
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        Log.d("UI-PARTS", String.valueOf(hourOfDay) + ":" + String.valueOf(minute));
                    }
                },
                13, // 初期値（時間）
                0,  // 初期値（分）
                true);
        timePickerDialog.show();

        if (hourOfDay >= 2; hourOfDay < 10 && minute >= 0; minute <= 59){
            System.out.println("「おはよう」");
        else if (hourOfDay >= 10; hourOfDay < 18 && minute >= 0; minute <= 59){
            System.out.println("「こんにちは」");
            }
        else if (hourOfDay >= 18; hourOfDay < 2 && minute >= 0; minute <= 59){
            System.out.println("「こんばんは」");

        }
    }
}