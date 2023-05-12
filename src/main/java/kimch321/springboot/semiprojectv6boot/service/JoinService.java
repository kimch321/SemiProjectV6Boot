package kimch321.springboot.semiprojectv6boot.service;

import kimch321.springboot.semiprojcectv5.model.Member;

public interface JoinService {

    String findZipcode(String dong);
    boolean newMember(Member m);
    int checkUserid(String uid);
    boolean loginMember(Member m);

}
