package activity;

import com.github.wasiqb.coteafs.appium.android.AndroidActivity;
import com.github.wasiqb.coteafs.appium.android.AndroidDevice;
import com.github.wasiqb.coteafs.appium.config.enums.WaitStrategy;
import com.github.wasiqb.coteafs.appium.device.DeviceElement;
import org.openqa.selenium.By;

public class BrowserActivity extends AndroidActivity {

    public BrowserActivity(AndroidDevice device) {
        super(device);
    }

    @Override
    protected DeviceElement prepare() {
        DeviceElement main = DeviceElement.create("Main").waitStrategy(WaitStrategy.PRESENT)
                .forAndroid(By.id("android:id/content"));

        DeviceElement search = DeviceElement.create("Search").waitStrategy(WaitStrategy.PRESENT)
                .forAndroid(By.name("q"));

        DeviceElement submit = DeviceElement.create("Submit").parent(main).waitStrategy(WaitStrategy.PRESENT)
                .forAndroid(By.name("btnK"));
        return main;
    }
}
