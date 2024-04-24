import java.util.ArrayList;
import java.util.List;

public class Rental {
    private String contractId;
    private String propertyId;
    private String tenantId;
    private String rentAmount;
    private static List<Rental> contractList = new ArrayList<>();

    public Rental(String contractId, String propertyId, String tenantId, String rentAmount) {
        this.contractId = contractId;
        this.propertyId = propertyId;
        this.tenantId = tenantId;
        this.rentAmount = rentAmount;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(String rentAmount) {
        this.rentAmount = rentAmount;
    }

    public static List<Rental> getContractList() {
        return contractList;
    }

    public static void removeContract(Rental contract) {
        contractList.remove(contract);
    }

    public void addContract() {
        contractList.add(this);
    }
}