package logic;

import constant.RegexConstant;
import entity.User;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyInfo {
    private Matcher matcher;
    //Verify the Email of User X
    public boolean verifyRegisterEmail(ArrayList<User> users, String email){ //Case 1: Verified if the Email isn't exist in the Server
        boolean verify = false;
        Pattern pattern = Pattern.compile(RegexConstant.EMAIL.value);
        matcher = pattern.matcher(email);
        if (matcher.matches()){
            verify = true;
            for (User user: users) {
                if (user.getEmail().equals(email)){
                    verify = false;
                    break;
                }
            }
        }
        return verify;
    }
    public boolean verifyLoginEmail(User user, String email){ //Case 2: Verified if the Email belongs to User X
        boolean verify = false;
        Pattern pattern = Pattern.compile(RegexConstant.EMAIL.value);
        matcher = pattern.matcher(email);
        if (matcher.matches() && user.getEmail().equals(email)){
            verify = true;
        }
        return verify;
    }

    //Verify the Password of User X
    public boolean verifyRegisterPassword(String password){ //Case 1: Verified if the Password satisfy all Conditions
        boolean verify = false;
        Pattern pattern = Pattern.compile(RegexConstant.PASSWORD.value);
        matcher = pattern.matcher(password);
        if (matcher.matches()){
            verify = true;
        }
        return verify;
    }
    public boolean verifyLoginPassword(User user, String password){ //Case 2: Case 1 + the Password belongs to User X
        boolean verify = false;
        Pattern pattern = Pattern.compile(RegexConstant.PASSWORD.value);
        matcher = pattern.matcher(password);
        if (matcher.matches() && user.getPassword().equals(password)){
            verify = true;
        }
        return verify;
    }

    //Verify the Username of User X
    public boolean verifyRegisterUsername(ArrayList<User> users, String username){ //Case 1: Verified if the Username isn't exist in the Server
        boolean verify = true;
        for (User user: users) {
            if (user.getUsername().equals(username)){
                verify = false;
                break;
            }
        }
        return verify;
    }
    public User verifyLoginUsername(ArrayList<User> users, String username){ //Case 2: (Return User) 1, Return Null if the Username isn't exist in the Server / 2, Find User X in the Server -> Return User X
        User user = null;
        for (User userTemp: users) {
            if (userTemp.getUsername().equals(username)){
                user = userTemp;
                break;
            }
        }
        return user;
    }
}
