package com.cg.ihe.doc.domain;

import com.cg.ihe.doc.DocumentType;
import com.cg.ihe.doc.domain.enums.DocumentState;
import com.cg.ihe.doc.domain.impl.CodedValueImpl;

import javax.activation.MimeType;
import javax.activation.MimeTypeParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Document meta data Superclass, that provides common properties of
 * documents that may be used across different document sources
 * (i.e. IHE, HIS)
 *
 * @author Johanna Fitzinger, AT
 */
public class DocumentMetadata implements Comparable<DocumentMetadata> {

    /**
     * Logger.
     */
    private transient static Logger logger = Logger.getLogger(DocumentMetadata.class.getName());

    /**
     * The i.pack identifier of the institution this document originates from or <code>null</code> if the
     * originating institution cannot be determined or is not configured in i.pack master data.
     * The determination of the originating institution is the responsibility of the source adapter implementation.
     */
    private String institution;

    /**
     * The oid of the institution this document originates from or <code>null</code> if the
     * originating institution cannot be determined or is not configured in i.pack master data.
     * see {@link #institution}
     */
    private String institutionOid;

    /**
     * Identifiers used to unambiguously identify this document <br />
     * both on the i.pack instance and on the remote source.r.
     */
    private DocumentId documentId;
    /**
     * Id of the parent document.
     * CAUTION: This is NOT the folder the document lives in! The parent
     * folder(s) can be found in the "folders" property.
     */
    private DocumentId parentDocumentId;
    /**
     * Id of the patient.
     */
    private DomainId patientId;
    /**
     * Title of the document.
     */
    private String title;
    /**
     * Date of creation.
     */
    private Date creationDate;
    /**
     * start date of health service.
     */
    private Date serviceStartTime;
    /**
     * stop date for health service.
     */
    private Date serviceStopTime;
    /**
     * author of the document.
     */
    private Employee author;
    /**
     * Person who has legally authenticated or attested the document.
     */
    private Employee legalAuthenticator;
    /**
     * State of the document (i.e. "Approved").
     */
    private DocumentState state;
    /**
     * The code specifying the particular kind of document (e.g. Prescription)
     */
    private CodedValueImpl documentClass;
    /**
     * The document's annotations at save-time, if any were given.
     */
    private String comments;
    /**
     * The medical events associated with the document (e.g. "Appendectomy").
     */
    private List<CodedValueImpl> events;
    /**
     * The code describing the precise kind document (e.g. "Ultrasound Report").
     */
    private CodedValueImpl type;
    /**
     * The higher-level format of the document (e.g. "ScanPDF/IHE1.x").
     */
    private CodedValueImpl format;
    /**
     * Type of document according to MIME standard (e.g. "text/xml").
     * If the mime type is unknown this value is "application/octet-stream".
     */
    private MimeType rawDocumentMimeType;

    private String rawDocumentMimeTypeName;
    /**
     * Attachments of the document.
     */
    private List<DocumentMetadata> attachments;

    /**
     * The language used in the Document (e.g. "de").
     */
    private String language;

    /**
     * The type originating healthcare facility (e.g. "Private Clinic").
     */
    private CodedValueImpl healthcareFacilityType;

    /**
     * The document's confidentiality status
     * (one of: "very restricted", "restricted", "standard").
     */
    private CodedValueImpl confidentiality;

    /**
     * A document can be stored an arbitrary (virtual) folder, which has
     * nothing to do with the document's class (e.g. "internal").
     * This folder can be used for further grouping.
     */
    private List<FolderMetadata> folders;
    /**
     * The code specifying the clinical specialty where the act, that resulted
     * in the document was performed (e.g. 'Family Practice').
     */
    private CodedValueImpl practiceSetting;

    /**
     * The size of the document in bytes.
     */
    private int size;

    private boolean ownInstitution;

    /**
     * xds query constraints.
     * For TIANI systems this attribute is used to decide which component is used to execute the query (gateway or local registry)
     */
    private String usedXdsCons;

    /**
     * Constructor.
     */
    public DocumentMetadata() {
        super();
    }

    /**
     * Constructor.
     *
     * @param documentId the document id.
     */
    public DocumentMetadata(DocumentId documentId) {
        super();
        this.documentId = documentId;
    }

    /**
     * @return the id of this documents parent document <br />
     *         <code>null</code> if the document has no parent
     */
    public DocumentId getParentDocumentId() {
        return parentDocumentId;
    }

    /**
     * SET.
     *
     * @param parentDocumentId the parentDocumentId to set
     */
    public void setParentDocumentId(DocumentId parentDocumentId) {
        this.parentDocumentId = parentDocumentId;
    }

    /**
     * @return the identifiers used to unambiguously identify this document <br />
     *         both on the i.pack instance and on the remote source.
     */
    public DocumentId getDocumentId() {
        return documentId;
    }

    /**
     * SET.
     *
     * @param documentId the documentId to set
     */
    public void setDocumentId(DocumentId documentId) {
        this.documentId = documentId;
    }

    /**
     * @return the identifiers used to unambiguously identify this patient <br />
     *         on the remote patient source.
     */
    public DomainId getPatientId() {
        return patientId;
    }

    /**
     * SET.
     *
     * @param patientId the patientId to set
     */
    public void setPatientId(DomainId patientId) {
        this.patientId = patientId;
    }

    /**
     * @return the documents title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * SET.
     *
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getServiceStartTime() {
        return serviceStartTime;
    }

    public void setServiceStartTime(Date serviceStartTime) {
        this.serviceStartTime = serviceStartTime;
    }

    public Date getServiceStopTime() {
        return serviceStopTime;
    }

    public void setServiceStopTime(Date serviceStopTime) {
        this.serviceStopTime = serviceStopTime;
    }

    /**
     * @return human or machine that authored this document.
     */
    public Employee getAuthor() {
        return author;
    }

    /**
     * SET.
     *
     * @param author the author to set
     */
    public void setAuthor(Employee author) {
        this.author = author;
    }

    /**
     * @return the participant who legally authenticated or attested this document.
     */
    public Employee getLegalAuthenticator() {
        return legalAuthenticator;
    }

    /**
     * SET.
     *
     * @param legalAuthenticator Person who has legally authenticated or attested the document
     */
    public void setLegalAuthenticator(Employee legalAuthenticator) {
        this.legalAuthenticator = legalAuthenticator;
    }

    /**
     * @return the state of this document.
     */
    public DocumentState getState() {
        return state;
    }

    /**
     * SET.
     *
     * @param state State of the document (i.e. 'Approved')
     */
    public void setState(DocumentState state) {
        this.state = state;
    }

    /**
     * @return the code specifying the particular kind of document (e.g. Prescription).
     */
    public CodedValueImpl getDocumentClass() {
        return documentClass;
    }

    /**
     * SET.
     *
     * @param documentClass code specifying the particular kind of document (e.g. Prescription).
     */
    public void setDocumentClass(CodedValueImpl documentClass) {
        this.documentClass = documentClass;
    }

    /**
     * @return the document's annotations at save-time, if any were given
     */
    public String getComments() {
        return comments;
    }

    /**
     * SET.
     *
     * @param comments the document's annotations at save-time, if any were given
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * @return the medical events associated with the document (e.g. "Appendectomy")
     */
    public List<CodedValueImpl> getEvents() {
        if (events == null) {
            events = new ArrayList<CodedValueImpl>();
        }
        return events;
    }

    /**
     * SET.
     *
     * @param events the medical events associated with the document (e.g. "Appendectomy")
     */
    public void setEvents(List<CodedValueImpl> events) {
        this.events = events;
    }

    /**
     * @return the code describing the precise kind document (e.g. "Ultrasound Report")
     */
    public CodedValueImpl getType() {
        return type;
    }

    /**
     * SET.
     *
     * @param type the code describing the precise kind document (e.g. "Ultrasound Report")
     */
    public void setType(CodedValueImpl type) {
        this.type = type;
    }

    /**
     * @return the higher-level format of the document (e.g. "ScanPDF/IHE1.x")
     */
    public CodedValueImpl getFormat() {
        return format;
    }

    /**
     * SET.
     *
     * @param format the higher-level format of the document (e.g. "ScanPDF/IHE1.x").
     */
    public void setFormat(CodedValueImpl format) {
        this.format = format;
    }

    /**
     * @return the type of document according to MIME standard (e.g. "text/xml") <br/>
     *         If the mime type of this document is unknown, or cannot be determined,  the return value is "application/octet-stream".
     */
    public MimeType getRawDocumentMimeType() {
        if (rawDocumentMimeType == null) {
            try {
                rawDocumentMimeType = new MimeType(DocumentType.MimeType.UNKNOWN);
            } catch (MimeTypeParseException e) {
//                throw new IHERuntimeException("Mime type was not recognized " + DocumentType.MimeType.UNKNOWN, e);
            }
        }
        return rawDocumentMimeType;
    }

    /**
     * SET.
     *
     * @param rawDocumentMimeType the type of document according to MIME standard (e.g. "text/xml")
     */
    public void setRawDocumentMimeType(MimeType rawDocumentMimeType) {
        this.rawDocumentMimeType = rawDocumentMimeType;
        this.rawDocumentMimeTypeName = rawDocumentMimeType.getBaseType();
    }

    /**
     * @return the string representation of the mime type of this document
     *         (e.g. "text/xml") <br/>
     *         If the mime type of this document is unknown, or cannot be
     *         determined  the return value is "application/octet-stream".
     */
    public String getRawDocumentMimeTypeName() {
        if (rawDocumentMimeTypeName == null) {
            rawDocumentMimeTypeName = getRawDocumentMimeType().getBaseType();
        }
        return rawDocumentMimeTypeName;
    }

    /**
     * SET.
     *
     * @param mimeType the string representation of the type of document according to MIME standard (e.g. "text/xml")
     */
    public void setRawDocumentMimeTypeName(String mimeType) {
        if (mimeType != null) {
            try {
                this.rawDocumentMimeType = new MimeType(mimeType);
                this.rawDocumentMimeTypeName = mimeType;
            } catch (MimeTypeParseException ex) {
                logger.log(Level.SEVERE, "failed to parse MIME type", ex);
            }
        }
    }

    /**
     * @return the language used in the Document (e.g. "de")
     */
    public String getLanguage() {
        return language;
    }

    /**
     * SET.
     *
     * @param language the language used in the Document (e.g. "de")
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * @return the type of the originating healthcare facility (e.g. "Private Clinic")
     */
    public CodedValueImpl getHealthcareFacilityType() {
        return healthcareFacilityType;
    }

    /**
     * SET.
     *
     * @param healthcareFacilityType the type of the originating healthcare facility (e.g. "Private Clinic")
     */
    public void setHealthcareFacilityType(CodedValueImpl healthcareFacilityType) {
        this.healthcareFacilityType = healthcareFacilityType;
    }

    /**
     * @return the list of documents that are marked as 'addendum' of the current document.
     */
    public List<DocumentMetadata> getAttachments() {
        if (attachments == null) {
            attachments = new ArrayList<DocumentMetadata>();
        }
        return attachments;
    }

    /**
     * SET.
     *
     * @param attachments the list of documents that are marked as 'addendum' of the current document.
     */
    public void setAttachments(List<DocumentMetadata> attachments) {
        this.attachments = attachments;
    }

    /**
     * @return the code specifying the level of confidentiality.
     */
    public CodedValueImpl getConfidentiality() {
        return confidentiality;
    }

    /**
     * SET.
     *
     * @param confidentiality the code specifying the level of confidentiality.
     */
    public void setConfidentiality(CodedValueImpl confidentiality) {
        this.confidentiality = confidentiality;
    }

    /**
     * @return the list of folders this document is assigned to.
     */
    public List<FolderMetadata> getFolders() {
        if (folders == null) {
            folders = new ArrayList<FolderMetadata>();
        }
        return folders;
    }

    /**
     * SET.
     *
     * @param folders the list of folders this document is assigned to.
     */
    public void setFolders(List<FolderMetadata> folders) {
        this.folders = folders;
    }

    /**
     * @return the code specifying the clinical specialty where the act, that resulted in the document was performed (e.g. 'Family Practice').
     */
    public CodedValueImpl getPracticeSetting() {
        return practiceSetting;
    }

    /**
     * SET.
     *
     * @param practiceSetting the code specifying the clinical specialty where the act, that resulted in the document was performed (e.g. 'Family Practice').
     */
    public void setPracticeSetting(CodedValueImpl practiceSetting) {
        this.practiceSetting = practiceSetting;
    }

    /**
     * @return the size in bytes
     */
    public int getSize() {
        return size;
    }

    /**
     * SET.
     *
     * @param size the size in bytes
     */
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int compareTo(DocumentMetadata o) {
        return getCreationDate().compareTo(o.getCreationDate());
    }

    /**
     * GET. See {@link #institution}.
     *
     * @return .
     */
    public String getInstitution() {
        return institution;
    }

    /**
     * SET. See {@link #institution}.
     *
     * @param institution .
     */
    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getInstitutionOid() {
        return institutionOid;
    }

    public void setInstitutionOid(String institutionOid) {
        this.institutionOid = institutionOid;
    }

    /**
     * @return the flag indicating if this document has attachments.
     */
    public boolean hasAttachments() {
        return !getAttachments().isEmpty();
    }

    public boolean isOwnInstitution() {
        return ownInstitution;
    }

    public void setOwnInstitution(boolean ownInstitution) {
        this.ownInstitution = ownInstitution;
    }

    public String getUsedXdsCons() {
        return usedXdsCons;
    }

    public void setUsedXdsCons(String usedXdsCons) {
        this.usedXdsCons = usedXdsCons;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DocumentId");
        sb.append('[');
        sb.append("documentClass=").append(documentClass);
        sb.append(',');
        sb.append("documentId=").append(documentId);
        sb.append(',');
        sb.append("title=").append(title);
        sb.append(',');
        sb.append("author=").append(author);
        sb.append(',');
        sb.append("format=").append(format);
        sb.append(',');
        sb.append("rawDocumentMimeType=").append(rawDocumentMimeType);
        sb.append(',');
        sb.append("rawDocumentMimeTypeName=").append(rawDocumentMimeTypeName);
        sb.append(',');
        sb.append("healthcareFacilityType=").append(healthcareFacilityType);
        sb.append(',');
        sb.append("confidentiality=").append(confidentiality);
        sb.append(',');
        sb.append("events=").append(events);
        sb.append(',');
        sb.append("documentClass=").append(documentClass);
        sb.append(',');
        sb.append("type=").append(type);
        sb.append(',');
        sb.append("folders=").append(folders);
        sb.append(',');
        sb.append("state=").append(state);
        sb.append(',');
        sb.append("language=").append(language);
        sb.append(',');
        sb.append("ownInstitution=").append(ownInstitution);
        sb.append(',');
        sb.append("parentDocumentId=").append(parentDocumentId);
        sb.append(',');
        sb.append("institution=").append(institution);
        sb.append(',');
        sb.append("institutionOid=").append(institutionOid);
        sb.append(',');
        sb.append("patientId=").append(patientId);
        sb.append(',');
        sb.append("size=").append(size);
        sb.append(',');
        sb.append("practiceSetting=").append(practiceSetting);
        sb.append(',');
        sb.append("usedXdsCons=").append(usedXdsCons);
        sb.append(']');
        return sb.toString();
    }

}
