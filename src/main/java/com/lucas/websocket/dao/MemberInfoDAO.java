package com.lucas.websocket.dao;

import java.util.List;

import com.lucas.websocket.dto.MemberInfoDTO;

public interface MemberInfoDAO {
	public List<MemberInfoDTO> getMemberInfo(String username);
}
