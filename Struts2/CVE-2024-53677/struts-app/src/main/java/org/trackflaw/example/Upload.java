package org.trackflaw.example;

import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class Upload extends ActionSupport {
    // 使用 FileUploadInterceptor 自动注入
    private File upload;                    // 上传文件
    private String uploadFileName;           // 文件名
    private String uploadContentType;        // 文件类型
    private String imagePath;                // 文件存储路径

    // Custom upload logic
    public String execute() throws Exception {
        if (uploadFileName != null) {
            String uploadDirectory = System.getProperty("user.dir") + "/webapps/ROOT/uploads/";
            this.imagePath = "uploads/" + uploadFileName;
            String message = "File uploaded successfully 😊";

            try {
                // 将文件保存到目标路径
                File destFile = new File(uploadDirectory, uploadFileName);
                FileUtils.copyFile(upload, destFile);
                addActionMessage(message);
                return SUCCESS;
            } catch (Exception e) {
                addActionError(e.getMessage());
                e.printStackTrace();
                return ERROR;
            }
        } else {
            return INPUT;
        }
    }

    // Getters and setters
    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}