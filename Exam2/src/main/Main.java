package main;

import entity.User;
import logic.VerifyInfo;
import logic.VerifyType;
import logic.UserFunction;
import view.MainPage;
import view.MenuPage;

import java.util.ArrayList;

public class Main {
    public static User user;
    public static ArrayList<User> users = new ArrayList<>();
    public static VerifyType verifyType = new VerifyType();
    public static VerifyInfo verifyInfo = new VerifyInfo();
    public static MainPage mainPage = new MainPage();
    public static MenuPage menuPage = new MenuPage();
    public static UserFunction userFunction = new UserFunction();
    public static void main(String[] args) {
        menuPage.runMain();
    }
}
