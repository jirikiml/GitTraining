/*
 * XdsIStudy
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
public class XdsIStudy {

    /**
     * The description of the study for presentation porpoises.
     */
    private String studyDescription;

    /**
     * Identifier of the study.
     */
    private String id;

    /**
     * List of series of the study. See {@link XdsISeries}.
     */
    private List<XdsISeries> series;

    /**
     * GET.
     *
     * @return the studyDescription
     */
    public String getStudyDescription() {
        return studyDescription;
    }

    /**
     * SET.
     *
     * @param studyDescription the studyDescription to set
     */
    public void setStudyDescription(String studyDescription) {
        this.studyDescription = studyDescription;
    }

    /**
     * GET.
     *
     * @return the series
     */
    public List<XdsISeries> getSeries() {
        return series;
    }

    /**
     * SET.
     *
     * @param series the series to set
     */
    public void setSeries(List<XdsISeries> series) {
        this.series = series;
    }

    /**
     * GET.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * SET.
     *
     * @param id the study id
     */
    public void setId(String id) {
        this.id = id;
    }

}
