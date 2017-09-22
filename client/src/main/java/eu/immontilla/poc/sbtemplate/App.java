package eu.immontilla.poc.sbtemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    final static String kpass = "s3cr3t";

    static {
        System.setProperty("javax.net.ssl.trustStore", App.class.getClassLoader().getResource("client.jks").getFile());
        System.setProperty("javax.net.ssl.trustStorePassword", kpass);
        System.setProperty("javax.net.ssl.keyStore", App.class.getClassLoader().getResource("client.jks").getFile());
        System.setProperty("javax.net.ssl.keyStorePassword", kpass);
        javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(new javax.net.ssl.HostnameVerifier() {

            public boolean verify(String hostname, javax.net.ssl.SSLSession sslSession) {
                if (hostname.equals("localhost")) {
                    return true;
                }
                return false;
            }
        });
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
