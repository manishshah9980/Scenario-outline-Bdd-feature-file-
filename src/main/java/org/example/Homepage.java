package org.example;

import org.openqa.selenium.By;

public class Homepage extends Utils
{
    private By _username = By.id("txtUsername");
    private By _password = By.id("txtPassword");
    private By _login = By.id("btnLogin");



    public void enterUsername(String username) {

        try {
            Thread.sleep(2000); // System will go on sleep mode to allow loading the homepage(very Slow)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("txtUsername")).sendKeys(username);
    }
    public void enterPassword(String password) {
        try {
            Thread.sleep(2000); // System will go on sleep mode to allow loading the homepage(very Slow)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("txtPassword")).sendKeys(password);
    }
    public void clickOnLogin(){
        clickOnElement(_login);
    }













    }



