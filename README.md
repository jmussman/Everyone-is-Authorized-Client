![](.common/joels-private-stock.png?raw=true)

# Everyone is Authorized Client

This project contains a class representing a client-side service component that always authorizes a credit card
purchase if the card number is valid.
The point is to have a deterministic external dependency for unit testing, but one that mucks up a production
project because cards are always authorized.
That provides an excuse to want to go back to the related BankOfRandomCreditAuthorizer class in a demo or lab.
## License

The code is licensed under the MIT license. You may use and modify all or part of it as you choose, as long as attribution to the source is provided per the license. See the details in the [license file](./LICENSE.md) or at the [Open Source Initiative](https://opensource.org/licenses/MIT)

### Software Configuration

The library code targets Java 1.8 and above. The JUnit tests are built with JUnit 5 and Jupiter.

### Dependencies

* com.wonderfulwidgets.retail:credit-card-validator

### Documentation

Read the JavaDoc at https://jmussman.github.io/Everyone-is-Authorized-Client/.

<hr>
Copyright © 2020 Joel Mussman. All rights reserved.