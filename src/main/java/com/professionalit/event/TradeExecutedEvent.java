package com.professionalit.event;

import lombok.Data;

@Data
public class TradeExecutedEvent {
	private Long tradeId;
    private Long userId;
    private String stockSymbol;
    private Integer quantity;
    private Double price;
    private String tradeType;

}
