package header;

import header.mainNavigation.actionwords;
import org.testng.annotations.*;

public class MyRecentTicketsTest {

    public header.mainNavigation.actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new actionwords();
    }

    @Test
    public void myRecentTicketsNoRecentTickets() {
        // Given that I have the MA Website open
        actionwords.thatIHaveTheMAWebsiteOpen();
        // When I tap on My Recent Tickets button
        actionwords.iTapOnMyRecentTicketsButton();
        // Then My Recent Tickets page loads
        actionwords.myRecentTicketsPageLoads();
        // Then a message You have no recent tickets.  Play a To-Go game in Ticket Mode to get started. is displayed
        actionwords.aMessageYouHaveNoRecentTicketsPlayAToGoGameInTicketModeToGetStartedIsDisplayed();
    }

    @Test
    public void myRecentTicketsRecentTickets() {
        // Given that I have the MA Website open
        actionwords.thatIHaveTheMAWebsiteOpen();
        // When I tap My Recent Tickets icon
        actionwords.iTapMyRecentTicketsIcon();
        // Then My Recent Tickets page loads with ticket information
        actionwords.myRecentTicketsPageLoadsWithTicketInformation();
    }
}