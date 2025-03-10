package riwi.com.apigetway;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfiguration {

    @Bean
    public SecurityWebFilterChain SecurityWebFilterChain(ServerHttpSecurity httpSecurity) {
        httpSecurity.authorizeExchange(exchanges->exchanges.anyExchange().authenticated())
                .oauth2Login(Customizer.withDefaults());

        httpSecurity.csrf(ServerHttpSecurity.CsrfSpec::disable); // deshabilita los csrf

        return httpSecurity.build();
    }
}
