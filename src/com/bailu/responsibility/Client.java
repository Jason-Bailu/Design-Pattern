package com.bailu.responsibility;

public class Client {
    public static void main(String[] args) {
        PurchaseRequest request = new PurchaseRequest(1, 31000, 1);
        
        DepartmentApprover departmentApprover = new DepartmentApprover("zhang");
        CollegeApprover collegeApprover = new CollegeApprover("li");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("duan");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("dong");

        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);

        departmentApprover.processRequest(request);
    }
}
