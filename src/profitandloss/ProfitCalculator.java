package profitandloss;
import java.math.BigDecimal;

public class ProfitCalculator {
	private int CP;
	private int SP;
	ProfitCalculator(int SP,int CP){
		this.SP=SP;
		this.CP=CP;
	}
public BigDecimal calculateResult() {
	int profit=SP-CP;
	int result=(profit/CP)*100;
	//BigDecimal result=new BigDecimal(profit).divide(new BigDecimal(CP)).multiply(new BigDecimal(100));
	BigDecimal res=new BigDecimal(result);
	return res;
}
}
