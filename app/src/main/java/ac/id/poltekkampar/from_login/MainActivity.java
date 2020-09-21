package ac.id.poltekkampar.from_login;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView M_Nama, M_Sandi;
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        M_Nama = findViewById(R.id.M_Nama);
        M_Sandi = findViewById(R.id.M_Sandi);
        Login = findViewById(R.id.login);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String UsernameKey = M_Nama.getText().toString();
                String PasswordKey = M_Sandi.getText().toString();

                if (UsernameKey.equals("admin") && PasswordKey.equals("admin")) {
                    // Jika Login Berhasil
                    Toast.makeText(getApplicationContext(), "LOGIN SUKSES",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
                    MainActivity.this.startActivity(intent);
                    finish();
                } else {
                    // Jika Login Tidak Berhasil
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Username dan Password Anda Salah!!!").setNegativeButton("Retry", null).create().show();
                }
            }
        });
    }
}