package adamatti.model.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection="users")
class User {
	@Id
	String id
	
	String firstName
	String lastName
	String email
}
