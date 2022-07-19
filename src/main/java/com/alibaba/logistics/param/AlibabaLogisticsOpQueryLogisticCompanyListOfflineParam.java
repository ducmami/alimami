package com.alibaba.logistics.param;

import com.alibaba.ocean.rawsdk.client.APIId;
import com.alibaba.ocean.rawsdk.common.AbstractAPIRequest;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaLogisticsOpQueryLogisticCompanyListOfflineParam extends AbstractAPIRequest<AlibabaLogisticsOpQueryLogisticCompanyListOfflineResult> {

    public AlibabaLogisticsOpQueryLogisticCompanyListOfflineParam() {
        super();
        oceanApiId = new APIId("com.alibaba.logistics", "alibaba.logistics.OpQueryLogisticCompanyList.offline", 1);
    }

}
