package com.luwi.example.kotlindemo.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class User(
        @Id @GeneratedValue var id: Long? = null,
        var name: String,
        var identification: String,
        var password: String,
        var loged: Boolean? = null
)