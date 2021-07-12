import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {

        try {

            URL url = new URL("https://www.nbkr.kg/#:~:text=%D0%9A%D3%A8%D0%9F%20%D0%91%D0%95%D0%A0%D0%98%D0%9B%D0%93%D0%95%D0%9D%20%D0%A1%D0%A3%D0%A0%D0%9E%D0%9E%D0%9B%D0%9E%D0%A0-,%D0%9A%D1%8B%D1%80%D0%B3%D1%8B%D0%B7%20%D0%A0%D0%B5%D1%81%D0%BF%D1%83%D0%B1%D0%BB%D0%B8%D0%BA%D0%B0%D1%81%D1%8B%D0%BD%D1%8B%D0%BD%20%D0%A3%D0%BB%D1%83%D1%82%D1%82%D1%83%D0%BA%20%D0%B1%D0%B0%D0%BD%D0%BA%D1%8B,720001%2C%20%D0%9A%D1%8B%D1%80%D0%B3%D1%8B%D0%B7%20%D0%A0%D0%B5%D1%81%D0%BF%D1%83%D0%B1%D0%BB%D0%B8%D0%BA%D0%B0%D1%81%D1%8B%2C%20%D0%91%D0%B8%D1%88%D0%BA%D0%B5%D0%BA%20%D1%88%D0%B0%D0%B0%D1%80%D1%8B%2C%20%D0%A7%D2%AF%D0%B9%20%D0%BF%D1%80%D0%BE%D1%81%D0%BF%D0%B5%D0%BA%D1%82%D0%B8%2C%20168,-%D0%91%D0%B0%D0%B9%D0%BB%D0%B0%D0%BD%D1%8B%D1%88%20%D0%BC%D0%B0%D0%B0%D0%BB%D1%8B%D0%BC%D0%B0%D1%82%D1%82%D0%B0%D1%80%D1%8B");

            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();

        }
        catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }

    }

}