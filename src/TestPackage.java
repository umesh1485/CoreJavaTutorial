import com.pkg.CD.*;


public class TestPackage {

	public static void main(String[] args) {
		Driver d = new Driver();
		d.drive();
		
		com.pkg.CarDriver.Driver carDriver = new com.pkg.CarDriver.Driver();
		
		carDriver.drive();
		
		FloppyDriver driverF = new FloppyDriver();
		driverF.drive();

	}

}
