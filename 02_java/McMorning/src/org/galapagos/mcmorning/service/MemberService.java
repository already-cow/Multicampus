package org.galapagos.mcmorning.service;

import org.galapagos.mcmorning.cli.input;
import org.galapagos.mcmorning.dao.MemberDao;
import org.galapagos.mcmorning.exception.UseridCountOverException;
import org.galapagos.mcmorning.vo.Member;

public class MemberService {
	MemberDao dao = new MemberDao();

	public void singup() {
		// Member info insert
		// id 중복 체크
		// Member 인스턴스 생성
		// List insert(Dao)

		Member member;
		try {
			member = inputMember();
			dao.add(member);

		} catch (UseridCountOverException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}

	}

	public Member inputMember() throws UseridCountOverException {
		String userid = inputUserid();
		String password = input.read("사용자 PW : ");
		String name = input.read("이름 : ");
		String email = input.read("Email : ");

		Member member = new Member(userid, password, name, email);
		return member;
	}

	public String inputUserid() throws UseridCountOverException {
		String userid = "";
		for (int i = 0; i < 3; i++) {
			userid = input.read("사용자 ID : ");

			Member m = dao.findByUserid(userid);
			if (m != null) { // 중복이면
				System.out.println(userid + "는 중복된 ID입니다.");
			} else {
				return userid;
			}
		}
		throw new UseridCountOverException();
	}

}
