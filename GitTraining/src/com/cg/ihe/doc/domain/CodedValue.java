/*
 * CodedValueImpl
 * Date of creation: 2010-06-16
 * 
 * Copyright (c) CompuGROUP Software GmbH, 
 * This software is the confidential and proprietary information of
 * CompuGROUP Software GmbH. You shall not disclose such confidential
 * information and shall use it only in accordance with the terms of
 * the license agreement you entered into with CompuGROUP Software GmbH.
 */

package com.cg.ihe.doc.domain;

import com.cg.ihe.doc.domain.impl.CodedValueImpl;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Value that complies with a code system (e.g. LOINC).
 *
 * @author Johanna Fitzinger, AT
 */
@XmlJavaTypeAdapter(value = CodedValueImpl.CodedValueAdapter.class)
public interface CodedValue {

    /**
     * Returns the identifier of the code system this code belongs to.
     *
     * @return the codeSystem
     */
    public String getCodingScheme();

    /**
     * GET.
     *
     * @return the code
     */
    public String getCode();

    /**
     * Returns what shall be displayed to a human user.
     *
     * @return the displayName
     */
    public String getCodeDisplayName();

}
