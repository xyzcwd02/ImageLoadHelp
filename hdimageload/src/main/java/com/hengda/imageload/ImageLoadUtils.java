package com.hengda.imageload;

import android.content.Context;
import android.widget.ImageView;

/**
 * Created by wenda on 2017/4/26.
 */

public class ImageLoadUtils {

    private static ImageLoader mImageLoader;

    public static void setImageLoader(ImageLoader imageLoader) {
        mImageLoader = imageLoader;
    }

    public static ImageLoader getImageLoader() {
        return mImageLoader;
    }

    public interface ImageLoader {
        /**
         * 确定加载图片方式
         */
        void loadImage(Context context, ImageView imageView, String url);

        /**
         * 清除缓存
         */
        void clearMemoryCache(Context context);

    }
}
