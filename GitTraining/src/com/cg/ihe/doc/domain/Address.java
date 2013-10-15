/*
 * Address
 * Date of creation: TODO YYYY-MM-DD
 * 
 * Copyright (c) CompuGROUP Software GmbH, 
 * This software is the confidential and proprietary information of
 * CompuGROUP Software GmbH. You shall not disclose such confidential
 * information and shall use it only in accordance with the terms of
 * the license agreement you entered into with CompuGROUP Software GmbH.
 */

package com.cg.ihe.doc.domain;

import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * Representation of a real world address of a person.
 *
 * @author Johanna Fitzinger, AT
 */

@XmlType(name = "address", namespace = "http://ihe.mdm.g3.cgm/domain")
public class Address implements Serializable {

    private static final long serialVersionUID = 9184159372553844181L;

    private String city;
    private String country;
    private String street;
    private String zipCode;
    private String state;
    private AddressType type;

    public Address() {
    }

    public Address(String street, String city, String zipCode, String country, String state, AddressType type) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.state = state;
        this.country = country;
        this.type = type;
    }

    public Address(String street, String city, String zipCode, String country, String state) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.state = state;
        this.country = country;
    }

    /**
     * {@inheritDoc}
     */
    public String getCity() {
        return city;
    }

    /**
     * SET.
     *
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * {@inheritDoc}
     */
    public String getCountry() {
        return country;
    }

    /**
     * SET.
     *
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * {@inheritDoc}
     */
    public String getStreet() {
        return street;
    }

    /**
     * SET.
     *
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * {@inheritDoc}
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * SET.
     *
     * @param zipCode the zipCode to set
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * GET.
     *
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * SET.
     *
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * GET.
     *
     * @return the type
     */
    public AddressType getType() {
        return type;
    }

    /**
     * SET.
     *
     * @param type the type to set
     */
    public void setType(AddressType type) {
        this.type = type;
    }

}
