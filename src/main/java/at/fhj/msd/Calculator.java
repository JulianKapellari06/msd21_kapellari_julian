package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;

import java.io.File;

/**
 * @Author Kapellari Julian
 * This class can be used for simple math
 */
public class Calculator {

    /**
     * This object creates logs.
     */
    private static Logger logger = LogManager.getLogger();

    /**
     * This methods adds two numbers
     * @param number1
     * @param number2
     * @return sum of number1 and number2
     */
    public double add(double number1, double number2) {
        logger.debug(number1 + " + " + number2);
        return number1 + number2;
    }

    /**
     * This method subtract two numbers
     * @param number1
     * @param number2
     * @return difference between number1 and number2
     */
    public double minus(double number1, double number2) {
        logger.debug(number1 + " - " + number2);
        return number1 - number2;
    }

    /**
     * This method multiply two numbers
     * @param number1
     * @param number2
     * @return product of number1 and number2
     */
    public double multiply(double number1, double number2) {
        logger.debug(number1 + " * " + number2);
        return number1 * number2;
    }

    /**
     * This method divides two numbers and throws an error if the second number is zero
     * @param number1
     * @param number2
     * @return quotient of number1 and number2
     * @throws ArithmeticException if number 2 equals to zero
     */
    public double divide(double number1, double number2) throws ArithmeticException {
        logger.debug(number1 + " / " + number2);
        if (number2 == 0) {
            logger.error("Division by Zero");
            throw new ArithmeticException();
        }
        return number1 / number2;
    }

    /**
     * This method calculates the faculty of a number
     * @param number
     * @return faculty of number
     */
    public int faculty(int number) {
        logger.debug(number+"!");

        if (number == 1) {
            return 1;
        } else if (number < 0) {
            return 0;
        } else {
            return number * faculty(number - 1);
        }

    }

}
