package com.professionalit.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TRADE")
@Data
public class Trade {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "trade_seq")
	@SequenceGenerator(name = "trade_seq", sequenceName = "TRADE_SEQ", allocationSize = 1)
	private Long tradeId;

	private Long userId;

	private String stockSymbol;

	private Integer quantity;

	private Double price;

	private String tradeType;

	private LocalDateTime tradeDate;

}