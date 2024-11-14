package network;

// Java imports
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class PageFetcher {
    String pageURL;

    // constructor that takes in the URL
    public PageFetcher(String pageURL) {
        this.pageURL = pageURL;
    }

    public String getURLContents(){
        try{
            // instantiate the URL class
            URL url = new URL(this.pageURL);
            // retrieve contents of specific file
            Scanner sc = new Scanner(url.openStream());
            // instantiate the StringBuffer class to hold the result
            StringBuffer sb = new StringBuffer();
            // populate the string buffer
            while(sc.hasNext()) {
                sb.append(sc.next());
            }
            // Retrieving the string from the String buffer object
            String result = sb.toString();
            // replace all the HTML tags
            String htmlChars = "<[^>]*>";
            result = result.replaceAll(htmlChars, "");
            System.out.println("Contents of the web page: " + result);
            return result;
        }
        catch (Exception e) {
            try {
                throw new Exception("Unable to reach webpage");
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
    }

}
