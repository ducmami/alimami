package com.alibaba.trade.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaTradeRefundReturnGoodsResult {

    private AlibabaOceanOpenplatformBizTradeResultRefundReturnGoodsResult result;

    /**
     * @return 返回结果
     */
    public AlibabaOceanOpenplatformBizTradeResultRefundReturnGoodsResult getResult() {
        return result;
    }

    /**
     * 设置返回结果     *
          
     * 此参数必填
     */
    public void setResult(AlibabaOceanOpenplatformBizTradeResultRefundReturnGoodsResult result) {
        this.result = result;
    }

}
