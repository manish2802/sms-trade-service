package com.professionalit.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.professionalit.dto.TradeRequest;
import com.professionalit.entity.Trade;
import com.professionalit.repository.TradeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TradeService {

    private final TradeRepository repository;
   // private final KafkaTemplate<String, TradeExecutedEvent> kafkaTemplate;

    public String executeTrade(TradeRequest request) {

        Trade trade = new Trade();
        trade.setUserId(request.userId());
        trade.setStockSymbol(request.stockSymbol());
        trade.setQuantity(request.quantity());
        trade.setPrice(request.price());
        trade.setTradeType(request.tradeType());
        trade.setTradeDate(LocalDateTime.now());

        Trade savedTrade = repository.save(trade);
//        TradeExecutedEvent event = new TradeExecutedEvent();
//        event.setTradeId(savedTrade.getTradeId());
//        event.setUserId(savedTrade.getUserId());
//        event.setStockSymbol(savedTrade.getStockSymbol());
//        event.setQuantity(savedTrade.getQuantity());
//        event.setPrice(savedTrade.getPrice());
//        event.setTradeType(savedTrade.getTradeType());
//
//        kafkaTemplate.send("trade-events", event);

        return "Trade Executed Successfully";
    }
}