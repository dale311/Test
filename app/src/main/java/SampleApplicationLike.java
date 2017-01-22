import android.app.Application;
import android.content.Intent;

import com.tencent.tinker.anno.DefaultLifeCycle;
import com.tencent.tinker.loader.app.DefaultApplicationLike;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * Created by cfl on 2017/1/22.
 */


@DefaultLifeCycle(
        application = "SampleApplication",             //application name to generate
        flags = ShareConstants.TINKER_ENABLE_ALL)
public class SampleApplicationLike extends DefaultApplicationLike {

    public SampleApplicationLike(Application application, int tinkerFlags, boolean tinkerLoadVerifyFlag, long applicationStartElapsedTime, long applicationStartMillisTime, Intent tinkerResultIntent) {
        super(application, tinkerFlags, tinkerLoadVerifyFlag, applicationStartElapsedTime, applicationStartMillisTime, tinkerResultIntent);
    }
}
