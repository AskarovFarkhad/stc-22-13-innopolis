package validators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PasswordBlackListImpl implements PasswordBlackList {

    private static final List<String> BROKEN_PASSWORDS  = Arrays.asList("qwerty", "123456", "password");
    @Override
    public boolean contains(String password) {
        return BROKEN_PASSWORDS.contains(password);
    }
}
