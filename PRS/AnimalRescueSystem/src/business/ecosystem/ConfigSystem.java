/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.ecosystem;

import java.util.UUID;

/**
 *
 * @author nishi
 */
public class ConfigSystem {
    public static Business configure(){
        
        Business system = Business.getInstance();
       
        UserAccount user = system.userAccountDirectory.addNewUserAccount();
        user.setEmail("shelter@email.com");
        user.setPassword("123");
        user.setRole("ShelterAdmin");
        user.setUserAccountId(UUID.randomUUID().toString());
        
        UserAccount user2 = system.userAccountDirectory.addNewUserAccount();
        user2.setEmail("pop@email.com");
        user2.setPassword("123");
        user2.setRole("PopulationAdmin");
        user2.setUserAccountId(UUID.randomUUID().toString());
        
        UserAccount user3 = system.userAccountDirectory.addNewUserAccount();
        user3.setEmail("hos@email.com");
        user3.setPassword("123");
        user3.setRole("HospitalAdmin");
        user3.setUserAccountId(UUID.randomUUID().toString());
        
        UserAccount user4 = system.userAccountDirectory.addNewUserAccount();
        user4.setEmail("dis@email.com");
        user4.setPassword("123");
        user4.setRole("DistributionAdmin");
        user4.setUserAccountId(UUID.randomUUID().toString());
        
        UserAccount user5 = system.userAccountDirectory.addNewUserAccount();
        user5.setEmail("gov@email.com");
        user5.setPassword("123");
        user5.setRole("GovernmentAdmin");
        user5.setUserAccountId(UUID.randomUUID().toString());
              
        return system;
    }
    
}
