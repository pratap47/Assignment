package test.com.assign_1;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;


public class AutoFitEditTextUtil {


    public static void setNormalization(final Activity a, View rootView, final AutoFitEditText aText) {


        if (!(rootView instanceof AutoFitEditText)) {

            rootView.setOnTouchListener(new View.OnTouchListener() {

                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    hideSoftKeyboard(a);
                    if (aText.get_minTextSize() != null && aText.getTextSize() < aText.get_minTextSize()) {

                        aText.setText(aText.getText().toString().replace("\n", ""));


                    }
                    return false;
                }
            });
        }


        if (rootView instanceof ViewGroup) {
            for (int i = 0; i < ((ViewGroup) rootView).getChildCount(); i++) {
                View innerView = ((ViewGroup) rootView).getChildAt(i);
                setNormalization(a, innerView, aText);
            }
        }
    }

    public static void hideSoftKeyboard(Activity a) {
        InputMethodManager inputMethodManager = (InputMethodManager) a
                .getSystemService(Activity.INPUT_METHOD_SERVICE);
        if (a.getCurrentFocus() != null
                && a.getCurrentFocus().getWindowToken() != null)
            inputMethodManager.hideSoftInputFromWindow(a.getCurrentFocus().getWindowToken(), 0);
    }
}
