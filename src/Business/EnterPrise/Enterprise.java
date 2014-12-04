/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.EnterPrise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public abstract class Enterprise extends Organization{
    
    private OrganizationDirectory organazDirectory;   
    private EnterpriseType enterpriseType;

    public Enterprise(String name, EnterpriseType enterpriseType) {
        super(name);
        this.enterpriseType = enterpriseType;
        this.organazDirectory = new OrganizationDirectory();
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"),
        Supplier("Supplier"),
        PHS("Partner HealthCare System");
        
        private String value;
        private EnterpriseType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }
        
        public String toString(){
            return value;
        }
    }

    public OrganizationDirectory getOrganazDirectory() {
        return organazDirectory;
    }

    public void setOrganazDirectory(OrganizationDirectory organazDirectory) {
        this.organazDirectory = organazDirectory;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public String toString(){
        return super.getName();
    }
    
    
}
