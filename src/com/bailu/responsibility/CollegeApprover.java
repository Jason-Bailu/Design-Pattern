package com.bailu.responsibility;

public class CollegeApprover extends Approver{
    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice() > 5000 && request.getPrice() <= 10000) {
            System.out.println("id="+request.getId()+"is handled by "+this.name);
        } else {
            approver.processRequest(request);
        }
    }
}
