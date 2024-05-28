
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Asus
 */
public class Tenant {

    private User user;
    private List<RentalContract> listOfContract = new ArrayList<>();
    
    public static String requestCreateRentalContract(){
        return "Wanting to create new contract";
    }
    
    public static String requestTerminateRentalContract(String contractID){
        return "Wanting to terminate this contract : "+contractID;
    }
    

}

