package kimch321.springboot.semiprojectv6.dao;

import kimch321.springboot.semiprojectv6.model.Member;

public interface MemberDAO {
    int selectLogin(Member m);
}
