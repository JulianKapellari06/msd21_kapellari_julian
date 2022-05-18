package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;

import java.io.File;

public class Calculator {

    private static Logger logger = LogManager.getLogger();


    public double add(double number1, double number2) {
        logger.debug(number1 + " + " + number2);
        return number1 + number2;
    }

    public double minus(double number1, double number2) {
        logger.debug(number1 + " - " + number2);
        return number1 - number2;
    }

    public double multiply(double number1, double number2) {
        logger.debug(number1 + " * " + number2);
        return number1 * number2;
    }

    public double divide(double number1, double number2) throws ArithmeticException {
        logger.debug(number1 + " / " + number2);
        if (number2 == 0) {
            logger.error("Division by Zero");
            throw new ArithmeticException();
        }
        return number1 / number2;
    }

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
