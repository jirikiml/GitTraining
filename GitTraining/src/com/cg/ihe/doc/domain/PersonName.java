/*
 * PersonName
 * Date of creation: 2011-1-12
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
import java.util.List;

/**
 * @author Ingo Hackl, AT
 */

@XmlType(name = "personName", namespace = "http://ihe.mdm.g3.cgm/domain")
public class PersonName implements Serializable {

    private static final long serialVersionUID = 2413149592779280728L;

    private String familyName;
    private String givenName;
    private List<String> middleNames;
    private String namePrefix;
    private String nameSuffix;
    private NameType nameType;
    private String fullName;
    private String degree;

    public PersonName() {
    }

    public PersonName(String familyName, String givenName, NameType nameType) {
        this.familyName = familyName;
        this.givenName = givenName;
        this.nameType = nameType;
    }

    public PersonName(String familyName, String givenName) {
        this.familyName = familyName;
        this.givenName = givenName;
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
     * @return the middleNames
     */
    public List<String> getMiddleNames() {
        return middleNames;
    }

    /**
     * SET.
     *
     * @param middleNames the middleNames to set
     */
    public void setMiddleNames(List<String> middleNames) {
        this.middleNames = middleNames;
    }

    /**
     * GET.
     *
     * @return the namePrefix
     */
    public String getNamePrefix() {
        return namePrefix;
    }

    /**
     * SET.
     *
     * @param namePrefix the namePrefix to set
     */
    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    /**
     * GET.
     *
     * @return the nameSuffix
     */
    public String getNameSuffix() {
        return nameSuffix;
    }

    /**
     * SET.
     *
     * @param nameSuffix the nameSuffix to set
     */
    public void setNameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix;
    }

    /**
     * GET.
     *
     * @return the nameTypeCode
     */
    public NameType getNameType() {
        return nameType;
    }

    /**
     * SET.
     *
     * @param nameType the nameType to set
     */
    public void setNameType(NameType nameType) {
        this.nameType = nameType;
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
        setNameType(NameType.LEGAL_NAME);

        this.fullName = fullName;
    }

    /**
     * GET.
     *
     * @return the degree
     */
    public String getDegree() {
        return degree;
    }

    /**
     * SET.
     *
     * @param degree the degree to set
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }

    /**
     * Returns a string representation suitable for use as a participant identifier.
     *
     * @return string representation for audit
     */
    public String toAuditString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        if (familyName != null) {
            sb.append("familyName=").append(familyName);
            sb.append(',');
        }
        if (givenName != null) {
            sb.append("givenName=").append(givenName);
            sb.append(',');
        }
        if (middleNames != null) {
            sb.append("middleNames=").append(middleNames);
            sb.append(',');
        }
        if (namePrefix != null) {
            sb.append("namePrefix=").append(namePrefix);
            sb.append(',');
        }
        if (nameSuffix != null) {
            sb.append("nameSuffix=").append(nameSuffix);
            sb.append(',');
        }
        if (nameType != null) {
            sb.append("nameType=").append(nameType);
            sb.append(',');
        }
        if (degree != null) {
            sb.append("degree=").append(degree);
        }
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append(']');
        return sb.toString();
    }

}
