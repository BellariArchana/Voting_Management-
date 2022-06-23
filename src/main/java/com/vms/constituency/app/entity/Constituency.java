package com.vms.constituency.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Constituency {
	@Id
	private int constituencyId;
	private String constituencyName;
	private int electionId;
	private String state;

	public int getConstituencyId() {
		return constituencyId;
	}

	public void setConstituencyId(int constituencyId) {
		this.constituencyId = constituencyId;
	}

	public String getConstituencyName() {
		return constituencyName;
	}

	public void setConstituencyName(String constituencyName) {
		this.constituencyName = constituencyName;
	}

	public int getElectionId() {
		return electionId;
	}

	public void setElectionId(int electionId) {
		this.electionId = electionId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Constituency(int constituencyId, String constituencyName, int electionId, String state) {
		super();
		this.constituencyId = constituencyId;
		this.constituencyName = constituencyName;
		this.electionId = electionId;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Constituency [constituencyId=" + constituencyId + ", constituencyName=" + constituencyName
				+ ", electionId=" + electionId + ", state=" + state + "]";
	}

	public Constituency() {
	}
	
}