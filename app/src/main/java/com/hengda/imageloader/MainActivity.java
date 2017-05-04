package com.hengda.imageloader;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
        ImageLoadUtils.getImageLoader().loadImage(MainActivity.this,iv,url,R.mipmap.bg_default,R.mipmap.bg_default);
//        ImageLoadUtils.getImageLoader().loadImage(MainActivity.this,iv,url);
//        ImageLoadUtils.getImageLoader().clearMemoryCache(MainActivity.this);
//        ImageLoadUtils.getImageLoader().loadOriginalImage(MainActivity.this,iv,url);
//        ImageLoadUtils.getImageLoader().loadRoundImage(MainActivity.this,iv,url,R.mipmap.bg_default,R.mipmap.bg_default);
//        ImageLoadUtils.getImageLoader().loadCircleImage(MainActivity.this,iv,url,R.mipmap.bg_default,R.mipmap.bg_default);
    }
}
