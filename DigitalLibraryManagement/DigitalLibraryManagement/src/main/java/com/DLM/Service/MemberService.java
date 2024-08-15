package com.DLM.Service;

import java.util.List;

import com.DLM.Entity.MemberPojo;

public interface MemberService {
	
	public abstract MemberPojo addMember(MemberPojo member);
	
	public abstract MemberPojo updateMember(Long id, MemberPojo member);

	public abstract Object deleteMember(Long id);
	
	public abstract List<MemberPojo> getAllMembers();

    public abstract MemberPojo getMemberById(Long id);
}
