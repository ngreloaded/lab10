package seatAllocation;

public class VirtualProgramme {
	String id;
	int capacity[];
	int filled[];
	VirtualProgramme(String d, int a[]){
		id = d;
		filled = new int[8];
		capacity = new int[8];
		for(int i=0; i<8; i++){
			capacity[i]=a[i];
			filled[i]=0;
		}
	}
}
