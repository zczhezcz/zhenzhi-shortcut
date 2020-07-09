package com.zhangchangzhi.actuator.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 订单分配定时任务
 * </p>
 *
 * @author zhangchangzhi
 * @since 2019-12-12
 */
@Component
public class OrderAssigmentTask {
    @Scheduled(fixedDelay = 100)
    public void execute() {
        /*
         * @Description 分配订单
         * @Param []
         * @return void
         **/
    }
}
