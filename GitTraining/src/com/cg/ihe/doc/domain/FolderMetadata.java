package com.cg.ihe.doc.domain;

import java.util.List;

/**
 * Contains metadata for a folder
 */
public class FolderMetadata {

    private boolean createFolder;
    private String name;
    private String uniqueId;
    private List<Classification> codeList;

    public boolean isCreateFolder() {
        return createFolder;
    }

    public void setCreateFolder(boolean createFolder) {
        this.createFolder = createFolder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public List<Classification> getCodeList() {
        return codeList;
    }

    public void setCodeList(List<Classification> codeList) {
        this.codeList = codeList;
    }

}
