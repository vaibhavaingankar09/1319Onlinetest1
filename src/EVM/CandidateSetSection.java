package EVM;

import java.util.ArrayList;

public class CandidateSetSection {
	CandidateSet candidateset;
	boolean seal;
	ArrayList<Candidate> candidates= new ArrayList<Candidate>();
	
	public boolean isSeal() {
		return seal;
	}

	public void setSeal(boolean seal) {
		this.seal = seal;
	}
	
	
}
