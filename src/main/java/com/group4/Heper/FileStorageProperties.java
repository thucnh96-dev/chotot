package com.group4.Heper;

import org.springframework.boot.context.properties.ConfigurationProperties;

import com.group4.untils.AppConstants;

@ConfigurationProperties(prefix=AppConstants.FILE_PROPERTIES_PREFIX)
public class FileStorageProperties {
	private String uploadDir;

	public String getUploadDir() {
		return uploadDir;
	}

	public void setUploadDir(String uploadDir) {
		this.uploadDir = uploadDir;
	}
}
