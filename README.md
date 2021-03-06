## 一、概述
图片加载框架封装，为了方便以后因项目需要改动成其他框架。
## 二、使用
### 1.引入
```
dependencies {
  //使用gilde
compile 'com.hengda:wenda.glideloader:0.0.2'
  //使用picasso
compile 'com.hengda:wenda.picassoloader:0.0.2'
  //其他
compile 'com.hengda:hdimageload:0.0.3'
}
```
### 2.在Application中初始化
```
  //使用gilde
  ImageLoadUtils.initImageLoader(new GlideImageLoader());//设置一次全局使用 修改为其他框架只需要修改此处和引入
  //使用picasso
  ImageLoadUtils.initImageLoader(new PicassoImageLoader());
```
### 3.使用
```
   //正常使用
   ImageLoadUtils.getImageLoader().loadImage(context,imageView,url,R.mipmap.bg_default,R.mipmap.bg_default);
   //不需要占位图
   ImageLoadUtils.getImageLoader().loadImage(context,imageView,url);
   //加载原图片尺寸
   ImageLoadUtils.getImageLoader().loadOriginalImage(context,imageView,url);
   //清除缓存
   ImageLoadUtils.getImageLoader().clearMemoryCache(context.this);
   //加载方形的圆角图片
   ImageLoadUtils.getImageLoader().loadRoundImage(context,imageView,url,R.mipmap.bg_default,R.mipmap.bg_default);
   //加载圆形图片
   ImageLoadUtils.getImageLoader().loadCircleImage(context,imageView,url,R.mipmap.bg_default,R.mipmap.bg_default);
```
## 三、说明
```
1.目前只支持glide和picasso如果需要其他可以继承ImageLoadUtils.ImageLoader子类实现方法确定如何加载图片
2.修改为其他图片加载框架只需修改初始化时代码其他不需要修改
3.如需使用fresco需要把xml中imageview改为SimpleDraweeView
```

