/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.EnterPrise.Enterprise;
import Business.MedicalDevice.MedicalDeviceProduct;
import Business.Network.Network;
import Business.Organization.MedStaffOrganization;
import Business.Organization.Organization;
import Business.Organization.SupplierOrganization;
import Business.Role.AccountingRole;
import Business.Role.AssetMgtRole;
import Business.Role.DoctorRole;
import Business.Role.HSPAdminRole;
import Business.Role.NurseRole;
import Business.Role.PHSAdminRole;
import Business.Role.SupplierRole;
import Business.Role.SystemAdminRole;
import Business.Role.TeamLeaderRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author raunakc
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        Employee employee = system.getEmployeeDirectory().createEmployee("Martin");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        //Test code
        Network network = system.createAndAddNetwork();
        network.setName("Boston");
        
        Enterprise phsEnterprise = network.getEnterpriseDirectory().createAndAddEnterprise("PHS", Enterprise.EnterpriseType.PHS);
        Enterprise hspEnterprise = network.getEnterpriseDirectory().createAndAddEnterprise("RedCross", Enterprise.EnterpriseType.Hospital);
        Enterprise supEnterprise = network.getEnterpriseDirectory().createAndAddEnterprise("Siemens", Enterprise.EnterpriseType.Supplier);
        
        employee = phsEnterprise.getEmployeeDirectory().createEmployee("E1");
        phsEnterprise.getUserAccountDirectory().createUserAccount("phs", "123", employee, new PHSAdminRole());
        
        employee = hspEnterprise.getEmployeeDirectory().createEmployee("E2");
        hspEnterprise.getUserAccountDirectory().createUserAccount("hsp", "123", employee, new HSPAdminRole());
        
        Organization supOrganization = supEnterprise.getOrganazDirectory().createOrganization(Organization.Type.Supplier);
        employee = supOrganization.getEmployeeDirectory().createEmployee("E3");
        UserAccount supUser = supOrganization.getUserAccountDirectory().createUserAccount("sup", "123", employee, new SupplierRole());
        
        Organization organization = phsEnterprise.getOrganazDirectory().createOrganization(Organization.Type.AssetMgt);
        employee = organization.getEmployeeDirectory().createEmployee("E4");
        organization.getUserAccountDirectory().createUserAccount("ass", "123", employee, new AssetMgtRole());
        
        organization = phsEnterprise.getOrganazDirectory().createOrganization(Organization.Type.Finace);
        employee = organization.getEmployeeDirectory().createEmployee("E5");
        organization.getUserAccountDirectory().createUserAccount("fin", "123", employee, new AccountingRole());
        
        organization = hspEnterprise.getOrganazDirectory().createOrganization(Organization.Type.MedStaff);
        Employee employee1 = organization.getEmployeeDirectory().createEmployee("E6");
        UserAccount userAccount = organization.getUserAccountDirectory().createUserAccount("doc", "123", employee1, new DoctorRole()); 
        
        Employee employee2 = organization.getEmployeeDirectory().createEmployee("E7");
        UserAccount userAccount1 = organization.getUserAccountDirectory().createUserAccount("team", "123", employee2, new TeamLeaderRole()); 
        ((MedStaffOrganization)organization).createTeam(userAccount1);
        
        Employee employee3 = organization.getEmployeeDirectory().createEmployee("E8");
        UserAccount userAccount2 =organization.getUserAccountDirectory().createUserAccount("nurs", "123", employee3, new NurseRole());   
        
        MedicalDeviceProduct mdp = ((SupplierOrganization)supOrganization).getmDProductCatalog().addProduct();
        mdp.setClassification("I");
        mdp.setDescription("Test");
        mdp.setModel("Md00001");
        mdp.setName("Knife");
        mdp.setManufacturer(supUser);
        mdp.setPrice(100000);
        
        
   
        return system;
    }
    
}
