package service;

import org.springframework.stereotype.Service;
import model.User;
@Service
public class UserService {
    public boolean login(User user) {
        if(user.getUsername().equals("validuser")) {
            return true;
        }
        else {
            return false;
        }
    }
}
