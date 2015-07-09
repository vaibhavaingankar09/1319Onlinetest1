package EVM;

public class Candidate {
	
	int candidateNum;
	String candidateName;
	Lamp candidatelamp;
	CandidatesButton candidatebutton;
	
	Candidate(int candidateNum,String candidateName) {
		this.candidateNum = candidateNum;
		this.candidateName = candidateName;
		candidatelamp = new Lamp();
		candidatebutton  = new CandidatesButton();
	}
	
	public int getCandidateNum() {
		return candidateNum;
	}
	public String getCandidateName() {
		return candidateName;
	}
}
