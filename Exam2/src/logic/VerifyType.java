package logic;

public class VerifyType {
    public boolean isInt(String string){ //Verified if the Input is Interger
        boolean isInt = true;
        try{
            Integer.parseInt(string);
        }catch (Exception e){
            isInt = false;
        }
        return isInt;
    }
}
