package org.springframework.social.yandex.connect;

import org.springframework.social.connect.support.OAuth2ConnectionFactory;
import org.springframework.social.yandex.api.Yandex;

/**
 * @author Anton Rudenko.
 */
public class YandexConnectionFactory extends OAuth2ConnectionFactory<Yandex> {

    public YandexConnectionFactory(String clientId, String clientSecret) {
        super("yandex", new YandexServiceProvider(clientId, clientSecret), new YandexAdapter());
    }
}
