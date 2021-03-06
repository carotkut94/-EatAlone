package com.death.eatalone;

/**
 * Created by rajora_sd on 4/7/2017.
 */


import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
/**
 * Created by deathcode on 11/03/17.
 */

public class CustomFontTextView extends android.support.v7.widget.AppCompatTextView {

    public CustomFontTextView(Context context) {
        super(context);

        applyCustomFont(context);
    }

    public CustomFontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        applyCustomFont(context);
    }

    public CustomFontTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        applyCustomFont(context);
    }

    private void applyCustomFont(Context context) {
        Typeface customFont = CacheFont.getTypeface("FunSized.ttf", context);
        setTypeface(customFont);
    }
}