package com.example.user.mymath;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Feedback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

    }

    public void send_click(View v)
    {
        EditText nama = (EditText) findViewById(R.id.Nama);
        EditText email = (EditText) findViewById(R.id.Email);
        EditText subject = (EditText) findViewById(R.id.Subject);
        EditText pesan = (EditText) findViewById(R.id.Pesan);
//        Button sendemail = (Button) findViewById(R.id.SendEmail);

        if (nama.getText().toString().equals(""))
            nama.setError("Mandatory feild");
        else if (email.getText().toString().equals(""))
            email.setError("Mandatory feild");
        else if (subject.getText().toString().equals(""))
            subject.setError("Mandatory feild");
        else if (pesan.getText().toString().equals(""))
            pesan.setError("Mandatory feild");

        else {
            Intent i = new Intent(Intent.ACTION_SENDTO);
            i.setData(Uri.parse("mailto:"));
            i.putExtra(Intent.EXTRA_EMAIL, new String[]{"nathenathe4@gmail.com"});
            i.putExtra(Intent.EXTRA_SUBJECT, subject.getText().toString());
            i.putExtra(Intent.EXTRA_TEXT, "Dear admin,\n"
                    + pesan.getText().toString() + "\n regards,"
                    + nama.getText().toString());

            try {
                startActivity(Intent.createChooser(i, "send mail"));
            } catch (android.content.ActivityNotFoundException ex)
            {
                Toast.makeText(this, "no mail app found", Toast.LENGTH_SHORT).show();

        }catch (Exception ex)
            {
                Toast.makeText(this, "unexpected error" + ex.toString(), Toast.LENGTH_SHORT).show();
            }
        }
    }
}