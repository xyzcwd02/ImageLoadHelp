package com.hengda.imageload;

import android.content.Context;
import android.widget.ImageView;

/**
 * Created by wenda on 2017/4/26.
 */

public class ImageLoadUtils {

    private static ImageLoader mImageLoader;

    public static void initImageLoader(ImageLoader imageLoader) {
        mImageLoader = imageLoader;
    }

    public static ImageLoader getImageLoader() {
        return mImageLoader;
    }

    public interface ImageLoader {
        /**
         * 加载图片
         */
        void loadImage(Context context, ImageView imageView, String url,int placeholderImg,int errorImg);
        void loadImage(Context context, ImageView imageView, String url);
        /**
         * 加载图片原来的大小
         * @param context
         * @param imageView
         * @param url
         */
        void loadOriginalImage(Context context, ImageView imageView, String url);
        /**
         * 方形的圆角图片
         */
        void loadRoundImage(Context context, ImageView imageView, String url,int placeholderImg,int errorImg);
        /**
         * 圆形图片
         */
        void loadCircleImage(Context context, ImageView imageView, String url,int placeholderImg,int errorImg);
        /**
         * 清除缓存
         */
        void clearMemoryCache(Context context);
    }
}
