// A digital marketing company wants to extract the domain name from a given URL.
// Write a Java program that:
// 1. Accepts a URL
// 2. Extracts and displays only the domain name not the www.
// Note: You are supposed to use at least two classes and one object in your program.

import java.util.Scanner;
class DomainExtractor {
    public String extractDomain(String url) {
        String domainName = "";

        // Remove the protocol (http:// or https://)
        if (url.startsWith("http://")) {
            url = url.substring(7);
        } else if (url.startsWith("https://")) {
            url = url.substring(8);
        }

        // Split the URL by '/' and take the first part
        String[] parts = url.split("/");
        if (parts.length > 0) {
            domainName = parts[0];
        }

        // Remove 'www.' if it exists
        if (domainName.startsWith("www.")) {
            domainName = domainName.substring(4);
        }

        return domainName;
    }
}

public class ass10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DomainExtractor extractor = new DomainExtractor();

        System.out.println("Enter a URL to extract the domain name:");
        String inputUrl = scanner.nextLine();

        String domainName = extractor.extractDomain(inputUrl);
        System.out.println("Domain Name: " + domainName);

        scanner.close();
    }
}
// done