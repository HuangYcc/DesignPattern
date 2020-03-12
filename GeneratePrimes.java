package com.vce.design;

import java.util.Arrays;

public class GeneratePrimes {
	public static int[] GeneratePrimeNumbers(int maxValue) {
		if (maxValue >= 2) {
			// ����
			long[] flag = new long[(maxValue + 1) / 64 + 1]; // λΪ0��������λΪ1�������
			flag[0] = 3L;
			int i, j, arrayKey = 0;
			int[] primes = new int[maxValue / 3 + 1];
			// ɸѡ.
			for (i = 0; i <= maxValue; i++) {
				if (((flag[i / 64] >> (i % 64)) & 1) == 0) {
					primes[arrayKey++] = i;
					if (i <= Math.sqrt(maxValue) + 1) {
						for (j = 2 * i; j < maxValue + 1; j += i)
							flag[j / 64] |= (1L << (j % 64));// ������������
					}
				}
			}
			primes = Arrays.copyOf(primes, arrayKey); // ��ȥ����0
			return primes; // ����
		} else // maxValue < 2
			return new int[0];
		// ���벻�����ֵ���ؿ�����
	}

}
