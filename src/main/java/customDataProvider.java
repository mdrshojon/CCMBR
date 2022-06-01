import org.testng.annotations.DataProvider;

public class customDataProvider {
    @DataProvider(name="UserDataProvider")
    public Object[][] getData()
    {
        Object[][] data= {{"md+2@gambyt.com","Password123!"}, {"md+1@gambyt.com","Password123!"}};
        return data;

    }
}
