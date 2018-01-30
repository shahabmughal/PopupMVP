package aliesaassadi.popupmvp.popup.PopupHelloWorld.view;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import aliesaassadi.popupmvp.R;
import aliesaassadi.popupmvp.base.BasePopup;
import aliesaassadi.popupmvp.popup.PopupHelloWorld.presenter.PopupHelloWorldPresenter;
import aliesaassadi.popupmvp.popup.PopupHelloWorld.presenter.PopupHelloWorldView;
import butterknife.BindView;

/**
 * Created by Ali Esa Assadi on 30/01/2018.
 */
public class PopupHelloWorld extends BasePopup<PopupHelloWorldPresenter> implements PopupHelloWorldView, View.OnClickListener {

    @BindView(R.id.ok) Button mOk;
    @BindView(R.id.cancel) Button mCancel;

    public PopupHelloWorld(Context context) {
        super(context);
        mOk.setOnClickListener(this);
        mCancel.setOnClickListener(this);
    }

    @Override
    protected int inflateLayout() {
        return R.layout.popup_hello_world;
    }

    @Override
    protected PopupHelloWorldPresenter createPresenter() {
        return new PopupHelloWorldPresenter(this);
    }

    @Override
    protected void onDismiss() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ok:
                mPresenter.onOkClicked(view);
                break;
            case R.id.cancel:
                mPresenter.onCancelClicked(view);
                break;
        }
    }

    @Override
    public void showOkToast(View v) {
        Toast.makeText(v.getContext(), "OK", Toast.LENGTH_SHORT).show();
        dismiss();
    }

    @Override
    public void showCancelToast(View v) {
        Toast.makeText(v.getContext() , "Cancel", Toast.LENGTH_SHORT).show();
        dismiss();
    }

}
