package com.supermap.base.pojo;

import java.util.Date;

public class smPeEmployeeHour {
    private Integer id;

    private Integer pid;

    private Integer planitemId;

    private String planitemName;

    private Double planitermHour;

    private String staffcode;

    private String staffname;

    private Integer deptId;

    private String deptName;

    private String subdeptId;

    private String subdeptName;

    private Integer projectId;

    private String projectName;

    private String projectManager;

    private String stoneName;

    private String substaffcode;

    private String substaffname;

    private Double workSheet;

    private Date msgdatetime;

    private Integer isdelete;

    private Integer status;

    private Integer workType;

    private Integer weekIndexId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getPlanitemId() {
        return planitemId;
    }

    public void setPlanitemId(Integer planitemId) {
        this.planitemId = planitemId;
    }

    public String getPlanitemName() {
        return planitemName;
    }

    public void setPlanitemName(String planitemName) {
        this.planitemName = planitemName == null ? null : planitemName.trim();
    }

    public Double getPlanitermHour() {
        return planitermHour;
    }

    public void setPlanitermHour(Double planitermHour) {
        this.planitermHour = planitermHour;
    }

    public String getStaffcode() {
        return staffcode;
    }

    public void setStaffcode(String staffcode) {
        this.staffcode = staffcode == null ? null : staffcode.trim();
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname == null ? null : staffname.trim();
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getSubdeptId() {
        return subdeptId;
    }

    public void setSubdeptId(String subdeptId) {
        this.subdeptId = subdeptId == null ? null : subdeptId.trim();
    }

    public String getSubdeptName() {
        return subdeptName;
    }

    public void setSubdeptName(String subdeptName) {
        this.subdeptName = subdeptName == null ? null : subdeptName.trim();
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager == null ? null : projectManager.trim();
    }

    public String getStoneName() {
        return stoneName;
    }

    public void setStoneName(String stoneName) {
        this.stoneName = stoneName == null ? null : stoneName.trim();
    }

    public String getSubstaffcode() {
        return substaffcode;
    }

    public void setSubstaffcode(String substaffcode) {
        this.substaffcode = substaffcode == null ? null : substaffcode.trim();
    }

    public String getSubstaffname() {
        return substaffname;
    }

    public void setSubstaffname(String substaffname) {
        this.substaffname = substaffname == null ? null : substaffname.trim();
    }

    public Double getWorkSheet() {
        return workSheet;
    }

    public void setWorkSheet(Double workSheet) {
        this.workSheet = workSheet;
    }

    public Date getMsgdatetime() {
        return msgdatetime;
    }

    public void setMsgdatetime(Date msgdatetime) {
        this.msgdatetime = msgdatetime;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getWorkType() {
        return workType;
    }

    public void setWorkType(Integer workType) {
        this.workType = workType;
    }

    public Integer getWeekIndexId() {
        return weekIndexId;
    }

    public void setWeekIndexId(Integer weekIndexId) {
        this.weekIndexId = weekIndexId;
    }
}