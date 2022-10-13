package com.juaracoding.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOne {
    public static void main(String[] args) throws InterruptedException {
        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "D:\\Bootcamp SQA\\chromedriver.exe");

        // Instantiate a ChromeDriver class.
        WebDriver driver=new ChromeDriver();
        //Maximize the browser
        driver.manage().window().maximize();
        String url = "https://demoqa.com/text-box";
        driver.get(url);
       // driver.get("https://www.facebook.com");
//        driver.findElement(By.name("email"));
//        driver.findElement(By.name("pass"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
       // driver.findElement(By.id("userName")).sendKeys("JuaraCoding"); //find by element
        driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Ahlan"); // find by xpath

        WebElement userName = driver.findElement(By.xpath("//*[@id='userName']"));
        userName.sendKeys("Ahlan"); //jika element username digunakan ditempat lain

        System.out.println("input user name");
        driver.findElement(By.id("userEmail")).sendKeys("testqa@gmail.com");
        System.out.println("input user email");
        driver.findElement(By.id("currentAddress")).sendKeys("Jl.Tebet Timur Dalam");
        System.out.println("input current address");
        driver.findElement(By.id("permanentAddress")).sendKeys("Jl.Tebet Timur Dalam IX");
        System.out.println("input permanent address");

        js.executeScript("window.scrollBy(0,1000)");

        driver.findElement(By.id("submit")).click();
        System.out.println("button submit clicked");

        Thread.sleep(5000); //delay
        driver.quit(); // keluar otomatis setelah delay

    }

}
