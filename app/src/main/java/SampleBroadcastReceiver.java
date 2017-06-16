/**
 * Created by Marika on 2017/06/15.
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
public class SampleBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context arg0, Intent arg1) {
        // TODO Auto-generated method stub

        Toast.makeText(arg0, "receive Intent", Toast.LENGTH_SHORT).show();
    }

}
