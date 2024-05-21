
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Asus
 */
public class Client {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contractID = sc.next();
        String propertyID = sc.next();
        String tenantID = sc.next();
        int rentMount = sc.nextInt();
        requestRentalContract(contractID, propertyID, tenantID, rentMount);
        System.out.println(contractID + " " + propertyID + " " + tenantID + " " + rentMount);
    }

    public static void requestRentalContract(String contractID, String propertyID, String tenantID, int rentAmount) {
        Contract currentContract = new Longterm()
                .BuildContractID(contractID)
                .BuildPropertyID(propertyID)
                .BuildTenantID(tenantID)
                .BuildRentAmount(rentAmount)
                .build();

    }
}
