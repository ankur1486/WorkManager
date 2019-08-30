package ocean9.com.workmanager;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;

import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class HomeWidgetApi extends Worker {

    private static final String TAG = HomeWidgetApi.class.getSimpleName();
//    private static List<NewsItems> listItemList = new ArrayList<>();
    private int appWidgetId = AppWidgetManager.INVALID_APPWIDGET_ID;


    public HomeWidgetApi(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Worker.Result doWork() {

        System.out.println("Etsting doWork fetch start . .. . .  . .. . . .");

        try {

            // dummy ntifivation hub url

            // If there were no errors, return SUCCESS
            return Worker.Result.SUCCESS;
        } catch (Throwable throwable) {

            // Technically WorkManager will return Worker.Result.FAILURE
            // but it's best to be explicit about it.
            // Thus if there were errors, we're return FAILURE
            Log.e(TAG, "Error applying blur", throwable);
            return Worker.Result.FAILURE;
        }
    }
}
