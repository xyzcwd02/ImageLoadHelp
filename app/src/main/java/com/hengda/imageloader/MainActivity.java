package com.hengda.imageloader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.hengda.imageload.ImageLoadUtils;

public class MainActivity extends AppCompatActivity {
    private ImageView iv;
    String url = "http://192.168.10.158/wcbwg/resource/exhibit/0002/images/img0.png";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = (ImageView) findViewById(R.id.iv);

        ImageLoadUtils.setImageLoader(new GlideImageLoader());//new GlideImageLoader可继承ImageLoader自定义  设置一次全局使用

        ImageLoadUtils.getImageLoader().loadImage(MainActivity.this,iv,url);
    }

}
