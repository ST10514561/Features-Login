package com.mycompany.loginfeature;
import java.util.Scanner;

public class loginClass {
    
   static Scanner input = new Scanner(System.in);
   
    //
    static String storedUsername = "";
    static String storedPassword = "";
    static String storedFirstName = "";
    static String storedLastName = "";
    
    static class Login {
        public static boolean checkUserName(String username){
            return username.contains("_");
        }
        public static boolean checkPasswordComplexity(String password){
            if (password.length() < 8) return false;
            
            boolean upper = password.matches(".*[A-Z].*");
            boolean digit = password.matches(".*[0-9].*");
            boolean special = password.matches(".*[^a-zA-Z0-9].*");
            
             return upper && digit && special;
          
        }
        public static boolean checkCellphoneNumber(String phone){
            return phone.startsWith("+27") && phone.length() ==12;
                   
        }
        public static String registerUser(String username, String password){
            if(checkPasswordComplexity(username)){
                return ("!Password does not meet complexity requirements.");
            }
            storedUsername = username;
            storedPassword = password;
            
            return "User registerd successfully.";
        }
        public static boolean loginUser(String username, String Password){
            return username.equals(storedUsername) && Password.equals(storedPassword);
        }
        public static String returnLoginStatus(boolean success, String FirstName, String LastName){
           String message;
           
           if (success){
               message = "Welcome " + FirstName + " " + LastName;
           } else {
               message = "Username is incorrect, please try again";
           }
           return message;
            
        }
        public static String returncellPhoneStatus(boolean valid){
            if (valid){
                return "Cellphone number successfully added.";
            }else {
                return "Cellphone number incorrectly formatted or does not contain international code";
            }
        }
    }
    
    
}

