package com.alibaba.trade.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaTradeUploadRefundVoucherResult {

    private AlibabaOceanOpenplatformCommonOrderRefundUploadVoucherResult result;

    /**
     * @return 返回结果
     */
    public AlibabaOceanOpenplatformCommonOrderRefundUploadVoucherResult getResult() {
        return result;
    }

    /**
     * 设置返回结果     *
          
     * 此参数必填
     */
    public void setResult(AlibabaOceanOpenplatformCommonOrderRefundUploadVoucherResult result) {
        this.result = result;
    }

}
