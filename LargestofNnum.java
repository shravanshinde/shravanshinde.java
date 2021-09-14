package com.geeks;

public class LargestofNnum {
		public static void main(String[] args) {
				
				int[] arr = {52,76,90,2,8,3,9,0,10,101};
				
				if(arr.length > 0) {
					
					int max = arr[0];
					
					int i = 0;
					
					while(i < arr.length) {
						
						if(arr[i] > max) {
							max = arr[i];
						}
						
						i++;
						
					}
					System.out.println(max);
				}
			
			}

		}

