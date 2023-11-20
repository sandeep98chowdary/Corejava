package oopsdemo3;
import com.ey.training.microsoft.*;
import com.ey.training.oracle.*;
public class SoftwareList {

	public static void main(String[] args) {
		
		OperatingSystem os1=new OperatingSystem();
		os1.listSoftware();
		Database d1=new Database();
		d1.printSoftware();
		System.out.println();

	}

}
