package com.mycompany.login;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class LOGIN {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        
        Scanner name = new scanner(System.in);
        System.out.println("Username");
        String username = name.next().tolowerCase();
        
        Scanner pass = new Scanner(System.in);
        System.out.println("Password");
        String password = pass.next().tolowerCase();
        
        System.out.println("You are logged in");
        
        Scanner ask = new Scanner(System.in);
        System.out.println("Do you want to check this or not select(yes or no) :");
        
        for(User: users){
            if(user.getUsername().equals(username)&& user.getPassword().equals(password)){
                System.out.println("Login Successful.");
                return;
            }
           
        }
        System.out.println("Login failed.Username or password incorrect.");
        
        while(true){
            if ("yes".equals("yes")){
                
                System.out.println("Username");
                String scann = scanner.next().toLowerCase();
                
                if (scann.equals(username)){
                    System.out.println("Password:");
                    String passcan = scanner.next().toLowerCase();
                    
                    if(scann.equals(username)) {
                        System.out.println("Password:");
                        passcan = scanner.next().toLowerCase();
                        
                        if(passcan.equals(password)){
                            System.out.println("You are now logged in");
                            break;
                        }else{
                            throw new RuntimeException("Wrong password!");
                        }
                    }else{
                        System.out.println("Username not found, try again.");
                    }
                    
                } else{
                    System.out.println("Invalid input, please enter yes or no");
                    
                    // Start the user management operations
                    
                        while (true){
                            System.out.println("\nUser Management System");
                            System.out.println("1.Register");
                            System.out.println("2.Login");
                            System.out.println("Forgot Password");
                            System.out.println("4.Exit");
                            System.out.println("Enter your choice");
                            int choice = scanner.nextInt();
                            scanner.nextLine();//
                            
                            System.out.println("Enter your choice");
                            int choice = scanner.nextInt();
                            scanner.nextLine();
                            
                            if(choice == 1){
                                Register();
                            } else if (choice ==2){
                                login();
                            }
                        }
                    }
                    
                    
                   
                }
            }
        }
        
        
        
       
    }
}
