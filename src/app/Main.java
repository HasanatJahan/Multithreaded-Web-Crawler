package app;

import network.PageFetcher;

public class Main {
    public static void main(String []args) {
        String testWebsite = "https://en.wikipedia.org/wiki/Sal_Khan";

        // test out PageFetcher
        PageFetcher pageFetcher = new PageFetcher(testWebsite);
        pageFetcher.getURLContents();
    }
}
