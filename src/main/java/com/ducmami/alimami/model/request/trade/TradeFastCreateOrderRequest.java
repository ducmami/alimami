package com.ducmami.alimami.model.request.trade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TradeFastCreateOrderRequest implements Serializable {
    private String flow;
    private Long subUserId;
    private String message;
    private TradeFastAddress addressParam;
    private List<TradeFastCargo> cargoParamList;
    private TradeFastInvoice invoiceParam;
    private Boolean isvBizTypeErp;
    private String shopPromotionId;
    private String tradeType;
    private TradeFastCreateOrderEncryptOutOrderInfo encryptOutOrderInfo;
}
