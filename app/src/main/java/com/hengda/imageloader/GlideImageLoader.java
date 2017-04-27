package com.hengda.imageloader;

import android.content.Context;
import android.os.Looper;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.hengda.imageload.ImageLoadUtils;

/**
 * Created by wenda on 2017/4/26.
 */

public class GlideImageLoader implements ImageLoadUtils.ImageLoader {
    @Override
    public void loadImage(Context context, ImageView imageView, String url) {
        Glide.with(context).load(url)//
                .asBitmap()
                .placeholder(R.mipmap.bg_default)//
                .error(R.mipmap.bg_default)//
                .diskCacheStrategy(DiskCacheStrategy.ALL)//
                .centerCrop()
                .into(imageView);
    }

    @Override
    public void clearMemoryCache(Context context) {
        clearImageDiskCache(context);
        clearImageMemoryCache(context);
    }


    /**
     * 清除图片磁盘缓存
     */
    public static void clearImageDiskCache(final Context context) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Glide.get(context).clearDiskCache();
                    }
                }).start();
            } else {
                Glide.get(context).clearDiskCache();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 清除图片内存缓存
     */
    public static void clearImageMemoryCache(Context context) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) { //只能在主线程执行
                Glide.get(context).clearMemory();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
