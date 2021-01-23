package com.mobigods.userlist.models

import com.mobigods.domain.models.Location

data class UserModel (
    val email: String,
    val firstName: String,
    val id: String,
    val lastName: String,
    val picture: String,
    val title: String,
    val registerDate: String = "",
    val gender: String = "",
    val dateOfBirth: String = "",
    val location: LocationModel = LocationModel()
)