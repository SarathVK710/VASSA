package utility;

import java.io.IOException;

public class TestContext {

      public  BrowserBase base;
      public PageObjectManager pageObjectManager;

    public TestContext() throws IOException {
        base = new BrowserBase();
        pageObjectManager = new PageObjectManager(base.getDriver());
    }
}
