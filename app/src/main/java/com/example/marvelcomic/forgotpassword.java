package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

public class forgotpassword extends AppCompatActivity {
Button btn_kodeverifotp, btn_verifotp;
EditText txt_name, txt_notlp, txt_verifotp;
int randomNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword);

        txt_name=(EditText)findViewById(R.id.txt_name);
        txt_notlp=(EditText)findViewById(R.id.txt_notlp);
        txt_verifotp=(EditText)findViewById(R.id.txt_verifotp);
        btn_kodeverifotp=(Button)findViewById(R.id.btn_kodeverifotp);
        btn_verifotp=(Button)findViewById(R.id.btn_verifotp);

        StrictMode.ThreadPolicy policy= new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        btn_kodeverifotp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    // Construct data
                    String apiKey = "apikey=" + "cV1nMMH047c-xtupOkoNJtq8rSzI6kXI5pBENfwUXh";
                    Random random= new Random();
                    randomNumber=random.nextInt(999999);
                    String message = "&message=" + "Halo" +txt_name.getText().toString()+"kodem verifikasi anda adalah"+randomNumber;
                    String sender = "&sender=" + "MarvelID";
                    String numbers = "&numbers=" + txt_notlp.getText().toString();

                    // Send data
                    HttpURLConnection conn = (HttpURLConnection) new URL("https://api.txtlocal.com/send/?").openConnection();
                    String data = apiKey + numbers + message + sender;
                    conn.setDoOutput(true);
                    conn.setRequestMethod("POST");
                    conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
                    conn.getOutputStream().write(data.getBytes("UTF-8"));
                    final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                    final StringBuffer stringBuffer = new StringBuffer();
                    String line;
                    while ((line = rd.readLine()) != null) {
                        stringBuffer.append(line);
                    }
                    rd.close();
                    Toast.makeText(getApplicationContext(),"Pengiriman kode sukses", Toast.LENGTH_LONG).show();

                    //return stringBuffer.toString();
                } catch (Exception e) {
                    //System.out.println("Error SMS "+e);
                    //return "Error "+e;
                    Toast.makeText(getApplicationContext(),"Error SMS"+e, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(),"Error "+e, Toast.LENGTH_LONG).show();
                }
            }
        });
        btn_verifotp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(randomNumber==Integer.valueOf(txt_verifotp.getText().toString())){
                    Toast.makeText(getApplicationContext(), "Berhasil Masuk", Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(getApplicationContext(), "Salah Kode", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
