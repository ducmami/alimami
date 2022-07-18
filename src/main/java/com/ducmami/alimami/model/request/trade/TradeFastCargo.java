package com.ducmami.alimami.model.request.trade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TradeFastCargo implements Serializable {
    private Long offerId;
    private String specId;
    private Double quantity;
}
