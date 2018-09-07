package cap.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import bean.Admin;

/**
* @author 作者:
* @createDate 创建时间：2018年9月7日 上午11:49:13
*/
public class LoginAction1 extends ActionSupport implements ModelDriven<Admin> {
    private Admin admin;

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public String login() {
        if (admin.getUsername().equals("admin") && admin.getPassword().equals("admin")) {
            return SUCCESS;
        } else
            return ERROR;
    }

    @Override
    public Admin getModel() {
        if (admin == null) {
            admin = new Admin();
        }
        return admin;
    }
}