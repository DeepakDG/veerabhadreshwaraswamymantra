package com.arka.veerabhadraswamymantra;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.arka.veerabhadraswamymantra.databinding.ActivityMainBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    ListView simpleList;
    ArrayList<Item> listArray =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_listviewexampleactivity);

        setSupportActionBar(findViewById(R.id.my_toolbar));
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        simpleList = (ListView) findViewById(R.id.listview);
        listArray.add(new Item("ಶ್ರೀ ವೀರಭದ್ರೇಶ್ವರ ಸುಪ್ರಭಾತ"));
        listArray.add(new Item("ಶ್ರೀ ವೀರಭದ್ರೇಶ್ವರ ಕವಚಂ"));
        listArray.add(new Item("ಶ್ರೀ ವೀರಭದ್ರೇಶ್ವರ ದಂಡಕಂ"));
        listArray.add(new Item("ಶ್ರೀ ವೀರಭದ್ರೇಶ್ವರ ತಾರಾವಳಿ"));
        listArray.add(new Item("ಶ್ರೀ ವೀರಭದ್ರಾಷ್ಟಕಂ"));
        listArray.add(new Item("ಶ್ರೀ ಭದ್ರ ಕವಚಂ"));
        listArray.add(new Item("ಶ್ರೀ ವೀರಭದ್ರೇಶ್ವರ ಸಹಸ್ರನಾಮಸ್ತೋತ್ರ"));
        listArray.add(new Item("ಶಶ್ರೀ ವೀರಭದ್ರೇಶ್ವರ ಸಹಸ್ರನಾಮವಳಿ"));
        listArray.add(new Item("ಶಶ್ರೀ ವೀರಭದ್ರೇಶ್ವರ ಅಷ್ಟೋತ್ತರ ಶತನಾಮಾವಳಿ ಸ್ತೋತ್ರo"));
        listArray.add(new Item("ಶ್ರೀ ವೀರಭದ್ರೇಶ್ವರ ಅಷ್ಟೋತ್ತರ ಶತನಾಮಾವಳಿ"));
        listArray.add(new Item("ಶ್ರೀ ವೀರಭದ್ರೇಶ್ವರ ವಡಪುಗಳು"));
        listArray.add(new Item("ಗುಗ್ಗುಳದ ಬಗ್ಗೆ ಮಾಹಿತಿ"));
        listArray.add(new Item("ಶ್ರೀ ವೀರಭದ್ರೇಶ್ವರ ಸಂಕ್ಷಿಪ್ತ ಪರಿಚಯ್ರ"));
        listArray.add(new Item("ಶ್ರೀ ವೀರಭದ್ರೇಶ್ವರ ಆಚರಣೆಗಳು"));
        listArray.add(new Item("ಶ್ರೀ ವೀರಭದ್ರೇಶ್ವರ ಪ್ರಾರ್ಥನೆ"));
        listArray.add(new Item("ಶ್ರೀ ವೀರಭದ್ರೇಶ್ವರ ಮಂಗಳ ಶ್ಲೋಕ"));
        listArray.add(new Item("ಶ್ರೀ ವೀರಭದ್ರೇಶ್ವರ ಶತಕ"));
        listArray.add(new Item("ಶ್ರೀ ವೀರಭದ್ರೇಶ್ವರ ಮಂಗಳ"));
        listArray.add(new Item("ದ್ವಾತ್ರಿಂಶದ್ಭುಜ ಶ್ರೀ ವೀರಭದ್ರ ಧ್ಯಾನಂ"));
        listArray.add(new Item("ಶ್ರೀ ಶರಭ ಹೃದಯ ಸ್ತೋತ್ರ"));
        listArray.add(new Item("ಶ್ರೀ ಶರಭೋಪನಿಷತ್ತು"));

        PrefManager myAdapter=new PrefManager(this,R.layout.custom_list_view, listArray);
        simpleList.setAdapter(myAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}