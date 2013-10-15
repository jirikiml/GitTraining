/*
 * NameType
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

/**
 * @author Ingo Hackl, AT
 */
@XmlType(namespace = "http://ihe.mdm.g3.cgm/domain")
public enum NameType {

    ALIAS_NAME("A"),

    NAME_AT_BIRTH("B"),

    ADOPTED_NAME("C"),

    DISPLAY_NAME("D"),

    LICSENSING_NAME("I"),

    LEGAL_NAME("L"),

    MAIDEN_NAME("M"),

    NICK_NAME("N"),

    NAME_OF_PARTNER("P"),

    REGISTERED_NAME("R"),

    CODE_PSEUDO_NAME("S"),

    INDIGENOUS("T"),

    UNSPECIFIED("U");

    private String code;

    private NameType(String code) {
        this.code = code;
    }

    public String toString() {
        return code;
    }

    public static NameType forCode(String code) {
        for (NameType t : values()) {
            if (t.code.equalsIgnoreCase(code)) {
                return t;
            }
        }
        throw new IllegalArgumentException("unknown code: " + code);
    }
}
