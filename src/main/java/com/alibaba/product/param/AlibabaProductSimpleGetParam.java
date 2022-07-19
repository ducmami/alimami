package com.alibaba.product.param;

import com.alibaba.ocean.rawsdk.client.APIId;
import com.alibaba.ocean.rawsdk.common.AbstractAPIRequest;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaProductSimpleGetParam extends AbstractAPIRequest<AlibabaProductSimpleGetResult> {

    public AlibabaProductSimpleGetParam() {
        super();
        oceanApiId = new APIId("com.alibaba.product", "alibaba.product.simple.get", 1);
    }

}
