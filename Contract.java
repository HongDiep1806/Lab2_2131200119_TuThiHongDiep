/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Contract {
    private String ContractID;
    private String propertyID;
    private String tenantID;
    private int rentAmount;

    public Contract(String ContractID, String propertyID, String tenantID, int rentAmount) {
        this.ContractID = ContractID;
        this.propertyID = propertyID;
        this.tenantID = tenantID;
        this.rentAmount = rentAmount;
    }
}
