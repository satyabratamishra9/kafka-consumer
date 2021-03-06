package com.kafka.mongo.twitter.utils

import com.typesafe.config.{Config, ConfigFactory}

object AppConfig {
  val conf: Config = ConfigFactory.load()
  val mongoUrl: String = conf.getString("db.mongo.url")
  val database: String = conf.getString("db.mongo.database")
  val tweetCollection: String = conf.getString("db.mongo.twitterCollection")
}
