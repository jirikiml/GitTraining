/*
 * Employee
 * Date of creation: 2009-12-10
 * 
 * Copyright (c) CompuGROUP Software GmbH, 
 * This software is the confidential and proprietary information of
 * CompuGROUP Software GmbH. You shall not disclose such confidential
 * information and shall use it only in accordance with the terms of
 * the license agreement you entered into with CompuGROUP Software GmbH.
 */

package com.cg.ihe.doc.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * health institution employee.
 *
 * @author Johanna Fitzinger, AT
 */
@XmlType(namespace = "http://ihe.mdm.g3.cgm/domain")
public class Employee implements Serializable {
    private static final long serialVersionUID = -5571813096204079335L;
    private String familyName;
    private String givenName;
    private String middleNames;
    private String nameSuffix;
    private String namePrefix;
    private UniqueId uniqueId;
    private String fullName;

    /**
     * The department of the employee (e.g. "Innere Medizin - OG3")
     */
    private String department;

    /**
     * The employee's role on the originating system (e.g. "BehandelnderArzt")
     */
    private List<String> roles;

    /**
     * The subdepartment of the employee (e.g. "Cardiology")
     */
    private String subDepartment;

    /**
     * The specialities fields of the employee (e.g. "Cardiologist", "Fachbereich")
     */
    private List<String> specialities;

    private Institution institution;

    /**
     * Constructor.
     */
    public Employee() {
        // nothing to do
    }

    /**
     * Constructor.
     */
    public Employee(Employee other) {
        this.department = other.department;
        this.familyName = other.familyName;
        this.fullName = other.fullName;
        this.givenName = other.givenName;
        this.uniqueId = other.uniqueId;
        this.institution = other.institution;// TODO copy
        this.middleNames = other.middleNames;
        this.namePrefix = other.namePrefix;
        this.nameSuffix = other.nameSuffix;
        this.roles = other.roles;// TODO copy
        this.specialities = other.specialities;// TODO copy
        this.subDepartment = other.subDepartment;
    }

    /**
     * GET.
     *
     * @return the uniqueId
     */
    public UniqueId getUniqueId() {
        if (uniqueId == null) {
            uniqueId = new UniqueId();
        }
        return uniqueId;
    }

    /**
     * SET.
     *
     * @param uniqueId the uniqueId to set
     */
    public void setUniqueId(UniqueId uniqueId) {
        this.uniqueId = uniqueId;
    }

    /**
     * GET.
     *
     * @return the familyName
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * SET.
     *
     * @param familyName the familyName to set
     */
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    /**
     * GET.
     *
     * @return the givenName
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * SET.
     *
     * @param givenName the givenName to set
     */
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    /**
     * GET.
     *
     * @return the middlenames
     */
    public String getMiddleNames() {
        return middleNames;
    }

    /**
     * SET.
     *
     * @param middleNames the middlenames to set
     */
    public void setMiddleNames(String middleNames) {
        this.middleNames = middleNames;
    }

    /**
     * GET.
     *
     * @return the suffix
     */
    public String getNameSuffix() {
        return nameSuffix;
    }

    /**
     * SET.
     *
     * @param suffix the suffix to set
     */
    public void setNameSuffix(String suffix) {
        this.nameSuffix = suffix;
    }

    /**
     * GET.
     *
     * @return the prefix
     */
    public String getNamePrefix() {
        return namePrefix;
    }

    /**
     * SET.
     *
     * @param prefix the prefix to set
     */
    public void setNamePrefix(String prefix) {
        this.namePrefix = prefix;
    }

    /**
     * {@inheritDoc}
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department The department of the employee (e.g. "Innere Medizin - OG3")
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * {@inheritDoc}
     */
    public String getSubDepartment() {
        return subDepartment;
    }

    /**
     * @param subDepartment The subdepartment of the employee (e.g. "Cardiology")
     */
    public void setSubDepartment(String subDepartment) {
        this.subDepartment = subDepartment;
    }

    /**
     * {@inheritDoc}
     */
    @XmlElement(name = "role")
    public List<String> getRoles() {
        if (roles == null) {
            roles = new ArrayList<String>();
        }
        return roles;
    }

    /**
     * @param roles The employee's roles on the originating system (e.g. "BehandelnderArzt")
     */
    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    /**
     * {@inheritDoc}
     */
    @XmlElement(name = "speciality")
    public List<String> getSpecialities() {
        if (specialities == null) {
            specialities = new ArrayList<String>();
        }
        return specialities;
    }

    /**
     * @param specialities The speciality field of the employee (e.g. "Cardiologist", "Fachbereich")
     */
    public void setSpecialities(List<String> specialities) {
        this.specialities = specialities;
    }

    /**
     * {@inheritDoc}
     */
    public Institution getInstitution() {
        return institution;
    }

    /**
     * SET.
     *
     * @param institution the institution to set
     */
    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    /**
     * GET.
     *
     * @return the fullName
     */
    public String getFullName() {
        if (fullName == null) {
            StringBuffer a = new StringBuffer();
            if (getNamePrefix() != null) {
                a.append(getNamePrefix());
            }
            if (getGivenName() != null) {
                if (a.length() > 0) {
                    a.append(" ");
                }
                a.append(getGivenName());
            }
            if (getFamilyName() != null) {
                if (a.length() > 0) {
                    a.append(" ");
                }
                a.append(getFamilyName());
            }
            if (getNameSuffix() != null) {
                if (a.length() > 0) {
                    a.append(" ");
                }
                a.append(getNameSuffix());
            }
            this.fullName = a.toString();
        }
        return fullName;
    }

    /**
     * SET.
     *
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

}
