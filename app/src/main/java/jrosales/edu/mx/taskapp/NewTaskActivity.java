package jrosales.edu.mx.taskapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import colvera.edu.mx.taskapp.R;

public class NewTaskActivity extends AppCompatActivity {
    private Spinner spnPriorities, spnStatus;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_task);

        btnSave = findViewById(R.id.btn_save);
        spnPriorities = findViewById(R.id.spn_priorities);
        spnStatus = findViewById(R.id.spn_status);

        ArrayAdapter<CharSequence> arrayPriority = ArrayAdapter.createFromResource(this,
                R.array.cmbPriorities, android.R.layout.simple_dropdown_item_1line);
        spnPriorities.setAdapter(arrayPriority);

        ArrayAdapter<CharSequence> arrayStatus = ArrayAdapter.createFromResource(this,
                R.array.cmbStatus, android.R.layout.simple_dropdown_item_1line);
        spnStatus.setAdapter(arrayStatus);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Saved!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
