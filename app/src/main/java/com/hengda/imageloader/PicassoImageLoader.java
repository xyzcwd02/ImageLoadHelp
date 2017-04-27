package com.hengda.imageloader;

import android.content.Context;
import android.widget.ImageView;

import com.hengda.imageload.ImageLoadUtils;
import com.squareup.picasso.Picasso;

/**
 * Created by wenda on 2017/4/26.
 */

public class PicassoImageLoader implements ImageLoadUtils.ImageLoader {
    @Override
    public void loadImage(Context context, ImageView imageView, String url) {
        Picasso.with(context).load(url)//
                .placeholder(R.mipmap.bg_default)//
                .error(R.mipmap.bg_default)//
                .into(imageView);
    }

    @Override
    public void clearMemoryCache(Context context) {
    }
}
