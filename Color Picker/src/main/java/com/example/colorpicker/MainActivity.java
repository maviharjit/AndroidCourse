package com.example.colorpicker;

import android.app.AppComponentFactory;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import yuku.ambilwarna.AmbilWarnaDialog;

public class MainActivity extends AppCompatActivity {

    RelativeLayout myLayoutColor;
    private int currentColor;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myLayoutColor = findViewById(R.id.myLayout);
    }

    public void btnSelectColor(View view) {

        openDialog(false);

    }

    private void openDialog(boolean supportAlpha) {
        AmbilWarnaDialog dialog = new AmbilWarnaDialog(this, currentColor, supportAlpha, new AmbilWarnaDialog.OnAmbilWarnaListener() {
            @Override
            public void onCancel(AmbilWarnaDialog dialog) {

            }

            @Override
            public void onOk(AmbilWarnaDialog dialog, int color) {

                currentColor = color;
                myLayoutColor.setBackgroundColor(color);

                Window win = getWindow();
                win.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    win.setStatusBarColor(color);
                }
            }
        });
        dialog.show();
    }
}
