import org.junit.Assert;
import org.junit.Test;

public class XYZBankTest {


    XYZBank bank = new XYZBank("/Users/haim/Desktop/driver/chromedriver");


    @Test
  public void Test5() throws InterruptedException {
      var actLable = bank.openAccount();
      var expLable = "Customer :";
      Assert.assertEquals(expLable,actLable);
      bank.close();
      System.out.println("Test 5 - PASS");

  }







}
