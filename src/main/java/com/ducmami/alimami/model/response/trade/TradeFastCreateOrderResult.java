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
public class TradeFastCreateOrderResult implements Serializable {
    private TradeFastResult result;
    private Boolean success;
    private String code;
    private String message;
}
