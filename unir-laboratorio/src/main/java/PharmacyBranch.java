/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author v.quiroz-castro
 */
public class PharmacyBranch {
    private String name;
    
    public PharmacyBranch(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getAddress() {
        switch (this.name) {
            case "main":
                return "Calle de la Rosa n. 28";
            case "secondary":
                return "Calle Alcazabilla n. 3";
            default:
                return null;
        }
    }
}
