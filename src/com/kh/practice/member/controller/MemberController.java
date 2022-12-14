package com.kh.practice.member.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.member.model.vo.Member;

public class MemberController {
	List<Member> mList;  //Member만 담을거
	
	public MemberController() {
		mList = new ArrayList<Member>();   //공간 만들기
	}
	
	public void registerMember(Member member) {   
		mList.add(member);    // 공간에 객체넣기
		
	}
	
	public void updateMember(Member member) {    // 입력한 값이 있는 member  
		for(int i = 0; i < mList.size(); i++) {
			String memberId = member.getMemberId();
			Member storedMember = mList.get(i);
			String storedId = storedMember.getMemberId();
			if(storedId.equals(memberId)) {
				storedMember.setMemberPwd(member.getMemberPwd());
				storedMember.setMemberEmail(member.getMemberEmail());
				storedMember.setMemberPhone(member.getMemberPhone());
				storedMember.setMemberAddress(member.getMemberAddress());
				storedMember.setMemberHobby(member.getMemberHobby());
			}
		}
	}
	
	public void removeMember(int index ) {
		mList.remove(index);
	}
	
	public List<Member> printAllMember() {
		return mList;
	}
	//같은 값이 있을 때 인덱스를 리턴
	public int findMemberIndex(String memberId) {
		for(int i = 0; i < mList.size(); i++) {
			// memberId와 같은 데이터가
			// mList에 있는지 찾아보기!
			Member mOne = mList.get(i);
			// 넘겨받은 memberId가 mOne에 있는지 확인
			if(memberId.equals(mOne.getMemberId())) {
				return i;
			}
		}
		return -1;
	}
	// 같은 값이 있을 때 해당 객체 리턴 (인덱스 없이 하는법)
	public Member findMemberId(String memberId) {
		for(int i = 0; i < mList.size(); i++) {
			Member mOne = mList.get(i);
			if(memberId.equals(mOne.getMemberId())) {
				return mOne;
			}
		}
		return null;
	}
	// 리턴된 인덱스값을 이용하여 데이터 찾기
//	public Member printOneByIndex(int index) {
//		Member member = mList.get(index);
//		return member;
//	}
	
	public Member findMemberName(String memberName) {
		for(int i = 0; i < mList.size(); i++) {
			Member mOne = mList.get(i);
			if(memberName.equals(mOne.getMemberName())) {
				return mOne;
			}
		}
		return null;
		
	}

}
