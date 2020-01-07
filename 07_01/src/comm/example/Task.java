package comm.example;

public class Task {
	
	private String taskId;
	private String taskName;
	private String createBy;
	private boolean isComplete;
	
	public Task(String string, String string2, String string3, boolean b)
	{
		this.taskId=string;
		this.taskName= string2;
		this.createBy=string3;
		this.isComplete=b;
		
	}

	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + ", createBy=" + createBy + ", isComplete="
				+ isComplete + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createBy == null) ? 0 : createBy.hashCode());
		result = prime * result + (isComplete ? 1231 : 1237);
		result = prime * result + ((taskId == null) ? 0 : taskId.hashCode());
		result = prime * result + ((taskName == null) ? 0 : taskName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Task thetask = null;
		boolean isEquals = false;
		
		if(obj instanceof Task)
		{
			thetask = (Task) obj;
		}
		if((this.getTaskName()== thetask.getTaskName())&&(this.getCreateBy()==thetask.getCreateBy()))
		{
			isEquals=true;
		}
		return isEquals;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public boolean isComplete() {
		return isComplete;
	}

	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}
	
}
