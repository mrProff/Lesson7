import com.practicaljava.lesson7.tryit.Contractor;
import com.practicaljava.lesson7.tryit.Employee;
import com.practicaljava.lesson7.tryit.Payable;

public class TestPayIncreaseInterface {

	public static void main(String[] args) {
		Payable workers[] = new Payable[3];
		workers[0] = new Employee("John");
		workers[1] = new Contractor("Mary");
		workers[2] = new Employee("Steve");
		
		for (Payable p : workers) {
			//((Payable) p).increasePay(30);
			p.increasePay(30);
		}
	}
}
