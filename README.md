GenericSpringHibernate
======================
A simple startup Spring and hibernate application
* Uses Generic DAO to enforce the middleware services.
* Provides a basic authentication service that is generic in nature.

The user is assumed to have common fields like name, password and role. For the sake of simplicity, the password is set in plaintext format, but an encrypted hash and a salt field can also be used in its place.
