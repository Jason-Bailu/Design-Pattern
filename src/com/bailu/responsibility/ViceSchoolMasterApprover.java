package com.bailu.responsibility;

public class ViceSchoolMasterApprover extends Approver{
    public ViceSchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice() > 10000 && request.getPrice() <= 30000) {
            System.out.println("id="+request.getId()+"is handled by "+this.name);
        } else {
            approver.processRequest(request);
        }
    }
}
