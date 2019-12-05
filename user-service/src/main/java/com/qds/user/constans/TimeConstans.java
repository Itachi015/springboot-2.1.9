package com.qds.user.constans;

import java.time.format.DateTimeFormatter;

/**
 * 时间相关常量
 *
 * @author kong
 */
public interface TimeConstans {

    String ZONE_ID = "Asia/Shanghai";

    /**
     * 年月日, 如 2019-11-07
     */
    DateTimeFormatter Y_M_D = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    /**
     * 时分秒 如  09:59:57
     */
    DateTimeFormatter H_M_S = DateTimeFormatter.ofPattern("HH:mm:ss");

    /**
     * 年月日时分秒 如 2019-11-07 09:59:57
     */
    DateTimeFormatter Y_M_D_H_M_S = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

}
