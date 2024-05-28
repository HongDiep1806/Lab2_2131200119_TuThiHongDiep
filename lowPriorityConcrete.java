
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class lowPriorityConcrete extends RequestProduct{

    @Override
    void setPriority() {
        priority = "Ignore";
    }

    @Override
    void setExpireDay() {
        expireDay = LocalDate.now().toString();
    }

    @Override
    void setStatus() {
        status = "Done";
    }

    @Override
    void processRequest() {
        System.out.println("Request dined");
    }
    
}
