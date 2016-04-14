package com.majina.model;

import java.io.File;
import java.sql.Date;

public class Media {

	private Integer idMedia;
	private File file;
	private Date dateUpload;

	public Media() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Media(Integer idMedia, File file, Date dateUpload) {
		super();
		this.idMedia = idMedia;
		this.file = file;
		this.dateUpload = dateUpload;
	}

	public Integer getIdMedia() {
		return idMedia;
	}

	public void setIdMedia(Integer idMedia) {
		this.idMedia = idMedia;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public Date getDateUpload() {
		return dateUpload;
	}

	public void setDateUpload(Date dateUpload) {
		this.dateUpload = dateUpload;
	}

	@Override
	public String toString() {
		return "Media [idMedia=" + idMedia + ", file=" + file + ", dateUpload=" + dateUpload + "]";
	}

}
