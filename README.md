# MediaSelector
   
## 简介     

  * 媒体资源选择库，支持图片，视频等资源
  * 兼容版本 19 ~ 29  
  * 同时支持androidx 和 support
  * 支持询问并获取相关权限

## 使用

    1. 只获取媒体资源
```kotlin
   MediaSelector(context, SelectorType.IMAGE) //SelectorType资源类型
           .config(SelectorConfig(limit = 3)) //一些常用设置，如选择个数限制、是否预览等
           .mime(MimeType.JPEG) //资源mime类型，支持多个mime
           .querySource { list ->
              //处理资源列表
           }
```

2. 打开一个带样式的activity，在onActivityResult中返回选择结果
```kotlin
       MediaSelector(this, SelectorType.VIDEO)
                .config(SelectorConfig(limit = 1))
                .openBasicPage(this)
```


## TODO

  * 支持视频预览
  * 支持拍照功能
  * 提供更多样式
