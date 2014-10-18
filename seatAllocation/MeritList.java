package seatAllocation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MeritList {
	List<Candidate> meritList = new ArrayList<Candidate>();
	MeritList(ArrayList<Candidate> a, final int k){
    	Collections.sort(a, new Comparator<Candidate>() {
            public int compare(Candidate p1, Candidate p2) {
                return p1.rank[k]- p2.rank[k];
            }
        });
    	for(int i=0; i<a.size(); i++){
    		Candidate c = a.get(i);
    		if (c.rank[k]!=0) meritList.add(c);
    	}
    }
}
