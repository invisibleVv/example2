package support;

public class Helper {
    public static String myVal = "My constant value";
    public static String getUrlFor(String name) {
        switch (name) {
            case "google search engine":
                return "https://google.com";
            default:
                return "";
        }
    }
    public static String getXpathFor(String name) {
        switch (name) {
            case "search textfield":
                return "//textarea[@name='q']";
            case "search button":
                return "(//input[@name='btnK'])[2]";
            case "results":
                return "//div[@id='rso']";
            default:
                return "";


        }
    }

}
