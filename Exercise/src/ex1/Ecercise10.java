package ex1;

import java.util.List;

/*
 * 날짜 : 2019/10/25
 * 이름 : 양인서
 * 내용: 1번째 수행평가(Exercise10)
 */
public class Ecercise10 {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		
		for(Board board : list) {
			System.out.println(board.getTitle()+"-"+board.getContent());
		}
	}

}
