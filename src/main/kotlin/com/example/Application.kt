package com.example

import io.micronaut.runtime.Micronaut.build

object ApplicationKt {

	@JvmStatic
	fun main(args: Array<String>) {
		build()
				.args(*args)
				.packages("com.example")
				.start()
	}
}
