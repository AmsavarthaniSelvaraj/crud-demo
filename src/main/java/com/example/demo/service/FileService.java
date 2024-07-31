package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.File;
import com.example.demo.repository.FileRepository;

@Service
public class FileService {
	@Autowired
	private FileRepository fileRepository;

	public File addFile(File file) {
		return fileRepository.save(file);
	}

	public Optional<File> getFile(int id) {
		return fileRepository.findById(id);
	}

	public File putFile(File file) {
		return fileRepository.saveAndFlush(file);
	}

	public void deleteFile(int id) {
		fileRepository.deleteById(id);
	}

}
