package com.juaracoding;

public class User {

    private String username;
    private String password;

    private String errorMessage = "Invalid login/Credential. Invalid username or password";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getErrorMessage(){
        return errorMessage;
    }



    //check login
    public boolean checkLogin(){  // Assert true untuk boolean. bisa juga string
        // bisa diisi tanpa get dlu.username == "ABC123"
        if(username == getUsername() && password == getPassword()){
            return true;
        }else {
            return false;
        }
    }
}
