/**
 * 
 */
package cs6301.g33.longProject1;

import cs6301.g33.utils.ParsePostfixExpression;

/**
 * @author Sushma
 * @author Sai Vivek Kanaparthy
 *
 */
public class ReadInfixExpressions {

	/**
	 * @param args: Takes input from command Line: n=args[0]: no of input expressions( Integer Value)
	 * In consecutive args[0...n] send the expressions to be evaluated.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no_of_expressions = Integer.parseInt(args[0]);
		ParsePostfixExpression parseExpression = new ParsePostfixExpression();
		
		for(int index = 0 ; index< no_of_expressions; index++)
		{
			parseExpression.evaluateExpression(args[index+1], Integer.parseInt(args[no_of_expressions+1]));
		}

	}

}
