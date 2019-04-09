import java.util.Arrays;
import java.util.Collection;
 
import org.junit.Test;
import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class test_cases {
   private String msg;
   private String key;
   private String expected_result;
   private crypto_function object;

   @Before
   public void initialize() {
      object = new crypto_function();
   }

   // Each parameter should be placed as an argument here
   // Every time runner triggers, it will pass the arguments
   // from parameters we defined in class method
	
   public test_cases(String msg, String key,String expected_result) {
      this.msg = msg;
      this.key = key;
      this.expected_result = expected_result;
   }

   @Parameterized.Parameters
   public static Collection primeNumbers() {
      return Arrays.asList(new Object[][] {
         { "PROJECT","C","PROJECT" },
         { "THISISATEST","B","THISISATEST" },
         { "ANOTHERONE","A","ANOTHERONE" }
      });
   }

   @Test(timeout=100)
   public void testPrimeNumberChecker() {
//      System.out.println("Parameterized Number is : " + inputNumber);
      assertEquals(expected_result, 
      object.encrypt(msg,key));
   }
}