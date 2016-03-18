package com.wuminmin.learncreatgrid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private GridLayout gridLayout;
    private Button b1,b2,b3,b4,b5;
    private int n = 0;
    private LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gridLayout = new GridLayout(this);
        gridLayout.setLayoutParams(new
                GridLayout.LayoutParams(GridLayout.spec(5), GridLayout.spec(4)));


        linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setLayoutParams(new LinearLayout
                .LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));

        LinearLayout.LayoutParams llparams = new LinearLayout
                .LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,0);
        llparams.weight = 1.0f;

        LinearLayout.LayoutParams buttonsParams = new LinearLayout
                .LayoutParams(0, ViewGroup.LayoutParams.MATCH_PARENT);
        buttonsParams.weight = 1.0f;

//        LinearLayout.LayoutParams params = new LinearLayout
//                .LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
//        params.weight = 1.0f;
//        WindowManager windowManager = this.getWindowManager();
//        int width = windowManager.getDefaultDisplay().getWidth();
//        int height = windowManager.getDefaultDisplay().getHeight();

        for(int i=0 ; i<5 ; i++){
            LinearLayout ll = new LinearLayout(this);
            ll.setLayoutParams(llparams);
            linearLayout.addView(ll);
            for(int j=0 ; j<4 ; j++){
                Button button = new Button(this);
                button.setText(Integer.toString(n));
                button.setLayoutParams(buttonsParams);

//                b1.setWidth(width / 5);
//                b1.setHeight(height / 4);
//                b1.setLayoutParams(new GridLayout.LayoutParams(GridLayout.spec(i), GridLayout.spec(j)));
//                gridLayout.addView(b1);
                ll.addView(button);
                n++;
            }
        }

//        setContentView(gridLayout);

        setContentView(linearLayout);
    }
}
