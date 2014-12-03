/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Nurse.getValue())){
            organization = new NurseOrganization();
            organizationList.add(organization);
        }else if(type.getValue().equals(Type.Supplier.getValue())){
            organization = new SupplierOrganization();
            organizationList.add(organization);
        }else if(type.getValue().equals(Type.AssetMgt.getValue())){
            organization = new AssetMgtOrganization();
            organizationList.add(organization);
        }else if(type.getValue().equals(Type.HSPAdmin.getValue())){
            organization = new HSPAdminOrganization();
            organizationList.add(organization);
        }else if(type.getValue().equals(Type.PHSAdmin.getValue())){
            organization = new PHSAdminOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}