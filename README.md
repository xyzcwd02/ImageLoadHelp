## 一、概述
图片加载
## 二、使用
继承ImageLoadUtils.ImageLoader子类实现方法确定如何加载图片，使用方式见demo
```
  public interface ImageLoader {
        /**
         * 加载图片
         */
        void loadImage(Context context, ImageView imageView, String url);
        /**
         * 方形的圆角图片
         */
        void loadRoundImage(Context context, ImageView imageView, String url);
        /**
         * 圆形图片
         */
        void loadCircleImage(Context context, ImageView imageView, String url);

        /**
         * 清除缓存
         */
        void clearMemoryCache(Context context);
    }

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

     ImageLoadUtils.setImageLoader(new GlideImageLoader());//new GlideImageLoader可继承ImageLoader自定义  设置一次全局使用

     ImageLoadUtils.getImageLoader().loadImage(MainActivity.this,iv,url);
```


