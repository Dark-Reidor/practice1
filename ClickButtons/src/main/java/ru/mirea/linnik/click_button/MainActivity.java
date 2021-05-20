package ru.mirea.linnik.click_button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvOut;
    private Button ButtonOk;
    private Button ButtonCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Найдём view элементы
        tvOut = (TextView) findViewById(R.id.tvOut);
        ButtonOk = (Button) findViewById(R.id.btnOk);
        ButtonCancel = (Button) findViewById(R.id.btnCancel);

        View.OnClickListener oclbtnOk =new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Нажата кнопка ОК");
            }
        };

        View.OnClickListener oclbtnCancel =new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Нажата кнопка Cancel");
            }
        };

        //присвоим обработчик кнопке OK(BtnOk)
        ButtonOk.setOnClickListener(oclbtnOk);
        //присвоим обработчик кнопке Cancel(BtnCancel)
        ButtonCancel.setOnClickListener(oclbtnCancel);



    }


}