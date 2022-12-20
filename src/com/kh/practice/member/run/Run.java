package com.kh.practice.member.run;

import java.util.List;

import com.kh.practice.member.controller.MemberController;
import com.kh.practice.member.model.vo.Member;
import com.kh.practice.member.view.MemberView;

public class Run {
	public static void main(String[] args) {
		MemberView view = new MemberView();
		MemberController mCon = new MemberController();
		done :
		while(true) {
			int choice = view.mainMenu();
			switch(choice) {
			case 1 : 
				List<Member> mList = mCon.printAllMember();
				view.showAllMember(mList);
				break;
			case 2 : 
				//�ε��� ���� �ϱ�
				String memberId = view.inputMemberId("�˻�");
				Member mOne = mCon.findMemberId(memberId);
				if(mOne == null) {
					//�����ϴ� �޽��� ���
				}
				
//				int index = mCon.findMemberId(memberId);
//				if(index == -1) {
//					//�����ϴ� �޽��� ���
//				}
//				Member mOne = mCon.printOneByIndex(index);
				view.showOneMember(mOne);
				break;
			case 3 : 
				String memberName = view.inputMemberName();
				Member memberOne = mCon.findMemberName(memberName);
				view.showOneMember(memberOne);
				break;
			case 4 : 
				Member member = view.inputMember();
				mCon.registerMember(member);
				view.displaySuccess("������ �Ϸ�Ǿ����ϴ�.");
				break;
			case 5 : 
				member = view.modifyMember();
				mCon.updateMember(member);
				view.displaySuccess("������ �Ϸ�Ǿ����ϴ�.");
				break;
			case 6 : 
				memberId = view.inputMemberId("����");
				int index = mCon.findMemberIndex(memberId);
				mCon.removeMember(index);
				//System.out.println("������ �����Ǿ����ϴ�.");
				view.displaySuccess("������ �����Ǿ����ϴ�.");
				break;
			case 0 : break done;
			}
		}

	}

}