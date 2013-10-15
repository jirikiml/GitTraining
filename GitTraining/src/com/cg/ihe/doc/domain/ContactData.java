/*
 * ContactData
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
import java.io.Serializable;

/**
 * Contact data for a person
 *
 * @author Ingo Hackl, AT
 */

@XmlType(name = "contactData", namespace = "http://ihe.mdm.g3.cgm/domain")
public class ContactData implements Serializable {

    private static final long serialVersionUID = -4118861540519233779L;

    private String emailBusiness;
    private String emailHome;
    private String phoneBusiness;
    private String phoneHome;

    /**
     * GET.
     *
     * @return the emailBusiness
     */
    public String getEmailBusiness() {
        return emailBusiness;
    }

    /**
     * SET.
     *
     * @param emailBusiness the emailBusiness to set
     */
    public void setEmailBusiness(String emailBusiness) {
        this.emailBusiness = emailBusiness;
    }

    /**
     * GET.
     *
     * @return the emailHome
     */
    public String getEmailHome() {
        return emailHome;
    }

    /**
     * SET.
     *
     * @param emailHome the emailHome to set
     */
    public void setEmailHome(String emailHome) {
        this.emailHome = emailHome;
    }

    /**
     * GET.
     *
     * @return the phoneBusiness
     */
    public String getPhoneBusiness() {
        return phoneBusiness;
    }

    /**
     * SET.
     *
     * @param phoneBusiness the phoneBusiness to set
     */
    public void setPhoneBusiness(String phoneBusiness) {
        this.phoneBusiness = phoneBusiness;
    }

    /**
     * GET.
     *
     * @return the phoneHome
     */
    public String getPhoneHome() {
        return phoneHome;
    }

    /**
     * SET.
     *
     * @param phoneHome the phoneHome to set
     */
    public void setPhoneHome(String phoneHome) {
        this.phoneHome = phoneHome;
    }
}
