package chainofresponsibility;

public interface ILeaveHandleRequest {
    
	public void nextHandler(ILeaveHandleRequest nextHandler);
	public void handleRequest(LeaveRequest leavedays);
}
