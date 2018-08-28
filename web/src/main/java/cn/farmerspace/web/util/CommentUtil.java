package cn.farmerspace.web.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @Author Steven Tang
 * @Description
 * @Date create in 16:42 18/2/9
 **/

public class CommentUtil {

    /**
     * 四舍五入 保留n位小数
     * @param d
     * @return
     */
    public static double formatDouble(double d,int n) {
        // 新方法，如果不需要四舍五入，可以使用RoundingMode.DOWN
        BigDecimal bg = new BigDecimal(d).setScale(n, RoundingMode.HALF_EVEN);
        return bg.doubleValue();
    }
}

    