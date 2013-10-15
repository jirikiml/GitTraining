/*
 * Gender
 * Date of creation: 2009-11-12
 * 
 * Copyright (c) CompuGROUP Software GmbH, 
 * This software is the confidential and proprietary information of
 * CompuGROUP Software GmbH. You shall not disclose such confidential
 * information and shall use it only in accordance with the terms of
 * the license agreement you entered into with CompuGROUP Software GmbH.
 */

package com.cg.ihe.doc.domain.enums;

import javax.xml.bind.annotation.XmlType;

/**
 * Enumerates all possible HL7 gender values. Refer to user-defined table 0001 (administrative sex) for suggested values.
 *
 * @author Johanna Fitzinger, AT
 */
@XmlType(namespace = "http://ihe.mdm.g3.cgm/domain")
public enum Gender {

    /**
     * Male.
     */
    M,

    /**
     * Female.
     */
    F,

    /**
     * Other.
     */
    O,

    /**
     * Unknown.
     */
    U,

    /**
     * Ambiguous.
     */
    A,

    /**
     * Not applicable.
     */
    N

}
