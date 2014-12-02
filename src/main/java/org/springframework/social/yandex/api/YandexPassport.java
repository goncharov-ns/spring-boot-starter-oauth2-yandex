package org.springframework.social.yandex.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * {
     "first_name": "\u0412\u0430\u0441\u044F",
     "last_name": "\u041F\u0443\u043F\u043A\u0438\u043D",
     "display_name": "Vasya",
     "emails":
     [
     "test@yandex.ru",
     "other-test@yandex.ru"
     ],
     "default_email": "test@yandex.ru",
     "real_name": "\u0412\u0430\u0441\u044F \u041F\u0443\u043F\u043A\u0438\u043D",
     "birthday": "1987-03-12",
     "login": "vasya",
     "old_social_login": "uid-mmzxrnry",
     "sex": "male",
     "id": "1000034426"
    }
 * @author Anton Rudenko.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class YandexPassport {

    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("display_name")
    private String displayName;
    private List<String> emails;
    @JsonProperty("default_email")
    private String defaultEmail;
    @JsonProperty("real_name")
    private String realName;
    private String birthday;
    private String login;
    @JsonProperty("old_social_login")
    private String oldSocialLogin;
    private String sex;
    private Long id;
    @JsonProperty("default_avatar_id")
    private Long defaultAvatarId;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public String getDefaultEmail() {
        return defaultEmail;
    }

    public void setDefaultEmail(String defaultEmail) {
        this.defaultEmail = defaultEmail;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getOldSocialLogin() {
        return oldSocialLogin;
    }

    public void setOldSocialLogin(String oldSocialLogin) {
        this.oldSocialLogin = oldSocialLogin;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDefaultAvatarId() {
        return defaultAvatarId;
    }

    public void setDefaultAvatarId(Long defaultAvatarId) {
        this.defaultAvatarId = defaultAvatarId;
    }
}
