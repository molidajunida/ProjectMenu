package id.ac.poliban.dts.molida.projectmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater Inflater =
                getMenuInflater();
        Inflater.inflate(R.menu.optionmenu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() ==R.id.menu1 ){
            startActivity(new Intent(this, Menu1.class));
            Toast.makeText(this, "menu 1 clicked", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() ==R.id.menu2 ){
            startActivity(new Intent(this, Menu2.class));
            Toast.makeText(this, "Menu 2 clicked", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() ==R.id.menu3 ){
            startActivity(new Intent(this, Menu3.class));
            Toast.makeText(this, "Menu 3 Clicked", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}
