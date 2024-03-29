package com.alibaba.trade.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaOceanOpenplatformBizTradeResultOrderRefundReasonListResult {

    private AlibabaOceanOpenplatformBizTradeResultOrderRefundReasonModel[] reasons;

    /**
     * @return 结果
     */
    public AlibabaOceanOpenplatformBizTradeResultOrderRefundReasonModel[] getReasons() {
        return reasons;
    }

    /**
     * 设置结果     *
     * 参数示例：<pre> </pre>     
     * 此参数必填
     */
    public void setReasons(AlibabaOceanOpenplatformBizTradeResultOrderRefundReasonModel[] reasons) {
        this.reasons = reasons;
    }

}
