package com.fullstacklearning;

public class Main {

    public static void main(String[] args) {

        Admin_department AdminDepartment = new Admin_department();
        System.out.println("Welcome to "+AdminDepartment.departmentName());
        System.out.println(AdminDepartment.getTodaysWork()+"\n"+AdminDepartment.getWorkDeadline() +"\n"+AdminDepartment.isTodayAHoliday()+"\n");

        Hr_department HRDepartment = new Hr_department();
        System.out.println("Welcome to "+HRDepartment.departmentName());
        System.out.println(HRDepartment.doActivity()+"\n"+HRDepartment.getTodaysWork()+"\n"+HRDepartment.getWorkDeadline()+"\n"+HRDepartment.isTodayAHoliday()+"\n");

        Tech_department TechDepartment = new Tech_department();
        System.out.println("Welcome to "+TechDepartment.departmentName());
        System.out.println(TechDepartment.getTodaysWork()+"\n"+TechDepartment.getWorkDeadline()+"\n"+TechDepartment.getTechStackInformation()+"\n"+TechDepartment.isTodayAHoliday()+"\n");

    }
}
