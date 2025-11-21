
interface A{}
class Admin implements A{
    public void specialOperation() {
        System.out.println("Admin: Special operation performed!");
    }
}
class Guest {
    public void specialOperation() {
        System.out.println("Guest: Regular operation.");
    }
}

public class PermissionDemo {
    
    public static void performSpecialOperation(Object obj) {
        if (obj instanceof A) {
           
            ((Admin)obj).specialOperation();
        } else {
            
            throw new RuntimeException("Permission Denied: Object does not have permission.");
        }
    }

    public static void main(String[] args) {
        Admin admin = new Admin();
        Guest guest = new Guest();

        performSpecialOperation(admin); 

        try {
            performSpecialOperation(guest); 
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}