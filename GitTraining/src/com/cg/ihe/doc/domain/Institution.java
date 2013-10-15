/*
 * Institution
 * Date of creation: TODO YYYY-MM-DD
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
 * Institution.
 *
 * @author Johanna Fitzinger, AT
 */
@XmlType(name = "institution", namespace = "http://ihe.mdm.g3.cgm/domain")
public class Institution implements Serializable {

    private static final long serialVersionUID = 8149012639347886933L;

    private String oid;
    private String name;

    /**
     * Constructor.
     */
    public Institution() {
        super();
    }

    /**
     * Constructor.
     *
     * @param oid
     * @param name
     */
    public Institution(String oid, String name) {
        super();
        this.oid = oid;
        this.name = name;
    }

    /**
     * {@inheritDoc}
     */
    public String getOid() {
        return oid;
    }

    /**
     * SET.
     *
     * @param oid the oid to set
     */
    public void setOid(String oid) {
        this.oid = oid;
    }

    /**
     * {@inheritDoc}
     */
    public String getName() {
        return name;
    }

    /**
     * SET.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
