/*
 * GlobalPatientId
 * Date of creation: 2011-01-14
 * 
 * Copyright (c) CompuGROUP Software GmbH, 
 * This software is the confidential and proprietary information of
 * CompuGROUP Software GmbH. You shall not disclose such confidential
 * information and shall use it only in accordance with the terms of
 * the license agreement you entered into with CompuGROUP Software GmbH.
 */

package com.cg.ihe.doc.domain;

import com.cg.ihe.core.util.ComparisonHelper;

import javax.xml.bind.annotation.XmlType;

/**
 * @author Ingo Hackl, AT
 */
@XmlType(name = "globalPatientId", namespace = "http://ihe.mdm.g3.cgm/domain")
public class GlobalPatientId extends UniqueId {

    private Integer type;
    private PatientIdType patientIdType;
    private String authUniversalIDType;

    public GlobalPatientId() {

    }

    public GlobalPatientId(String id, String assigningAuthorityId, Integer type, PatientIdType patientIdType, String authUniversalIDType) {
        super(id, assigningAuthorityId);
        this.type = type;
        this.patientIdType = patientIdType;
        this.authUniversalIDType = authUniversalIDType;
    }

    public GlobalPatientId(LocalPatientId localPatientId) {
        this(localPatientId.getId(), localPatientId.getAssigningAuthorityId());
    }

    public GlobalPatientId(String id, String assigningAuthorityId) {
        super(id, assigningAuthorityId);
    }

    public GlobalPatientId(String id, String assigningAuthorityId, PatientIdType patientIdType) {
        super(id, assigningAuthorityId);

        this.patientIdType = patientIdType;
    }

    /**
     * GET.
     *
     * @return the type
     */
    public Integer getType() {
        return type;
    }

    /**
     * SET.
     *
     * @param type the type to set
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * GET.
     *
     * @return the patientIdType
     */
    public PatientIdType getPatientIdType() {
        return patientIdType;
    }

    /**
     * SET.
     *
     * @param patientIdType the patientIdType to set
     */
    public void setPatientIdType(PatientIdType patientIdType) {
        this.patientIdType = patientIdType;
    }

    /**
     * GET.
     *
     * @return the authUniversalIDType
     */
    public String getAuthUniversalIDType() {
        return authUniversalIDType;
    }

    /**
     * SET.
     *
     * @param authUniversalIDType the authUniversalIDType to set
     */
    public void setAuthUniversalIDType(String authUniversalIDType) {
        this.authUniversalIDType = authUniversalIDType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        boolean equals = super.equals(obj);

        GlobalPatientId other = (GlobalPatientId) obj;
        if (equals) {
            return equals && ComparisonHelper.equals(type, other.type) && ComparisonHelper.equals(patientIdType, other.patientIdType);
        }
        return equals;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        int result = super.hashCode();
        final int prime = 31;
        result = prime * result + (type == null ? 0 : type.hashCode());
        result = prime * result + (patientIdType == null ? 0 : patientIdType.hashCode());
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toAuditString() {
        StringBuilder string = new StringBuilder(super.toAuditString());
        string.deleteCharAt(string.length() - 1);
        string.append(", ").append("scope=").append("global");
        string.append(", ").append("type=").append(patientIdType);
        string.append('}');
        return string.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(super.toString());
        builder.append("GlobalPatientId [type=");
        builder.append(type);
        builder.append(", patientIdType=");
        builder.append(patientIdType);
        builder.append("]");
        return builder.toString();
    }

}
