package fr.ktourret.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TextUtilsTest {

    private static TextUtils textUtils;

    @BeforeAll
    public static void init() {
        textUtils = new TextUtils();
    }

    @Test
    public void testSuccessLegitPassword() {
        assertTrue(textUtils.isALegitPassword("ZuperP@ssw0rd"));
    }

    @Test
    public void testSuccessPasswordTooShort() {
        assertFalse(textUtils.isALegitPassword("Short"));
    }

    @Test
    public void testSuccessPasswordTooShortWithAtrate() {
        assertFalse(textUtils.isALegitPassword("Short@"));
    }

    @Test
    public void testSuccessPasswordWithoutAtrate() {
        assertFalse(textUtils.isALegitPassword("NotShortButKO"));
    }

    // PALINDROME

    @Test
    public void testSuccessNotPalindrome() {
        assertFalse(textUtils.isPalindrome("toto"));
    }

    @Test
    public void testSuccessPalindromeNull() {
        assertFalse(textUtils.isPalindrome(null));
    }

    @Test
    public void testSuccessPalindrome() {
        assertTrue(textUtils.isPalindrome("À révéler mon nom, mon nom relèvera"));
    }

}
