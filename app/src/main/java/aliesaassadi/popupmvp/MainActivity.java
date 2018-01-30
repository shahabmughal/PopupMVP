package aliesaassadi.popupmvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

import aliesaassadi.popupmvp.popup.PopupHelloWorld.view.PopupHelloWorld;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private PopupHelloWorld mPopupHelloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this, this);
        mPopupHelloWorld = new PopupHelloWorld(this);
    }

    @OnClick(R.id.btnShowPopup)
    void showHelloWorldPopup(View v) {
        mPopupHelloWorld.showAtLocation(v,Gravity.CENTER,0,0);
    }
}
