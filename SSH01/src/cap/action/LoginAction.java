package cap.action;

import com.opensymphony.xwork2.ActionSupport;

import bean.Admin;

/**
* @author 作者:
* @createDate 创建时间：2018年9月7日 上午11:50:35
*/
public class LoginAction extends ActionSupport {
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
}