package primitiveDataType;
import java.math.BigDecimal;
public class SimpleInterestCalculator {

	BigDecimal principal;
	BigDecimal interest;
	
	SimpleInterestCalculator(String princ, String interest){
		this.principal=new BigDecimal(princ);
		this.interest=new BigDecimal(interest);
		
	}
	
	public int calculateTotalValue(int time) {
		int res=principal*interest *time/100;
		return res;
	}
}
