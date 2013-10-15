/*
 * DomainSessionToken
 * Date of creation: 2011-02-22
 * 
 * Copyright (c) CompuGROUP Software GmbH, 
 * This software is the confidential and proprietary information of
 * CompuGROUP Software GmbH. You shall not disclose such confidential
 * information and shall use it only in accordance with the terms of
 * the license agreement you entered into with CompuGROUP Software GmbH.
 */

package com.cg.ihe.doc;

import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * @author Ingo Hackl, AT
 */

@XmlType(namespace = "http://ihe.mdm.g3.cgm/domain")
// @ComplexType(name = DomainSessionToken.SCHEMA_TYPE) TODO create PresentationDTO if needed
public class DomainSessionToken implements Serializable{
    private static final long serialVersionUID = 8429749127810323285L;

    private String domain;
    private String sessionToken;

    /**
     *
     */
    public DomainSessionToken() {
        // 
    }

    /**
     * @param domain       .
     * @param sessionToken .
     */
    public DomainSessionToken(String domain, String sessionToken) {
        this.domain = domain;
        this.sessionToken = sessionToken;
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
     * GET.
     *
     * @return the sessionToken
     */
    public String getSessionToken() {
        return sessionToken;
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
     * SET.
     *
     * @param sessionToken the sessionToken to set
     */
    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

}
