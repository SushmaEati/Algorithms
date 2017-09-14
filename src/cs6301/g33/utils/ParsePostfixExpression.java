/**
 * 
 */
package cs6301.g33.utils;

import java.math.BigInteger;

/**
 * @author Sushma
 *
 */
public class ParsePostfixExpression {
	
	//Array to store the values of the operands( Since they are a-z in small letter, we can create a static array of length 26, and initially assign them to zero)
	static BigInteger[] variableValue = new BigInteger[26];
	
	/**
	 * 
	 * @param expression: Expression given by user
	 */
	void evaluateExpression(String expression)
	{
		//Index of the character in the expression
		int index =0 ;
		//Variable to hold the left hand operand
		char temp_variable = 'a';
		
		//Iterate the expression and evaluate the value of left hand operand
		while(expression.charAt(index) != 0)
		{
			//Discard the spaces in the expression
			if(expression.charAt(index)==' ')
				continue;
			//If the character is an equal to ('=') start evaluating the right hand side of the expression.
			if(expression.charAt(index) == '=')
			{
				//Evaluate the expression an assign it to the operand
				variableValue[temp_variable-'a'] = 
				evaluatePostfixExpression(expression.substring(index+1,expression.length()));
			}
			//If it is an operand, store it in a temp_variable to store the value later.
			else if(expression.charAt(index) >= 'a' || expression.charAt(index) <= 'z')
				temp_variable = expression.charAt(index);
		}
	}
	
	/**
	 * 
	 * @param postfixExpression (Expression after the equal to operator)
	 * @return
	 */
	BigInteger evaluatePostfixExpression(String postfixExpression)
	{
		BigInteger expressionValue = new BigInteger("0");
		return expressionValue;
	}
}
