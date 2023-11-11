package com.jackpot.mapper;

import com.jackpot.domain.AdminVO;

public interface AdminMapper {
	
	public AdminVO get(String adminLoginId); // PK 전달
	
	public void insert(AdminVO admin);
	
	public int update(AdminVO admin);
	
	public int delete(Long adminId); // PK 전달
	
	public int deleteLoginId(String adminLoginId); // PK 전달
}
