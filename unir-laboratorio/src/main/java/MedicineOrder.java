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
    private String name;
    private int amount;
    private MedicineKind kind;
    private PharmacyBranch[] branches;
    private Distributor distributor;
    
    public MedicineOrder(
            String name,
            int amount,
            MedicineKind kind,
            Distributor distributor,
            PharmacyBranch[] branch
            
    ) {
        this.name = name;
        this.amount = amount;
        this.kind = kind;
        this.branches = branches;
        this.distributor = distributor;
    }
    
    public String getDistributorName() {
        return this.distributor.getName();
    }
}
