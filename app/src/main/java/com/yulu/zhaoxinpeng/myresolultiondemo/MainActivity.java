package com.yulu.zhaoxinpeng.myresolultiondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获取 TextView 控件
        TextView tv = (TextView) findViewById(R.id.tv);
        //找到当前控件的父控件(父控件上给当前的子控件去设定一个规则)
        DisplayMetrics metrics = new DisplayMetrics();
        //给当前 metrics 去设置当前屏幕信息(宽(像素)高(像素))
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        //日志输出屏幕的高度和宽度
        Log.i("aaa", "Constant.srceenHeight = "+metrics.heightPixels);
        Log.i("aaa", "Constant.srceenWidth = "+metrics.widthPixels);
        //宽高各 50%
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                (int)(metrics.widthPixels*0.5), (int)(metrics.heightPixels*0.5));
        //给 tv 控件设置布局参数
        tv.setLayoutParams(layoutParams);
    }
}
