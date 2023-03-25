package com.casafisk.webshop.configuration;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@Configuration
public class FireBaseInitialize {
    @Bean
    public FirebaseApp initialize() {

        FileInputStream serviceAccount =
                null;
        try {
            serviceAccount = new FileInputStream("src/main/java/com/casafisk/webshop/configuration/secrets/FireBaseSecret.json");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        FirebaseOptions options = null;
        try {
            options = new FirebaseOptions.Builder()
                        .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                        .setDatabaseUrl("https://webshop-portfolio-default-rtdb.europe-west1.firebasedatabase.app")
                        .build();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return FirebaseApp.initializeApp(options);

    }

}
