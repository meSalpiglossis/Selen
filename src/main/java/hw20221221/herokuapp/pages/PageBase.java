package hw20221221.herokuapp.pages;

import static hw20221221.herokuapp.helpers.WebBrowser.webBrowser;

public class PageBase {

   protected static boolean titleIsPresented(String TITLE_EXPECTED) {
        return webBrowser().getTitle().contains(TITLE_EXPECTED);
   }
}
