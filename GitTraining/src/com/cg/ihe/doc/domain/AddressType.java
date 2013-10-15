/*
 * AddressType
 * Date of creation: 2011-01-11
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
public enum AddressType {
    PRIMARY_ADDRESS,
    SECONDARY_ADDRESS;
}
