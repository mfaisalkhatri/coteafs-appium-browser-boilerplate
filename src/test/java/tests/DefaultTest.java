package tests;

import com.github.wasiqb.coteafs.appium.android.AndroidDevice;
import com.github.wasiqb.coteafs.appium.service.AppiumServer;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class DefaultTest {
    protected AndroidDevice androidDevice;
    private AppiumServer androidServer;

    /**
     * @param server
     * @param device
     *
     * @author wasiq.bhamla
     * @since 13-Apr-2017 10:10:45 PM
     */
    @Parameters({ "server", "device" })
    @BeforeTest(alwaysRun = true)
    public void setupTest (final String server, final String device) {
        this.androidServer = new AppiumServer (server);
        this.androidServer.start ();

        this.androidDevice = new AndroidDevice (this.androidServer, device);
        this.androidDevice.start ();
    }

    /**
     * @author wasiq.bhamla
     * @since 17-Apr-2017 3:47:41 PM
     */
    @AfterTest(alwaysRun = true)
    public void tearDownTest () {

        this.androidDevice.stop ();
        this.androidServer.stop ();
    }
}