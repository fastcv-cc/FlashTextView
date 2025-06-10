# FlashTextView

# 用法



添加依赖：

```
implementation("cc.fastcv:flash-text-view:1.0.0")
```



在布局文件中：

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <cc.fastcv.flash_text_view.FlashTextView
        android:layout_width="match_parent"
        android:layout_height="30dp"
        android:text="我是一段设置了自己颜色的文本，看看效果"
        android:id="@+id/v1"
        android:textColor="#1E23CE"
        android:textSize="20sp"
        android:background="#B15D5D"
        android:gravity="center"
        android:layout_marginTop="20dp"
        tools:ignore="HardcodedText" />

</LinearLayout>
```



这样，就可以在你的app上看到效果了。

![](./assets/2025_06_xiaoguotu-b55b75.gif)





我拉了个安卓技术讨论群，感兴趣的可以加我，我拉你进群

<img src="./assets/image-20250610153910261.png" alt="image-20250610153910261" style="zoom:50%;" />
