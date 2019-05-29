/**
 * 
 */
package com.yourpackagename.yourwebproject.service;

import java.util.List;

import com.yourpackagename.framework.data.BaseService;
import com.yourpackagename.yourwebproject.model.entity.GroupWorkInstructionRecord;
import com.yourpackagename.yourwebproject.model.entity.User;

/**
 * @author dsouzam5
 *
 */
public interface GroupWorkInstructionRecordService extends BaseService<GroupWorkInstructionRecord, Long>{

	public List<GroupWorkInstructionRecord> findByGroupCodeAndUser(String groupCode, User user);
	public List<GroupWorkInstructionRecord> findByGroupCode(String groupCode);

}
