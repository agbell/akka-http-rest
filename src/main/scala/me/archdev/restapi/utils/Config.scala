package me.archdev.restapi.utils

import com.typesafe.config.ConfigFactory

trait Config {
  private val config = ConfigFactory.load()
  private val httpConfig = config.getConfig("http")

  val httpHost = httpConfig.getString("interface")
  val httpPort = httpConfig.getInt("port")

  private val databaseConfig = config.getConfig("pgdb")
    val jdbcUrl = databaseConfig.getString("db.url")
    val dbUser = databaseConfig.getString("db.user")
    val dbPassword = databaseConfig.getString("db.password")
}
