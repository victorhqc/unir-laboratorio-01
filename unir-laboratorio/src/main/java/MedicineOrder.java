/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author v.quiroz-castro
 */
public class MedicineOrder {
    private final String name;
    private final int amount;
    private final MedicineKind kind;
    private PharmacyBranch[] branches;
    private final Distributor distributor;
    
    public MedicineOrder(
            String name,
            int amount,
            MedicineKind kind,
            Distributor distributor
    ) {
        this.name = name;
        this.amount = amount;
        this.kind = kind;
        this.distributor = distributor;
    }
    
    public void addBranches(PharmacyBranch [] branches) {
        this.branches = branches;
    }
    
    public String getDistributorName() {
        return this.distributor.getName();
    }
    
    public int getAmount() {
        return this.amount;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getKindName() {
        return this.kind.getName();
    }
    
    public String getBranchAddresses() {
        String addresses = "";
        int i, len;
        
        len = this.branches.length;
        
        for (i = 0; i < len; i++) {
            addresses += " y " + this.branches[i].getAddress();
        }
        
        return addresses.substring(3);
    }
}
