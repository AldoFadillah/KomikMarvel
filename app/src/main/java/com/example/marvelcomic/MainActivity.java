package com.example.marvelcomic;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TextView txt_id, txt_username, txt_name;
    String id, username, name;
    SharedPreferences sharedpreferences;

    public static final String TAG_ID = "id";
    public static final String TAG_NAME = "name";
    public static final String TAG_USERNAME = "username";
    ViewFlipper viewFlipper;
    SharedPreferences pref; //Declaration SharedPreferences
    Button buttonLogout; //Declaration Button
    private String[] namakomik = {"Captain Amerika", "Ironman", "Deadpool", "Spiderman", "Ghost Rider", "Civil War", "Avengers", "Doctor Strange", "Age Of Ultron"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_name = (TextView) findViewById(R.id.txt_name);
        /*txt_username = (TextView) findViewById(R.id.txt_username);*/

        sharedpreferences = getSharedPreferences(Login.my_shared_preferences, Context.MODE_PRIVATE);

        id = getIntent().getStringExtra(TAG_ID);
        name = getIntent().getStringExtra(TAG_NAME);
        username = getIntent().getStringExtra(TAG_USERNAME);

        /*txt_id.setText("ID : " + id);*/
        txt_name.setText("Halo, " + name + "!");
        /*txt_username.setText("USERNAME : " + username);*/

        final TabLayout tabLayout = findViewById(R.id.tabs);
        final ViewPager viewPager = findViewById(R.id.pager);
        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());

        viewPager.setAdapter(pagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

        viewFlipper = (ViewFlipper) this.findViewById(R.id.v_flipper);

        viewFlipper.setFlipInterval(2500);
        viewFlipper.setAutoStart(true);

        viewFlipper.setInAnimation(this,android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this,android.R.anim.slide_out_right);

        AutoCompleteTextView autoTextView;
        autoTextView = (AutoCompleteTextView) findViewById(R.id.autotextnamecomics);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, namakomik);
        autoTextView.setThreshold(1); //will start working from first character
        autoTextView.setAdapter(adapter);
        autoTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String getName = adapter.getItem(position);

                //Berpindah Activity dan Mempassing data Nama pada Activity Selanjutnya
                Intent sendData = new Intent(MainActivity.this, DataKomik.class);
                sendData.putExtra("NamaKomik", getName);
                startActivity(sendData);
            }
        });

        buttonLogout = (Button) findViewById(R.id.buttonLogout);
        buttonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putBoolean(Login.session_status, false);
                editor.putString(TAG_ID, null);
                editor.putString(TAG_NAME, null);
                editor.putString(TAG_USERNAME, null);
                editor.commit();

                Intent intent = new Intent(MainActivity.this, Login.class);
                finish();
                startActivity(intent);
            }
        });
    }

    public void spiderman(View view) {
        startActivity(new Intent(MainActivity.this, SpidermanComics.class));
    }
    public void captainamerica(View view) {
        startActivity(new Intent(MainActivity.this, CaptainAmericaComics.class));
    }
    public void ironman(View view) {
        startActivity(new Intent(MainActivity.this, IronManComics.class));
    }

    public void deadpool(View view) {
        startActivity(new Intent(MainActivity.this, DeadpoolComics.class));
    }
    public void ghostrider(View view) {
        startActivity(new Intent(MainActivity.this, GhostRiderComics.class));
    }
    public void doctorstrange(View view) {
        startActivity(new Intent(MainActivity.this, DoctorStrangeComics.class));
    }
    public void civilwar(View view) {
        startActivity(new Intent(MainActivity.this, CivilWarComics.class));
    }
    public void avengers(View view) {
        startActivity(new Intent(MainActivity.this, AvengersComics.class));
    }
    public void ultron(View view) {
        startActivity(new Intent(MainActivity.this, UltronComics.class));
    }

    public void onBackPressed() {
        AlertDialog.Builder tombolkeluar = new AlertDialog.Builder(MainActivity.this);
        tombolkeluar.setMessage("Apakah Anda Yakin Ingin Keluar Dari Aplikasi ini ?");
        tombolkeluar.setTitle("Keluar Aplikasi");
        tombolkeluar.setIcon(R.drawable.alert);
        tombolkeluar.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.this.finish();
            }
        });
        tombolkeluar.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        tombolkeluar.setNeutralButton("Batal", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        tombolkeluar.show();
    }
}
