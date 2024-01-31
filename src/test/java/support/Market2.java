package support;

public class Market2 {
    public static String getUrlFor(String name) {
        switch (name) {
            case "store-stage":
                return "https://store-stage.portnov.com/";
            default:
                return "";
        }
    }

    public static String getXpathFor(String name) {
        switch (name) {
            case "My account":
                return "//a[contains(text(),'account')][1]";
            case "log in":
                return "//button[@name='login']";
            case "username":
                return "//div/form/p/input[@id='username']";
            case "password":
                return "//input[@id='password']";
            case "Get started":
                return "//a[contains(text(), 'Get started')]";
            case "iMac":
                return "//li[3]/a[contains(text(), 'Add to cart')]";
            case "iPhone XR":
                return "//li[5]/a[contains(text(), 'Add to cart')]";
            case "AirPods Pro":
                return "//li[1]/a[contains(text(), 'Add to cart')]";
            case "view cart":
                return "//li/a[contains(text(), 'View cart')]";
            case "cart":
                return "//h1[contains(text(), 'Cart')]";
            case "checkout":
                return "//h1[contains(text(), 'Checkout')]";
            case "quantity":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
                return "//input[@class='input-text qty text']";
            case "update cart":
                return "//button[@name='update_cart']";
            case "updating":
                return "//div[contains(text(), 'Cart updated')]";
            case "remove from cart":
                return "//a[@class='remove']";
            case "removed from cart":
                return "//div[contains(text(), 'removed')]";
            case "total":
                return "//tr[@class='order-total']";
            case "proceed to checkout":
                return "//a[contains(text(), 'Proceed to checkout')]";
            case "place order":
                return "//button[@id='place_order']";
            default:
                return "";
        }
    }
}
