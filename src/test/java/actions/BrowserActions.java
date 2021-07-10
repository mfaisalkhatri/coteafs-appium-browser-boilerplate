package actions;

import activity.BrowserActivity;
import com.github.wasiqb.coteafs.appium.android.AndroidActivityActions;
import com.github.wasiqb.coteafs.appium.android.AndroidDevice;

public class BrowserActions extends AndroidActivityActions {


    public BrowserActions(AndroidDevice device) {
        super(device);
    }

    @Override
    public void perform() {
        BrowserActivity bb = new BrowserActivity(getDevice());
        bb.onDevice().navigateTo("https://www.google.co.in");
        bb.onElement("Search").enterText("Apple iphone X");
        bb.onElement("Submit").click();

    }
}
