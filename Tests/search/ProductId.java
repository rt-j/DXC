package assignmentPackage;
import java.util.*;

public class ProductId {
	String productId;
	String itemName;
	int number;
	int f;
	Scanner s=new Scanner(System.in);
	
	public ProductId() {
		super();
	}

	public ProductId(String productId, String itemName, int number) {
		super();
		this.productId = productId;
		this.itemName = itemName;
		this.number = number;
	}

	@Override
	public String toString() {
		return "ProductId [productId=" + productId + ", itemName=" + itemName + ", number=" + number + "]";
	}
	public boolean check(String h) {
		for(int i=0;i<h.length();i++) {
			if((productId.length()==h.length())&&productId.charAt(i)==h.charAt(i)) {
				f=1;
				
			}
			else {
				f=0;
				
				}
		}
		if(f==1)
			return true;
		else
			return false;
	}
}
