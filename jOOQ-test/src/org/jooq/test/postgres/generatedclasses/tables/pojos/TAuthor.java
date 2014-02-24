/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TAuthor implements org.jooq.test.postgres.generatedclasses.tables.interfaces.ITAuthor {

	private static final long serialVersionUID = 979289363;

	private final java.lang.Integer                                              id;
	private final java.lang.String                                               firstName;
	private final java.lang.String                                               lastName;
	private final java.sql.Date                                                  dateOfBirth;
	private final java.lang.Integer                                              yearOfBirth;
	private final org.jooq.test.postgres.generatedclasses.udt.pojos.UAddressType address;

	public TAuthor(
		java.lang.Integer                                              id,
		java.lang.String                                               firstName,
		java.lang.String                                               lastName,
		java.sql.Date                                                  dateOfBirth,
		java.lang.Integer                                              yearOfBirth,
		org.jooq.test.postgres.generatedclasses.udt.pojos.UAddressType address
	) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.yearOfBirth = yearOfBirth;
		this.address = address;
	}

	@Override
	public java.lang.Integer getId() {
		return this.id;
	}

	@Override
	public java.lang.String getFirstName() {
		return this.firstName;
	}

	@Override
	public java.lang.String getLastName() {
		return this.lastName;
	}

	@Override
	public java.sql.Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	@Override
	public java.lang.Integer getYearOfBirth() {
		return this.yearOfBirth;
	}

	@Override
	public org.jooq.test.postgres.generatedclasses.udt.pojos.UAddressType getAddress() {
		return this.address;
	}
}
