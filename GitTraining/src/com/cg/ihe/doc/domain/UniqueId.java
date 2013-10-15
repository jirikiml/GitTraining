/*
 * PatientId
 * Date of creation: 2011-01-18
 * 
 * Copyright (c) CompuGROUP Software GmbH, 
 * This software is the confidential and proprietary information of
 * CompuGROUP Software GmbH. You shall not disclose such confidential
 * information and shall use it only in accordance with the terms of
 * the license agreement you entered into with CompuGROUP Software GmbH.
 */

package com.cg.ihe.doc.domain;

import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * @author Ingo Hackl, AT
 */
@XmlType(name = "uniqueId", namespace = "http://ihe.mdm.g3.cgm/domain")
public class UniqueId implements Serializable {
    private static final long serialVersionUID = -6145230032211141760L;

    private String id;
    private String assigningAuthorityId;

    public UniqueId() {
    }

    public UniqueId(String id, String assigningAuthorityId) {
        this.id = id;
        this.assigningAuthorityId = assigningAuthorityId;
    }

    /**
     * GET.
     *
     * @return the assigningAuthorityId
     */
    public String getAssigningAuthorityId() {
        return assigningAuthorityId;
    }

    /**
     * SET.
     *
     * @param assigningAuthorityId the assigningAuthorityId to set
     */
    public void setAssigningAuthorityId(String assigningAuthorityId) {
        this.assigningAuthorityId = assigningAuthorityId;
    }

    /**
     * GET.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * SET.
     *
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        UniqueId other = (UniqueId) obj;
        if (assigningAuthorityId == null) {
            if (other.assigningAuthorityId != null) {
                return false;
            }
        } else if (!assigningAuthorityId.equals(other.assigningAuthorityId)) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((assigningAuthorityId == null) ? 0 : assigningAuthorityId.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    /**
     * Returns a string representation suitable for use as a participant identifier.
     *
     * @return string representation for audit
     */
    public String toAuditString() {
        StringBuilder string = new StringBuilder();
        string.append("PatientId");
        string.append('{');
        string.append("id=").append(id);
        string.append(", ").append("assigningAuthorityId=").append(assigningAuthorityId);
        string.append('}');
        return string.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.getClass().getName()).append(" [assigningAuthorityId=");
        builder.append(assigningAuthorityId);
        builder.append(", id=");
        builder.append(id);
        builder.append("]");
        return builder.toString();
    }

}