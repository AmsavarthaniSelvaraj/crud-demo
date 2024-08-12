package com.example.demo.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Hex;

public class Password {
	public static String ByteEncryt(String password) {
		MessageDigest algorithm;
		try {
			algorithm=MessageDigest.getInstance("SHA-1");
		} catch(NoSuchAlgorithmException e) {
			throw new RuntimeException("Exception occured");
		}
		byte[] digest=algorithm.digest(password.getBytes());
		return new String(Hex.encodeHex(digest));
			
		}
	}


