package cc.snser.securityentrance;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Snser on 2017/2/26.
 */

public class SecurityCodeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e("Snser", "SecurityCodeReceiver onReceive!!!!!!!!!!!!!!");
        final Intent intentStart = new Intent(context, MainActivity.class);
        intentStart.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        //context.startActivity(intentStart);
    }
}
