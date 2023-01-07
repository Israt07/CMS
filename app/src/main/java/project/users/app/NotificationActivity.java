package project.users.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import project.users.app.databinding.ActivityNotificationBinding;

public class NotificationActivity extends AppCompatActivity {
    private ActivityNotificationBinding binding;
    private String[] head = {"Water Distruption","Electric Distruption","Overdue Maintenance","Parcel Collect"};
    private String[] sub = {"Water Distruption On___","Electric Distruption On___",
            "Overdue Maintenance On___","Parcel Collect On_"};
    private int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNotificationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.txtHead.setText(head[counter]);
        binding.txtSub.setText(sub[counter]);

        binding.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        binding.leftArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                if (counter < 0) counter = head.length - 1;
                binding.txtHead.setText(head[counter]);
                binding.txtSub.setText(sub[counter]);
            }
        });

        binding.rightArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                if (counter == head.length) counter = 0;
                binding.txtHead.setText(head[counter]);
                binding.txtSub.setText(sub[counter]);

            }
        });
    }
}