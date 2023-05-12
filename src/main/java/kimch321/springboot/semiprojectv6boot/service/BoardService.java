package kimch321.springboot.semiprojectv6boot.service;

import kimch321.springboot.semiprojcectv5.model.Board;

import java.util.List;

public interface BoardService {

     List<Board> readBoard(int cpage);
     List<Board> readBoard(int cpage, String ftype, String fkey);
     Board readOneBoard(String bno);
     int countBoard();
     int countBoard(String ftype, String fkey);
     public boolean newBoard(Board bd);

}
