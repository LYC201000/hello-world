package chap11;

public class GoodStock {
	String goodstock;
	int stockNum;
	public GoodStock(String goodstock, int stockNum) {
		super();
		this.goodstock = goodstock;
		this.stockNum = stockNum;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		String str = "상품코드:"+goodstock+
						"재고수량:"+stockNum;
		
		return str;
	}

	
}
