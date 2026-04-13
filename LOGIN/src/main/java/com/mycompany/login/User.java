
package com.mycompany.login;


public class User {
    private String username;
    private String password;
    private String email;
    private String cellPhoneNumber;
    private String secretAnswer;
    
    //
    public User(String username, String password, String email,String secretCellPhoneNumber, String secretAnswer){
        this.username = username;
        this.password = password;
        this.email = email;
        this.secretcellPhoneNumber = secretcellPhoneNumber;
    }
    
    //Getters and Setters
    public String getPassword(){
        return username;
    }
    public String getEmail(){
        return email;
    }
    public String getSecretcellPhoneNumber(){
        return name;
    }
    
    //
    public void setPassword(String password){
        this.password = password;
        
    }
    
   
           
    
            
    
}
