package project.users.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import project.users.app.databinding.ActivityRegistrationCompletdBinding;

public class RegistrationCompletdActivity extends AppCompatActivity {
    private ActivityRegistrationCompletdBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegistrationCompletdBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String type = getIntent().getStringExtra("type");

        binding.forLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (type.equals("staff")){
                    Intent i = new Intent(RegistrationCompletdActivity.this,StaffLoginActivity.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(i);
                    finish();
                }
                if (type.equals("user")){
                    Intent i = new Intent(RegistrationCompletdActivity.this,LoginActivity.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(i);
                    finish();
                }
            }
        });
    }
}