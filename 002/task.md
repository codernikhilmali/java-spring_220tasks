Task 002: Payment Processing System
Objective: Design a payment system that supports multiple payment methods using OOP relationships.

What we implemented:
- PaymentMethod — abstract parent class containing shared provider information and payment behavior.
- UPIPayment — inherits from PaymentMethod and implements UPI processing.
- CreditCardPayment — inherits from PaymentMethod and implements credit-card processing.
- Order — stores order details and a PaymentMethod reference, then delegates payment processing.
- Main — creates payment objects and orders to demonstrate the design.
Concepts involved:
Concept	How we used it
Abstraction	PaymentMethod declares processPayment() as an abstract method.
Inheritance	Both payment classes extend PaymentMethod.
Polymorphism	The same processPayment() call executes the appropriate child implementation at runtime.
Encapsulation	Private fields protect internal state; the provider field should be private.
Composition	Order contains a reference to a PaymentMethod and delegates processing to it.
Constructor chaining	super(provider) calls the parent constructor.
Method overriding	Each payment class implements its own processPayment() method.
Key takeaway: Abstraction defines a common contract, inheritance shares common behavior, polymorphism allows different implementations, and composition connects objects with separate responsibi