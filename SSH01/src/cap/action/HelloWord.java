package cap.action;

import com.sun.corba.se.spi.orbutil.fsm.Action;


/**
* @author ����:
* @createDate ����ʱ�䣺2018��9��7�� ����9:32:20
*/
public class HelloWord implements Action {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String sayHi() {

        return SUCCESS;

    }

    public String execute() {
        return SUCCESS;
    }

		
	}
