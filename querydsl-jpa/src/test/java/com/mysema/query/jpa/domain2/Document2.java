package com.mysema.query.jpa.domain2;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Document2 {
    
    @Id
    private long id;
    
    private String documentTitle;
    
    private String documentBody;
    
    private String documentSummary;
    
    private double createdBy;
    
    private Date creationDate;
    
    private double modifiedBy;
    
    private Date modificationDate;
    
    private double deletedBy;
    
    private Date deletedDate;
    
    private double documentVersion;

    private double documentStatus;
    
    private double entryId;
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDocumentTitle() {
        return documentTitle;
    }

    public void setDocumentTitle(String documentTitle) {
        this.documentTitle = documentTitle;
    }

    public String getDocumentBody() {
        return documentBody;
    }

    public void setDocumentBody(String documentBody) {
        this.documentBody = documentBody;
    }

    public String getDocumentSummary() {
        return documentSummary;
    }

    public void setDocumentSummary(String documentSummary) {
        this.documentSummary = documentSummary;
    }

    public double getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(double createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public double getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(double modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    public double getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(double deletedBy) {
        this.deletedBy = deletedBy;
    }

    public Date getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(Date deletedDate) {
        this.deletedDate = deletedDate;
    }

    public double getDocumentVersion() {
        return documentVersion;
    }

    public void setDocumentVersion(double documentVersion) {
        this.documentVersion = documentVersion;
    }

    public double getDocumentStatus() {
        return documentStatus;
    }

    public void setDocumentStatus(double documentStatus) {
        this.documentStatus = documentStatus;
    }

    public double getEntryId() {
        return entryId;
    }

    public void setEntryId(double entryId) {
        this.entryId = entryId;
    }


}