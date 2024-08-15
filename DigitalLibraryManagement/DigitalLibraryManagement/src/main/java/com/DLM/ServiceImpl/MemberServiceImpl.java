package com.DLM.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DLM.Entity.MemberPojo;
import com.DLM.Repo.MemberRepo;
import com.DLM.Service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberRepo memberRepository;
	
	@Override
	public MemberPojo addMember(MemberPojo member) {
        return memberRepository.save(member);
    }
	
	@Override
	public MemberPojo updateMember(Long id, MemberPojo member) {
        MemberPojo existingMember = memberRepository.findById(id).orElseThrow(() -> new RuntimeException("Member not found"));
        existingMember.setName(member.getName());
        existingMember.setEmail(member.getEmail());
        return memberRepository.save(existingMember);
    }

	@Override
	public Object deleteMember(Long id) {
		memberRepository.deleteById(id);
		return id;
	}
	
	@Override
	public List<MemberPojo> getAllMembers() {
        return memberRepository.findAll();
    }

	@Override
    public MemberPojo getMemberById(Long id) {
        return memberRepository.findById(id).orElseThrow(() -> new RuntimeException("Member not found"));
    }
}