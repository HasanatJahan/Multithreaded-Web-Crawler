package app;

import network.PageFetcher;
import parser.LinkParser;

import java.util.List;

public class Main {
    public static void main(String []args) {
        String testWebsite = "https://en.wikipedia.org/wiki/Sal_Khan";

        // test out PageFetcher
        PageFetcher pageFetcher = new PageFetcher(testWebsite);

        // test out link parser
        String htmlContent = pageFetcher.getURLContents();

        System.out.println("This is the html content" + htmlContent);


        List<String> webLinks = LinkParser.extractLinks(htmlContent);

        // test out the output of weblinks

        for (int i = 0; i < webLinks.size(); i++){
            System.out.println(webLinks.get(i));
        }

    }
}
