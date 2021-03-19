package chainofresponsibility;

public class Supervisor implements ILeaveHandleRequest {
	    
		ILeaveHandleRequest nextHandler;

		@Override
		public void nextHandler(ILeaveHandleRequest nextHandler) {
			this.nextHandler=nextHandler;
		}

		@Override
		public void handleRequest(LeaveRequest leavedays) {
	           	if(leavedays.getLeavedays()<=3) {
	           		System.out.println("Granted "+leavedays.getLeavedays()+" days leave for "+leavedays.getEmployeename()+" by the supervisor");
	           	}
	           	else {
	           		nextHandler.handleRequest(leavedays);
	           	}
}
}
		
	
