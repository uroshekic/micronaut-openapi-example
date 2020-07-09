package com.example

import io.micronaut.runtime.Micronaut.*
import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Contact
import io.swagger.v3.oas.annotations.info.Info
import io.swagger.v3.oas.annotations.info.License

@OpenAPIDefinition(
		info = Info(
				title = "Hello World",
				version = "1.0",
				description = "My API",
				license = License(name = "Apache 2.0", url = "https://foo.bar"),
				contact = Contact(url = "https://company.com", name = "Support", email = "support@company.com")
		)
)
object ApplicationKt {

	@JvmStatic
	fun main(args: Array<String>) {
		build()
				.args(*args)
				.packages("com.example")
				.start()
	}
}
