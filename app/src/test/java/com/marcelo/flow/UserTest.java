package com.marcelo.flow;

import com.marcelo.flow.data.User;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by projeto on 11/10/2016.
 */

public class UserTest {
    @Test
    public void checkPasswordIsOk() throws Exception {
        User moderator = new User();
        moderator.setEmail("marcelolajr@gmail.com");
        moderator.setFullname("Marcelo Aguiar");
        moderator.setNickname("Dartagnan");
        moderator.setPassword("123456");

        assertEquals("Esperado que passe o password",moderator.checkPasword("123456"),true);
    }
}
