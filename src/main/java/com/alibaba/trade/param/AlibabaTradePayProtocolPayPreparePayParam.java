package com.alibaba.trade.param;

import com.alibaba.ocean.rawsdk.client.APIId;
import com.alibaba.ocean.rawsdk.common.AbstractAPIRequest;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaTradePayProtocolPayPreparePayParam extends AbstractAPIRequest<AlibabaTradePayProtocolPayPreparePayResult> {

    public AlibabaTradePayProtocolPayPreparePayParam() {
        super();
        oceanApiId = new APIId("com.alibaba.trade", "alibaba.trade.pay.protocolPay.preparePay", 1);
    }

    private AlibabaOceanOpenplatformBizTradeParamTradeWithholdPreparePayParam tradeWithholdPreparePayParam;

    /**
     * @return 发起免密支付
     */
    public AlibabaOceanOpenplatformBizTradeParamTradeWithholdPreparePayParam getTradeWithholdPreparePayParam() {
        return tradeWithholdPreparePayParam;
    }

    /**
     * 设置发起免密支付     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setTradeWithholdPreparePayParam(AlibabaOceanOpenplatformBizTradeParamTradeWithholdPreparePayParam tradeWithholdPreparePayParam) {
        this.tradeWithholdPreparePayParam = tradeWithholdPreparePayParam;
    }

}
