package br.ufpa.facomp.jsf.util;

import java.math.BigInteger;
import java.security.SecureRandom;

public final class GeradorTokenUtil {

	public static String gerarTokenComTamanho(int tamanho) {
		return new BigInteger(tamanho * 5, new SecureRandom()).toString(32).toUpperCase();
	}

}
