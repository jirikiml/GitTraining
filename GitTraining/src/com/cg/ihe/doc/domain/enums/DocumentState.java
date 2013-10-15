/*
 * DocumentState
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
 * Enumeration of available states for documents.<br>
 * <br>
 * Case of letters is important as the enum names are used as constants.
 *
 * @author Johanna Fitzinger, AT
 */
@XmlType(namespace = "http://ihe.mdm.g3.cgm/domain")
public enum DocumentState {

    /**
     * Approved document.
     */
    Approved,

    /**
     * Depreciated document.
     */
    Deprecated

}
