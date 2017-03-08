package com.example.bigmovie.index;

import android.os.Handler;
import android.os.Message;

import com.example.bigmovie.IndexActivity;

import java.lang.ref.WeakReference;

/**
 * Created by 且以白首共余生。 on 2017/3/3.
 */
public class ImageHandler extends Handler {
    //请求更新显示的View
    public static final int MSG_UPDATE_IMAGE=1;
    //请求暂停播放
    public static final int MSG_KEEP_SILENT = 2;
    //请求恢复播放
    public static final int MSG_BREAK_SILENT= 3;

    public static final int MSG_PAGE_CHANGED  = 4;
    //轮播间隔时间
    public static final long MSG_DELAY = 3000;//3秒

    //使用弱引用避免Handler泄露.这里的泛型参数可以不是Activity，也可以是Fragment等
    private WeakReference<IndexActivity> weakReference;
    private int currentItem = 0;

    //构造方法
    public ImageHandler(WeakReference<IndexActivity> weakReference) {
        this.weakReference = weakReference;
    }

    @Override
    public void handleMessage(Message msg) {
        super.handleMessage(msg);
        IndexActivity indexActivity=weakReference.get();
        if (indexActivity==null){
            //Activity已经回收，无需再处理UI了
            return ;
        }
        //检查消息队列并移除未发送的消息，这主要是避免在复杂环境下消息出现重复等问题。
        if (indexActivity.handler.hasMessages(MSG_UPDATE_IMAGE)){
            indexActivity.handler.removeMessages(MSG_UPDATE_IMAGE);
        }
        switch (msg.what) {
            case MSG_UPDATE_IMAGE:
                currentItem++;
                indexActivity.IndexViewPager.setCurrentItem(currentItem);
                //准备下次播放
                indexActivity.handler.sendEmptyMessageDelayed(MSG_UPDATE_IMAGE, MSG_DELAY);
                break;
            case MSG_KEEP_SILENT:
                //只要不发送消息就暂停了
                break;
            case MSG_BREAK_SILENT:
                indexActivity.handler.sendEmptyMessageDelayed(MSG_UPDATE_IMAGE, MSG_DELAY);
                break;
            case MSG_PAGE_CHANGED:
                //记录当前的页号，避免播放的时候页面显示不正确。
                currentItem = msg.arg1;
                break;
            default:
                break;
        }

    }
}
