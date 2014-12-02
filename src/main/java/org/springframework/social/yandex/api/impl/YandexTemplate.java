package org.springframework.social.yandex.api.impl;

import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.yandex.api.UserOperations;
import org.springframework.social.yandex.api.Yandex;

/**
 * @author Anton Rudenko.
 */
public class YandexTemplate extends AbstractOAuth2ApiBinding implements Yandex {

    private UserOperations userOperations;

    public YandexTemplate(String accessToken) {
        super(accessToken);

        initSubApis();
    }

    private void initSubApis() {
        userOperations = new UserTemplate(getRestTemplate(), isAuthorized());
    }

    @Override
    public UserOperations userOperations() {
        return userOperations;
    }
}
