
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Asus
 */
public class mediumPriorityConcrete extends RequestProduct {

    @Override
    void setPriority() {
        priority = "Medium";
    }

    @Override
    void setExpireDay() {
        expireDay = LocalDate.now()
                .plusMonths(1)
                .toString();
    }

    @Override
    void setStatus() {
        status = "Accepted";
    }

    @Override
    void processRequest() {
        System.out.println("Request accept, estimated completion date is " + expireDay);
    }

}
