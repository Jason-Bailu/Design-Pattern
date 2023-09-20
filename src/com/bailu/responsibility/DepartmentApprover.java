package com.bailu.responsibility;

public class DepartmentApprover extends Approver{
    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice() <= 5000) {
            System.out.println("id="+request.getId()+"is handled by "+this.name);
        } else {
            approver.processRequest(request);
        }
    }
}
