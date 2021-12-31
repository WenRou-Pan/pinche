package com.pinche.domain.request;

import javax.validation.constraints.NotNull;

/**
 * @author Parmaze
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
