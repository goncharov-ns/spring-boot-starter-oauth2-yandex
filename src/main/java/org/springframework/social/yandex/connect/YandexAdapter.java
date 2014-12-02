package org.springframework.social.yandex.connect;

import org.springframework.social.ApiException;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.UserProfileBuilder;
import org.springframework.social.yandex.api.Yandex;
import org.springframework.social.yandex.api.YandexPassport;

/**
 * @author Anton Rudenko.
 */
public class YandexAdapter implements ApiAdapter<Yandex> {
    @Override
    public boolean test(Yandex yandex) {
        try {
            yandex.userOperations().getPassport();
            return true;
        } catch (ApiException e) {
            return false;
        }
    }

    public void setConnectionValues(Yandex yandex, ConnectionValues values) {
        YandexPassport profile = yandex.userOperations().getPassport();
        values.setProviderUserId(String.valueOf(profile.getId()));
        values.setDisplayName(profile.getLogin());

        // yandex does not provide it
        values.setProfileUrl("");
        values.setImageUrl("");
    }

    public UserProfile fetchUserProfile(Yandex yandex) {
        YandexPassport profile = yandex.userOperations().getPassport();
        return new UserProfileBuilder().setName(profile.getDisplayName()).setFirstName(profile.getFirstName()).setLastName(profile.getLastName()).
                setEmail(profile.getDefaultEmail()).setUsername(profile.getLogin()).build();
    }

    public void updateStatus(Yandex yandex, String message) {
        // do nothing;
    }
}
