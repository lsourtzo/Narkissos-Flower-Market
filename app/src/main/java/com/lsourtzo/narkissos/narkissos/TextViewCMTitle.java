package com.lsourtzo.narkissos.narkissos;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class TextViewCMTitle extends TextView {
    public TextViewCMTitle(Context context) {
        super(context);
        setFont();
    }
    public TextViewCMTitle(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont();
    }
    public TextViewCMTitle(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setFont();
    }

    private void setFont() {
        Typeface font = Typeface.createFromAsset(getContext().getAssets(), "fonts/AC-Graduate.ttf");
        setTypeface(font, Typeface.NORMAL);
    }
}
