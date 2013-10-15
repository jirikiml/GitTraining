/*
 * XdsIFrame
 * Date of creation: 2011-11-15
 * 
 * Copyright (c) CompuGROUP Software GmbH, 
 * This software is the confidential and proprietary information of
 * CompuGROUP Software GmbH. You shall not disclose such confidential
 * information and shall use it only in accordance with the terms of
 * the license agreement you entered into with CompuGROUP Software GmbH.
 */

package com.cg.ihe.doc.domain;

/**
 * @author Ingo Hackl, AT
 */
public class XdsIFrame {

    /**
     * Width of the image.
     */
    private Integer columns;

    /**
     * The order number of the frame.
     */

    private Integer frameNr;

    /**
     * TODO .
     */
    private Boolean fullSeriesScan;

    /**
     * TODO .
     */
    private String loaderUri;

    /**
     * TODO .
     */
    private String retrieveAET;

    /**
     * TODO .
     */
    private String retrieveAetUrl;

    /**
     * Height of the image.
     */
    private Integer rows;

    /**
     * TODO .
     */
    private String wadoParameter;

    /**
     * GET.
     *
     * @return {@link #columns}
     */
    public Integer getColumns() {
        return columns;
    }

    /**
     * SET.
     *
     * @param columns width of the frame
     */
    public void setColumns(Integer columns) {
        this.columns = columns;
    }

    /**
     * GET.
     *
     * @return {@link #frameNr}
     */
    public Integer getFrameNr() {
        return frameNr;
    }

    /**
     * SET.
     *
     * @param frameNr order of the frame
     */
    public void setFrameNr(Integer frameNr) {
        this.frameNr = frameNr;
    }

    /**
     * GET.
     *
     * @return {@link #fullSeriesScan}
     */
    public Boolean getFullSeriesScan() {
        return fullSeriesScan;
    }

    /**
     * SET.
     *
     * @param fullSeriesScan fullSeriesScan
     */
    public void setFullSeriesScan(Boolean fullSeriesScan) {
        this.fullSeriesScan = fullSeriesScan;
    }

    /**
     * GET.
     *
     * @return {@link #loaderUri}
     */
    public String getLoaderUri() {
        return loaderUri;
    }

    /**
     * SET.
     *
     * @param loaderUri loaderUri
     */
    public void setLoaderUri(String loaderUri) {
        this.loaderUri = loaderUri;
    }

    /**
     * GET.
     *
     * @return {@link #retrieveAET}
     */
    public String getRetrieveAET() {
        return retrieveAET;
    }

    /**
     * SET.
     *
     * @param retrieveAET retrieveAET
     */
    public void setRetrieveAET(String retrieveAET) {
        this.retrieveAET = retrieveAET;
    }

    /**
     * GET.
     *
     * @return {@link #retrieveAetUrl}
     */
    public String getRetrieveAetUrl() {
        return retrieveAetUrl;
    }

    /**
     * SET.
     *
     * @param retrieveAetUrl retrieveAetUrl
     */
    public void setRetrieveAetUrl(String retrieveAetUrl) {
        this.retrieveAetUrl = retrieveAetUrl;
    }

    /**
     * GET.
     *
     * @return {@link #rows}
     */
    public Integer getRows() {
        return rows;
    }

    /**
     * SET.
     *
     * @param rows width of the frame
     */
    public void setRows(Integer rows) {
        this.rows = rows;
    }

    /**
     * GET.
     *
     * @return {@link #wadoParameter}
     */
    public String getWadoParameter() {
        return wadoParameter;
    }

    /**
     * SET.
     *
     * @param wadoParameter wadoParameter
     */
    public void setWadoParameter(String wadoParameter) {
        this.wadoParameter = wadoParameter;
    }

}
