package com.jious2.AccountActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.jious2.R;

public class ProfileActivity extends AppCompatActivity {

    private String receiverUserID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        receiverUserID = getIntent().getExtras().get("visit_user_id").toString();

        Toast.makeText(this,"User ID: " + receiverUserID, Toast.LENGTH_SHORT).show();
    }
}