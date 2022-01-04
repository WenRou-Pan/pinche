package com.pinche.domain.address;

/**
 * @author <a href="https://github.com/WenRou-Pan">Parmaze</a>
 * @since 2021/12/16
 */
public class GeoAddress {
    private String name;
    private String address;
    private Dot dot;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Dot getDot() {
        return dot;
    }

    public void setDot(Dot dot) {
        this.dot = dot;
    }
}
