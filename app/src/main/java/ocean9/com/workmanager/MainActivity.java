package ocean9.com.workmanager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.concurrent.TimeUnit;

import androidx.work.Constraints;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;

import ocean9.com.workmanager.R;

public class MainActivity extends AppCompatActivity {

    private Constraints myConstraints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WorkManager.getInstance().cancelAllWork();

        Constraints constraints =
                new Constraints.Builder()
                        .setRequiredNetworkType(NetworkType.CONNECTED)
                        .build();
        PeriodicWorkRequest myWorkRequest =
                new PeriodicWorkRequest.Builder(HomeWidgetApi.class, 15, TimeUnit.MINUTES)
                        .setConstraints(constraints)
                        .build();
        WorkManager.getInstance().enqueueUniquePeriodicWork("12312ds", ExistingPeriodicWorkPolicy.KEEP, myWorkRequest);

//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
//            myConstraints = new Constraints.Builder()
//                    .setRequiresCharging(true)
//                    .build();
//        }

//        PeriodicWorkRequest newsUpdateWork = new PeriodicWorkRequest.Builder(
//                HomeWidgetApi.class, 2, TimeUnit.MINUTES).addTag("newsapiwork").build();
//        WorkManager.getInstance().enqueue(newsUpdateWork);

    }
}
