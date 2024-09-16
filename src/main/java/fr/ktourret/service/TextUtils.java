package fr.ktourret.service;

public class TextUtils {

    /**
     * @param password
     * @return true if the password has 8+ length and contains a @
     */
    public boolean isALegitPassword(String password) {
        return password.contains("@") && password.length() >= 8;
    }

}
