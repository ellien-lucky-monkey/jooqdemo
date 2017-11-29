/**
 * This class is generated by jOOQ
 */
package com.jooq.demo.domain.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;

import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class User implements Serializable {

	private static final long serialVersionUID = -1515241094;

	private UInteger id;

	public User() {}

	public User(User value) {
		this.id = value.id;
	}

	public User(
		UInteger id
	) {
		this.id = id;
	}

	public UInteger getId() {
		return this.id;
	}

	public User setId(UInteger id) {
		this.id = id;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("User (");

		sb.append(id);

		sb.append(")");
		return sb.toString();
	}
}
