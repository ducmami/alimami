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
public class TradeFastCreateOrderEncryptOutOrderInfo implements Serializable {
    private Boolean encryptOrder;
    private String outPlatformOrderNo;
    private String outPlatformCode;
    private String outPlatformAppkey;
    private String oaid;
    private String outPatformExtraInfo;
}
