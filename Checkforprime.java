package com.geeks;

public class Checkforprime {
		
		public static void main(String[] args) {
			
			int num = 1900;
			
			int mid = num/2;
			
			if(num == 0 || num == 1) {
				System.out.println("Given number is not a Prime number.");
			}else {
				boolean flag = false;
				
				for(int i = 2; i <= mid; i++) {
					
					if(num % i == 0) {
						System.out.println("Given number is not a Prime number.");
						flag = true;
						break;
					}
					
					
				}
				
				if(flag == false){
					System.out.println("Given number is a prime number.");
				}
			}
			
		}

	}


