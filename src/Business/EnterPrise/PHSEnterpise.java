/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.EnterPrise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public class PHSEnterpise extends Enterprise{

    public PHSEnterpise(String name) {
        super(name, EnterpriseType.PHS);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
    
}
