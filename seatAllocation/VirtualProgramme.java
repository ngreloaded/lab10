package seatAllocation;

public class VirtualProgramme {
	String id;
	int availableSeat[];
	VirtualProgramme(String d, int a[]){
		id = d;
		availableSeat = new int[8];
		for(int i=0; i<8; i++){
			availableSeat[i]=a[i];
		}
	}
}
