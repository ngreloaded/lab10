package seatAllocation;

public class Candidate {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uid == null) ? 0 : uid.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidate other = (Candidate) obj;
		if (uid == null) {
			if (other.uid != null)
				return false;
		} else if (!uid.equals(other.uid))
			return false;
		return true;
	}
	String uid;
	String bid; //id of allocated branch
	boolean allocated; //seat allocated or not
	char ctg;
	boolean pd;
	boolean ds;
	boolean indian;
	String preferenceList; //implementation left
	int rank[]; //implementation left
	Candidate (String id, char ctg1, boolean pd1, boolean ds1, boolean indian1){
		if(true) uid = id; //check inside if that id is unique
		ctg = ctg1;
		pd = pd1;
		ds = ds1;
		indian = indian1;
	}
	String get_uid(){
		return uid;
	}
	char get_ctg(){
		return ctg;
	}
	boolean get_pd(){
		return pd;
	}
	boolean get_ds(){
		return ds;
	}
	boolean get_nationality(){
		return indian;
	}
	void add(){ //add pref
		
	}
	// function to find next virtual programme
	
	// pointer reset. needed at end of phase
}
