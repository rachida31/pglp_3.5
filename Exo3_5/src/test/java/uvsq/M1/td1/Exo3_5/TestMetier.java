package uvsq.M1.td1.Exo3_5;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import  java.util.ArrayList ;
import  java.util.List ;
import org.junit.*;
public class TestMetier {
	
		 private UneClasseMetier metier;
		 private UneInterfaceMetier intMetier;
		@Before()
		public void setUp() {
			intMetier=new Metier();
		}

		@Test
		public void TestRobotAvance()
		{
			this.metier=new UneClasseMetier();
			metier.uneMethodeMetier(intMetier);
		}
}
