/**
 * 
 */
package com.yourpackagename.yourwebproject.model.repository;

import java.util.List;

import com.yourpackagename.framework.data.BaseJpaRepository;
import com.yourpackagename.yourwebproject.model.entity.GroupWorkInstructionRecord;
import com.yourpackagename.yourwebproject.model.entity.User;

/**
 * @author mevan.d.souza
 *
 */
public interface GroupWorkInstructionRecordRepository extends BaseJpaRepository<GroupWorkInstructionRecord, Long> {

	public List<GroupWorkInstructionRecord> findByGroupCodeAndUser(String groupCode, User user);
	public List<GroupWorkInstructionRecord> findByGroupCode(String groupCode);
	
}
