package cn.ricardowang.www.javabean;

/**
 * @Author: wangqin
 * @Date: 2020/12/19 0019 - 12 -19 -17:17
 * @Description: cn.ricardowang.www.javabean
 * @version: 1.0
 */
public class User {
    String username;
    String password;
    String email;
    String phoneNumber;
    String address;

    String cartId;
    String orderId;

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

    @Override
    public String toString() {
        return "User{" +
                "account='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
