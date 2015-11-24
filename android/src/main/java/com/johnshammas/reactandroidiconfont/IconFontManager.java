package com.johnshammas.reactnativeandroidiconfont;

import android.graphics.Typeface;
import android.util.Log;

import com.facebook.react.uimanager.ReactProp;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.text.ReactTextView;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nullable;

public class IconFontManager extends SimpleViewManager<ReactTextView> {

    private static final String TAG = "ReactNativeAndroidIconFont";

    private static Typeface sTypefaceCache = null;

    public static final String REACT_CLASS = "IconAndroid";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public ReactTextView createViewInstance(ThemedReactContext context) {
        ReactTextView textView = new ReactTextView(context);

        Typeface typeface = null;
        if (sTypefaceCache == null) {
            try {
                typeface = Typeface.createFromAsset(context.getAssets(), "icon-font.ttf");
            } catch (Exception ex) {
                Log.e(TAG, "Icon file not found.");
            }
        } else {
            typeface = sTypefaceCache;
        }
        if (typeface != null) {
            textView.setTypeface(typeface);
        }

        return textView;
    }

}
