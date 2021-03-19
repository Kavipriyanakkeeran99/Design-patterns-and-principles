package chainofresponsibility;

public class Main {

	public static void main(String[] args) {
          
		LeaveRequest leaverequest=new LeaveRequest();
		
		leaverequest.setEmployeename("Kavi");
		leaverequest.setLeavedays(2);
		
		ILeaveHandleRequest supervisor=new Supervisor();
		ILeaveHandleRequest projectmanager=new ProjectManager();
		ILeaveHandleRequest hr=new HR();
		
		supervisor.nextHandler(projectmanager);
		projectmanager.nextHandler(hr);
		
		supervisor.handleRequest(leaverequest);
		
		leaverequest.setLeavedays(4);
		supervisor.handleRequest(leaverequest);

		leaverequest.setLeavedays(8);
        supervisor.handleRequest(leaverequest);

	}

}
