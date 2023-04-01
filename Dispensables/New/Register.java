package Dispensables.New;

public class Register {
    String email, password, confpassword;
    
    public String checkRegisInfo(){
        final boolean isEmail = email.contains("@");
        final boolean passwordLength = password.length() >= 13;
        final boolean confPassCorrect = confpassword.equals(password);
        final boolean emailisEmpty = email.equals("");
        final boolean passwordisEmpty = password.equals("");
        final boolean confpassisEmpty = confpassword.equals("");

        if(isEmail && passwordLength && confPassCorrect){
            return "Successful";

        }else if(emailisEmpty || passwordisEmpty || confpassisEmpty){
            return "Please fill all the fields";

        }else if(!isEmail){
            return "Please fill the correct email address";

        }else if(!passwordLength){
            return "Password must be longer than 12 letters";

        }else if(!confPassCorrect){
            return "Please confirm your password";
        }
        return "Register Failed";    
    }
}
