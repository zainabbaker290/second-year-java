package com.company.Assignment1

data class PersonK(
    val name: String,
    val gender: Gender,
    val location: String,
    val skill: String?,
    val yearsOfExperience: Int
) {
    companion object {
        private fun parseGender(gender: String): Gender {
            for (g in Gender.values()) {
                if (g.name.lowercase() == gender.lowercase()) {
                    return g
                }
            }
            return Gender.Other
        }

        fun build(newName: String, theGender: String?, newLocation: String): PersonK {
            val actualGender = theGender?.let { gender ->
                parseGender(gender)
            } ?: Gender.Other
            return PersonK(newName, actualGender, newLocation, null, 0)
        }
    }
}


object Test {
    @JvmStatic
    fun main(args: Array<String>) {
        val person = PersonK.build("zainab", "lklkhlhkj", "cork")
        println("Persons name ${person.name}")
        println("Persons gender ${person.gender}")

    }

}

