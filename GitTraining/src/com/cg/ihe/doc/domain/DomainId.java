package com.cg.ihe.doc.domain;

import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.List;

/**
 * Id that uniquely identifies a resource or person in a specific domain.
 *
 * @author Johanna Fitzinger, AT
 */
@XmlType(name = "domainId", namespace = "http://ihe.mdm.g3.cgm/domain")
public class DomainId implements Serializable {

    private static final long serialVersionUID = 980944694861922801L;

    private String domain;

    private List<GlobalPatientId> patientIds;

    public DomainId() {
    }

    public DomainId(List<GlobalPatientId> patientIds, String domain) {
        this.patientIds = patientIds;
        this.domain = domain;
    }

    /**
     * GET.
     *
     * @return the domain
     */
    public String getDomain() {
        return domain;
    }

    /**
     * SET.
     *
     * @param domain the domain to set
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * GET.
     *
     * @return the patientIds
     */
    public List<GlobalPatientId> getPatientIds() {
        return patientIds;
    }

    /**
     * SET.
     *
     * @param patientIds the patientIds to set
     */
    public void setPatientIds(List<GlobalPatientId> patientIds) {
        this.patientIds = patientIds;
    }

    /**
     * @param patientIdType .
     * @return .
     */
    public GlobalPatientId getGlobalPatientId(PatientIdType patientIdType) {
        for (GlobalPatientId patientId : patientIds) {
            if (patientId.getPatientIdType().equals(patientIdType)) {
                return patientId;
            }
        }
        return null;
    }

    /**
     * Ignores domain.
     */
    @Override
    public boolean equals(Object other) {
        if (this != other) {
            return false;
        }
        if (other == null) {
            return false;
        }
        if (getClass() != other.getClass()) {
            return false;
        }

        return true;
    }

    /**
     * Ignores domain.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        if (patientIds != null) {
            for (GlobalPatientId patientId : patientIds) {
                result = prime * result + patientId.hashCode();
            }
        }
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("DomainId [domain=");
        builder.append(domain);
        if (patientIds != null) {
            for (GlobalPatientId patientId : patientIds) {
                builder.append("globalPatientId = ");
                builder.append(patientId.toString());
            }
        }
        builder.append("]");
        return builder.toString();
    }

}
