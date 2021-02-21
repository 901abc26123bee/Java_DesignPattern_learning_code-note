package com.responsibilitychain;

public class ViceSchoolMasterApprover extends Approver{

    public ViceSchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice() < 10000 && purchaseRequest.getPrice() <= 30000) {
            System.out.println(" 請求編號 id= " + purchaseRequest.getId() + " 被 " + this.name + " 處理");
        }else {
            approver.processRequest(purchaseRequest);
        }
    }
}