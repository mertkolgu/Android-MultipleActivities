package tr.com.mertkolgu.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String userName;
    EditText editTextName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = "";
        editTextName = findViewById(R.id.editTextName);
    }

    public void changeActivity(View view) {
        userName = editTextName.getText().toString();
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("userInput", userName);
        startActivity(intent);
    }
}
