/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.EnterPrise;

import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import com.db4o.collections.ActivatableArrayList;
import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory(){
        enterpriseList = new ActivatableArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        
        if(type == Enterprise.EnterpriseType.Hospital){
            enterprise = new HospitalEnterpise(name);
            enterpriseList.add(enterprise);
        }else if(type == Enterprise.EnterpriseType.Supplier){
            enterprise = new SupplierEnterpise(name);
            enterpriseList.add(enterprise);
        }else if(type == Enterprise.EnterpriseType.PHS){
            enterprise = new PHSEnterpise(name);
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }
    
    public Enterprise getEnterpriseByUserAccount(UserAccount ua){
        Enterprise ent = null;
        for(Enterprise ep: enterpriseList){
            for(Organization org : ep.getOrganazDirectory().getOrganizationList()){
                for(UserAccount account : org.getUserAccountDirectory().getUserAccountList()){
                    if(account.equals(ua)){
                        ent = ep;
                        break;
                    }
                }
            }
        }
        return ent;
    }
}
