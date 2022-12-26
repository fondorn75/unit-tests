package Coverage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class usersTest {

    @Test
    void testUserCreation(){
        Users users = new Users("name", "qwerty");
        assertTrue(users.authorisation("name", "qwerty"));
    }

    @Test
    void testUserCreationFail(){
        Users users = new Users("name", "qwerty");
        assertFalse(users.authorisation("name", "123"));
    }
}
