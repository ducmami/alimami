package com.ducmami.alimami.model.response.trade;

import lombok.*;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReceiveAddressItem implements Serializable {
    private Long id;
    private String fullName;
    private String address;
    private String post;
    private String phone;
    private String mobilePhone;
    private String addressCode;
    private String addressCodeText;
    private Boolean isDefault;
    private String townCode;
    private String townName;
}
