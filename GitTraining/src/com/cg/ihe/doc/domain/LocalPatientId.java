/*
 * LocalPatientId
 * Date of creation: 2011-01-14
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
@XmlType(name = "localPatientId", namespace = "http://ihe.mdm.g3.cgm/domain")
public class LocalPatientId extends UniqueId {

    private static final long serialVersionUID = -1954300845536371849L;

    /**
     * Default constructor.
     */
    public LocalPatientId() {
        super();
    }

    /**
     * @param id                   id
     * @param assigningAuthorityId assigningAuthorityId
     */
    public LocalPatientId(String id, String assigningAuthorityId) {
        super(id, assigningAuthorityId);
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
