package Dispensables.Old;

public class Register{
    String email, password, confpassword;
    
    public String checkLoginInfo(){
        //Check if email contains @, password is longer than 13 and confirm password is the same as password
        if(email.contains("@") && password.length() >= 13 && confpassword.equals(password)){
            return "Successful";

        //Check if all the fields have a value
        }else if(email.equals("") || password.equals("") || confpassword.equals("")){
            return "Please fill all the fields";

        //Return an error if email doesnt contain @
        }else if(!email.contains("@")){
            return "Please fill the correct email address";

        //Return an error if password is too short
        }else if(password.length() > 13){
            return "Password must be longer than 12 letters";

        //Return an error if confirm password is different than the password
        }else if(confpassword.equals(password)){
            return "Please confirm your password";
        }

        //If none of conditions are filled then return "Register failed"
        return "Register Failed";    
    }
}
