/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public interface ContractBuilder {

    public ContractBuilder BuildContractID(String id);

    public ContractBuilder BuildPropertyID(String id);

    public ContractBuilder BuildTenantID(String id);

    public ContractBuilder BuildRentAmount(int id);

    public Contract SignContract();

    Contract build();
}
