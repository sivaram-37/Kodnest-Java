/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, 
which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for
four is not IIII. Instead, the number four is written as IV. Because the one is before the five we 
subtract it making four. The same principle applies to the number nine, which is written as IX. 
There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 

Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 */

package com.leetcode;

import java.util.*;

public class RomanToInteger {
	static int Solution(String s) {
		int sum=value(s.charAt(0));
		for(int i=1;i<s.length();i++) {

			if(check(s.charAt(i-1),s.charAt(i))) {
				sum=sum+value(s.charAt(i))-(value(s.charAt(i-1))*2);
			}
			else {
				sum+=value(s.charAt(i));
			}
			
		}
		
		return sum;
	}
	static boolean check(char c1,char c2){
        if((c1=='I' && (c2=='V' || c2=='X'))||(c1=='X' && (c2=='L' || c2=='C'))||(c1=='C' && (c2=='D' || c2=='M'))){
            return true;
        }
        return false;
    }
	static int value(char i){
        if(i=='I'){
            return 1;
        }
        else if(i=='V'){
            return 5;
        }
        else if(i=='X'){
            return 10;
        }
        else if(i=='L'){
            return 50;
        }
        else if(i=='C'){
            return 100;
        }
        else if(i=='D'){
            return 500;
        }   
        else if(i=='M'){
            return 1000;
        }
        return -1;
        
    }
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Roman number :");
		String s=in.next();
		in.close();
		System.out.println(Solution(s));
	
	}

}
