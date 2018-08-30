package io.homo.efficio.scratchpad.oauth10a.serviceprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ScratchpadOauth10aServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScratchpadOauth10aServiceProviderApplication.class, args);
    }
}
