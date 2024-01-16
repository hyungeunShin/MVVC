package com.example.mvvc.transaction;

import com.example.mvvc.service.StockService;

public class TransactionStockService {
	private StockService stockService;

	public TransactionStockService(StockService stockService) {
		this.stockService = stockService;
	}
	
	public void decrease(Long id, Long quantity) {
		startTransaction();
		
		stockService.decrease(id, quantity);
		
		endTransaction();
	}
	
	private void startTransaction() {
		System.out.println("트랜잭션 시작");
	}
	
	private void endTransaction() {
		System.out.println("트랜잭션 끝");
	}
}
