package org.springframework.social.yandex.api.impl;

import org.springframework.social.MissingAuthorizationException;

/**
 * @author Anton Rudenko.
 */
public class AbstractYandexOperations {

    private final boolean isAuthorized;

    public AbstractYandexOperations(boolean isAuthorized) {
        this.isAuthorized = isAuthorized;
    }

    protected void requireAuthorization() {
        if (!isAuthorized) {
            throw new MissingAuthorizationException("yandex");
        }
    }
}
