package com.alibaba.trade.param;

import com.alibaba.ocean.rawsdk.client.APIId;
import com.alibaba.ocean.rawsdk.common.AbstractAPIRequest;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaTradePayProtocolPayIsopenParam extends AbstractAPIRequest<AlibabaTradePayProtocolPayIsopenResult> {

    public AlibabaTradePayProtocolPayIsopenParam() {
        super();
        oceanApiId = new APIId("com.alibaba.trade", "alibaba.trade.pay.protocolPay.isopen", 1);
    }

}
