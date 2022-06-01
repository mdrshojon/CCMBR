import org.testng.annotations.Test;

public class dataProvider {
   @Test(dataProvider = "UserDataProvider",dataProviderClass = customDataProvider.class)
    public void loginTest(String email, String pwd) {
       System.out.println(email+"   "+pwd);
    }

        }


