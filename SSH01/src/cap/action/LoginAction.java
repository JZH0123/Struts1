package cap.action;

import com.opensymphony.xwork2.ActionSupport;

import bean.Admin;

/**
* @author ����:
* @createDate ����ʱ�䣺2018��9��7�� ����11:50:35
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