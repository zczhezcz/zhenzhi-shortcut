package com.zhangchangzhi.actuator.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
/**
 * <p>
 * 订单释放定时任务
 * </p>
 *
 * @author zhangchangzhi
 * @since 2019-12-12
 */
@Component
public class OrderReleaseTask {
    @Scheduled(cron = "0 0 5 * * ?")
    public void cronJob(){
        System.out.println("cron");
    }

    @Scheduled(fixedDelay = 2*60*1000,initialDelay = 30*1000)
    public void fixedDelayJob(){
        System.out.println("fixedDelay");
    }

    @Scheduled(fixedRate = 5 * 1000)
    public void fixedRatejob(){
        System.out.println("fixedRatejob");
    }

}
