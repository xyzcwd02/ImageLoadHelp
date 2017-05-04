package com.hengda.picassoloader;

import android.content.Context;
import android.widget.ImageView;

import com.hengda.imageload.ImageLoadUtils;
import com.squareup.picasso.Picasso;

/**
 * Created by wenda on 2017/4/26.
 */

public class PicassoImageLoader implements ImageLoadUtils.ImageLoader {
    @Override
    public void loadImage(Context context, ImageView imageView, String url,int placeholderImg,int errorImg) {
        Picasso.with(context).load(url)//
                .placeholder(placeholderImg)//
                .error(errorImg)//
                .into(imageView);
    }

    @Override
    public void loadImage(Context context, ImageView imageView, String url) {
        Picasso.with(context).load(url)//
                .into(imageView);
    }

    @Override
    public void loadOriginalImage(Context context, ImageView imageView, String url) {

    }

    @Override
    public void loadRoundImage(Context context, ImageView imageView, String url,int placeholderImg,int errorImg) {

    }

    @Override
    public void loadCircleImage(Context context, ImageView imageView, String url,int placeholderImg,int errorImg) {

    }

    @Override
    public void clearMemoryCache(Context context) {
    }
}
