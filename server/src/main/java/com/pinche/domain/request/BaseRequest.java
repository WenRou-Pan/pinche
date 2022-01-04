package com.pinche.domain.request;

import javax.validation.constraints.NotNull;

/**
 * @author <a href="https://github.com/WenRou-Pan">Parmaze</a>
 * @since 2021/12/16
 */
public class BaseRequest {
    @NotNull(message = "token can't null")
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
