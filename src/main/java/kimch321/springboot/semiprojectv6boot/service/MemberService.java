package kimch321.springboot.semiprojectv6boot.service;

import kimch321.springboot.semiprojcectv5.model.Member;

import javax.servlet.http.HttpSession;

public interface MemberService {
    boolean checkLogin(Member m, HttpSession sess);

}
