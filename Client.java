
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
        // create rental contract
        Scanner sc = new Scanner(System.in);
        String contractID = sc.next();
        String propertyID = sc.next();
        String tenantID = sc.next();
        int rentMount = sc.nextInt();
        requestRentalContract(contractID, propertyID, tenantID, rentMount);
        System.out.println(contractID + " " + propertyID + " " + tenantID + " " + rentMount);

        //create new document
        String extension = sc.next();
        String encryptiontype = sc.next();
        newDocument(extension, encryptiontype);
    }

    public static void newDocument(String extension, String encyption) {
        Document newDoc = new NormalDoc()
                .SetExtension(extension)
                .SetEncryption(encyption)
                .BuildDoc();

    }

    public static void requestRentalContract(String contractID, String propertyID, String tenantID, int rentAmount) {
        Contract currentContract = new Longterm()
                .BuildContractID(contractID)
                .BuildPropertyID(propertyID)
                .BuildTenantID(tenantID)
                .BuildRentAmount(rentAmount)
                .SignContract();

    }
}
