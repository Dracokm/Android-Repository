package com.draco.passwordgen;

import java.util.Random;


public class passwordGen {
	
	/**
	 * @author Keith
	 *  Program to generate a password of different lengths
	 */

		static int passwordLength = 0;
		/**
		 * @param args
		 */
			// TODO Auto-generated method stub
	
		public String randomCharacters(int passwordLength,boolean extraStuff)
		{
			//Returns a String of chars made up of random chars/ints
			Random random = new Random();
			int low = 48;
			int high = 122;
			String password = "";
			
			for(int i = 0;i < passwordLength;i++)
			{
				
				int randomNumber = random.nextInt(high - low) + low;
				if(extraStuff == false)
				{
					while(randomNumber == searchBadArray(randomNumber))
					{
						randomNumber = random.nextInt(high - low) + low;	
					}
				}
				password += ((char)randomNumber);
			}
			return password;
		}

		
		private static int searchBadArray(int randomNum)
		{
			final int badCharacters[] = {58,59,60,61,62,63,91,92,93,94,95,96,48,49,73,76,79,105,108,111};
			  for (int index = 0; index < badCharacters.length; index++)
		      {
		           if ( badCharacters[index] == randomNum ) 
		                 return randomNum;  //We found it!!!
		      }
			return -1;
		}
	}


