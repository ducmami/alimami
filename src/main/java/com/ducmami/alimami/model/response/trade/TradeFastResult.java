package com.ducmami.alimami.model.response.trade;

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
public class TradeFastResult implements Serializable {
    private Long totalSuccessAmount;
    private String orderId;
    private List<TradeFastOffer> failedOfferList;
    private Long postFee;
}
