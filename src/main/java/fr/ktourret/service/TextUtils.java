package fr.ktourret.service;

public class TextUtils {

    /**
     * @param password
     * @return true if the password has 8+ length and contains a @
     */
    public boolean isALegitPassword(String password) {
        return password.contains("@") && password.length() >= 8;
    }

    public boolean isPalindrome(String str) {
        str = str.toLowerCase()
                .replace('é', 'e')
                .replace('è', 'e')
                .replace('à', 'a')
                .replace(',', ' ')
                .replace(" ", "");
        String inverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            inverse += str.charAt(i);
        }
        return str.equals(inverse);
    }

}
