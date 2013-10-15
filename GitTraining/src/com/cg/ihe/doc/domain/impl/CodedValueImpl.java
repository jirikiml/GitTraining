/*
 * CodedValue
 * Date of creation: 2010-06-16
 * 
 * Copyright (c) CompuGROUP Software GmbH, 
 * This software is the confidential and proprietary information of
 * CompuGROUP Software GmbH. You shall not disclose such confidential
 * information and shall use it only in accordance with the terms of
 * the license agreement you entered into with CompuGROUP Software GmbH.
 */

package com.cg.ihe.doc.domain.impl;

import com.cg.ihe.doc.domain.CodedValue;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.io.Serializable;

/**
 * Value that complies with a coding scheme, e.g. LOINC code.
 *
 * @author Johanna Fitzinger, AT
 */
@XmlType(name = "codedValue", namespace = "http://ihe.mdm.g3.cgm/domain")
public class CodedValueImpl implements CodedValue, Serializable {

    private String codingScheme;

    private String code;

    private String codeDisplayName;

    /**
     * Default constructor.
     */
    public CodedValueImpl() {
        super();
    }

    /**
     * Constructor.
     *
     * @param code            the code's value.
     * @param codeDisplayName the code's display name.
     */
    public CodedValueImpl(String code, String codeDisplayName) {
        super();
        this.code = code;
        this.codeDisplayName = codeDisplayName;
    }

    /**
     * Constructor.
     *
     * @param code            the code's value.
     * @param codeDisplayName the code's display name.
     * @param codingScheme    the code's scheme.
     */
    public CodedValueImpl(String code, String codeDisplayName, String codingScheme) {
        super();
        this.code = code;
        this.codeDisplayName = codeDisplayName;
        this.codingScheme = codingScheme;
    }

    /**
     * {@inheritDoc}
     */
    public String getCodingScheme() {
        return codingScheme;
    }

    /**
     * SET.
     *
     * @param codingScheme the codingScheme that defines the code
     */
    public void setCodingScheme(String codingScheme) {
        this.codingScheme = codingScheme;
    }

    /**
     * {@inheritDoc}
     */
    public String getCode() {
        return code;
    }

    /**
     * SET.
     *
     * @param code the code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * {@inheritDoc}
     */
    public String getCodeDisplayName() {
        return codeDisplayName;
    }

    /**
     * SET.
     *
     * @param codeDisplayName the name that shall be displayed to a human user
     */
    public void setCodeDisplayName(String codeDisplayName) {
        this.codeDisplayName = codeDisplayName;
    }

    @XmlTransient
    public static class CodedValueAdapter extends XmlAdapter<CodedValueImpl, CodedValue> {

        @Override
        public CodedValue unmarshal(final CodedValueImpl v) {
            return v;
        }

        @Override
        public CodedValueImpl marshal(final CodedValue v) {
            return (CodedValueImpl) v;
        }

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("code=").append(code);
        sb.append(',');
        sb.append("codeDisplayName=").append(codeDisplayName);
        sb.append(',');
        sb.append("codingScheme=").append(codingScheme);
        sb.append(']');
        return sb.toString();
    }

}
