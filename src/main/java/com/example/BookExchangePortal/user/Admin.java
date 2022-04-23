package com.example.BookExchangePortal.user;

public class Admin extends User{

    private String adminId;

    public Admin(String username, String password, String email, String phone, String address, Boolean isAdmin, String adminId) {
        super(username, password, email, phone, address, isAdmin);
        //TODO Auto-generated constructor stub
        this.adminId = adminId;
    }

    public Admin(String username, String userId, String password, String email, String phone, String address,
            Boolean isAdmin, String adminId) {
        super(username, userId, password, email, phone, address, isAdmin);
        this.adminId = adminId;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }
    
}
