package com.alibaba.trade.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaTradeGetRefundReasonListResult {

    private AlibabaOceanOpenplatformCommonOrderRefundReasonListResult result;

    /**
     * @return 返回结果
     */
    public AlibabaOceanOpenplatformCommonOrderRefundReasonListResult getResult() {
        return result;
    }

    /**
     * 设置返回结果     *
          
     * 此参数必填
     */
    public void setResult(AlibabaOceanOpenplatformCommonOrderRefundReasonListResult result) {
        this.result = result;
    }

}
