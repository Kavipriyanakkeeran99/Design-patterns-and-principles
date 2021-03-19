package chainofresponsibility;

public class ProjectManager implements ILeaveHandleRequest {
    
	ILeaveHandleRequest nextHandler;

	@Override
	public void nextHandler(ILeaveHandleRequest nextHandler) {
		this.nextHandler=nextHandler;
	}

	@Override
	public void handleRequest(LeaveRequest leavedays) {
           	if(leavedays.getLeavedays()>=3 && leavedays.getLeavedays()<=5) {
           		System.out.println("Granted "+leavedays.getLeavedays()+" days leave for "+leavedays.getEmployeename()+" by the Project Manager");
           	}
           	else {
           		nextHandler.handleRequest(leavedays);
           	}
	}
	
}
