package me.grantland.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class AutofitParentTextView extends AutofitTextView {

    public AutofitParentTextView(Context context) {
        super(context);
    }

    public AutofitParentTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AutofitParentTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public AutofitHelper.Adapter getDefaultAdapter() {
        return new AutofitHelper.Adapter() {
            @Override
            public int getMaxWidthOfView(View view) {
                return super.getMaxWidthOfView((View) view.getParent());
            }
        };
    }
}
