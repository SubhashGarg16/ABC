package subhash.app;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class LostActivity extends AppCompatActivity {

    private static final String TAG="LostActivty";
    private EditText editText_Date;
    TextView textView_date;
    private DatePickerDialog.OnDateSetListener datePickerDialog;
    Spinner spinner_breed, spinner_age1, spinner_age2;
    ArrayAdapter arrayAdapter, arrayAdapter2, arrayAdapter3;
    TextView textView_breed;
    String Breed[]={"Please Select One","Husky","Labrador","German Shaphered","Golden Retriver","Silver Retreaver","beagle","Malamute"};
    RadioGroup radioGroup, radioGroup2;
    RadioButton radioButton,radioButton2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lost);

        textView_date=(TextView)findViewById(R.id.text_view_date);
        editText_Date= (EditText) findViewById(R.id.date_et);
        textView_date.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {

                Calendar calendar=Calendar.getInstance();
                int year=calendar.get(Calendar.YEAR);
                int month=calendar.get(Calendar.MONTH);
                int day=calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog pickerDialog=new DatePickerDialog(LostActivity.this,R.style.Theme_MaterialComponents_DayNight_Dialog, datePickerDialog,year,month,day);
                pickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.WHITE));
                pickerDialog.show();

            }
        });

        datePickerDialog=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                Log.d(TAG, "onDateSet: dd/mm/yy: " +"/"+ dayOfMonth +"/"+ month +"/"+ year);
                month=month+1;
                String date=dayOfMonth +"/"+month+"/"+year;
                editText_Date.setText(date);

            }
        };

        spinner_breed=(Spinner)findViewById(R.id.Breed_spinner);
        textView_breed=(TextView)findViewById(R.id.text_view2);
        spinner_age1=(Spinner)findViewById(R.id.Age_spinner1);
        spinner_age2=(Spinner)findViewById(R.id.Age_spinner2);



        arrayAdapter=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item);
        arrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner_breed.setAdapter(arrayAdapter);

        arrayAdapter2=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item);
        arrayAdapter2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner_age1.setAdapter(arrayAdapter2);

        arrayAdapter3=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item);
        arrayAdapter3.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner_age2.setAdapter(arrayAdapter3);




    }


}