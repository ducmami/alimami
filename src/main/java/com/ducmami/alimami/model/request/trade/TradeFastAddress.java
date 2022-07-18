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
public class TradeFastAddress implements Serializable {
    private Long addressId;
    private String fullName;
    private String mobile;
    private String phone;
    private String postCode;
    private String cityText;
    private String provinceText;
    private String areaText;
    private String townText;
    private String address;
    private String districtCode;
}
