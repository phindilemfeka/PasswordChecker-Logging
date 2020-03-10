import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging
{
    private static final Logger logger = LogManager.getLogger(Logging.class.getName());

    //Methods for all the conditions that must be met for password to be considered as valid.
    boolean PasswordExist(String password)
    {
        return password.length() >= 1;
    }

    boolean PasswordLength (String password)
    {
        return password.length() >8;
    }

    boolean PasswordHasLowercase (String password)
    {
        for (int i =1; i <=password.length(); i++)
        {
            if (Character.isLowerCase(password.charAt(i)))
            {
                return true;
            }
        }
        return false;
    }

    boolean PasswordHasUppercase (String password)
    {
        for (int i = 0; i < password.length(); i++)
        {
            if (Character.isUpperCase(password.charAt(i)))
            {
                return true;
            }
        }
        return false;
    }

    boolean PasswordHasDigit (String password)
    {
        for (int i = 0; i < password.length(); i++)
        {
            if (Character.isDigit(password.charAt(i)))
            {
                return true;
            }
        }
        return false;
    }

    boolean PasswordHasSpecialCharacter (String password)
    {
        for (int i = 0; i < password.length(); i++)
        {
            if (!Character.isLetterOrDigit(password.charAt(i)))
            {
                return true;
            }
        }
        return false;
    }

    //Method checking if all the conditions are met using the above methods
    public boolean PasswordIsValid(String password)
    {

        if (!PasswordExist(password))
        {
            logger.error(" Password should exist");
        }
        if (!PasswordLength(password))
        {
            logger.error("Password should be longer than 8 characters");
        }
        if (!PasswordHasLowercase(password))
        {
            logger.error("Password should contain at least 1 lowercase letter");
        }
        if (!PasswordHasUppercase(password))
        {
            logger.error("Password should contain at least 1 uppercase letter");
        }
        if (!PasswordHasDigit(password))
        {
            logger.error("Password should contain at least one digit");
        }
        if (!PasswordHasSpecialCharacter(password))
        {
            logger.error("Password should contain at least one special character");
        }
        return false;
    }

    //Method PasswordIsOk is only satisfied(returns true) if at least conditions are met with conditions 1&2 included
    //i.e (password exist and password is longer than 8 characters)
    public boolean PasswordIsOk(String password)

    {
        int counter = 0;
        if (PasswordExist(password))
        {
            counter++;
        }
        if (PasswordLength(password))
        {
            counter++;
        }
        if (PasswordHasLowercase(password))
        {
            counter++;
        }
        if (PasswordHasUppercase(password))
        {
            counter++;
        }
        if (PasswordHasDigit(password))
        {
            counter++;
        }
        if (PasswordHasSpecialCharacter(password))
        {
            counter++;
        }
        if (!PasswordLength(password))
        {
            logger.debug("Password is not ok");
            return false;
        }

        logger.debug("Password is ok ");
        return counter > 3 || counter == 3;

    }

}





