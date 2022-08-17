package com.res.cloud;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import com.cloudinary.Cloudinary;

public class FileUpload {

	public static Cloudinary cloudinaryConfig() {
        Cloudinary cloudinary = null;
        Map config = new HashMap();
        config.put("cloud_name", "vietnam-national-university-of-agricuture");
        config.put("api_key", "836363678844323");
        config.put("api_secret", "MCXWu4LWRWPvao8fA6xi5WPgKH4");
        cloudinary = new Cloudinary(config);
        return cloudinary;
    }
	
	public static String upload(File file) {
		Cloudinary cloudinaryConfig = cloudinaryConfig();
		Map uploadResult;
		Map uploadParams = new HashMap<String, String>();
		uploadParams.put("resource_type", "auto");
		try {
			
			uploadResult = cloudinaryConfig.uploader().upload(file, uploadParams);
			return uploadResult.get("url").toString();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}   
	}
	
}
