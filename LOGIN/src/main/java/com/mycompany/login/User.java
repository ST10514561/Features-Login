
package com.mycompany.login;


public class User {
    private String username;
    private String password;
    private String email;
    private String secretQuestion;
    private String secretAnswer;
    
    //
    public User(String username, String password, String email,String secretQuestion, String secretAnswer){
        this.username = username;
        this.password = password;
        this.email = email;
        this.secretAnswer = secretAnswer;
        this.secretQuestion = secretQuestion;
    }
    
    //Getters and Setters
    public String getPassword(){
        return username;
    }
    public String getEmail(){
        return email;
    }
    public String getSecretQuestion(){
        return secretQuestion;
    }
    public String getSecretAnswer(){
        return secretQuestion;
    }
    //
    public void setPassword(String password){
        this.password = password;
    }
    
   
           
    
            
    
}
