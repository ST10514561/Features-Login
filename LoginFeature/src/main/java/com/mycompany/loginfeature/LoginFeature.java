package com.mycompany.loginfeature;
import java.util.Scanner;

public class LoginFeature {

    public static void main(String[] args) {
       
        //Instantiate Scanner
        Scanner Jv = new Scanner(System.in);
     
      
       
       String username = Jv.next();
       
       
       String password;
        
       
       //Prompt user to add the following details
        System.out.println("------------Register Account----------");
        System.out.println("Create Your Username:");
        System.out.println("Create Your Password:");
        String Password = Jv.next();
        
        //
        if (username.contains("_")&& username.length() <= 5){
            System.out.println("Username successfulyy captured");
        }else {
            System.out.println("USERNAME IS NOT CORRECTLY FORMATTED; PLEASE ENURE THAT YOUR USERNAME CONTAINS AN UNDERSCORE AND IS NO MORE THAN FIVE CHARACTERS LONG.");
        }
        System.out.println("Enter your password");
        password = Jv.next();
        
        //Password Validation
        boolean hasUpper = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;
        
        for (int i = 0; i < password.length(); i++){
            char ch = password.charAt(i);
            
            if (Character.isUpperCase(ch)){
                hasUpper = true;
            }else if (Character.isDigit(ch)){
                hasNumber = true;
            }else if (!Character.isLetterOrDigit(ch)){
                hasSpecial = true;
            }
        }
        //Prompting the User to add the following details
        System.out.println(" ");
        
        System.out.println("Account that has been created successfully");
        
        System.out.println(" ");
        
        System.out.println("Login Your account");
        
        String userN = "LoginSystems";
       
        
        System.out.println("Enter Your username (username should contain underscore)");
        
        username = Jv.next();
        System.out.println("Enter your password (should have atleast 8 characters, should contain a capital letter, contain a number, contain a special character.)");;
        password = Jv.next();
        
       
        System.out.println("Enter cell phone number(+27___________________)");
        String phone = Jv.next();
        //boolean validPhone = login.checkCellPhoneNumber(phone);
        if(username.equals("LoginSystem")&& password.equals("578901")){
            System.out.println("login is Successful");
        }
        else
        {
            System.out.println("INCORRECT USERNAME OR PASSWORD!");
        }
       
        
        System.out.println("1. Profile");
        System.out.println("2. Message");
        System.out.println("Settings");
        String choice = Jv.next(); 
        
        switch(choice){
            //Profile details
            case "1":
                System.out.println("1.Update Profile");
                System.out.println("2.Update Status");
                System.out.println(" 3.Change Name");
                System.out.println("4.Back to menu");
                break;
                
                //Message details
            case "2":
                System.out.println("Delete Message");
                System.out.println("Back to Menu");
                break;
                
                //Settings Details
            case "3":
                System.out.println("Logout Now");
                System.out.println("Logout Later");
                System.out.println("Back to Menu");
                break;
                
            default:
                System.out.println("Invalid Input!!!!");
                      
        }
        
    }
    
    }
// Code Attribution
//https://gist.github.com/Sabareh/f34e2c81804465df3005efd471b645d7
//https://www.javaguides.net/2024/04/building-login-and-registration-system-with-java.html
//https://stackoverflow.com/questions/16627910/how-to-code-a-very-simple-login-system-with-java
//https://chatgpt.com. 
//https://youtu.be/QwQuro7ekvc?si=DOjHAcHIpZeKZOwe