package com.bailu.compostie;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: JasonD
 * @date: 2023/9/4 22:18
 * @Description:
 */
public class University extends Organization{
    List<Organization> organizationList = new ArrayList<>();

    public University(String name, String describe) {
        super(name, describe);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescribe() {
        return super.getDescribe();
    }

    @Override
    protected void add(Organization organization) {
        organizationList.add(organization);
    }

    @Override
    protected void remove(Organization organization) {
        organizationList.remove(organization);
    }

    @Override
    protected void print() {
        System.out.println("--------------"+getName()+"--------------");
        for (Organization organization : organizationList) {
            organization.print();
        }
    }
}
