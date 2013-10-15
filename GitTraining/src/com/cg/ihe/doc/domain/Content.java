/*
 * Content
 * Date of creation: 2010-01-12
 * 
 * Copyright (c) CompuGROUP Software GmbH, 
 * This software is the confidential and proprietary information of
 * CompuGROUP Software GmbH. You shall not disclose such confidential
 * information and shall use it only in accordance with the terms of
 * the license agreement you entered into with CompuGROUP Software GmbH.
 */
package com.cg.ihe.doc.domain;

import javax.activation.MimeType;

/**
 * Carries content as an array of bytes with a MIME type as additional information.
 *
 * @author Johanna Fitzinger, AT
 */
public interface Content {

    /**
     * GET.
     *
     * @return the mimeType
     */
    public MimeType getMimeType();


    /**
     * Get the document content (the first document part if multiple exist).
     *
     * @return the content
     */
    public byte[] getContent();

    /**
     * Shortcut to <code>mimetype.getBaseType()</code>
     *
     * @return the string representation of the mimeType
     */
    public String getMimeTypeName();

}
