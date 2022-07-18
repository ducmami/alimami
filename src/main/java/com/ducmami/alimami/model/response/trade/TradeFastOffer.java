package com.ducmami.alimami.model.response.trade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TradeFastOffer implements Serializable {
    private String offerId;
    private String specId;
    private String errorCode;
    private String errorMessage;
}
