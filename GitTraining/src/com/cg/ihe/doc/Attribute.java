/*
 * Attribute
 * Date of creation: 2011-09-06
 * 
 * Copyright (c) CompuGROUP Software GmbH, 
 * This software is the confidential and proprietary information of
 * CompuGROUP Software GmbH. You shall not disclose such confidential
 * information and shall use it only in accordance with the terms of
 * the license agreement you entered into with CompuGROUP Software GmbH.
 */

package com.cg.ihe.doc;

import com.cg.ihe.i18n.helix.HelixMessage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ingo Hackl, AT
 */
public class Attribute {

    public final static String ERROR_MESSAGE = "errormessage";
    public final static String ERROR_MESSAGE_AUTHENTICATION_FAILED = HelixMessage.AUTHENTICATION_FAILED;
    public final static String ERROR_MESSAGE_AUTHENTICATION_FAILED_NO_UNIQUE_ROLE = HelixMessage.AUTHENTICATION_FAILED_NO_UNIQUE_ROLE;
    public final static String ERROR_MESSAGE_AUTHENTICATION_FAILED_MISSING_ORGANISATION = HelixMessage.AUTHENTICATION_FAILED_MISSING_ORGANISATION;
    public final static String ERROR_MESSAGE_AUTHENTICATION_FAILED_NO_UNIQUE_ORGANISATION_AND_ROLE = HelixMessage.AUTHENTICATION_FAILED_NO_UNIQUE_ORGANISATION_AND_ROLE;
    public final static String ERROR_MESSAGE_AUTHENTICATION_FAILED_FOR_GIVEN_ORGANISATION_AND_ROLE = HelixMessage.AUTHENTICATION_FAILED_FOR_GIVEN_ORGANISATION_AND_ROLE;
    public final static String ERROR_MESSAGE_UNKNOWN_PATIENT = HelixMessage.UNKNOWN_PATIENT;
    public final static String ERROR_MESSAGE_NO_DOCUMENTS = HelixMessage.NO_DOCUMENTS;
    public final static String ERROR_MESSAGE_CONNECTION_FAILED = HelixMessage.CONNECTION_FAILED;
    public final static String ERROR_MESSAGE_WRONG_REPOSITORY_VERSION = HelixMessage.WRONG_REPOSITORY_VERSION;
    public final static String ERROR_MESSAGE_UNKNOWN_ERROR = HelixMessage.UNKNOWN_ERROR;
    public final static String ERROR_MESSAGE_REPO_METADATA_SOME_DOCS_FAILED = HelixMessage.REPOSITORY_METADATA_SOME_DOCS_FAILED;
    public final static String ERROR_MESSAGE_DOC_METADATA_SOME_DOCS_FAILED = HelixMessage.DOCUMENT_METADATA_SOME_DOCS_FAILED;
    public final static String ERROR_MESSAGE_SOME_DOCS_FAILED = HelixMessage.SOME_DOCS_FAILED;
    public final static String NO_PERMISSION_TO_ACCESS_REPOSITORY = HelixMessage.NO_PERMISSION_TO_ACCESS_REPOSITORY;

    public final static String SEVERITY = "severity";
    public final static String SEVERITY_INFO = "info";
    public final static String SEVERITY_ERROR = "error";

    public final static String ERROR_MESSAGE_DETAIL = "errorMessageDetail";

    public final static String ERROR_MESSAGE_PARAMETERS = "errorMessageParameters";

    public final static String QUERY_RANGE_START_DATE = "queryRangeStartDate";

    private String name;
    /* Remark: storage of value(s) required for workaround how to store/(de)serialize array of multiple values
     *  (used e.g. for storage/transfer error message parameters). Inheritance can not be used in Helix
     *  (de)serialization process and API change is not intended (most of attributes hold single value). */
    private String[] values;

    /**
     * Default Constructor needed by helix
     */
    public Attribute() {

    }

    /**
     * Use for creation of Attribute storing only single value.
     *
     * @param name  name of Attribute.
     * @param value value of Attribute.
     */
    public Attribute(String name, String value) {
        this(name, new String[]{value});
    }

    /**
     * Use for creation of Attribute storing multiple values.
     *
     * @param name           name of multiple values Attribute.
     * @param multipleValues multiple values.
     */
    public Attribute(String name, String[] multipleValues) {
        if (name == null || name.trim().length() == 0) {
            throw new IllegalArgumentException("Name must not be null or empty!");
        }
        if (multipleValues == null) {
            throw new IllegalArgumentException("Value must not be null!");
        }
        for (String value : multipleValues) {
            if (value == null) {
                throw new IllegalArgumentException("Value must not be null!");
            }
        }

        this.name = name;
        this.values = multipleValues.clone();
    }

    /**
     * GET.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * GET.
     *
     * @return the value
     */
    public String getValue() {
        return values[0];
    }

    /**
     * GET.
     *
     * @return the array of Strings as multiple values.
     */
    public String[] getMultipleValues() {
        return values;
    }

    /**
     * needed by helix
     *
     * @param name .
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * needed by helix
     *
     * @param value .
     */
    public void setValue(String value) {
        /* Remark: setter is called by Helix (de)serialization in fixed order determined by property name. */
        if (this.values == null) {
            this.values = new String[]{value};
        } else {
            Boolean valueExists = false;
            for (String existingValue : values) {
                if (value.equals(existingValue)) {
                    valueExists = true;
                    break;
                }
            }
            if (!valueExists) {
                /* Should not happen in normal case. */
                List<String> newValues = new ArrayList<String>(this.values.length + 1);
                newValues.add(value);
                newValues.addAll(Arrays.asList(this.values));
                this.values = newValues.toArray(new String[newValues.size()]);
            }
        }
    }

    /**
     * needed by helix
     *
     * @param multipleValues the array of Strings as multiple values.
     *                       .
     */
    public void setMultipleValues(String[] multipleValues) {
        if (multipleValues == null) {
            throw new IllegalArgumentException("Value must not be null!");
        }
        for (String value : multipleValues) {
            if (value == null) {
                throw new IllegalArgumentException("Value must not be null!");
            }
        }

        this.values = multipleValues.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Attribute attribute = (Attribute) o;
        if (name != null ? !name.equals(attribute.name) : attribute.name != null) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

}
