/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

/**
 *
 * @author Tharu
 */
public abstract class StaffMember {
    private String fullname;
    private final String staffID;
    protected String Department;

    public StaffMember(String fullname, String staffID, String Department) {
        this.fullname = fullname;
        this.staffID = staffID;
        this.Department = Department;
    }

    public String getFullname() {
        return fullname;
    }

    public String getStaffID() {
        return staffID;
    }

    public String getDepartment() {
        return Department;
    }
    
    public final void displayBasicDetails(){
        System.out.println("Full name: " + fullname);
        System.out.println("Staff ID: " + staffID);
        System.out.println("Department: " + Department);
    }
    
    public abstract double calculateMonthlyPayment();
}
