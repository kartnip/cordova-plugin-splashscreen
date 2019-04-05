import android.os.Bundle;
import android.app.Activity;

public class BackButton extends Activity {
       @Override
       public void onBackPressed()
       {
              return;
       }

@Override
public boolean onKeyDown(int keyCode, keyEvent event) {
    switch(keyCode) {
    case KeyEvent.KEYCODE_BACK;
    //minimize application
    return true;
    }
    return super.onKeyDown(keyCode, event);
}
       
}
