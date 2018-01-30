package aliesaassadi.popupmvp.base;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.LayoutRes;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;

import butterknife.ButterKnife;

/**
 * Created by Ali Esa Assadi on 22/10/2017.
 */
public abstract class BasePopup<Presenter extends BasePopupPresenter> extends PopupWindow {
    private final int mLayoutRes;
    protected final View mGeneralView;
    protected Presenter mPresenter;

    protected abstract @LayoutRes
    int inflateLayout();
    protected abstract Presenter createPresenter();
    protected abstract void onDismiss();

    protected BasePopup(Context context) {
        super(context);
        mPresenter = createPresenter();
        mLayoutRes = inflateLayout();
        mGeneralView = LayoutInflater.from(context).inflate(mLayoutRes, null);
        setContentView(mGeneralView);
        ButterKnife.bind(this,mGeneralView);

        initPopupParams();
    }

    private void initPopupParams() {
        setOutsideTouchable(true);
        setFocusable(true);
        setBackgroundDrawable(new BitmapDrawable());
        setAnimationStyle(android.R.style.Animation_Dialog);
    }

    @Override
    public void dismiss() {
        super.dismiss();
        onDismiss();
    }


}
