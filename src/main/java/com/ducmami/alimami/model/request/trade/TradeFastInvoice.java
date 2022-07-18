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
public class TradeFastInvoice implements Serializable {
    private Integer invoiceType;
    private String provinceText;
    private String cityText;
    private String areaText;
    private String townText;
    private String postCode;
    private String address;
    private String fullName;
    private String phone;
    private String mobile;
    private String companyName;
    private String taxpayerIdentifier;
    private String bankAndAccount;
    private String localInvoiceId;

}
