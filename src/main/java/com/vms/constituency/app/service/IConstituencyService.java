package com.vms.constituency.app.service;

import java.util.List;
import com.vms.constituency.app.entity.Constituency;

public interface IConstituencyService {

	public List<Constituency> getAllConstituency();

	public Constituency getConstituencyById(int constituencyId);

	public void deleteConstituencyById(int constituencyId);
	
	public Constituency updateConstituency(Constituency constituency);

	public Constituency addConstituency(Constituency constituency);

}
