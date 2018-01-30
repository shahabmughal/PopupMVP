package aliesaassadi.popupmvp.popup.PopupHelloWorld.presenter;

import android.view.View;

import aliesaassadi.popupmvp.base.BasePopupPresenter;

/**
 * Created by Ali Esa Assadi on 30/01/2018.
 */
public class PopupHelloWorldPresenter extends BasePopupPresenter {

    private final PopupHelloWorldView mView;

    public PopupHelloWorldPresenter(PopupHelloWorldView view) {
        mView = view;
    }

    public void onOkClicked(View v) {
        mView.showOkToast(v);
    }

    public void onCancelClicked(View v) {
        mView.showCancelToast(v);
    }
}
