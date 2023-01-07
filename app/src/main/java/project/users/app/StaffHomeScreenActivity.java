package project.users.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import project.users.app.databinding.ActivityStaffHomeScreenBinding;

public class StaffHomeScreenActivity extends AppCompatActivity {
    ActivityStaffHomeScreenBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStaffHomeScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        //binding.btnNotification.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View view) {
               // Intent i = new Intent(StaffHomeScreenActivity.this,StaffNotificationActivity.class);
                //startActivity(i);
            //}
       // });
    }
}