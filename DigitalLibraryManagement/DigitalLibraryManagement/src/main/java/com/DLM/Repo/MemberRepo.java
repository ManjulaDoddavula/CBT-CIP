package com.DLM.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DLM.Entity.MemberPojo;

@Repository
public interface MemberRepo extends JpaRepository<MemberPojo, Long> {

}
