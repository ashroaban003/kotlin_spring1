package com.plooding.demo.database.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.Instant

@Document("notes")  //annotates to mongodb its a storable
data class Note(
    val title: String,
    val constant: String,
    val color: Long,
    val createdAt: Instant = Instant.now(),
    @Id val id: ObjectId = ObjectId.get()
)
