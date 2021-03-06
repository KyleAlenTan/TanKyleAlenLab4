package kylealen.tan.com.tankylealenlab4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button toastBtn = (Button) findViewById(R.id.toastBtn);
        Button snackbarBtn = (Button) findViewById(R.id.snackbarBtn);

        toastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "BACK";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            }
        });

        snackbarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = findViewById(R.id.main_layout_id);
                String message = "NEXT";
                int duration = Snackbar.LENGTH_SHORT;
                showSnackbar(view, message, duration);
            }
        });

    }

    public void showSnackbar(View view, String message, int duration){
        Snackbar.make(view,message,duration).show();
    }


}
