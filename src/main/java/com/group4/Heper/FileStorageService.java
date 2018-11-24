package com.group4.Heper;

import java.io.IOException;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface FileStorageService {
	public String storeFile(MultipartFile file) throws IOException;
	public Resource loadFileAsResource(String fileName);
}
