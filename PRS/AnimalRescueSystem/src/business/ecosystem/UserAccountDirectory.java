/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.ecosystem;

import business.ecosystem.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author nishi
 */
public class UserAccountDirectory {
    ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory(){
        userAccountList = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }
    
    public UserAccount addNewUserAccount(){
        UserAccount userAccount = new UserAccount();
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public void removeUserAccount(UserAccount userAccount){
        userAccountList.remove(userAccount);
    }
    
    public UserAccount userCheck(String email, String password){
        for (UserAccount user : userAccountList)
            if (user.getEmail().equals(email) && user.getPassword().equals(password)){
                return user;
            }
        return null;
    }
    
    public UserAccount findAccount(String id){
        for (UserAccount user : userAccountList)
            if (id.equals(user.getUserAccountId())){
                return user;
            }
        return null;
    }
    
    
}
