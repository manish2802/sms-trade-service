package com.professionalit.dto;

public record TradeRequest(Long userId, String stockSymbol, Integer quantity, Double price, String tradeType) {

}
