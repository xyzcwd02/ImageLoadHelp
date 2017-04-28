package com.hengda.imageloader;

import android.app.Application;

import com.hengda.glideloader.GlideImageLoader;
import com.hengda.imageload.ImageLoadUtils;
import com.hengda.picassoloader.PicassoImageLoader;

/**
 * Created by wenda on 2017/4/28.
 */

public class APP extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        ImageLoadUtils.initImageLoader(new GlideImageLoader());//new GlideImageLoader可继承ImageLoader自定义  设置一次全局使用
    }
}
