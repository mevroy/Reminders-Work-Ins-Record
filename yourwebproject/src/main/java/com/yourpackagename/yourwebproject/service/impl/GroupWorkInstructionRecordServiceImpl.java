/**
 * 
 */
package com.yourpackagename.yourwebproject.service.impl;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yourpackagename.framework.data.BaseJpaServiceImpl;
import com.yourpackagename.yourwebproject.model.entity.GroupWorkInstructionRecord;
import com.yourpackagename.yourwebproject.model.entity.User;
import com.yourpackagename.yourwebproject.model.repository.GroupWorkInstructionRecordRepository;
import com.yourpackagename.yourwebproject.service.GroupWorkInstructionRecordService;

/**
 * @author dsouzam5
 *
 */
@Service
@Transactional
public class GroupWorkInstructionRecordServiceImpl extends BaseJpaServiceImpl<GroupWorkInstructionRecord, Long>
		implements GroupWorkInstructionRecordService {

	private @Autowired GroupWorkInstructionRecordRepository groupWorkInstructionRecordRepository;

	@PostConstruct
	public void setupService() {
		this.baseJpaRepository = groupWorkInstructionRecordRepository;
		this.entityClass = GroupWorkInstructionRecord.class;
		this.baseJpaRepository.setupEntityClass(GroupWorkInstructionRecord.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.yourpackagename.yourwebproject.service.GroupWorkInstructionRecordService#
	 * findByGroupCodeAndUser(java.lang.String,
	 * com.yourpackagename.yourwebproject.model.entity.User)
	 */
	public List<GroupWorkInstructionRecord> findByGroupCodeAndUser(String groupCode, User user) {
		return groupWorkInstructionRecordRepository.findByGroupCodeAndUser(groupCode, user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.yourpackagename.yourwebproject.service.GroupWorkInstructionRecordService#
	 * findByGroupCode(java.lang.String)
	 */
	public List<GroupWorkInstructionRecord> findByGroupCode(String groupCode) {
		return groupWorkInstructionRecordRepository.findByGroupCode(groupCode);
	}

}
