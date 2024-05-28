/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public abstract class RequestProduct {

    String priority = new String();
    String expireDay = new String();
    String status = new String();
    
     abstract void setPriority();
     abstract void setExpireDay();
     abstract void setStatus();
     abstract void processRequest();
    
}


