/*
 * PatientIdType
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

/**
 * @author Ingo Hackl, AT
 */
@XmlType(namespace = "http://ihe.mdm.g3.cgm/domain")
public enum PatientIdType {
    EMPLOYEE_NUMBER("EI"),

    HEALTH_CARD_NUMBER("HC"),

    LABOR_AND_INDUSTRIES("LI"),

    LOCAL_REGISTRY("ID"),

    MEDICAL_RECORD_NUMBER("MR"),

    TEMPORARY_MEDICAL_RECORD_NUMBER("MRT"),

    PATIENT_INTERNAL_IDENTIFIER("PI"),

    PERSON_NUMBER("PN"),

    PASSPORT_NUMBER("PPN"),

    PATIENT_EXTERNAL_IDENTIFIER("PT"),

    RESOURCE_IDENTIFIER("RI"),

    REGIONAL_REGISTRY("RRI"),

    SOCIAL_SECURITY_NUMBER("SS"),

    UNSPECIFIED_IDENTIFIER("U"),

    VISIT_NUMBER("VN");

    private final String code;

    public String code() {
        return code;
    }

    public String toString() {
        return code;
    }

    private PatientIdType(String code) {
        this.code = code;
    }

    public static PatientIdType forCode(String code) {
        for (PatientIdType t : values()) {
            if (t.code.equalsIgnoreCase(code)) {
                return t;
            }
        }
        throw new IllegalArgumentException("unknown code: " + code);
    }
}
