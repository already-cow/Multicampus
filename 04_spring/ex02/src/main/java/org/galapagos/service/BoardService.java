package org.galapagos.service;

import java.util.List;

import org.galapagos.domain.BoardVO;

public interface BoardService {
	
	public void register(BoardVO board);

	// 상세보기
	public BoardVO get(Long bno);
	
	// 수정하기
	public boolean modify(BoardVO board);
	
	// 삭제하기
	public boolean remove(Long bno);
	
	// 목록얻기
	public List<BoardVO> getList();
}
