/*
 * XdsISeries
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
public class XdsISeries {

    /**
     * @see {@link java.io.Serializable}
     */
    private String seriesDescription;

    /**
     * The id of the series .
     */
    private String id;

    /**
     * List of instances .
     */
    private List<XdsIInstance> instances;

    /**
     * TODO .
     */
    private String retrieveAET;

    /**
     * Order number of the series .
     */
    private Integer seriesNr;

    /**
     * GET.
     *
     * @return the seriesDescription
     */
    public String getSeriesDescription() {
        return seriesDescription;
    }

    /**
     * SET.
     *
     * @param seriesDescription the seriesDescription to set
     */
    public void setSeriesDescription(String seriesDescription) {
        this.seriesDescription = seriesDescription;
    }

    /**
     * GET.
     *
     * @return the instances
     */
    public List<XdsIInstance> getInstances() {
        return instances;
    }

    /**
     * SET.
     *
     * @param instances the instances to set
     */
    public void setInstances(List<XdsIInstance> instances) {
        this.instances = instances;
    }

    /**
     * GET.
     *
     * @return {@link #id}
     */
    public String getId() {
        return id;
    }

    /**
     * SET.
     *
     * @param id the id of the series
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the Application Entity Title where the study can be retrieved from.
     *
     * @return the "Application Entity Title" where the study can be retrieved from (usually the PACS Q/R location)
     */
    public String getRetrieveAET() {
        return retrieveAET;
    }

    /**
     * Sets the Application Entity Title where the study can be retrieved from.
     *
     * @param retrieveAET the "Application Entity Title" where the study can be retrieved from (usually the PACS Q/R location)
     */
    public void setRetrieveAET(String retrieveAET) {
        this.retrieveAET = retrieveAET;
    }

    /**
     * GET.
     *
     * @return {@link #seriesNr}
     */
    public Integer getSeriesNr() {
        return seriesNr;
    }

    /**
     * SET.
     *
     * @param seriesNr the order number of series
     */
    public void setSeriesNr(Integer seriesNr) {
        this.seriesNr = seriesNr;
    }
}
