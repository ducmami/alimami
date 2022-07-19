package com.alibaba.trade.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaTradeCreateRefundResult {

    private AlibabaOceanOpenplatformCommonOrderRefundCreateResult result;

    /**
     * @return 返回结果
     */
    public AlibabaOceanOpenplatformCommonOrderRefundCreateResult getResult() {
        return result;
    }

    /**
     * 设置返回结果     *
          
     * 此参数必填
     */
    public void setResult(AlibabaOceanOpenplatformCommonOrderRefundCreateResult result) {
        this.result = result;
    }

}
