package informate.com.odm_sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.informate.odm.sdk.Informate;
import com.informate.odm.sdk.utils.Utility;

public class MainActivity extends AppCompatActivity {

    TextView txtODMStatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtODMStatus = (TextView) findViewById(R.id.odm_status);

        /*
        * ** To enable ODM please call below line
        * make sure you set parameters properly */
        Informate.enableODM(this,  //Context
                Utility.getAndroidId(this),  // Device uniquer number i.e. IMEI/Android ID etc.
                "REG-007", //   App Registration ID
                "India");   // users country

    }

    @Override
    protected void onResume() {
        super.onResume();
        /*
        * Below method is responsible to check APP_USAGE permitted or not,
        * and ask to provide permission if not give*/
        /*
        * Withought this line ODM unable to captures application usage and data usage
        * */
        Informate.checkAppUsagePermission(this,MainActivity.class);
    }
}
