package lab_06;

import java.util.Scanner;

public class Lab06_4 {
    public static String getNetworkProtocol(String url) {
        if (url.startsWith("http://")) return "http://";
        else return "https://";
    }

    public static String getDomain(String url) {
        if (url.endsWith(".com")) return ".com";
        else return ".net";
    }

    /*public static String getDetailUrl(String url) {
        return "Network Protocol is /n" + getNetworkProtocol(url) + "Domain is " + getDomain(url);
    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input url: ");
        String url = scanner.nextLine();

        System.out.println("Domain is: " + getDomain(url));
        System.out.println("Protocol is: " + getNetworkProtocol(url));
    }
}
