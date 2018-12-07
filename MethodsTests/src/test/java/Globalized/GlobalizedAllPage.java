package Globalized;

import org.junit.Before;

import Healper.DriverUtility;
import Healper.LibraryUtility;
import Moduals.WaitUtility;
import Moduals.WindowUtility;

public class GlobalizedAllPage extends DriverUtility {
				
		public static WaitUtility UtilWait = new WaitUtility();
		public static WindowUtility UtilWin = new WindowUtility();

		@Before
		public void BeforeTest() {
			lib = new LibraryUtility(driver);
		}

}
