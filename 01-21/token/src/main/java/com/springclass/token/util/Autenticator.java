package com.springclass.token.util;

import javax.xml.bind.DatatypeConverter;

import com.springclass.token.model.Usuario;



public class Autenticator {
	private static final String prefix="GeNeRaTiOn|P@t1N#0";
	
	public static String encode(Usuario usuario) {
		return DatatypeConverter.printHexBinary((prefix + usuario).getBytes());
	}
	
	public static boolean isValid(String token) {
		byte strByte[] = DatatypeConverter.parseHexBinary(token);
		String newToken = new String(strByte);
		return newToken.startsWith(prefix);	
	}
}
