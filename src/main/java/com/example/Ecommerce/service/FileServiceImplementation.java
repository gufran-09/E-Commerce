package com.example.Ecommerce.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

@Service
public class FileServiceImplementation implements FileService{

    @Override
    public String uploadImage(String path, MultipartFile file) throws IOException {
        //File names of current / original file
        String originalFileName=file.getOriginalFilename();  // gives complete file name along with extension; getName() only gives name of the file

        // Generate a unique file name
        String randomId= UUID.randomUUID().toString();
        // 123 --> mat.jpg  --> 123.jpg
        String fileName=randomId.concat(originalFileName.substring(originalFileName.lastIndexOf('.')));
        String filePath=path+ File.separator+fileName;  // File.separator ='/'

        System.out.println(System.getProperty("user.dir"));

        // Check if path exist and create
        File folder=new File(path);
        if(!folder.exists())
            folder.mkdirs();

        //  upload to server
        Files.copy(file.getInputStream(), Paths.get(filePath));

        // returning file name
        return fileName;
    }
}
