/**
 * 
 */
package com.yourpackagename.yourwebproject.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yourpackagename.yourwebproject.common.CheckPermission;
import com.yourpackagename.yourwebproject.common.EnableLogging;
import com.yourpackagename.yourwebproject.model.entity.GroupWorkInstructionRecord;
import com.yourpackagename.yourwebproject.model.entity.Groups;
import com.yourpackagename.yourwebproject.model.entity.enums.Role;
import com.yourpackagename.yourwebproject.service.GroupsService;

/**
 * @author mdsouza
 *
 */
@Controller
@EnableLogging(loggerClass = "GroupWorkInstructionController")
@CheckPermission(allowedRoles = { Role.SUPER_ADMIN, Role.ADMIN,
		Role.SUPER_USER, Role.USER })
public class GroupWorkInstructionController extends BaseWebAppController {
/*	@Autowired
	private GroupEventInviteService groupEventInviteService;*/
	private @Autowired GroupsService groupsService;


	@RequestMapping(value = "/groupInstructionRecord", method = RequestMethod.GET)
	public String groupInstructionRecord(Model model,
			@PathVariable String groupCode) throws Exception {

		GroupWorkInstructionRecord groupWorkInstructionRecord = new GroupWorkInstructionRecord();
		Groups group = groupsService.findByGroupCode(groupCode);
		groupWorkInstructionRecord.setGroup(group);
		model.addAttribute("groupWorkInstructionRecord", groupWorkInstructionRecord);
		return "groupWorkInstructionRecord";
	}

	@RequestMapping(value = "/saveGroupWorkInstructionRecord", method = RequestMethod.POST)
	public String newFeedback(Model model,
			@ModelAttribute("groupWorkInstructionRecord") GroupWorkInstructionRecord groupWorkInstructionRecord) {
		return "listGroupWorkInstructionRecord";
	}


}
