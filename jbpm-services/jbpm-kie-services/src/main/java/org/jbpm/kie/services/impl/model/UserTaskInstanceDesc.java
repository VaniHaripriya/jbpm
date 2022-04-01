/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jbpm.kie.services.impl.model;

import java.io.Serializable;
import java.util.Date;


public class UserTaskInstanceDesc implements org.jbpm.services.api.model.UserTaskInstanceDesc, Serializable {

	private static final long serialVersionUID = -4594921035584546643L;

	private Long taskId;
	private String status;
	private Date activationTime;
	private String name;
	private String description;
	private Integer priority;
	private String actualOwner;
	private String createdBy;
	private String deploymentId;
	private String processId;
	private Long processInstanceId;
	private Date createdOn;
	private Date dueDate;
	private String formName;
	private Long workItemId;
	private Date slaDueDate;
	private Integer slaCompliance;
    private String subject;
    private String correlationKey;
    private Integer processType;


    public UserTaskInstanceDesc(Long taskId, String status,
                                Date activationTime, String name, String description,
                                Integer priority, String actualOwner, String createdBy,
                                String deploymentId, String processId, Long processInstanceId,
                                Date createdOn, Date dueDate) {
        this(taskId, status, activationTime, name, description, priority, actualOwner, createdBy, deploymentId, processId, processInstanceId, createdOn, dueDate, null);

    }

	public UserTaskInstanceDesc(Long taskId, String status, Date activationTime, String name, String description,
								Integer priority, String actualOwner, String createdBy, String deploymentId,
								String processId, Long processInstanceId, Date createdOn, Date dueDate, Long workItemId) {
		this(taskId, status, activationTime, name, description, priority, actualOwner, createdBy, deploymentId,
             processId, processInstanceId, createdOn, dueDate, workItemId,null, null, null, null);
	}
	
	
	public UserTaskInstanceDesc(Long taskId, String status, Date activationTime, String name, String description,
                                Integer priority, String actualOwner, String createdBy, String deploymentId,
                                String processId, Long processInstanceId, Date createdOn, Date dueDate, Long workItemId, String formName, String subject, String correlationKey, Integer processType) {
        this(taskId, status, activationTime, name, description, priority, actualOwner, createdBy, deploymentId,
             processId, processInstanceId, createdOn, dueDate, workItemId, formName, subject, correlationKey, processType, null, null);
    }
	
	
    public UserTaskInstanceDesc(Long taskId, String status, Date activationTime, String name,
                                String description,
                                Integer priority, String actualOwner, String createdBy, String deploymentId,
                                String processId, Long processInstanceId, Date createdOn, Date dueDate, Long workItemId, String formName, String subject, String correlationKey, Integer processType,
                                Date slaDueDate, Integer slaCompliance) {
        this.taskId = taskId;
        this.status = status;
        this.activationTime = activationTime;
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.actualOwner = actualOwner;
        this.createdBy = createdBy;
        this.deploymentId = deploymentId;
        this.processId = processId;
        this.processInstanceId = processInstanceId;
        this.createdOn = createdOn;
        this.dueDate = dueDate;
        this.workItemId = workItemId;
        this.formName = formName;
        this.subject = subject;
        this.correlationKey = correlationKey;
        this.processType = processType;
        this.slaDueDate = slaDueDate;
        this.slaCompliance = slaCompliance;
    }

    public UserTaskInstanceDesc(Long taskId, String name, String description, Integer priority, Date dueDate, String formName) {
        this.taskId = taskId;
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.dueDate = dueDate;
        this.formName = formName;
    }

    public UserTaskInstanceDesc(Long taskId, String status, String actualOwner, 
            String name, String description, Integer priority, String createdBy, String processId,
            Long processInstanceId, Date createdOn, String formName, 
            String deploymentId, Date dueDate) {
        this.taskId = taskId;
        this.status = status;
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.actualOwner = actualOwner;
        this.createdBy = createdBy;
        this.deploymentId = deploymentId;
        this.processId = processId;
        this.processInstanceId = processInstanceId;
        this.createdOn = createdOn;
        this.formName = formName;
        this.deploymentId = deploymentId;
        this.dueDate = dueDate;
    }

	public UserTaskInstanceDesc(Long taskId, String status,
								Date activationTime, String name, String description,
								Integer priority, String actualOwner, String createdBy,
								String deploymentId, String processId, Long processInstanceId,
								Date createdOn, Date dueDate, Date slaDueDate) {
		this(taskId, status, activationTime, name, description, priority, actualOwner, createdBy, deploymentId, processId, processInstanceId, createdOn, dueDate);
		this.slaDueDate = slaDueDate;
	}
    
	@Override
	public Long getTaskId() {
		
		return this.taskId;
	}

	@Override
	public String getStatus() {
		
		return this.status;
	}

	@Override
	public Date getActivationTime() {
		
		return this.activationTime;
	}

	@Override
	public String getName() {
		
		return this.name;
	}

	@Override
	public String getDescription() {
		
		return this.description;
	}

	@Override
	public Integer getPriority() {
		
		return this.priority;
	}

	@Override
	public String getCreatedBy() {
		
		return this.createdBy;
	}

	@Override
	public Date getCreatedOn() {
		
		return this.createdOn;
	}

	@Override
	public Date getDueDate() {
		
		return this.dueDate;
	}

	@Override
	public Long getProcessInstanceId() {
		
		return this.processInstanceId;
	}

	@Override
	public String getProcessId() {
		
		return this.processId;
	}

	@Override
	public String getActualOwner() {
		
		return this.actualOwner;
	}

	@Override
	public String getDeploymentId() {
		
		return this.deploymentId;
	}
	
	@Override
    public String getFormName() {
        return formName;
    }

	@Override
	public Long getWorkItemId() {
		return workItemId;
	}

	public Date getSlaDueDate() {
		return slaDueDate;
	}

	public Integer getSlaCompliance() {
		return slaCompliance;
	}

	public void setFormName(String formName) {
        this.formName = formName;
    }
	
    public void setName(String name) {
        this.name = name;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public void setPriority(Integer priority) {
        this.priority = priority;
    }
    
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

	@Override
	public void setSlaDueDate(Date slaDueDate) {
		this.slaDueDate = slaDueDate;
	}

	@Override
	public void setSlaCompliance(Integer slaCompliance) {
		this.slaCompliance = slaCompliance;
	}

	@Override
	public String getSubject() {
	    return subject;
	}
	
	@Override
	public void setSubject(String subject) {
        this.subject = subject;
	}

	@Override
	public String getCorrelationKey() {
	    return correlationKey;
	}

	@Override
	public void setCorrelationKey(String correlationKey) {
	    this.correlationKey = correlationKey;
	}

	@Override
	public Integer getProcessType() {
	    return processType;
    }

	@Override
	public void setProcessType(Integer processType) {
	    this.processType = processType;
	}

	@Override
	public String toString() {
	    return "UserTaskInstanceDesc [taskId=" + taskId + ", status=" + status + ", activationTime=" + activationTime + ", name=" + name + ", description=" + description + ", priority=" + priority + ", actualOwner=" +
	            actualOwner + ", createdBy=" + createdBy + ", deploymentId=" + deploymentId + ", processId=" + processId + ", processInstanceId=" + processInstanceId + ", createdOn=" + createdOn + ", dueDate=" + dueDate +
	            ", formName=" + formName + ", workItemId=" + workItemId + ", slaDueDate=" + slaDueDate + ", slaCompliance=" + slaCompliance + ", subject=" + subject + ", correlationKey=" + correlationKey +
	            ", processType=" + processType + "]";
	}
}
