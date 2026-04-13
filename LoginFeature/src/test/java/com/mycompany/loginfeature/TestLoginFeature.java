/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.loginfeature;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class TestLoginFeature {
    
    public TestLoginFeature() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
  
    @Test
    public void testUsernameCorrectlyFormatted() {
        boolean result = loginClass.Login.checkPasswordComplexity("Ch&&sec@ke99!");
       
    }
     @Test
    public void testReturnLoginStatusSuccess() {
        String message = loginClass.Login.returnLoginStatus(true, "kyle", "Smith");
        
        
    }
    
    
    @Test
    public void testUsernameIncorrectlyFormatted(){
        boolean isValid = loginClass.Login.checkUserName("kyle");
        String message;
        
        if(isValid){
            message = "Username is not correctly formated; please make sure that your username contains an underscore and is not more than five five characters long.";
        } else {
            message = "Welcome Kyle Smith";
        }
        assertEquals(
                "Username is not correctly formatted; please ensure that your username contains an underscore and is not more than five characters long",
                message
        );
    }
    @Test
    public void testCellphoneCorrectlyFormatted(){
        
        boolean result = loginClass.Login.checkCellphoneNumber("+27838968976");
        String message = result
                ? "Cellphone number successfully captured."
                : "Cell number is incorrectly formatted or does not contain an international code; please crrect the nimber and try again.";
        
        assertEquals("Cellphone number is successfully captured.", message);
    }    
     @Test
    public void testCellPhoneIncorrectlyFormatted(){
        
        boolean result = loginClass.Login.checkCellphoneNumber("08966553");
        String message = result
                ? "Cellphone succesfully captured."
                : "Cellphone number is incorrectly formatted or does not contain an international code; please correct the number and try again.";
            
        
              
    }
      @Test
    public void testLoginSuccessful(){
        
        boolean result = loginClass.Login.loginUser("Kyle_1", "Ch&&sec@ke99!");
        assertTrue(result);
    }
     @Test
    public void testLoginFailed(){
        
        boolean result = loginClass.Login.loginUser("wrongUser", "wrongPass");
        assertTrue(result);
    }
    @Test
    public void testCheckUserNameTrue(){
        assertTrue(loginClass.Login.checkUserName("kyl_1"));
    }
    @Test
    public void testCheckUserNameFalse(){
        assertFalse(loginClass.Login.checkUserName("kyle||"));
    }
     @Test
    public void testCheckPasswordComplexityTrue(){
        assertTrue(loginClass.Login.checkPasswordComplexity("Ch&&secke99!"));
    }
    @Test
    public void testCheckPasswordComplexityFalse(){
        assertFalse(loginClass.Login.checkPasswordComplexity("password"));
    }
    @Test
    public void testCheckCellPhoneTrue(){
        boolean result = loginClass.Login.checkCellphoneNumber("+27838968976");
    }
    @Test
    public void testCheckCellPhoneFalse(){
        assertFalse(loginClass.Login.checkCellphoneNumber("08966553"));
    }
    
        
        
        
       
    
}
