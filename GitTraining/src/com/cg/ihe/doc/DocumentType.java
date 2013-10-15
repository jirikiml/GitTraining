/*
 * DocumentTypes
 * Date of creation: 2011-05-26
 * 
 * Copyright (c) CompuGROUP Software GmbH, 
 * This software is the confidential and proprietary information of
 * CompuGROUP Software GmbH. You shall not disclose such confidential
 * information and shall use it only in accordance with the terms of
 * the license agreement you entered into with CompuGROUP Software GmbH.
 */

package com.cg.ihe.doc;

/**
 * @author Ingo Hackl, AT
 */
public interface DocumentType {
    public static interface MimeType {
        public static final String PNG = "image/png";
        public static final String JPG = "image/jpg";
        public static final String JPEG = "image/jpeg";
        public static final String TIFF = "image/tiff";
        public static final String PDF = "application/pdf";
        public static final String XML = "application/xml";
        public static final String TEXT_XML = "text/xml";
        public static final String TEXT_PLAIN = "text/plain";
        public static final String HTML = "application/html";
        public static final String TEXT_HTML = "text/html";
        public static final String MULTIIMAGE = "multipart/mixed";
        public static final String DICOM = "application/dicom";
        public static final String UNKNOWN = "application/octet-stream";
    }

    public static interface FormatName {
        public static final String PNG = "PNG";
        public static final String JPG = "JPG";
        public static final String TIFF = "TIFF";
        public static final String PDF = "PDF";
        public static final String XML = "XML";
        public static final String TXT = "TXT";
        public static final String HTML = "HTML";
    }

}
