package com.kipperdev.orderhub.dto.abacate;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AbacateChargeResponseDTO {
    
    private String error;
    private AbacateChargeDataDTO data;
    
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AbacateChargeDataDTO {
        private String id;
        private Integer amount;
        private String status;
        private String frequency;
        @JsonProperty("devMode")
        private Boolean devMode;
        private List<String> methods;
        @JsonProperty("allowCoupons")
        private Boolean allowCoupons;
        private List<Object> coupons;
        @JsonProperty("couponsUsed")
        private List<Object> couponsUsed;
        private String url;
        @JsonProperty("createdAt")
        private LocalDateTime createdAt;
        @JsonProperty("updatedAt")
        private LocalDateTime updatedAt;
        private List<AbacateProductResponseDTO> products;
        private AbacateChargeMetadataDTO metadata;
        private AbacateCustomerResponseDTO.AbacateCustomerMetadataDTO customer;
        
        @Data
        @NoArgsConstructor
        @AllArgsConstructor
        public static class AbacateProductResponseDTO {
            private String id;
            private String externalId;
            private Integer quantity;
        }
        
        @Data
        @NoArgsConstructor
        @AllArgsConstructor
        public static class AbacateChargeMetadataDTO {
            private Integer fee;
            private String returnUrl;
            private String completionUrl;
        }
    }
}