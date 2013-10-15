package com.cg.ihe.doc.domain;

import com.cg.ihe.doc.domain.enums.Gender;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Patient.
 *
 * @author Johanna Fitzinger, AT
 */
public class Patient implements Serializable {

    private static final long serialVersionUID = -818486365710020275L;

    private Gender gender;

    private Date birthDate;

    private String fullName;

    private List<Address> addresses;

    private List<GlobalPatientId> globalPatientIds;

    private Address primaryAddress;

    private LocalPatientId localPatientId;

    private List<PersonName> personNames;

    private String socialSecurityNumber;

    private String birthPlace;

    private String citizenship;

    private Date deathDate;

    private Boolean deathIndicator;

    private String language;

    private String maritalStatus;

    private Date lastUpdateTime;

    private ContactData contactData;

    /**
     * Creates a new empty patient.
     */
    public Patient() {
        super();
    }


    /**
     * Creates a new patient with the given local patient id
     *
     * @param localPatientId The patient's local id.
     */
    public Patient(LocalPatientId localPatientId) {
        super();
        this.localPatientId = localPatientId;
    }

    /**
     * {@inheritDoc}
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * SET.
     *
     * @param gender the gender to set
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setGenderName(String gender) {
        if (gender != null) {
            this.gender = Gender.valueOf(gender);
        }
    }

    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * SET.
     *
     * @param birthDate the birthDate of the patient
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }


    /**
     * Get the patient's addresses.
     *
     * @return the addresses of this patient
     */
    public List<Address> getAddresses() {
        return addresses;
    }

    /**
     * Get the patient's primary address. His/her main domicile.
     *
     * @return the primary address of this patient's addresses {@link #getAddresses()}
     */
    public Address getPrimaryAddress() {
        if (primaryAddress == null) {
            if (addresses != null) {
                for (Address address : addresses) {
                    if (address.getType().equals(AddressType.PRIMARY_ADDRESS)) {
                        primaryAddress = address;
                    }
                }
            }
        }

        return primaryAddress;
    }


    /**
     * Set the patient's primary address. His/her main domicile.
     *
     * @param primaryAddress the main domicile address of this patient.
     */
    public void setPrimaryAddress(Address primaryAddress) {
        this.primaryAddress = primaryAddress;
    }


    /**
     * SET.
     *
     * @param addresses the person's real world address
     */
    public void setAddresses(List<Address> addresses) {
        if (addresses != null) {
            if (addresses.size() >= 1) {
                addresses.get(0).setType(AddressType.PRIMARY_ADDRESS);
            }
        }
        this.addresses = addresses;
    }

    /**
     * @return .
     */
    public List<GlobalPatientId> getGlobalPatientIds() {
        return globalPatientIds;
    }

    /**
     * DomainId.
     *
     * @param globalPatientIds the domainId to set
     */
    public void setGlobalPatientIds(List<GlobalPatientId> globalPatientIds) {
        this.globalPatientIds = globalPatientIds;
    }

    /**
     * GET.
     *
     * @return the socialSecurityNumber
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * SET.
     *
     * @param socialSecurityNumber the socialSecurityNumber to set
     */
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     * GET.
     *
     * @return the birthPlace
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /**
     * SET.
     *
     * @param birthPlace the birthPlace to set
     */
    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    /**
     * GET.
     *
     * @return the citizenship
     */
    public String getCitizenship() {
        return citizenship;
    }

    /**
     * SET.
     *
     * @param citizenship the citizenship to set
     */
    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    /**
     * GET.
     *
     * @return the deathDate
     */
    public Date getDeathDate() {
        return deathDate;
    }

    /**
     * SET.
     *
     * @param deathDate the deathDate to set
     */
    public void setDeathDate(Date deathDate) {
        this.deathDate = deathDate;
        if (deathDate != null) {
            deathIndicator = true;
        }
    }

    /**
     * GET.
     *
     * @return the deathIndicator
     */
    public Boolean getDeathIndicator() {
        return deathIndicator;
    }

    /**
     * SET.
     *
     * @param deathIndicator the deathIndicator to set
     */
    public void setDeathIndicator(Boolean deathIndicator) {
        if (deathDate != null) {
            this.deathIndicator = true;
        } else {
            this.deathIndicator = deathIndicator;
        }
    }

    /**
     * GET.
     *
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * SET.
     *
     * @param language the language to set
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * GET.
     *
     * @return the maritalStatus
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * SET.
     *
     * @param maritalStatus the maritalStatus to set
     */
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    /**
     * GET.
     *
     * @return the lastUpdateTime
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * SET.
     *
     * @param lastUpdateTime the lastUpdateTime to set
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * GET.
     *
     * @return the contactData
     */
    public ContactData getContactData() {
        return contactData;
    }

    /**
     * SET.
     *
     * @param contactData the contactData to set
     */
    public void setContactData(ContactData contactData) {
        this.contactData = contactData;
    }

    /**
     * GET.
     *
     * @return the localPatientId
     */
    public LocalPatientId getLocalPatientId() {
        return localPatientId;
    }

    /**
     * SET.
     *
     * @param localPatientId the localPatientId to set
     */
    public void setLocalPatientId(LocalPatientId localPatientId) {
        this.localPatientId = localPatientId;
    }

    /**
     * @param patientIdType .
     * @return .
     */
    public GlobalPatientId getGlobalPatientId(PatientIdType patientIdType) {
        if (globalPatientIds != null) {
            for (GlobalPatientId patientId : globalPatientIds) {
                if (patientId.getPatientIdType() != null && patientId.getPatientIdType().equals(patientIdType)) {
                    return patientId;
                }
            }
        }
        return null;
    }

    public GlobalPatientId getGlobalPatientId(String assigningAuthorityId) {
        if (globalPatientIds != null) {
            for (GlobalPatientId patientId : globalPatientIds) {
                if (patientId.getAssigningAuthorityId().equals(assigningAuthorityId)) {
                    return patientId;
                }
            }
        }

        return null;
    }

    /**
     * @return The textual representation of this patient. This is also used
     *         for error messages to show the user which patient is affected.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getFullName() != null) {
            sb.append(getFullName());
        } else {
            if (getGivenName() != null) {
                sb.append(getGivenName()).append(" ");
            }
            if (getFamilyName() != null) {
                sb.append(getFamilyName());
            }

            if (sb.length() == 0) {
                sb.append("[Patient with localPatientId ").append(getLocalPatientId()).append("]");
            }
        }
        return sb.toString();
    }

    /**
     * @return The textual representation of this patient plus his local
     *         patient id.
     */
    public String toStringWithId() {
        return toString() + " (" + getLocalPatientId() + ")";
    }

    /**
     * GET.
     *
     * @return the personNames
     */
    public List<PersonName> getPersonNames() {
        return personNames;
    }

    /**
     * SET.
     *
     * @param personNames the personNames to set
     */
    public void setPersonNames(List<PersonName> personNames) {
        this.personNames = personNames;
    }

    public String getFamilyName() {
        PersonName personName = getLegalName();
        if (personName != null) {
            return personName.getFamilyName();
        } else {
            return null;
        }
    }

    public String getGivenName() {
        PersonName personName = getLegalName();
        if (personName != null) {
            return personName.getGivenName();
        } else {
            return null;
        }
    }

    public List<String> getMiddleNames() {
        PersonName personName = getLegalName();
        if (personName != null) {
            return personName.getMiddleNames();
        } else {
            return null;
        }
    }

    public String getFullName() {
        if (fullName == null) {
            PersonName personName = getLegalName();
            if (personName != null) {
                fullName = personName.getFullName();
            }
        }
        return fullName;
    }

    /**
     * Needed by helix
     *
     * @param fullName .
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public PersonName getName(NameType nameType) {
        if (personNames != null) {
            for (PersonName personName : personNames) {
                if (personName.getNameType() != null && personName.getNameType().equals(nameType)) {
                    return personName;
                }
            }
            return null;
        }

        return null;
    }

    public PersonName getLegalName() {
        PersonName personName = getName(NameType.LEGAL_NAME);

        if (personName == null) {
            if (personNames != null && !personNames.isEmpty()) {
                // if no legal name is defined take the first person name
                return personNames.get(0);
            } else {
                return null;
            }
        } else {
            return personName;
        }
    }

}
