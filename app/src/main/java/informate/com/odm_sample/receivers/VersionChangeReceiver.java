package informate.com.odm_sample.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.informate.odm.sdk.Informate;
import com.informate.odm.sdk.utils.Utility;

public class VersionChangeReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Informate.enableODM(context,  //Context
                Utility.getAndroidId(context),  // Device uniquer number i.e. IMEI/Android ID etc.
                "REG-007", //   App Registration ID
                "India");   // users country

    }
}
