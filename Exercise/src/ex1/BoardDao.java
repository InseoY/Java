package ex1;

import java.util.ArrayList;
import java.util.List;

/*
 * 朝楼 : 2019/10/25
 * 捞抚 : 剧牢辑
 * 郴侩: 1锅掳 荐青乞啊(BoardDao)
 */
public class BoardDao {

	public List<Board> getBoardList() {
		List<Board>list = new ArrayList<Board>();
		list.add(new Board("力格1", "力格1"));
		list.add(new Board("力格2", "力格2"));
		list.add(new Board("力格3", "力格3"));
		return list;
	}
}
