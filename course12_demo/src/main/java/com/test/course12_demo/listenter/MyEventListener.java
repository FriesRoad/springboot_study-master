package com.test.course12_demo.listenter;

import com.test.course12_demo.entity.User;
import com.test.course12_demo.event.MyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener implements ApplicationListener<MyEvent> {

    @Override
    public void onApplicationEvent(MyEvent myEvent){
        //把事件中的信息获取到
        User user = myEvent.getUser();
        //处理事件，实际项目中可以通知别的微服务或者处理其他逻辑等待
        System.out.println("用户名:" + user.getUsername());
        System.out.println("密码：" + user.getPassword());
    }
}
