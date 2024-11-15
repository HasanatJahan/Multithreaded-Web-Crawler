package parser;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * LinkParser class handles HTML parsing and link extraction
 *
 */
public class LinkParser {

    public LinkParser() {
        return;
    }

    // Constants
    final static String URL_REGEX = "(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";

    /**
     * Manages the visited URLs and any results that need to be saved
     * @param string output of the web crawl from page fetcher
     * @return list of URLs extracted from web crawl
     */
    public static List<String> extractLinks(String pageFetchResult) {
        List<String> webLinks = new ArrayList<>();

        Pattern pattern = Pattern.compile(URL_REGEX);
        Matcher matcher = pattern.matcher(pageFetchResult);

        while(matcher.find()) {
            webLinks.add(matcher.group());
        }

        // regular expression pattern for matching URLs
        return webLinks;
    }
}
