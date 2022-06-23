package com.vms.constituency.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vms.constituency.app.entity.Constituency;

@Repository
public interface IConstituencyRepository extends JpaRepository<Constituency, Integer> {

}
