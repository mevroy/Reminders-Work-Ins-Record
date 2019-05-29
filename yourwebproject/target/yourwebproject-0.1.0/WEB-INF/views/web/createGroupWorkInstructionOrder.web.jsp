<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div class="jumbotron">
	<h2>Create Work Instruction Order</h2>
	<br />
	<div class="span12">
		<div class="row">
			<form:form commandName="groupWorkInstructionRecord"
				action="saveGroupWorkInstructionRecord" method="post"
				id="groupWorkInstructionRecord">
				<div class="col-lg-5">
					<div class="form-group" id="jobNumberCtl">
						<label class="control-label" for="jobNumber">Job Number</label>

						<div class="controls">
							<form:input path="jobNumber" cssClass="form-control"
								id="jobNumber" placeholder="Enter Job Number" />
						</div>
					</div>
					<div class="form-group" id="orderNumberCtl">
						<label class="control-label" for="orderNumber">Order
							Number</label>

						<div class="controls">
							<form:input path="orderNumber" cssClass="form-control"
								id="orderNumber" placeholder="Enter Order Number" />
						</div>
					</div>
					<div class="form-group" id="clientCtl">
						<label class="control-label" for="client">Client </label>

						<div class="controls">
							<form:input path="client" cssClass="form-control" id="client"
								placeholder="Client Name" />
						</div>
					</div>
					<div class="form-group" id="quoteNumberCtl">
						<label class="control-label" for="quoteNumber">Quote</label>

						<div class="controls">
							<div class="input-group">
								<form:input path="quoteNumber" cssClass="form-control"
									id="quoteNumber" placeholder="Enter Quote Number" />
								<div class="input-group-addon">
									<span><i class="glyphicon glyphicon-envelope"></i></span>
								</div>
							</div>
						</div>
					</div>
					<div class="form-group" id="dateCtl">
						<label class="control-label" for="date">Date</label>
						<div class="controls">
							<div class="input-group date">
								<form:input path="date" cssClass="form-control" id="date"
									placeholder="Date (DD/MM/YYYY)" />
								<div class="input-group-addon">
									<span><i class='glyphicon glyphicon-calendar'></i></span>
								</div>
							</div>

						</div>


					</div>
					<div class="form-group" id="materialCtl">
						<label class="control-label" for="material">Material</label>

						<div class="controls">
							<div class="input-group">
								<form:input path="material" cssClass="form-control"
									id="material" placeholder="Enter Material" />
								<div class="input-group-addon">
									<span><i class='glyphicon glyphicon-phone'></i></span>
								</div>
							</div>
						</div>
					</div>

				</div>

				<div class="col-lg-offset-2 col-lg-5">
					<div class="form-group" id="surfacePreparationCtl">
						<label class="control-label" for="surfacePreparation">Surface
							Preparation </label>

						<div class="controls">
							<div class="input-group">

								<form:input path="surfacePreparation" cssClass="form-control"
									id="surfacePreparation" placeholder="Surface Preparation" />
								<div class="input-group-addon">
									<span><i class='glyphicon glyphicon-phone-alt'></i></span>
								</div>
							</div>
						</div>
					</div>


					<div class="form-group" id="suitableAccessCtl">
						<label class="control-label" for="suitableAccess">Suitable
							Access</label>
						<div>
							<div class="radio">
								<label class="radio-inline"> <form:radiobutton
										path="suitableAccess" id="suitableAccess" value="true" /> Yes
								</label> <label class="radio-inline"> <form:radiobutton
										path="suitableAccess" id="suitableAccess" value="false" /> NO
								</label>
							</div>
						</div>

					</div>
					<div class="form-group" id="powerCtl">
						<label class="control-label" for="power">Power?</label>
						<div>
							<div class="radio">
								<label class="radio-inline"> <form:radiobutton
										path="power" id="power" value="true" /> Yes
								</label> <label class="radio-inline"> <form:radiobutton
										path="power" id="power" value="false" /> NO
								</label>
							</div>
						</div>

					</div>

					<div class="form-group" id="ewpAccessEquipmentCtl">
						<label class="control-label" for="ewpAccessEquipment">EWP
							Access Equipment</label>

						<div class="controls">

							<form:input path="ewpAccessEquipment" cssClass="form-control"
								id="ewpAccessEquipment" placeholder="EWP Access Equipment" />

						</div>
					</div>
					<div class="form-group" id="additionalRequirementsCtl">
						<label class="control-label" for="additionalRequirements">Additional
							Requirements</label>

						<div class="controls">
							<form:textarea path="additionalRequirements"
								cssClass="form-control" id="additionalRequirements"
								placeholder="Additional Requirements" rows="5" />
						</div>
					</div>

				</div>
				<br />
				<div class="col-lg-12">
					<input type="button" name="addMore" id="addMore"
						class="btn btn-danger btn-block btn-lg" value="ADD WORK ITEMS"
						onclick="$('#moreDetails').show();" />

				</div>
				<br />
				<div id="moreDetails">
					<div class="col-lg-5">
						<div class="form-group" id="groupWorkItems[0].testMethodCtl">
							<label class="control-label" for="testMethod">Test Method</label>

							<div class="controls">
								<form:input path="groupWorkItems[0].testMethod"
									cssClass="form-control" id="groupWorkItems[0].testMethod"
									placeholder="Test Method" />
							</div>
						</div>
						<div class="form-group" id="groupWorkItems[0].itrDocumentCtl">
							<label class="control-label" for="itrDocument">ITR
								Document</label>

							<div class="controls">
								<form:input path="groupWorkItems[0].itrDocument"
									cssClass="form-control" id="groupWorkItems[0].itrDocument"
									placeholder="ITR Document" />
							</div>
						</div>
						<div class="form-group" id="groupWorkItems[0].testStandardCtl">
							<label class="control-label" for="testStandard">Test
								Standard</label>

							<div class="controls">
								<form:input path="groupWorkItems[0].testStandard"
									cssClass="form-control" id="groupWorkItems[0].testStandard"
									placeholder="Enter Test Standard" />
							</div>
						</div>
					</div>
					<div class="col-lg-offset-2 col-lg-5">
						<div class="form-group"
							id="groupWorkItems[0].acceptanceCriteriaCtl">
							<label class="control-label" for="acceptanceCriteria">Acceptance
								Criteria</label>

							<div class="controls">
								<form:input path="groupWorkItems[0].acceptanceCriteria"
									cssClass="form-control"
									id="groupWorkItems[0].acceptanceCriteria"
									placeholder="Enter Acceptane Criteria" />
							</div>
						</div>
						<div class="form-group" id="groupWorkItems[0].itemProcedureCtl">
							<label class="control-label" for="itemProcedure">Test
								Method</label>

							<div class="controls">
								<form:input path="groupWorkItems[0].itemProcedure"
									cssClass="form-control" id="groupWorkItems[0].itemProcedure"
									placeholder="Item Procedure" />
							</div>
						</div>
						<div class="form-group" id="groupWorkItems[0].nataClassTestCtl">
							<label class="control-label" for="nataClassTest">Test
								Method</label>

							<div class="controls">
								<form:input path="groupWorkItems[0].nataClassTest"
									cssClass="form-control" id="groupWorkItems[0].nataClassTest"
									placeholder="NATA Class Test" />
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-12">
					<form:hidden path="group.groupCode" id="groupCode" readonly="true" />
					<input class="btn btn-primary btn-block btn-lg" type="submit"
						value="SUBMIT" /> <a
						href="${pageContext.request.contextPath}/${sessionScope.groupCode}/"
						class="btn btn-default btn-block btn-lg">CANCEL</a>
				</div>
			</form:form>
		</div>
	</div>
</div>

<script type="text/javascript">
	$(document).ready(
			function() {
				$("#groupMember").validate(
						{
							rules : {
								firstName : {
									required : true
								},
								lastName : {
									required : false
								},
								primaryEmail : {
									required : true,
									email : true
								},

								adultCount : {
									number : true
								},
								kidCount : {
									number : true
								},
								mobilephone : {
									maxlength : 13
								},
								otherPhone : {
									maxlength : 13
								},
								paidMembershipAmount : {
									number : true
								},
								memberCategoryCode : {
									required : true
								}
							},
							messages : {

							},
							errorPlacement : function(error, element) {
								error.appendTo(element.parent("div").parent(
										"div"));
							},
							errorClass : "control-group has-error text-danger",
							validClass : "control-group has-success",
							errorElement : "span",
							highlight : function(element, errorClass,
									validClass) {
								if (element.type === 'radio') {
									this.findByName(element.name).parent("div")
											.parent("div").removeClass(
													validClass).addClass(
													errorClass);
								} else {
									$(element).parent("div").parent("div")
											.removeClass(validClass).addClass(
													errorClass);
								}
							},
							unhighlight : function(element, errorClass,
									validClass) {
								if (element.type === 'radio') {
									this.findByName(element.name).parent("div")
											.parent("div").removeClass(
													errorClass).addClass(
													validClass);
								} else {
									$(element).parent("div").parent("div")
											.removeClass(errorClass).addClass(
													validClass);
								}
							}
						})

			});

	$(function() {

		$('.input-group.date, .input-daterange').datepicker({
			format : "dd/mm/yyyy",
			autoclose : true,
			todayHighlight : true
		});
		$('#moreDetails').hide();
		buildGroupMemberCategoriesOptions('memberCategoryCode');
	});
</script>
