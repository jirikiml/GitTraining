/*
 * XdsIInstance
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
public class XdsIInstance {

    /**
     * List of {@link XdsIFrame}.
     */
    private List<XdsIFrame> frames;

    /**
     * Id of the instance.
     */
    private String id;

    /**
     * Order number of the instance.
     */
    private Integer instanceNr;

    /**
     * GET.
     *
     * @return {@link #frames}
     */
    public List<XdsIFrame> getFrames() {
        return frames;
    }

    /**
     * SET.
     *
     * @param frames the frames to set
     */
    public void setFrames(List<XdsIFrame> frames) {
        this.frames = frames;
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
     * @param id the id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * GET.
     *
     * @return {@link #instanceNr}
     */
    public Integer getInstanceNr() {
        return instanceNr;
    }

    /**
     * SET.
     *
     * @param instanceNr the order number
     */
    public void setInstanceNr(Integer instanceNr) {
        this.instanceNr = instanceNr;
    }
}
