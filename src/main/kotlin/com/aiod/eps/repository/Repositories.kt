package com.aiod.eps.repository

import com.aiod.eps.model.Event
import org.springframework.data.mongodb.core.*
import org.springframework.data.mongodb.core.query.Criteria.where
import org.springframework.data.mongodb.core.query.Query
import org.springframework.data.mongodb.core.query.Query.query
import org.springframework.data.mongodb.core.query.isEqualTo

class EventRepository(
        private val mongo:ReactiveFluentMongoOperations
){
    suspend fun count()=mongo.query<Event>().awaitCount()

    fun findAll()=mongo.query<Event>().flow()

    suspend fun findOne(id:String)=mongo.query<Event>().matching(query(where("id").isEqualTo(id))).awaitOne()

    suspend fun deleteALl(){
        mongo.remove<Event>().allAndAwait()
    }

    suspend fun update(event:Event)=mongo.update<Event>().replaceWith(event).asType<Event>().findReplaceAndAwait()

    suspend fun insert(event:Event)=mongo.insert<Event>().oneAndAwait(event)

    

}