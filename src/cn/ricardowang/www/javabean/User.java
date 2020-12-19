package cn.ricardowang.www.javabean;

/**
 * @Author: wangqin
 * @Date: 2020/12/19 0019 - 12 -19 -17:17
 * @Description: cn.ricardowang.www.javabean
 * @version: 1.0
 */
public class User {
    String account;
    String password;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
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
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
