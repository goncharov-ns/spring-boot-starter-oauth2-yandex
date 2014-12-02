package org.springframework.social.yandex.connect;

import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;
import org.springframework.social.oauth2.OAuth2Template;
import org.springframework.social.yandex.api.Yandex;
import org.springframework.social.yandex.api.impl.YandexTemplate;

/**
 * @author Anton Rudenko.
 */
public class YandexServiceProvider extends AbstractOAuth2ServiceProvider<Yandex> {

    public YandexServiceProvider(String clientId, String clientSecret) {
        super(new OAuth2Template(clientId, clientSecret,
                "https://oauth.yandex.ru/authorize",
                "https://oauth.yandex.ru/token"));
    }

    public Yandex getApi(String accessToken) {
        return new YandexTemplate(accessToken);
    }

}
