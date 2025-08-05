package genericCollection.sec15;

public class Student {
	private int stdNo;
	private String stdName;
	
	public Student(int stdNo, String stdName) {
		this.stdNo = stdNo;
		this.stdName = stdName;
	}
	
	public int getStdNo() {
		return stdNo;
	}

	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	
	@Override
    public boolean equals(Object Ob) {
		if (Ob instanceof Student) {
			Student std = (Student) Ob;
			return stdNo == std.stdNo && stdName.equals(std.stdName);
		}
		
		return false;
    }

    @Override
    public int hashCode() {
        return stdNo + stdName.hashCode();
    }
}
