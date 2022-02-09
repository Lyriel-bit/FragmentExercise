package it.univaq.fragmentexercise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.DisplayMetrics;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        DisplayMetrics display = this.getResources().getDisplayMetrics();
        int width = display.widthPixels;
        int heigth = display.heightPixels;

        //FragmentManager fragmentManager = getSupportFragmentManager();


        if(width > heigth)
        {
            getSupportFragmentManager().beginTransaction().setReorderingAllowed(true)
                    .replace(R.id.fragment_container_view,Fragment1.class,null).commit();
        }
        else
        {
            getSupportFragmentManager().beginTransaction().setReorderingAllowed(true)
                    .replace(R.id.fragment_container_view,Fragment2.class,null).commit();
        }

    }
}