
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class highPriorityConcrete extends RequestProduct{

    @Override
    void setPriority() {
        priority = "Emergency";
    }

    @Override
    void setExpireDay() {
        expireDay = LocalDate.now().toString();
    }

    @Override
    void setStatus() {
        status ="Accept";
    }

    @Override
    void processRequest() {
        System.out.println("Emergency request, our Administer will contact you immediately !");    
    }
    
}
