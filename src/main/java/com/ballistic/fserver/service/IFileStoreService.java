package com.ballistic.fserver.service;

import com.ballistic.fserver.pojo.FileInfo;

import java.util.Optional;

public interface IFileStoreService {

    public FileInfo storeFile(FileInfo fileInfo);
    public Optional<FileInfo> loadFileAsResource(String id);
    public FileInfo deleteFile(FileInfo fileInfo);

    /*
    public interface ILocalFileStoreService {}
    public interface IServerFileStoreService {
        public void storeFile();
        public void loadFileAsResource();
    }*/
}
