package org.springframework.social.yandex.api.impl;

import org.springframework.social.yandex.api.UserOperations;
import org.springframework.social.yandex.api.YandexPassport;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

/**
 * @author Anton Rudenko.
 */
public class UserTemplate extends AbstractYandexOperations implements UserOperations {

    private RestTemplate restTemplate;

    public UserTemplate(RestTemplate restTemplate, boolean isAuthorizedForUser) {
        super(isAuthorizedForUser);
        this.restTemplate = restTemplate;
    }

    @Override
    public YandexPassport getPassport() {
        return getRestTemplate().getForObject(buildUri(), YandexPassport.class);
    }

    private URI buildUri() {
        return UriComponentsBuilder.fromHttpUrl("https://login.yandex.ru/info?format=json")
                .build()
                .toUri();
    }

    private RestTemplate getRestTemplate() {
        return restTemplate;
    }
}
