/*
 * XdsIDocumentMetadata
 * Date of creation: 2011-11-15
 * 
 * Copyright (c) CompuGROUP Software GmbH, 
 * This software is the confidential and proprietary information of
 * CompuGROUP Software GmbH. You shall not disclose such confidential
 * information and shall use it only in accordance with the terms of
 * the license agreement you entered into with CompuGROUP Software GmbH.
 */

package com.cg.ihe.doc.domain;

import java.util.List;

/**
 * @author Ingo Hackl, AT
 */
public class XdsIDocumentMetadata {

    private List<XdsIStudy> studies;

    /**
     * GET.
     *
     * @return the studies
     */
    public List<XdsIStudy> getStudies() {
        return studies;
    }

    /**
     * SET.
     *
     * @param studies the studies to set
     */
    public void setStudies(List<XdsIStudy> studies) {
        this.studies = studies;
    }

}
