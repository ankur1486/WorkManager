package ocean9.com.workmanager;

public class HomeWidgetConfigManager {

    private static HomeWidgetConfigManager sInstance;

    private HomeWidgetConfigManager() {

    }

    public static synchronized HomeWidgetConfigManager getInstance() {
        if (sInstance == null)
            sInstance = new HomeWidgetConfigManager();
        return sInstance;
    }


}