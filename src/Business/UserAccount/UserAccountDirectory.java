/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;
    private ArrayList<UserAccount> uaVacancyList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
        uaVacancyList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public ArrayList<UserAccount> getUaVacancyList() {
        return uaVacancyList;
    }
    
    public void removeUaVacancy(UserAccount ua){
        uaVacancyList.remove(ua);
    }
    
    public void addUaVacancy(UserAccount ua){
        uaVacancyList.add(ua);
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        uaVacancyList.add(userAccount);
        return userAccount;
    }
}
