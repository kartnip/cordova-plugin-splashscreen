package org.apache.cordova.splashscreen;

import android.os.Bundle;
import android.app.Activity;

public class BackButton extends Activity {
       @Override
       public void onBackPressed()
       {
       }

       @Override
       public boolean onKeyDown(int keyCode, KeyEvent event) 
       {
           return (keyCode == KeyEvent.KEYCODE_BACK ? true : super.onKeyDown(keyCode, event));
       }
}
