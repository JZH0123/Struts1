package cap.action;

import com.sun.corba.se.spi.orbutil.fsm.Action;


/**
* @author 作者:
* @createDate 创建时间：2018年9月7日 上午9:32:20
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
