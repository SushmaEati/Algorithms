/**
 * 
 */
package cs6301.g33.utils;

import java.math.BigInteger;

/**
 * @author Sushma
 * @author Sai Vivek Kanaparthy
 */
public class OperatorPrecedence {
	//Set all the operator that can be used in the expression and assign ranks in the rank array accordingly 
	int rank[] = {5,5,5,5,5,5,4,3,2,2,1,1,1};
	char operator[]={'(',')','[','[',']',']','!','^','/','*','+','-','|'};
	int length = 12;

	public boolean needsOneOperand(char operator)
	{
		if(operator == '!' || operator == '|')
			return true;
		else
			return false;
	}
	/**
	 * 
	 * @param charector
	 * @return
	 */
	//Check if the charactor is an operator or an operand
	public boolean isOperator(char charector)
	{
		for(int index=0;index<length;index++)
		{
			 if(charector==operator[index])
				 return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @param charector
	 * @return
	 */
	//Returns the rank of the operator
	public int getRankOfOperator(char charector)
	{
		for(int index=0;index<length;index++)
		{
			 if(charector==operator[index])
				 return rank[index];
		}
		return -1;
	}
	
	//Check if the charactor is an open paranthesis 
	public boolean isOpenParanthesis(char charector)
	{
		if(charector == '(' || charector == '[' || charector == '{')
			return true;
		return false;
	}
	
	//Checks if the paranthesis is a closed paranthesis
	public boolean isCloseParanthesis(char charector)
	{
		if(charector == ')' || charector == ']' || charector == '}')
			return true;
		return false;
	}
	
	public BigInteger computeValue(BigInteger number1, BigInteger number2, char operator)
	{
		BigInteger finalValue = new BigInteger("0");
		switch(operator)
		{
		case '+':{
			return number1.add(number2);
		}
		case '-':{
			return number1.subtract(number2);
		}
		case '*':{
			return number1.multiply(number2);
		}
		case '/':{
			return number1.divide(number2);
		}
		case '^':{
			return number1.pow(number2.intValue());
		}
		case '%':{
			return number1.divide(number2);
		}
		case '|':{
			finalValue = new BigInteger(Math.sqrt(number1.doubleValue())+"");
			return finalValue;
			}
		}
		return finalValue;
	}
}
