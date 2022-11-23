/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel_safe;

/**
 *
 * @author SHEHARA
 */

//Inheritance

public class receptionist extends systemUser {
    
    
    public receptionist(String ID, String userName, String password, String name, String phoneNo, String userAddress, String nicNo) {
        super(ID, userName, password, name, phoneNo, userAddress, nicNo);
    }
    
      
    
      public receptionist() {
    }
      
    @Override
      public void registerUser(user user){ 
      user.addUser();
    }
    
}
