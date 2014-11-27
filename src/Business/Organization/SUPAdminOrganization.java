/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SUPAdminRole;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class SUPAdminOrganization extends Organization{

    public SUPAdminOrganization() {
        super(Type.SUPAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SUPAdminRole());
        return roles;
    }
     
}
