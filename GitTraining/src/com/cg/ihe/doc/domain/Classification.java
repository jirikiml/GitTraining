package com.cg.ihe.doc.domain;

import java.util.List;

/**
 * classification of a @see FolderMetadata
 */
public class Classification {

    private String nodeRepresentation;
    private String value;
    private List<String> schema;

    public String getNodeRepresentation() {
        return nodeRepresentation;
    }

    public void setNodeRepresentation(String nodeRepresentation) {
        this.nodeRepresentation = nodeRepresentation;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<String> getSchema() {
        return schema;
    }

    public void setSchema(List<String> schema) {
        this.schema = schema;
    }

}
