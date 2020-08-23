// AlwaysAuthorize.java
// Copyright © 2020 Joel Mussman. All rights reserved.
//

package com.everyoneisauthorized.client;

import com.wonderfulwidgets.retail.CreditCardValidator;
import com.wonderfulwidgets.retail.ICreditCardValidator;

import java.math.BigDecimal;
import java.util.Random;
import java.util.UUID;

/**
 * Client interface to the credit card processing services for Everyone is Authorized.
 */
public class AlwaysAuthorize {

    ICreditCardValidator creditCardValidator = new CreditCardValidator();

    /**
     * Create an authorizer using an instance of CreditCardValidator.
     */
    public AlwaysAuthorize() {

        creditCardValidator = new CreditCardValidator();
    }

    /**
     * Create an authorizer using a provided credit card validator.
     *
     * @param creditCardValidator The ICreditCardValidator instance to use.
     */
    public AlwaysAuthorize(ICreditCardValidator creditCardValidator) {

        this.creditCardValidator = creditCardValidator;
    }

    /**
     * If an invalid card number is presented the card will always be rejected.
     * Otherwide every request is authorized regardless of available credit.
     *
     * @param amt The amount to charge.
     * @param number The card number to charge.
     * @return A unique token tied to the transaction if the charge is allowed, or null if it is not.
     */
    public String authorize(double amt, String number) {

        String result = null;

        try {

            if (creditCardValidator.validateCardNumber(number)) {

                result = UUID.randomUUID().toString();
            }
        }

        catch (NullPointerException e) {

            // Do nothing, null will be returned as a failure to purchase.
        }

        return result;
    }
}
