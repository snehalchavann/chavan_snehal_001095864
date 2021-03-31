package Business;

import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        System.out.println("In configure system");
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        Employee employeeAdmin = system.getEmployeeDirectory().createEmployee("John");
        Employee employeeDeliver = system.getEmployeeDirectory().createEmployee("Sam");
        Employee employeeCustomer = system.getEmployeeDirectory().createEmployee("Tom");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        UserAccount ua1 = system.getUserAccountDirectory().createUserAccount("admin", "admin", employeeAdmin, new AdminRole());
        system.getDeliveryManDirectory().createDeliveryMan("Sam");
        UserAccount ua2 = system.getUserAccountDirectory().createUserAccount("deliveryman", "deliveryman", employeeDeliver, new DeliverManRole());
        UserAccount ua3 = system.getUserAccountDirectory().createUserAccount("customer", "customer", employeeCustomer, new CustomerRole());
        Restaurant restaurant1 = system.getRestaurantDirectory().createRestaurant("Mumbai spice",ua1);
        Restaurant restaurant2 = system.getRestaurantDirectory().createRestaurant("Honest",ua1);
        
        return system;
    }
    
}
