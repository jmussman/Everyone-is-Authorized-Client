/**
 * Classes supporting cardservices operations at The Bank of Random Credit.
 *
 * <p>
 * This package contains an example class, AlwaysAuthorize, that will always authorize a purchase on
 * the provided credit card.  Definitely deterministic but probably if your manager asks to rebuild the
 * project with this service, they will probably have you roll it back as soon as they realize they aren't
 * getting any payment from Everyone Is Authorized. On top of that, the amount is a double, not a BigDecimal.
 * </p>
 * <p>
 * Look for the peer class BankOfRandomCreditAuthorizer in the package com.thebankofrandomcredit.cardservices
 * from the Bank of Random Credit, which may or may not allow a charge regardless of available credit, instead
 * basing it on the phase of the Moon, alignment of the planets, etc.
 * </p>
 */
package com.everyoneisauthorized.client;