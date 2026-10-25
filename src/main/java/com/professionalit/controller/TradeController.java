package com.professionalit.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.professionalit.dto.TradeRequest;
import com.professionalit.service.TradeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/trades")
@RequiredArgsConstructor
public class TradeController {
	 private final TradeService tradeService;

	    @PostMapping
	    public ResponseEntity<String> createTrade(
	            @RequestBody TradeRequest request) {

	        return ResponseEntity.ok(
	                tradeService.executeTrade(request));
	    }
}
